package com.fosu.enums;

public enum TeacherResultEnum {

	UNKONW_ERROR(-1,"未知错误"),
	SUCCESS(0,"成功"),
	TEACHER_ID(10,"老师id异常"),
	TEACHER_insertNULL(50,"老师用户插入失败"),
	TEACHER_FinallNULL(51,"老师查询为空"),
	GRADE_findNULL(70,"Grade查询为空"),
	Grade_writeNULL(420,"Grade未写入"),
	;
	private Integer code;
	private String msg;
	private TeacherResultEnum(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	public Integer getCode() {
		return code;
	}
	public String getMsg() {
		return msg;
	}
}
