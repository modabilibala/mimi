package com.fosu.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fosu.pojo.Student;
import com.fosu.pojo.result.Result;
import com.fosu.utils.ResultUtil;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("api")
public class getText {
	
	@ApiOperation(value = "返回一个学生",notes ="这个是干甚么的")
	@ApiImplicitParam(name = "id", value = "学生ID",paramType = "path", required = true, dataType="Integer")
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Result<Student> getStudent(@PathVariable int id){
		Student stu = new Student();
		stu.setStudent_id(id);
		stu.setStudent_name("mimi");
		stu.setStudent_password("3306");
		return ResultUtil.success(stu);
	}
	@ApiOperation(value="创建复杂对象",notes="复杂复杂对象")
	@RequestMapping(value="/users-3",method=RequestMethod.POST)
	public Result<Student> postStudent(@RequestBody Student studnet){
		return ResultUtil.success(studnet);
	}
}
