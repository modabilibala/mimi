package com.fosu.dao.teacher;

import java.util.List;
import java.util.Map;

import com.fosu.pojo.Grade;
import com.fosu.pojo.Student;
import com.fosu.pojo.Teacher;
import com.fosu.vo.GradeQueryVo;
import com.fosu.vo.GradeStudentQueryVo;
import com.fosu.vo.TeacherAndGrade;
import com.fosu.vo.teacher.TeacherMessage;


public interface TeacherManageMapper {
	//增加老师用户
	void insertTeacher(Teacher teacher);
	
	//查询老师用户
	Integer findTeacher(String teacher_username);
	//增加 中间表 老师 和 教导关系  (批量）
	//需要变量 老师 id、List<年级id>
	void insertTeacher_grade(Map<String, Object> map);
	
	//增加中间表   -- 在dao层实现 耦合性太低   
	//查询 老师关联 年级
	List <TeacherAndGrade> findTeacherAndGrade(Integer teacher_id);
	
	//通过老师ID查所有信息
	Teacher findTeacher_id(Integer teacher_id);
	
	//通过老师主键查询老师所带班级
	List<Grade> findTeacherGrade_tId(Integer teacher_id) ;
	
	// 搜索班级 id 得相关学生信息集合
	List<GradeStudentQueryVo> findClassStatus(Integer grade_id);
	
	// 搜索同学名字 返回所有信息
	List<Student> findOneStudent(String student_name);
}
