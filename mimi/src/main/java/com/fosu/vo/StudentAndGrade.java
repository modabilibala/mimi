package com.fosu.vo;

public class StudentAndGrade {
	private int grade_period;
	private String grade_specialty;
	private int grade_class;
	
	private Integer student_id;
	private Integer for_student_grade_id;
	private String student_number;
	private String student_gender;
	private String student_phone;
	
	private String student_name;

	public int getGrade_period() {
		return grade_period;
	}

	public void setGrade_period(int grade_period) {
		this.grade_period = grade_period;
	}

	public String getGrade_specialty() {
		return grade_specialty;
	}

	public void setGrade_specialty(String grade_specialty) {
		this.grade_specialty = grade_specialty;
	}

	public int getGrade_class() {
		return grade_class;
	}

	public void setGrade_class(int grade_class) {
		this.grade_class = grade_class;
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

	public String getStudent_phone() {
		return student_phone;
	}

	public void setStudent_phone(String student_phone) {
		this.student_phone = student_phone;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	@Override
	public String toString() {
		return "StudentAndGrade [grade_period=" + grade_period + ", grade_specialty=" + grade_specialty
				+ ", grade_class=" + grade_class + ", student_id=" + student_id + ", for_student_grade_id="
				+ for_student_grade_id + ", student_number=" + student_number + ", student_gender=" + student_gender
				+ ", student_phone=" + student_phone + ", student_name=" + student_name + "]";
	}
	
}
