package com.fosu.service.student;

import java.util.HashMap;
import java.util.Map;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fosu.dao.student.StudentMapper;
import com.fosu.enums.ResultEnum;
import com.fosu.enums.TeacherResultEnum;
import com.fosu.exception.StudentException;
import com.fosu.exception.TeacherException;
import com.fosu.pojo.Grade;
import com.fosu.pojo.Student;
import com.fosu.service.grade.GradeService;
import com.fosu.serviceInf.student.StudentInf;
import com.fosu.vo.student.StudentBaseAndGrade;
import com.fosu.vo.student.StudentLogin;
import com.fosu.vo.student.StudentRegisterMD5Vo;
import com.fosu.vo.student.StudentInfo;

@Service
public class StudentService implements StudentInf{

	@Autowired
	private StudentMapper StudentM;
	
	//service层的 Grade
	@Autowired
	private GradeService gradeService;
	
	//service层的Student
	@Autowired
	private StudentService StudentService;
	

	/*
	 * 更新学生基本信息
	 * 
	 */
	@Override
	public StudentBaseAndGrade StudentInfo(StudentInfo studentInfo) throws Exception {
		// TODO Auto-generated method stub
		StudentM.StudentInfo(studentInfo);
		
		
		StudentBaseAndGrade findStudentInfo = StudentService.findStudentInfo(studentInfo.getStudent_id());
		
		return findStudentInfo;
	}
	
	/*
	 * 查看学生基本信息
	 * 420 传入参数为空
	 * 451 查询为空
	 */

	@Override
	public StudentBaseAndGrade findStudentInfo(Integer student_id) throws Exception{
		// TODO Auto-generated method stub
		
		//参数是否为空
		if(student_id == null)
			throw new StudentException(ResultEnum.STUDENT_ParamNULL);
		
		StudentBaseAndGrade studentInfo = StudentM.findStudentInfo(student_id);
		
		//查询是否为空
		if(studentInfo == null)
			throw new StudentException(ResultEnum.STUDENT_findNULL);
		
		return studentInfo;
	}

	/*
	 * 	学生登录功能
	 */

	@Override
	public StudentLogin findStudentLogin(Map<String, String> student) {
		// TODO Auto-generated method stub
		
		StudentLogin findStudentLogin = StudentM.findStudentLogin(student);
		
		return findStudentLogin;
	}

	
	/*
	 * 从学号判定年级和班级  2016 031 01 08  031 好像是 专业号
	 */
	public Map<String,String> getGrade_class(String number) {
		
				Map<String,String> r = new HashMap<>();
				//去除空格
				String number_safe = number.replaceAll(" ","");
				//最长
				int endIndex = number_safe.length();
				//最短
				int beginIndex = 0;
				String grade_period = number_safe.substring(beginIndex, 4);
				String grade_class = number_safe.substring(endIndex-4,endIndex-2);
				r.put("grade_period", grade_period);
				r.put("grade_class", grade_class);
				
				return r;
	}
	/*
	 * 学生注册功能
	 * @see com.fosu.serviceInf.student.StudentInf#StudentRegister(java.lang.String, java.lang.String)
	 */
	@Override
	public String StudentRegister(StudentRegisterMD5Vo student) throws Exception{
		// TODO Auto-generated method stub
		
		String username = student.getUsername();
		String password = student.getPassword();
		String number = student.getNumber();
		
		//从学号判定年级和班级  2016 031 01 08  031 好像是 专业号 
		//返回年级 和班级
		Map<String, String> result = StudentService.getGrade_class(number);
		
		String grade_period = result.get("grade_period");
		String grade_class =  result.get("grade_class");
		
		System.out.println(grade_period);
		System.out.println(grade_class);
		
		//判断年级单位是否存在 不存在 增加
		//存在返回id
		Grade grade = new Grade();
				
		String grade_specialty = student.getSpecialty();

		//届 专业 年级 放入 pojo中
		grade.setGrade_class(grade_class);
		grade.setGrade_specialty(grade_specialty);
		grade.setGrade_period(grade_period);
		
		
		System.out.println(grade);
		//年级插入 失败会抛出异常
		Integer grade_id = gradeService.findGradeAdd(grade);
		 
		System.out.println(grade_id);
		//用户名作为盐值
		ByteSource salt = ByteSource.Util.bytes(username);
		/*
		 * MD5加密：
        * 使用SimpleHash类对原始密码进行加密
        * 第一个参数代表使用MD5方式加密
        * 第二个参数为原始密码
        * 第三个参数为盐值，即用户名
        * 第四个参数为加密次数
        * 最后用toHex()方法将加密后的密码转成String
        */
		String newPs = new SimpleHash("MD5",password,salt,5).toHex();
		
		//查看数据库是否存在用户名
		Map<String, String> StudentInfo = StudentM.findStudentByUsername(username);
		
		//不存在
		if(StudentInfo == null)
		{
			//插入数据
			//转换为数据库形式
			Map<String,Object> dataMap = new HashMap<>();
			dataMap.put("student_username", username);
			dataMap.put("student_password", newPs);
			dataMap.put("student_number", number);
			dataMap.put("for_student_grade_id", grade_id);
			
			Integer student_flag = StudentM.insertStudentRegister(dataMap);
			
			String student_id = null;
			
			if(student_flag != null)
			{
				student_id = dataMap.get("student_id").toString();
			}
			
			return student_id;
		}
		
		//存在同名用户名
		throw new StudentException(ResultEnum.STUDENT_EXIST);
	}


}
