package com.fosu.enums;

/*
 * 错误枚举
 * 可添加
 * 学生异常枚举
 */
public enum ResultEnum {

	UNKONW_ERROR(-1,"未知错误"),
	SUCCESS(0,"成功"),
	STUDENT_ID(100,"错误类型 id = 0"),
	STUDENT_ID2(101,"错误类型id = 1"),
	STUDENT_insertNULL(50,"学生插入失败"),
	STUDENT_findNULL(451,"学生查询为空"),
	STUDENT_EXIST(304,"用户名已存在"),
	STUDENT_ParamNULL(420,"传入参数为空"),
	;
	private Integer code;
	private String msg;
	private ResultEnum(Integer code, String msg) {
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
