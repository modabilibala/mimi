package com.fosu.vo.exam;

import java.sql.Timestamp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="每时成绩 ",value="TimeExam")
public class TimeExam {

	
	@ApiModelProperty(value="成绩表ID")
	private Integer exam_id;
	@ApiModelProperty(value="日期")
	private Timestamp exam_CreateTime;
	
	@ApiModelProperty(value="成绩")
	private float exam_score;

	@ApiModelProperty(value="星期")
	private String exam_week;

	@ApiModelProperty(value="具体时间")
	private String exam_time;

	public Integer getExam_id() {
		return exam_id;
	}

	public void setExam_id(Integer exam_id) {
		this.exam_id = exam_id;
	}

	public Timestamp getExam_CreateTime() {
		return exam_CreateTime;
	}

	public void setExam_CreateTime(Timestamp exam_CreateTime) {
		this.exam_CreateTime = exam_CreateTime;
	}

	public float getExam_score() {
		return exam_score;
	}

	public void setExam_score(float exam_score) {
		this.exam_score = exam_score;
	}

	public String getExam_week() {
		return exam_week;
	}

	public void setExam_week(String exam_week) {
		this.exam_week = exam_week;
	}

	public String getExam_time() {
		return exam_time;
	}

	public void setExam_time(String exam_time) {
		this.exam_time = exam_time;
	}

	@Override
	public String toString() {
		return "TimeExam [exam_id=" + exam_id + ", exam_CreateTime=" + exam_CreateTime + ", exam_score=" + exam_score
				+ ", exam_week=" + exam_week + ", exam_time=" + exam_time + "]";
	}
	




}
