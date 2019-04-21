package com.fosu.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="题目索引表 ",value="Que_index")
public class QueIndex {

	@ApiModelProperty(value="题目索引id")
	private Integer que_index_id ;
	
	@ApiModelProperty(value="题目所属科目")
	private String question_subject  ;
	
	@ApiModelProperty(value="题目所属科章")
	private String question_chapter   ;
	
	@ApiModelProperty(value="题目所属科节")
	private String question_section   ;

	public Integer getQue_index_id() {
		return que_index_id;
	}

	public void setQue_index_id(Integer que_index_id) {
		this.que_index_id = que_index_id;
	}

	public String getQuestion_subject() {
		return question_subject;
	}

	public void setQuestion_subject(String question_subject) {
		this.question_subject = question_subject;
	}

	public String getQuestion_chapter() {
		return question_chapter;
	}

	public void setQuestion_chapter(String question_chapter) {
		this.question_chapter = question_chapter;
	}

	public String getQuestion_section() {
		return question_section;
	}

	public void setQuestion_section(String question_section) {
		this.question_section = question_section;
	}

	
	
}
