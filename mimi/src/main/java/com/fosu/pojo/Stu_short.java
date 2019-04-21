package com.fosu.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="做题记录简答表 ",value="Short")
public class Stu_short {

	@ApiModelProperty(value="简答题主键")
	private Integer stu_short_id;
	@ApiModelProperty(value="外键对应题目主键id")
	private Integer for_sho_que_id;
	
	@ApiModelProperty(value="外键 对应学生主键id")
	private Integer for_sho_stu_id;
	
	@ApiModelProperty(value="简答题答案")
	private String stu_short_answer ;

	@ApiModelProperty(value="简答题是否正确")
	private String stu_short_correction;
	
	@ApiModelProperty(value="生成时间")
	private String stu_short_CreateTime;

	public Integer getStu_short_id() {
		return stu_short_id;
	}

	public void setStu_short_id(Integer stu_short_id) {
		this.stu_short_id = stu_short_id;
	}

	public Integer getFor_sho_que_id() {
		return for_sho_que_id;
	}

	public void setFor_sho_que_id(Integer for_sho_que_id) {
		this.for_sho_que_id = for_sho_que_id;
	}

	public Integer getFor_sho_stu_id() {
		return for_sho_stu_id;
	}

	public void setFor_sho_stu_id(Integer for_sho_stu_id) {
		this.for_sho_stu_id = for_sho_stu_id;
	}

	public String getStu_short_answer() {
		return stu_short_answer;
	}

	public void setStu_short_answer(String stu_short_answer) {
		this.stu_short_answer = stu_short_answer;
	}

	public String getStu_short_correction() {
		return stu_short_correction;
	}

	public void setStu_short_correction(String stu_short_correction) {
		this.stu_short_correction = stu_short_correction;
	}

	public String getStu_short_CreateTime() {
		return stu_short_CreateTime;
	}

	public void setStu_short_CreateTime(String stu_short_CreateTime) {
		this.stu_short_CreateTime = stu_short_CreateTime;
	}

	
	
}
