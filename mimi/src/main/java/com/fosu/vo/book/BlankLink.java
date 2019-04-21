package com.fosu.vo.book;

import com.fosu.pojo.Stu_blank;
import com.fosu.pojo.Paper;
import com.fosu.pojo.QueBlank;
import com.fosu.pojo.QueIndex;
import com.fosu.pojo.QueLevel;

import io.swagger.annotations.ApiModelProperty;

public class BlankLink {

	@ApiModelProperty(value="填空记录")
    private Stu_blank blk;
	
	
	@ApiModelProperty(value="题型等级")
	private QueLevel q_le;
	
	@ApiModelProperty(value="题目章节")
	private QueIndex q_in;
	
	@ApiModelProperty(value="题目所属模拟卷")
	private Paper pap;
	
	@ApiModelProperty(value="选择题表")
	private QueBlank q_bl;

	public Stu_blank getBlk() {
		return blk;
	}

	public void setBlk(Stu_blank blk) {
		this.blk = blk;
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

	public QueBlank getQ_bl() {
		return q_bl;
	}

	public void setQ_bl(QueBlank q_bl) {
		this.q_bl = q_bl;
	}
	
}
