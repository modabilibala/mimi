package com.fosu.serviceInf.student;

import java.util.Map;

import com.fosu.pojo.Student;
import com.fosu.vo.student.StudentBaseAndGrade;
import com.fosu.vo.student.StudentLogin;
import com.fosu.vo.student.StudentRegisterMD5Vo;
import com.fosu.vo.student.StudentInfo;
public interface StudentInf {
	
	//更新学生基本信息
	public StudentBaseAndGrade StudentInfo(StudentInfo studentInfo) throws Exception;
	
	//查看学生基本信息
	public StudentBaseAndGrade findStudentInfo(Integer student_id) throws Exception;
	
	//学生登录功能
	public StudentLogin findStudentLogin(Map<String,String> student);
	
	//学生注册
	public String StudentRegister (StudentRegisterMD5Vo student) throws Exception;
}

