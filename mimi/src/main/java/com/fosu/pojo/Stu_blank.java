package com.fosu.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="做题记录填空表 ",value="Blank")
public class Stu_blank {

	@ApiModelProperty(value="填空题主键")
	private Integer stu_blank_id ;
	@ApiModelProperty(value="外键对应题目主键id")
	private Integer for_bla_que_id;
	
	@ApiModelProperty(value="外键 对应学生主键id")
	private Integer for_bla_stu_id;
	
	@ApiModelProperty(value="填空题正确详细信息")
	private String stu_blank_option;
	
	@ApiModelProperty(value="填空题 选项答案")
	private String stu_blank_answer;

	@ApiModelProperty(value="填空题 得分")
	private Integer stu_blank_score;
	
	@ApiModelProperty(value="填空是否正确")
	private String stu_blank_correction;
	
	@ApiModelProperty(value="生成时间")
	private String stu_blank_CreateTime;

	public Integer getStu_blank_id() {
		return stu_blank_id;
	}

	public void setStu_blank_id(Integer stu_blank_id) {
		this.stu_blank_id = stu_blank_id;
	}

	public Integer getFor_bla_que_id() {
		return for_bla_que_id;
	}

	public void setFor_bla_que_id(Integer for_bla_que_id) {
		this.for_bla_que_id = for_bla_que_id;
	}

	public Integer getFor_bla_stu_id() {
		return for_bla_stu_id;
	}

	public void setFor_bla_stu_id(Integer for_bla_stu_id) {
		this.for_bla_stu_id = for_bla_stu_id;
	}

	public String getStu_blank_option() {
		return stu_blank_option;
	}

	public void setStu_blank_option(String stu_blank_option) {
		this.stu_blank_option = stu_blank_option;
	}

	public String getStu_blank_answer() {
		return stu_blank_answer;
	}

	public void setStu_blank_answer(String stu_blank_answer) {
		this.stu_blank_answer = stu_blank_answer;
	}

	public Integer getStu_blank_score() {
		return stu_blank_score;
	}

	public void setStu_blank_score(Integer stu_blank_score) {
		this.stu_blank_score = stu_blank_score;
	}

	public String getStu_blank_correction() {
		return stu_blank_correction;
	}

	public void setStu_blank_correction(String stu_blank_correction) {
		this.stu_blank_correction = stu_blank_correction;
	}

	public String getStu_blank_CreateTime() {
		return stu_blank_CreateTime;
	}

	public void setStu_blank_CreateTime(String stu_blank_CreateTime) {
		this.stu_blank_CreateTime = stu_blank_CreateTime;
	}

	
}
