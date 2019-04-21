package com.fosu.vo;

import java.util.List;

import com.fosu.pojo.Grade;

public class GradeQueryVo {

	private Grade gradeVo;

	private List<Integer> grade_id;
	
	public Grade getGradeVo() {
		return gradeVo;
	}

	public void setGradeVo(Grade gradeVo) {
		this.gradeVo = gradeVo;
	}

	public List<Integer> getGrade_id() {
		return grade_id;
	}

	public void setGrade_id(List<Integer> grade_id) {
		this.grade_id = grade_id;
	}
	
}
