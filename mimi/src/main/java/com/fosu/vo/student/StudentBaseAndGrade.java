package com.fosu.vo.student;

import com.fosu.pojo.Grade;
import com.fosu.pojo.Student;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(description="学生年级基本信息" )
public class StudentBaseAndGrade {
	@ApiModelProperty(value="学生-class")
	private Student student;

	@ApiModelProperty(value="年级-class")
	private Grade grade;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

}

