package com.fosu.vo;

import com.fosu.pojo.Exam;
import com.fosu.pojo.Paper;

import io.swagger.annotations.ApiModelProperty;

public class ExamPaperLink {

	@ApiModelProperty(value="成绩单")
	private Exam exam;
	@ApiModelProperty(value="试卷")	
	private Paper paper;

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public Paper getPaper() {
		return paper;
	}

	public void setPaper(Paper paper) {
		this.paper = paper;
	}
	
	
}
