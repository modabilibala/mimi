package com.fosu.vo.student;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="学生登录基本信息" )
public class StudentLogin {

	@ApiModelProperty(value="学生ID")
	Integer student_id;
	
	@ApiModelProperty(value="学生用户名")
	String student_username;
	
	@ApiModelProperty(value="学生密码")
	String student_password;
	
	@ApiModelProperty(value="学生名字")
	String student_name;

	public Integer getStudent_id() {
		return student_id;
	}

	public void setStudent_id(Integer student_id) {
		this.student_id = student_id;
	}

	public String getStudent_username() {
		return student_username;
	}

	public void setStudent_username(String student_username) {
		this.student_username = student_username;
	}

	public String getStudent_password() {
		return student_password;
	}

	public void setStudent_password(String student_password) {
		this.student_password = student_password;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	@Override
	public String toString() {
		return "StudentLogin [student_id=" + student_id + ", student_username=" + student_username
				+ ", student_password=" + student_password + ", student_name=" + student_name + "]";
	}
	
	
	
}
