package com.fosu.controller.grade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fosu.pojo.Grade;
import com.fosu.pojo.result.Result;
import com.fosu.serviceInf.grade.GradeInf;
import com.fosu.utils.ResultUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;



@RequestMapping("/grade")
@RestController()
@Api(value="年级controller",tags={"年级操作接口"})
public class GradeController {

	@Autowired
	private GradeInf gradeimp;
	
	//测试增加年级用户 -不重复
	@ApiOperation(value="增加年级用户 -不重复",notes="MiKi 1-8")
	@PostMapping(path = "/insertGrade")
	public Result<Grade> insertGrade(@RequestBody Grade grade){
		
		gradeimp.insertGrade(grade);
		return ResultUtil.success();
	}
	//查询年级单位返回id
	@ApiOperation(value="查询年级单位返回id",notes="MiKi 1-8")
	@PostMapping(path="/findGrade_id")
	public Result<Grade> findGrade_base(@RequestBody Grade grade) throws Exception{
		Integer grade_id = gradeimp.findGrade_base(grade);
		
		return ResultUtil.success(grade_id);
	}
}
