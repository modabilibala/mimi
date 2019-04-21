package com.fosu.pojo;

import java.util.List;

/*
 * teacher_grade_id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '��ʦ �� �м��id',
	for_teacher_id INTEGER  NOT NULL COMMENT '��� ��Ӧ��ʦ����',
	for_grade_id INTEGER  NOT NULL COMMENT '��� ��Ӧ������ ��not null��',
	FOREIGN KEY(for_teacher_id) REFERENCES teacher(teacher_id),
	FOREIGN KEY(for_grade_id) REFERENCES grade(grade_id)
 */
public class Teacher_grade {
	
	public Integer teacher_grade_id;
	public Integer for_teacher_id;
	public Integer for_grade_id;
	
	
	public Integer getTeacher_grade_id() {
		return teacher_grade_id;
	}
	public void setTeacher_grade_id(Integer teacher_grade_id) {
		this.teacher_grade_id = teacher_grade_id;
	}
	public Integer getFor_teacher_id() {
		return for_teacher_id;
	}
	public void setFor_teacher_id(Integer for_teacher_id) {
		this.for_teacher_id = for_teacher_id;
	}
	public Integer getFor_grade_id() {
		return for_grade_id;
	}
	public void setFor_grade_id(Integer for_grade_id) {
		this.for_grade_id = for_grade_id;
	}

	

}
