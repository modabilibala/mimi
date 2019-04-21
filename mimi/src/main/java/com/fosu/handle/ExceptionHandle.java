package com.fosu.handle;

import org.slf4j.LoggerFactory;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UnknownAccountException;
//不兼容的类型: org.slf4j.Logger无法转换为java.util.logging.Logger
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fosu.aspect.HttpAspect;
import com.fosu.exception.StudentException;
import com.fosu.exception.TeacherException;
import com.fosu.pojo.result.Result;
import com.fosu.utils.ResultUtil;


/*
 * 捕获异常
 */

@ControllerAdvice
public class ExceptionHandle {
	
	//不能再exception中加入logger
	private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);
	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public Result handle(Exception e) {
		//异常是Student
		if(e instanceof StudentException) {
			StudentException studentException = (StudentException)e;
			return  ResultUtil.error(studentException.getCode(), studentException.getMessage());
		}
		//异常是Teacher
		if(e instanceof TeacherException) {
			TeacherException teacherException = (TeacherException)e;
			return  ResultUtil.error(teacherException.getCode(), teacherException.getMessage());
		}
		if(e instanceof AuthenticationException)
		{
			if(e instanceof UnknownAccountException)
			{logger.error("{用户名检验错误} { }",e);
				return ResultUtil.error(1, "用户名不存在");
			}
		
			return ResultUtil.error(-4, "密码错误");
		}
		else {
			logger.error("{系统异常} { }",e);
			return ResultUtil.error(-1, "未知错误");
		}

	}
}
