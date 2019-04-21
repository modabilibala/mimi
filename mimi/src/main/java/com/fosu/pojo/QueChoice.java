package com.fosu.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="做题记录选择表 ",value="Que_choice")
public class QueChoice {
	@ApiModelProperty(value="选择题id")
	private Integer que_choice_id;
	@ApiModelProperty(value="外键 题目id")
	private Integer for_que_choice_question_id;
	@ApiModelProperty(value="题目内容")
	private String que_choice_context;
	@ApiModelProperty(value="选项A")
	private String que_choice_optionA;
	@ApiModelProperty(value="选项B")
	private String que_choice_optionB;
	@ApiModelProperty(value="选项C")
	private String que_choice_optionC;
	@ApiModelProperty(value="选项D")
	private String que_choice_optionD;
	@ApiModelProperty(value="题目答案")
	private String que_choice_answer;
	@ApiModelProperty(value="注释")
	private String que_choice_detail;
	public Integer getQue_choice_id() {
		return que_choice_id;
	}
	public void setQue_choice_id(Integer que_choice_id) {
		this.que_choice_id = que_choice_id;
	}
	public Integer getFor_que_choice_question_id() {
		return for_que_choice_question_id;
	}
	public void setFor_que_choice_question_id(Integer for_que_choice_question_id) {
		this.for_que_choice_question_id = for_que_choice_question_id;
	}
	public String getQue_choice_context() {
		return que_choice_context;
	}
	public void setQue_choice_context(String que_choice_context) {
		this.que_choice_context = que_choice_context;
	}
	public String getQue_choice_optionA() {
		return que_choice_optionA;
	}
	public void setQue_choice_optionA(String que_choice_optionA) {
		this.que_choice_optionA = que_choice_optionA;
	}
	public String getQue_choice_optionB() {
		return que_choice_optionB;
	}
	public void setQue_choice_optionB(String que_choice_optionB) {
		this.que_choice_optionB = que_choice_optionB;
	}
	public String getQue_choice_optionC() {
		return que_choice_optionC;
	}
	public void setQue_choice_optionC(String que_choice_optionC) {
		this.que_choice_optionC = que_choice_optionC;
	}
	public String getQue_choice_optionD() {
		return que_choice_optionD;
	}
	public void setQue_choice_optionD(String que_choice_optionD) {
		this.que_choice_optionD = que_choice_optionD;
	}
	public String getQue_choice_answer() {
		return que_choice_answer;
	}
	public void setQue_choice_answer(String que_choice_answer) {
		this.que_choice_answer = que_choice_answer;
	}
	public String getQue_choice_detail() {
		return que_choice_detail;
	}
	public void setQue_choice_detail(String que_choice_detail) {
		this.que_choice_detail = que_choice_detail;
	}
	
}
