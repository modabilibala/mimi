package com.fosu.vo.student;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="学生修改基本信息" )
public class StudentInfo {
// name nikiname gender phone
	
	@ApiModelProperty(value="学生ID")
	Integer student_id;
	
	@ApiModelProperty(value="学生-真实姓名")
	private String student_name; 
	
	@ApiModelProperty(value="学生-昵称")
	private String student_nikiname;
	
	@ApiModelProperty(value="学生-性别")
	private String student_gender;
	
	@ApiModelProperty(value="学生-手机号")
	private String student_phone;

	
	public Integer getStudent_id() {
		return student_id;
	}

	public void setStudent_id(Integer student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getStudent_nikiname() {
		return student_nikiname;
	}

	public void setStudent_nikiname(String student_nikiname) {
		this.student_nikiname = student_nikiname;
	}

	public String getStudent_gender() {
		return student_gender;
	}

	public void setStudent_gender(String student_gender) {
		this.student_gender = student_gender;
	}

	public String getStudent_phone() {
		return student_phone;
	}

	public void setStudent_phone(String student_phone) {
		this.student_phone = student_phone;
	}
	
}
