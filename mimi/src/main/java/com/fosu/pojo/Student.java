package com.fosu.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/*
 * #ѧ����
CREATE TABLE student(
student_id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT 'ѧ������',
for_student_grade_id  INTEGER NOT NULL COMMENT '��� ��Ӧ �� id ',
student_username VARCHAR(20) NOT NULL COMMENT 'ѧ����¼��',
student_password VARCHAR(20) NOT NULL COMMENT 'ѧ����¼����',
student_number VARCHAR(20) NOT NULL COMMENT 'ѧ��ѧ��',
student_gender VARCHAR(2) COMMENT 'ѧ���Ա�',
student_power VARCHAR(10) COMMENT 'ѧ��Ȩ��',
student_phone VARCHAR(11) COMMENT 'ѧ���ֻ���',
FOREIGN KEY(for_student_grade_id) REFERENCES grade(grade_id)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

 
/*
 * @������
 *2018.10.10
 *�޸� �� ���ӣ�  private String student_name;
			private String student_nikiname;
	
 */
@ApiModel(value="Student",description="学生")
public class Student {
	@ApiModelProperty(value="学生ID")
	private Integer student_id;
	
	@ApiModelProperty(value="学生-年级关联")
	private Integer for_student_grade_id;
	
	@ApiModelProperty(value="学生登录名")
	private String student_username;
	
	@ApiModelProperty(value="学生密码")
	private String student_password;
	
	@ApiModelProperty(value="学生学号")
	private String student_number;
	
	@ApiModelProperty(value="学生性别")
	private String student_gender;
	
	@ApiModelProperty(value="学生权利")
	private String student_power;
	
	@ApiModelProperty(value="学生手机")
	private String student_phone;
	
	@ApiModelProperty(value="学生名字")
	private String student_name;
	
	@ApiModelProperty(value="学生昵称")
	private String student_nikiname;
	
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_nikiname() {
		return student_nikiname;
	}
	public void setStudent_nikiname(String student_nikiname) {
		this.student_nikiname = student_nikiname;
	}
	public Student() {
		super();
	}
	public Student( Integer for_student_grade_id, String student_username, String student_password,
			String student_number, String student_gender, String student_phone) {
		super();
		this.for_student_grade_id = for_student_grade_id;
		this.student_username = student_username;
		this.student_password = student_password;
		this.student_number = student_number;
		this.student_gender = student_gender;
		this.student_phone = student_phone;
	}
	public Integer getStudent_id() {
		return student_id;
	}
	public void setStudent_id(Integer student_id) {
		this.student_id = student_id;
	}
	public Integer getFor_student_grade_id() {
		return for_student_grade_id;
	}
	public void setFor_student_grade_id(Integer for_student_grade_id) {
		this.for_student_grade_id = for_student_grade_id;
	}
	public String getStudent_username() {
		return student_username;
	}
	public void setStudent_username(String student_username) {
		this.student_username = student_username;
	}
	public String getStudent_password() {
		return student_password;
	}
	public void setStudent_password(String student_password) {
		this.student_password = student_password;
	}
	public String getStudent_number() {
		return student_number;
	}
	public void setStudent_number(String student_number) {
		this.student_number = student_number;
	}
	public String getStudent_gender() {
		return student_gender;
	}
	public void setStudent_gender(String student_gender) {
		this.student_gender = student_gender;
	}
	public String getStudent_power() {
		return student_power;
	}
	public void setStudent_power(String student_power) {
		this.student_power = student_power;
	}
	public String getStudent_phone() {
		return student_phone;
	}
	public void setStudent_phone(String student_phone) {
		this.student_phone = student_phone;
	}
	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", for_student_grade_id=" + for_student_grade_id
				+ ", student_username=" + student_username + ", student_password=" + student_password
				+ ", student_number=" + student_number + ", student_gender=" + student_gender + ", student_power="
				+ student_power + ", student_phone=" + student_phone + ", student_name=" + student_name
				+ ", student_nikiname=" + student_nikiname + "]";
	}
	
}
