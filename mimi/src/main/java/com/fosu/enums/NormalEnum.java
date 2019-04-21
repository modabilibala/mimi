package com.fosu.enums;

public enum NormalEnum {
	UNKONW_ERROR(-1,"未知错误"),
	SUCCESS(0,"成功"),
	EXAM_WEEK_ERROR(10,"成绩查询为空");
	;
	private Integer code;
	private String msg;
	private NormalEnum(Integer code, String msg) {
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
