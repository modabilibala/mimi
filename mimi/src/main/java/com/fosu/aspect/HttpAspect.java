package com.fosu.aspect;

import javax.servlet.http.HttpServletRequest;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.SourceLocation;
import org.aspectj.weaver.JoinPointSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.sun.jdi.LongType;

/*
 * 日志说明
 */
@Aspect
@Component
public class HttpAspect {

	
private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);
	
	@Pointcut("execution(public * com.fosu.controller.*.*.*(..))")
	public void log() {
		
	}
	@Before("log()")
	public void doBefore(JoinPoint joinPoint) {
		
		ServletRequestAttributes attributes=(ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
		HttpServletRequest request = attributes.getRequest();
		
		System.out.println("Get_log日志说明");
		//url
		logger.info("url={}",request.getRequestURL());
		
		//method
		logger.info("method={}",request.getMethod());
		
		//ip
		logger.info("ip={}",request.getRemoteAddr());
		
		//类方法
		logger.info("class_method={}", joinPoint.getSignature().getDeclaringTypeName()+"."+ joinPoint.getSignature().getName());
		
		//参数
		logger.info("args={}",joinPoint.getArgs());
	}
	
	@After("log()")
	public void doAfter() {
		logger.info("finally");
	}
	
	@AfterReturning(returning ="object" ,pointcut="log()")
	public void doAfterReturning(Object object) {
		System.out.println("返回_log日志说明");
		

		logger.info("response={}",object.toString());
		
		
	}
	
	@AfterThrowing(pointcut="log()",throwing="e")
	public void doException(JoinPoint jp, Throwable e) {
		if(e != null) {
			Logger logger = LoggerFactory.getLogger(jp.getSignature().getClass());
			logger.error("HttpAspect 抛出 程序发生异常"+e.getMessage(),e);
		}
	}
}
