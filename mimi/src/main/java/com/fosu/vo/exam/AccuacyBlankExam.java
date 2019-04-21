package com.fosu.vo.exam;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="章节Blank正确率 ",value="AccuacyBlankExam")
public class AccuacyBlankExam {

	@ApiModelProperty(value="填空ID")
	private Integer blank_id;
	
	@ApiModelProperty(value="章节ID")
	private Integer que_index_id;
	
	@ApiModelProperty(value="科目名")
	private String question_subject;
	
	@ApiModelProperty(value="章")
	private String question_chapter;
	
	@ApiModelProperty(value="节")
	private String question_section;
	
	@ApiModelProperty(value="章名")
	private String question_chapName;
	
	@ApiModelProperty(value="节名")
	private String question_secName;
	
	@ApiModelProperty(value="正确率")
	private float accuacy;

	public Integer getBlank_id() {
		return blank_id;
	}

	public void setBlank_id(Integer blank_id) {
		this.blank_id = blank_id;
	}

	public Integer getQue_index_id() {
		return que_index_id;
	}

	public void setQue_index_id(Integer que_index_id) {
		this.que_index_id = que_index_id;
	}

	public String getQuestion_subject() {
		return question_subject;
	}

	public void setQuestion_subject(String question_subject) {
		this.question_subject = question_subject;
	}

	public String getQuestion_chapter() {
		return question_chapter;
	}

	public void setQuestion_chapter(String question_chapter) {
		this.question_chapter = question_chapter;
	}

	public String getQuestion_section() {
		return question_section;
	}

	public void setQuestion_section(String question_section) {
		this.question_section = question_section;
	}

	public String getQuestion_chapName() {
		return question_chapName;
	}

	public void setQuestion_chapName(String question_chapName) {
		this.question_chapName = question_chapName;
	}

	public String getQuestion_secName() {
		return question_secName;
	}

	public void setQuestion_secName(String question_secName) {
		this.question_secName = question_secName;
	}

	public float getAccuacy() {
		return accuacy;
	}

	public void setAccuacy(float accuacy) {
		this.accuacy = accuacy;
	}
	
}
