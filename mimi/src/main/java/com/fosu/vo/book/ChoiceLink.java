package com.fosu.vo.book;

import com.fosu.pojo.Stu_choice;
import com.fosu.pojo.Paper;
import com.fosu.pojo.QueChoice;
import com.fosu.pojo.QueIndex;
import com.fosu.pojo.QueLevel;

import io.swagger.annotations.ApiModelProperty;

public class ChoiceLink {

	@ApiModelProperty(value="选择记录")
    private Stu_choice cho;
		
	@ApiModelProperty(value="题型等级")
	private QueLevel q_le;
	
	@ApiModelProperty(value="题目章节")
	private QueIndex q_in;
	
	@ApiModelProperty(value="题目所属模拟卷")
	private Paper pap;
	
	@ApiModelProperty(value="选择题表")
	private QueChoice q_ch;

	
	public Stu_choice getCho() {
		return cho;
	}

	public void setCho(Stu_choice cho) {
		this.cho = cho;
	}

	public QueLevel getQ_le() {
		return q_le;
	}

	public void setQ_le(QueLevel q_le) {
		this.q_le = q_le;
	}

	public QueIndex getQ_in() {
		return q_in;
	}

	public void setQ_in(QueIndex q_in) {
		this.q_in = q_in;
	}

	public Paper getPap() {
		return pap;
	}

	public void setPap(Paper pap) {
		this.pap = pap;
	}

	public QueChoice getQ_ch() {
		return q_ch;
	}

	public void setQ_ch(QueChoice q_ch) {
		this.q_ch = q_ch;
	}
	
}
