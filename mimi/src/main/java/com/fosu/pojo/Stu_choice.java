package com.fosu.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="做题记录表 -选择题 ",value="Choice")
public class Stu_choice {

	@ApiModelProperty(value="选择题主键")
	private Integer stu_choice_id;
	@ApiModelProperty(value="外键对应题目主键id")
	private Integer for_cho_que_id;
	
	@ApiModelProperty(value="外键 对应学生主键id")
	private Integer for_cho_stu_id;
	
	@ApiModelProperty(value="选择题选项")
	private String stu_choice_option ;
		
	@ApiModelProperty(value="选择题是否正确")
	private String stu_choice_correction;
	//成绩表生成时间
	@ApiModelProperty(value="choice生成时间")
	private String stu_choice_CreateTime;
	public Integer getStu_choice_id() {
		return stu_choice_id;
	}
	public void setStu_choice_id(Integer stu_choice_id) {
		this.stu_choice_id = stu_choice_id;
	}
	public Integer getFor_cho_que_id() {
		return for_cho_que_id;
	}
	public void setFor_cho_que_id(Integer for_cho_que_id) {
		this.for_cho_que_id = for_cho_que_id;
	}
	public Integer getFor_cho_stu_id() {
		return for_cho_stu_id;
	}
	public void setFor_cho_stu_id(Integer for_cho_stu_id) {
		this.for_cho_stu_id = for_cho_stu_id;
	}
	public String getStu_choice_option() {
		return stu_choice_option;
	}
	public void setStu_choice_option(String stu_choice_option) {
		this.stu_choice_option = stu_choice_option;
	}
	public String getStu_choice_correction() {
		return stu_choice_correction;
	}
	public void setStu_choice_correction(String stu_choice_correction) {
		this.stu_choice_correction = stu_choice_correction;
	}
	public String getStu_choice_CreateTime() {
		return stu_choice_CreateTime;
	}
	public void setStu_choice_CreateTime(String stu_choice_CreateTime) {
		this.stu_choice_CreateTime = stu_choice_CreateTime;
	}
	


	
	
	
}
