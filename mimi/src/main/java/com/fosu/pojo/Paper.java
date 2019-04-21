package com.fosu.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/*
 * 试卷
 */
@ApiModel(description="试卷",value="Paper")
public class Paper {

	//试卷id
	@ApiModelProperty(value="试卷id")
	private Integer paper_id;
	//试卷标题
	@ApiModelProperty(value="试卷标题")
	private String paper_title;
	//试卷总分
	@ApiModelProperty(value="试卷总分")
	private Integer paper_total_score ;
	//试卷题目数?
	@ApiModelProperty(value="试卷题目数?")
	private Integer paper_question_number ;
	//考试时长
	@ApiModelProperty(value="考试时长")
	private Integer paper_time;
	//试卷说明
	@ApiModelProperty(value="试卷说明")
	private String paper_explain ;
	public Integer getPaper_id() {
		return paper_id;
	}
	public void setPaper_id(Integer paper_id) {
		this.paper_id = paper_id;
	}
	public String getPaper_title() {
		return paper_title;
	}
	public void setPaper_title(String paper_title) {
		this.paper_title = paper_title;
	}
	public Integer getPaper_total_score() {
		return paper_total_score;
	}
	public void setPaper_total_score(Integer paper_total_score) {
		this.paper_total_score = paper_total_score;
	}
	public Integer getPaper_question_number() {
		return paper_question_number;
	}
	public void setPaper_question_number(Integer paper_question_number) {
		this.paper_question_number = paper_question_number;
	}
	public Integer getPaper_time() {
		return paper_time;
	}
	public void setPaper_time(Integer paper_time) {
		this.paper_time = paper_time;
	}
	public String getPaper_explain() {
		return paper_explain;
	}
	public void setPaper_explain(String paper_explain) {
		this.paper_explain = paper_explain;
	}
	
}
