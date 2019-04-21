package com.fosu.dao.student;

import java.util.List;
import java.util.Map;

import com.fosu.pojo.Student;
import com.fosu.vo.StudentAndGrade;
import com.fosu.vo.student.StudentBaseAndGrade;
import com.fosu.vo.student.StudentInfo;
import com.fosu.vo.student.StudentLogin;

public interface StudentMapper {
	

	//查询班级的学生 通过班级id
	List<StudentAndGrade> findStudentByGradeId(Integer grade_id);
	
	//修改学生信息 by 学生ID
	void StudentInfo(StudentInfo student);
	
	//查看学生基本信息
	StudentBaseAndGrade findStudentInfo(Integer student_id);
	
	//插入学生基本信息 返回ID
	Integer insertBaseStudent(Student student);
	
	//学生登录功能 by username
	StudentLogin findStudentLogin(Map<String,String> student);
	
	//学生注册功能
	Integer insertStudentRegister(Map<String,Object> student);
	
	//学生登录情况
	boolean findStudentExist(Map<String,String> student);
	
	//根据用户名查询信息
	Map<String,String> findStudentByUsername(String username);
}
