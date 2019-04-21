package com.fosu.pojo;

import java.text.SimpleDateFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/*
 * 成绩表
 */
@ApiModel(description="成绩表",value="Exam")
public class Exam {

	//成绩单主键
	@ApiModelProperty(value="主键")
	private Integer exam_id;
	//外键对应学生ID主键
	@ApiModelProperty(value="外键对应学生ID主键")
	private Integer for_exam_student_id;
	//外键 对应试卷ID主键
	@ApiModelProperty(value="外键 对应试卷ID主键")
	private Integer for_exam_paper_id;
	//成绩分数
	@ApiModelProperty(value="成绩分数")
	private float exam_score;
	//成绩单对应课程
	@ApiModelProperty(value="成绩单对应课程")
	private String exam_course;
	//成绩表生成时间
	@ApiModelProperty(value="成绩表生成时间")
	private String exam_CreateTime;
	//成绩表修改时间
	@ApiModelProperty(value="成绩表修改时间")
	private String exam_UpdateTime;
	
	//测试 不用 SimpleDateFormate
	
	
	public Integer getExam_id() {
		return exam_id;
	}
	public void setExam_id(Integer exam_id) {
		this.exam_id = exam_id;
	}
	public Integer getFor_exam_student_id() {
		return for_exam_student_id;
	}
	public void setFor_exam_student_id(Integer for_exam_student_id) {
		this.for_exam_student_id = for_exam_student_id;
	}
	public Integer getFor_exam_paper_id() {
		return for_exam_paper_id;
	}
	public void setFor_exam_paper_id(Integer for_exam_paper_id) {
		this.for_exam_paper_id = for_exam_paper_id;
	}
	public float getExam_score() {
		return exam_score;
	}
	public void setExam_score(float exam_score) {
		this.exam_score = exam_score;
	}
	public String getExam_CreateTime() {
		return exam_CreateTime;
	}
	public void setExam_CreateTime(String exam_CreateTime) {
		this.exam_CreateTime = exam_CreateTime;
	}
	public String getExam_UpdateTime() {
		return exam_UpdateTime;
	}
	public void setExam_UpdateTime(String exam_UpdateTime) {
		this.exam_UpdateTime = exam_UpdateTime;
	}
	
	
}
