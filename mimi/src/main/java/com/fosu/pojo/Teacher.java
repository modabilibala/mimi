package com.fosu.pojo;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/*
 * teacher_id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT '��ʦ����',
	teacher_power INT NOT NULL COMMENT '��ʦȨ��',
	teacher_username VARCHAR(20) NOT NULL COMMENT'��ʦ��¼��',
	tacher_password VARCHAR(20) NOT NULL COMMENT'��ʦ����',
	teacher_name VARCHAR(20) NOT NULL COMMENT'��ʦ����'
 */

/*
 * @������
 *2018.10.10
 *�޸� �� ���ӣ� �и�teacherд��
 */
@ApiModel(value="Teacher",description="老师")
public class Teacher {
	@ApiModelProperty(value="老师ID")
	private Integer teacher_id;
	
	@ApiModelProperty(value="老师权利")
	private int teacher_power;
	
	@ApiModelProperty(value="老师登录号")
	private String teacher_username;
	
	@ApiModelProperty(value="老师密码")
	private String teacher_password;
	
	@ApiModelProperty(value="老师姓名")
	private String teacher_name;
	
	@ApiModelProperty(value="老师所带领班级")
	private List<Grade> grade;

	public Integer getTeacher_id() {
		return teacher_id;
	}

	
	public void setTeacher_id(Integer teacher_id) {
		this.teacher_id = teacher_id;
	}
	public int getTeacher_power() {
		return teacher_power;
	}
	public void setTeacher_power(int teacher_power) {
		this.teacher_power = teacher_power;
	}
	public String getTeacher_username() {
		return teacher_username;
	}
	public void setTeacher_username(String teacher_username) {
		this.teacher_username = teacher_username;
	}
	public String getTeacher_password() {
		return teacher_password;
	}
	public void setTeacher_password(String teacher_password) {
		this.teacher_password = teacher_password;
	}
	public String getTeacher_name() {
		return teacher_name;
	}
	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}


	@Override
	public String toString() {
		return "Teacher [teacher_id=" + teacher_id + ", teacher_power=" + teacher_power + ", teacher_username="
				+ teacher_username + ", teacher_password=" + teacher_password + ", teacher_name=" + teacher_name
				+ ", grade=" + grade + "]";
	}


	
}
