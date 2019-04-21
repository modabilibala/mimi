package com.fosu.vo.book;

import java.util.List;

import io.swagger.annotations.ApiModelProperty;

public class BookBaseBlank {


	@ApiModelProperty(value="学生名字")
	private  String Student_name;
	
	@ApiModelProperty(value="题目类型")
	private String question_type;
	
	@ApiModelProperty(value="List Choice")
	private List <BlankLink> BlaLink;

	public String getStudent_name() {
		return Student_name;
	}

	public void setStudent_name(String student_name) {
		Student_name = student_name;
	}

	public String getQuestion_type() {
		return question_type;
	}

	public void setQuestion_type(String question_type) {
		this.question_type = question_type;
	}

	public List<BlankLink> getBlaLink() {
		return BlaLink;
	}

	public void setBlaLink(List<BlankLink> blaLink) {
		BlaLink = blaLink;
	}
	

}
