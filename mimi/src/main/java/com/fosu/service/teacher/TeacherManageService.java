package com.fosu.service.teacher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fosu.dao.teacher.TeacherManageMapper;
import com.fosu.enums.ResultEnum;
import com.fosu.enums.TeacherResultEnum;
import com.fosu.exception.StudentException;
import com.fosu.exception.TeacherException;
import com.fosu.pojo.Grade;
import com.fosu.pojo.Student;
import com.fosu.pojo.Teacher;
import com.fosu.service.grade.GradeService;
import com.fosu.serviceInf.teacher.TeacherInf;
import com.fosu.vo.GradeStudentQueryVo;
import com.fosu.vo.TeacherAndGrade;
import com.fosu.vo.teacher.TeacherAndGradeBase;



@Service
public class TeacherManageService implements TeacherInf{

	@Autowired
	//dao层Teacher
     private TeacherManageMapper teachermm ;
	//Service层Teacher
	@Autowired
	 private TeacherManageService teachermService;
	//Service层Grade
	@Autowired
	 private GradeService gradeService;
	
	/*
	 *   增加老师用户
	 */

	@Override
	@Transactional
	public void  addTeacher(Teacher teacher) throws Exception{
		
		//参数异常情况
		teachermm.insertTeacher(teacher);	
		
		//插入返回主键为空
		if(teacher.getTeacher_id() == null)
		{
			//抛出异常
			throw new TeacherException(TeacherResultEnum.TEACHER_insertNULL);
		}
	}
	/*
	 * 查询老师用户
	 */
	@Override
	public Integer findTeacher_id(String teacher_username) throws Exception {
		// TODO Auto-generated method stub
		
		Integer findTeacher = teachermm.findTeacher(teacher_username);
		if (findTeacher == null)
		{
			//找不到
			throw new TeacherException(TeacherResultEnum.TEACHER_FinallNULL);
		}
		else
		{
			//找到
			return findTeacher;
		}
	}
	
	/*增加 中间表 老师 和 教导关系  (批量）
	/*需要变量 老师 id、List<年级id>
	 */
	@Override
	//@Transactional
	public void insertTeacher_grade(TeacherAndGradeBase teacherAndGrade) throws Exception{
		
		//是否存在该老师 - 找不到会抛出异常 (这里查的是用户名  -改进 加入老师 工号 )
		String teacher_username = ((TeacherAndGradeBase) teacherAndGrade).getTeacher_username();
		Integer teacher_id = teachermService.findTeacher_id(teacher_username);
		

		//该届是否存在 --单个 i/o - 找不到会抛出异常 
		Integer grade_id = gradeService.findGrade_base(teacherAndGrade.getGrade().get(0));
		
		//  需要 ：更新 多个 
		
		
		//在这里变成map形式
		Map<String , Object> map = new HashMap<>();
		
		Integer[] datas = new Integer[] {grade_id};
		ArrayList arrayList = new ArrayList<>(Arrays.asList(datas));
		
		map.put("for_teacher_id", teacher_id);
		map.put("for_grade_id", arrayList);
		teachermm.insertTeacher_grade(map);
	}

	/*
	 * 通过主键 提供该老师所有信息
	 */
	@Override
	public Teacher Teacher_id(Integer teacher_id) throws Exception {
		// TODO Auto-generated method stub
		Teacher teacher = teachermm.findTeacher_id(teacher_id);
		
		//查询为空
		if(teacher == null)
		{
			throw new TeacherException(TeacherResultEnum.TEACHER_FinallNULL);
		}
		return teacher;
	}
	
	/*
     * 通过老师主键查询老师所带班级
   */
	public List<Grade> findTeacherGrade_tId(Integer teacher_id) throws Exception{
		// TODO Auto-generated method stub
		List<Grade> grade = teachermm.findTeacherGrade_tId(teacher_id);
		
		//查询为空
		if(grade.size() == 0)
		{
			throw new TeacherException(TeacherResultEnum.GRADE_findNULL);
		}
		return grade;
	}
	
	/*
	 * 搜索班级 id 得相关学生集合
	 */
	@Override
	public List<GradeStudentQueryVo> findClassStatus(Integer grade_id) throws Exception{
		// TODO Auto-generated method stub
		List<GradeStudentQueryVo> findClassStatus = teachermm.findClassStatus(grade_id);
		
		//查询为空
		if(findClassStatus.size() == 0)
		{
			throw new TeacherException(TeacherResultEnum.GRADE_findNULL);
		}
		return findClassStatus;
	}
	
	/*
	 * 搜索同学名字 返回所有信息
	 */
	@Override
	public List<Student> findOneStudent(String student_name) throws Exception {
		// TODO Auto-generated method stub
		
		List<Student> student = teachermm.findOneStudent(student_name);
		
		//查询为空
		if(student.size() == 0)
		{
			throw new StudentException(ResultEnum.STUDENT_findNULL);
		}
		
		return student;
	}

}
