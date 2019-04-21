package com.fosu.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="题目简答表",value="Que_short")
public class QueShort {

	@ApiModelProperty(value="简答题id")
	private Integer que_short_id;
	@ApiModelProperty(value="外键 题目id")
	private Integer for_que_short_question_id;
	@ApiModelProperty(value="题目内容")
	private String que_short_context;
	@ApiModelProperty(value="题目答案")
	private String que_short_answer;
	@ApiModelProperty(value="注释")
	private String que_short_detail;
	public Integer getQue_short_id() {
		return que_short_id;
	}
	public void setQue_short_id(Integer que_short_id) {
		this.que_short_id = que_short_id;
	}
	public Integer getFor_que_short_question_id() {
		return for_que_short_question_id;
	}
	public void setFor_que_short_question_id(Integer for_que_short_question_id) {
		this.for_que_short_question_id = for_que_short_question_id;
	}
	public String getQue_short_context() {
		return que_short_context;
	}
	public void setQue_short_context(String que_short_context) {
		this.que_short_context = que_short_context;
	}
	public String getQue_short_answer() {
		return que_short_answer;
	}
	public void setQue_short_answer(String que_short_answer) {
		this.que_short_answer = que_short_answer;
	}
	public String getQue_short_detail() {
		return que_short_detail;
	}
	public void setQue_short_detail(String que_short_detail) {
		this.que_short_detail = que_short_detail;
	}
	
}
