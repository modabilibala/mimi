package com.fosu.serviceInf.teacher;

import java.util.List;

import com.fosu.pojo.Grade;
import com.fosu.pojo.Student;
import com.fosu.pojo.Teacher;
import com.fosu.vo.GradeStudentQueryVo;
import com.fosu.vo.teacher.TeacherAndGradeBase;

public interface TeacherInf {

	// 增加老师用户
	public void  addTeacher(Teacher teacher) throws Exception;
	//查询老师用户
	public Integer findTeacher_id(String teacher_username) throws Exception;
	
	/*增加 中间表 老师 和 教导关系  (批量）
	/*需要变量 老师 id、List<年级id>
	 */
	public void insertTeacher_grade(TeacherAndGradeBase teacherAndGrade) throws Exception;	
	
	/*
	 * 老师登录功能
	 */
	public Teacher Teacher_id(Integer teacher_id) throws Exception;
	
	/*
     * 通过主键查询老师所带班级
   */
	public List<Grade> findTeacherGrade_tId(Integer teacher_id) throws Exception;
	
	/*
	 * 搜索班级 id 得相关学生集合
	 */
	public List<GradeStudentQueryVo> findClassStatus(Integer grade_id)throws Exception;
	
	/*
	 * 搜索同学名字 返回所有信息
	 */
	public List<Student> findOneStudent(String student_name) throws Exception;
}
