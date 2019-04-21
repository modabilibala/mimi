package com.fosu.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="题目难度表 ",value="Que_level")
public class QueLevel {
	@ApiModelProperty(value="题目难度id")
	private Integer que_level_id ;
	
	@ApiModelProperty(value="题目难度系数")
	private Integer que_level_level;
	
	@ApiModelProperty(value="题目分值")
	private Integer que_level_score ;
	
	@ApiModelProperty(value="建议时间")
	private Integer que_level_time;

	public Integer getQue_level_id() {
		return que_level_id;
	}

	public void setQue_level_id(Integer que_level_id) {
		this.que_level_id = que_level_id;
	}

	public Integer getQue_level_level() {
		return que_level_level;
	}

	public void setQue_level_level(Integer que_level_level) {
		this.que_level_level = que_level_level;
	}

	public Integer getQue_level_score() {
		return que_level_score;
	}

	public void setQue_level_score(Integer que_level_score) {
		this.que_level_score = que_level_score;
	}

	public Integer getQue_level_time() {
		return que_level_time;
	}

	public void setQue_level_time(Integer que_level_time) {
		this.que_level_time = que_level_time;
	}
	
	
}
