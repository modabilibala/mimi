package com.fosu.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="题目表 ",value="Question")
public class Question {

	@ApiModelProperty(value="题目id")
	private Integer question_id;
	
	@ApiModelProperty(value="题目类型")
	private String question_type;
	
	@ApiModelProperty(value="外键 题目索引id")
	private Integer for_question_que_index;
	
	@ApiModelProperty(value="外键 题目难度id")
	private Integer for_question_que_level_id ;
	
	@ApiModelProperty(value="外键 题目所属试卷id")
	private Integer for_question_paper_id ;


	

	public Integer getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(Integer question_id) {
		this.question_id = question_id;
	}

	public String getQuestion_type() {
		return question_type;
	}

	public void setQuestion_type(String question_type) {
		this.question_type = question_type;
	}

	public Integer getFor_question_que_index() {
		return for_question_que_index;
	}

	public void setFor_question_que_index(Integer for_question_que_index) {
		this.for_question_que_index = for_question_que_index;
	}

	public Integer getFor_question_que_level_id() {
		return for_question_que_level_id;
	}

	public void setFor_question_que_level_id(Integer for_question_que_level_id) {
		this.for_question_que_level_id = for_question_que_level_id;
	}

	public Integer getFor_question_paper_id() {
		return for_question_paper_id;
	}

	public void setFor_question_paper_id(Integer for_question_paper_id) {
		this.for_question_paper_id = for_question_paper_id;
	}
	
	
}
