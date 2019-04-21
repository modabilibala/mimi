package com.fosu.vo;

import java.util.List;

import com.fosu.pojo.Exam;
import com.fosu.pojo.Paper;

import io.swagger.annotations.ApiModelProperty;

public class GradeStudentQueryVo {
	@ApiModelProperty(value="年级ID")
	private Integer Grade_id;
	@ApiModelProperty(value="学生ID")
	private Integer Student_id;
	@ApiModelProperty(value="学生姓名")
	private String Student_name;
	@ApiModelProperty(value="学生学号")
	private String Student_number;
	
	@ApiModelProperty(value="成绩单 成绩  连 试卷")
	private List<ExamPaperLink> ExamPaper;

	
	public Integer getGrade_id() {
		return Grade_id;
	}

	public void setGrade_id(Integer grade_id) {
		Grade_id = grade_id;
	}

	public Integer getStudent_id() {
		return Student_id;
	}

	public void setStudent_id(Integer student_id) {
		Student_id = student_id;
	}

	public String getStudent_name() {
		return Student_name;
	}

	public void setStudent_name(String student_name) {
		Student_name = student_name;
	}

	public String getStudent_number() {
		return Student_number;
	}

	public void setStudent_number(String student_number) {
		Student_number = student_number;
	}

	public List<ExamPaperLink> getExamPaper() {
		return ExamPaper;
	}

	public void setExamPaper(List<ExamPaperLink> examPaper) {
		ExamPaper = examPaper;
	}
	
}
