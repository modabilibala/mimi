package com.fosu.exception;

import com.fosu.enums.ResultEnum;

/*
 * 异常判断
 * 可自定义学生异常枚举
 */
public class StudentException extends RuntimeException{

	private Integer code;
	public StudentException(ResultEnum resultEnum) {
		super(resultEnum.getMsg());
		this.code = resultEnum.getCode();
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
}
