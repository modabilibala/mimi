package com.fosu.vo;

import java.util.List;

import com.fosu.pojo.Grade;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="TeacherAndGrade",description="老师-年级vo")
public class TeacherAndGrade {
	
	@ApiModelProperty(value="老师ID")
	private Integer teacher_id;
	
	@ApiModelProperty(value="老师名字")
	private String teacher_name;
	
	@ApiModelProperty(value="所带班级")
	private List <Grade> grade;
	
	public Integer getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(Integer teacher_id) {
		this.teacher_id = teacher_id;
	}
	public String getTeacher_name() {
		return teacher_name;
	}
	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}
	public List<Grade> getGrade() {
		return grade;
	}
	public void setGrade(List<Grade> grade) {
		this.grade = grade;
	}
	
}
