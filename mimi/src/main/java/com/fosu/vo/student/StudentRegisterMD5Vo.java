package com.fosu.vo.student;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@ApiModel(description="学生注册信息" )
public class StudentRegisterMD5Vo {
/*
 * username 用户名"
			+ "password 密码"
			+ "number 学号"
			+ "specialty 专业"
 */
	@ApiModelProperty(value="学生-用户名")
	private String username;
	
	@ApiModelProperty(value="学生-密码")
	private String password;
	
	@ApiModelProperty(value="学生-学号")
	private String number;
	
	@ApiModelProperty(value="学生-专业")
	private String specialty;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	
}
