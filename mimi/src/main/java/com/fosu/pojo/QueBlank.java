package com.fosu.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="题目填空题表",value="Que_blank")
public class QueBlank {
	@ApiModelProperty(value="填空题id")
	private Integer que_blank_id;
	@ApiModelProperty(value="外键 题目id")
	private Integer for_que_blank_question_id;
	@ApiModelProperty(value="题目内容")
	private String que_blank_context;
	@ApiModelProperty(value="题目填空数")
	private Integer que_blank_num;
	@ApiModelProperty(value="填空答案")
	private String que_blank_answer;

	@ApiModelProperty(value="注释")
	private String que_blank_detail;
	
	
	public Integer getQue_blank_id() {
		return que_blank_id;
	}
	public void setQue_blank_id(Integer que_blank_id) {
		this.que_blank_id = que_blank_id;
	}
	public Integer getFor_que_blank_question_id() {
		return for_que_blank_question_id;
	}
	public void setFor_que_blank_question_id(Integer for_que_blank_question_id) {
		this.for_que_blank_question_id = for_que_blank_question_id;
	}
	public String getQue_blank_context() {
		return que_blank_context;
	}
	public void setQue_blank_context(String que_blank_context) {
		this.que_blank_context = que_blank_context;
	}
	public Integer getQue_blank_num() {
		return que_blank_num;
	}
	public void setQue_blank_num(Integer que_blank_num) {
		this.que_blank_num = que_blank_num;
	}

	public String getQue_blank_detail() {
		return que_blank_detail;
	}
	public void setQue_blank_detail(String que_blank_detail) {
		this.que_blank_detail = que_blank_detail;
	}
	
}
