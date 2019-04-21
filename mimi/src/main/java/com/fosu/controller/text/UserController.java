package com.fosu.controller.text;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import io.swagger.annotations.Api;



@Controller
@Api(value="权限controller",tags={"权限记录操作接口--完善中"})
public class UserController {

	/*
	 * 登录逻辑处理
	 */
	@RequestMapping("/login")
	public String login(String name, String password , Model model) {
		/*
		 * Shiro 认证
		 */
		
		//1.获取Subject
		Subject subject = SecurityUtils.getSubject();
		
		//2.封装用户数据
		UsernamePasswordToken token = new UsernamePasswordToken();
		
		//3.执行登录方法
		try {
			subject.login(token);
			
			return "redirect:/testThymeleaf";
			//登录成功
		}catch(UnknownAccountException e) {
			//e.printStackTrace();
			//登录失败：用户名不存在
			model.addAttribute("msg","用户名不存在");
			return "me/loginme";
		}catch(IncorrectCredentialsException e){
			//e.printStackTrace();
			//登录失败：密码错误
			model.addAttribute("msg","密码错误");
			return "me/loginme";
		}
		}
	}


