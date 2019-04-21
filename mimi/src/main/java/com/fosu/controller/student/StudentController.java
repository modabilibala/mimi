package com.fosu.controller.student;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fosu.pojo.Student;
import com.fosu.pojo.result.Result;
import com.fosu.service.student.StudentService;
import com.fosu.utils.ResultUtil;
import com.fosu.vo.student.StudentBaseAndGrade;
import com.fosu.vo.student.StudentLogin;
import com.fosu.vo.student.StudentRegisterMD5Vo;

import ch.qos.logback.classic.Logger;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@RequestMapping("/student")
@RestController()
@Api(value="用户controller",tags={"学生操作接口"})
public class StudentController {

	@Autowired
	private StudentService stuService;
	
	
	/*
	 * 更新学生基本信息
	 * 420 传入参数为空
	 * 451 查询为空
	 */
	@ApiOperation(value="更新学生基本信息",notes = "miki 1-5 ")
	@PatchMapping(path = "/baseInfo/{student_id}")
	@ApiResponses({
		@ApiResponse(code=420,message="传入参数为空"),
		@ApiResponse(code=451,message="查询为空"),
	})
	public Result<StudentBaseAndGrade> findStudentBaseInfo(@PathVariable Integer student_id) throws Exception{
		
		
		
		StudentBaseAndGrade studentInfo = stuService.findStudentInfo(student_id);
		return null;
		
	}
	
	/*
	 * 查看学生基本信息
	 * 420 传入参数为空
	 * 451 查询为空
	 */
	@ApiOperation(value="查看学生基本信息",notes = "miki 1-5 ")
	@GetMapping(path = "/baseInfo/{student_id}")
	@ApiResponses({
		@ApiResponse(code=420,message="传入参数为空"),
		@ApiResponse(code=451,message="查询为空"),
	})
	public Result<StudentBaseAndGrade> StudentBaseInfo(@PathVariable Integer student_id) throws Exception{
		
		StudentBaseAndGrade studentInfo = stuService.findStudentInfo(student_id);
		
		return ResultUtil.success(studentInfo);
		
	}
	/*
	 * 学生登录功能
	 */
	@ApiOperation(value="学生登录功能",notes = "miki 1-5 session 增加 student_id,student_name")
	@PostMapping(path = "/login")
	@ApiResponses({
		@ApiResponse(code=404,message="用户名或密码错误"),
		@ApiResponse(code=200,message="用户登录成功"),
	})
	public Result<String> StudentLogin(@RequestBody StudentLogin studentLogin,HttpServletRequest request){
		
		//session创建
		HttpSession session = request.getSession();
		
		/*
		 * Shiro 认证
		 */
		//1.获取Subject
		Subject subject = SecurityUtils.getSubject();
		
		//2.封装用户数据
		UsernamePasswordToken token = new UsernamePasswordToken(studentLogin.getStudent_username(),studentLogin.getStudent_password());
		

		//3.执行登录方法
		try {
			subject.login(token);
			
			//放入学生ID和名字 于 session中
			session.setAttribute("student_id", studentLogin.getStudent_id());
			session.setAttribute("student_name", studentLogin.getStudent_name());
			
			return ResultUtil.success("用户登录成功");
			//登录成功
		}catch(AuthenticationException  e) {
			return ResultUtil.error(404, "用户名或密码错误");
						}
		}

	/*
	 * 学生注册
	 */
	@ApiOperation(value="学生注册功能",notes = "miki 1- + ")
	@PostMapping(path = "/registerMD5")
	@ApiResponses({
		@ApiResponse(code=400,message="请求参数没填好"),
		@ApiResponse(code=304,message="用户名已存在"),
		@ApiResponse(code=420,message="学号格式不对，无法识别届&班级")
	})
	public Result<String> StudentRegister(@RequestBody StudentRegisterMD5Vo studentInfo,HttpServletRequest request) throws Exception{
		
		//参数格式
		if(studentInfo.getNumber() == null || studentInfo.getPassword() == null || studentInfo.getSpecialty() == null || studentInfo.getUsername() == null)
			return  ResultUtil.error(400, "请求参数没填好"); 

		String student_id = stuService.StudentRegister(studentInfo);
		
		return ResultUtil.success("student_id:"+student_id);
	}
	


	

	@ApiOperation(value="测试返回响应",notes = "miki 1 -5 ")
	@GetMapping("/demo")
	public Result<Student> studentFind(){
		Student stu = new Student();
		stu.setStudent_id(1);
		stu.setStudent_name("mimi");
		stu.setStudent_password("3306");
		return ResultUtil.success(stu);
	}

}
