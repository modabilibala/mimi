package com.fosu.pojo;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/*
 *  grade_id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT'������',
	grade_period INT NOT NULL COMMENT'�� ��',
	grade_specialty VARCHAR(20) COMMENT'�� רҵ',
	grade_class INT COMMENT'�� �༶'
 */
@ApiModel(value="Grade",description="年级")
public class Grade {
	@ApiModelProperty(value="年级ID")
	private Integer grade_id;
	
	@ApiModelProperty(value="x届")
	private String grade_period;
	
	@ApiModelProperty(value="x专业")
	private String grade_specialty;
	
	@ApiModelProperty(value="x班")
	private String grade_class;
	
	
	
	public Integer getGrade_id() {
		return grade_id;
	}
	public void setGrade_id(Integer grade_id) {
		this.grade_id = grade_id;
	}
	public String getGrade_period() {
		return grade_period;
	}
	public void setGrade_period(String grade_period) {
		this.grade_period = grade_period;
	}
	public String getGrade_specialty() {
		return grade_specialty;
	}
	public void setGrade_specialty(String grade_specialty) {
		this.grade_specialty = grade_specialty;
	}
	public String getGrade_class() {
		return grade_class;
	}
	public void setGrade_class(String grade_class) {
		this.grade_class = grade_class;
	}
	
	@Override
	public String toString() {
		return "Grade [grade_id=" + grade_id + ", grade_period=" + grade_period + ", grade_specialty=" + grade_specialty
				+ ", grade_class=" + grade_class + "]";
	}
	
}
