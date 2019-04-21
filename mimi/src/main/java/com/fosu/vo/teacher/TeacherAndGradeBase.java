package com.fosu.vo.teacher;

import java.util.List;

import com.fosu.pojo.Grade;

public class TeacherAndGradeBase {

	private Integer teacher_id;
	private String teacher_username;
	private List <Grade> grade;
	public Integer getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(Integer teacher_id) {
		this.teacher_id = teacher_id;
	}
	public String getTeacher_username() {
		return teacher_username;
	}
	public void setTeacher_username(String teacher_username) {
		this.teacher_username = teacher_username;
	}
	public List<Grade> getGrade() {
		return grade;
	}
	public void setGrade(List<Grade> grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "TeacherAndGradeBase [teacher_id=" + teacher_id + ", teacher_username=" + teacher_username + ", grade="
				+ grade + "]";
	}
	
}
