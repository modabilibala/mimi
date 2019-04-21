package com.fosu.vo.exam;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="每周成绩 ",value="WeekExam")
public class WeekExam {

	@ApiModelProperty(value="科目")
	private String exam_course;
	
	@ApiModelProperty(value="每时成绩")
	private List<TimeExam> time_exam;



	public String getExam_course() {
		return exam_course;
	}

	public void setExam_course(String exam_course) {
		this.exam_course = exam_course;
	}

	public List<TimeExam> getTime_exam() {
		return time_exam;
	}

	public void setTime_exam(List<TimeExam> time_exam) {
		this.time_exam = time_exam;
	}

	@Override
	public String toString() {
		return "WeekExam [exam_course=" + exam_course + ", time_exam=" + time_exam + "]";
	}
	
	

}
