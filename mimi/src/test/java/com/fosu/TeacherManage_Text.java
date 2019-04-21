package com.fosu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fosu.dao.teacher.TeacherManageMapper;
import com.fosu.pojo.Grade;
import com.fosu.pojo.Teacher;
import com.fosu.vo.GradeStudentQueryVo;
import com.fosu.vo.TeacherAndGrade;
@RunWith(SpringRunner.class)
@SpringBootTest
public class TeacherManage_Text {

	@Autowired
	private TeacherManageMapper teacherManageMapper;
	
	@Test
	//测试增加老师用户
	public void Test_insertTeacher() {	
		Teacher teacher = new Teacher();
		teacher.setTeacher_name("长春吖");
		teacher.setTeacher_username("c3c4");
		teacher.setTeacher_password("123");

		//空情况
		teacherManageMapper.insertTeacher(teacher);
		if(teacher.getTeacher_id()!= null)
		System.out.println(teacher.getTeacher_id());
		System.out.println("sdfsdfoj");
	}

	@Test
	//测试查询老师用户
	public void Test_findTeacher_id() {
		String teacher_username="12312"; //存在
		String teacher_no_username = "lsdskfjsdlkfj;gwe"; //不存在
		
		//存在时
		Integer findTeacher = teacherManageMapper.findTeacher(teacher_username);
		System.out.println(findTeacher);
		
		//不存在时
		Integer findTeacher2 = teacherManageMapper.findTeacher(teacher_no_username);
		System.out.println(findTeacher2);
		
	}
	@Test
	//测试增加关联表(批量）
	public void Test_insertTeacher_grade() {
		
		Map<String,Object> saveParams = new HashMap<>();
		//找到该教师的id
		//找到有关届的所有idList （已存在）
		int teacher_id = 1;
		Integer[] datas = new Integer[]{3,4};
		ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(datas));
		//Arrays.asList("1","2")
		
		saveParams.put("for_teacher_id", teacher_id);
		saveParams.put("for_grade_id", arrayList);
		
		teacherManageMapper.insertTeacher_grade(saveParams);
	}
	
	@Test
	//查询 老师关联 年级
	public void Test_findTeacherAndGrade() {
		Integer teacher_id = 1;
		
		List<TeacherAndGrade> teacherAndGrade = teacherManageMapper.findTeacherAndGrade(teacher_id);
		
		 for (TeacherAndGrade tag : teacherAndGrade) {
			System.out.println(tag.getTeacher_id()+","+tag.getTeacher_name()+","+"教以下班级");
			List<Grade> grade = tag.getGrade();
			for (Grade g : grade) {
				System.out.println(g.getGrade_id()+","+g.getGrade_period()+","+g.getGrade_specialty()+","+g.getGrade_class()+"班");
			}
		}
	}
	
	@Test
	//测试  搜索班级 id 得相关学生信息集合
	public void Test_findClassStatus() {
		Integer grade_id = 3;
		List<GradeStudentQueryVo> context = teacherManageMapper.findClassStatus(grade_id);
		
		for (GradeStudentQueryVo gradeStudentQueryVo : context) {

			System.out.println(gradeStudentQueryVo.getStudent_name());
		}
	}
}
