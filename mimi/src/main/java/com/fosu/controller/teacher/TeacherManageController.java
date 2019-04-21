package com.fosu.controller.teacher;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.websocket.server.PathParam;

import org.apache.ibatis.annotations.Param;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fosu.aspect.HttpAspect;
import com.fosu.pojo.Grade;
import com.fosu.pojo.Student;
import com.fosu.pojo.Teacher;
import com.fosu.pojo.result.Result;
import com.fosu.service.teacher.TeacherManageService;
import com.fosu.utils.ResultUtil;
import com.fosu.vo.GradeStudentQueryVo;
import com.fosu.vo.teacher.TeacherAndGradeBase;
import com.fosu.vo.teacher.TeacherMessage;

import ch.qos.logback.classic.Logger;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RequestMapping("/teacher")
@RestController
@Api(value="老师controller",tags={"老师操作接口"})
public class TeacherManageController {
	
     @Autowired
	private TeacherManageService teacherms;
     
	//@RequestMapping("/{page}/{id}")
	//public String TeacherRegisterC(@PathVariable String page, Integer id) {
		//System.out.println(id);
		//return page;
	//}
//	@RequestMapping("/{page}")
//	public String TeacherRegisterC(@PathVariable String page) {
//		System.out.println("老师注册页面");
//		return "/teacher/"+page;
//	}
//	@RequestMapping(value="/User",method=RequestMethod.POST)
//	public String TeacherLogin() {
//		
//		return "/teacher/teacherLogin";
//	}
	/*增加老师用户
	 * 
	 */
    @ApiOperation(value="增加老师用户",notes="MiKi 1-8")
	@PostMapping("/register")
	public Result<Teacher> TeacherAdd(@RequestBody Teacher teacher) throws Exception{
		teacherms.addTeacher(teacher);
		return ResultUtil.success(teacher);
	}
	
	/*
	 * 查询老师用户
	 */
    @ApiOperation(value="查询老师用户名 返回ID",notes="MiKi 1-8")
    @ApiImplicitParam(name = "teacher_username", value = "老师用户名",paramType = "path", required = true, dataType="String")
	@GetMapping(value="/findTeacher_id/{teacher_username}")
	public Result<Integer> findTeacher_id(@PathVariable String teacher_username) throws Exception
	{
		Integer teacher_id = teacherms.findTeacher_id(teacher_username);
		return ResultUtil.success(teacher_id);
	}
	
	//增加 中间表 老师 和 教导关系  (非批量）
	//需要变量 老师 id、List<年级id>
    @ApiOperation(value="增加老师所带班级 返回ID",notes="MiKi 1-8")
	@PostMapping("/midTeacher_Grade")
	public Result<Integer> insertTeacher_grade(@RequestBody TeacherAndGradeBase teacherAndGrade) throws Exception{
		teacherms.insertTeacher_grade(teacherAndGrade);
		
		return ResultUtil.success();
	}
    
	/*
	 * 通过主键 提供该老师所有信息
	 */
    @ApiOperation(value="通过主键 提供该老师所有信息",notes="MiKi 1-14 老师登录功能")
    @GetMapping(value = "/TeacherMessage/{teacher_id}")
    public Result<TeacherMessage> Teacher_id(@PathVariable Integer teacher_id) throws Exception{
    	System.out.println(teacher_id);
    	Teacher teacher = teacherms.Teacher_id(teacher_id);
    	
    	return ResultUtil.success(teacher);
    }
    /*
       * 通过主键查询老师所带班级
     */
    @ApiOperation(value="通过老师主键查询老师所带班级",notes="MiKi 1-16 老师查询班级功能")
    @GetMapping(value="/findTeacherGrade_tId/{teacher_id}")
    public Result<List<Grade>>findTeacherGrade_tId(@PathVariable Integer teacher_id) throws Exception
    {
    	List<Grade> grade_tId = teacherms.findTeacherGrade_tId(teacher_id);

    	for (Grade grade : grade_tId) {
			System.out.println(grade);
		}
    	return ResultUtil.success(grade_tId);
    }
	/*
	 * 搜索班级 id 得相关学生集合
	 */
	@ApiOperation(value="搜索班级 id 得相关学生集合",notes="MIKI 1-16")
	@GetMapping(path="/findStudent_gradeId/{grade_id}")
	public Result<List<GradeStudentQueryVo>> findStudent_gradeId(@PathVariable Integer grade_id) throws Exception {
		
		List<GradeStudentQueryVo> findClassStatus = teacherms.findClassStatus(grade_id);
		return  ResultUtil.success(findClassStatus);
	}
	/*
	 * 搜索同学名字 返回所有信息
	 */
	@ApiOperation(value="搜索同学名字 返回基础信息",notes="MIKI 1-16")
	@GetMapping(path="findOneStudent/{student_name}")
	public Result<List<Student>> findOneStudent(@PathVariable String student_name) throws Exception{
		
		List<Student> student = teacherms.findOneStudent(student_name);
		
		return ResultUtil.success(student);
	}
	/*
	 * 获取学生ID得exam Paper 
	 */
	
	/*
	 * 测试
	 */
//	@PostMapping("/midTeacher_Grade2")
//	public Result<Integer> insertTeacher_grade2(TeacherAndGradeBase teacherAndGrade) throws Exception{
//		
//		return ResultUtil.success(teacherAndGrade.getTeacher_id());
//	}
	
	
}
