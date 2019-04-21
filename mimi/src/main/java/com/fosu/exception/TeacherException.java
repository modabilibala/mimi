package com.fosu.exception;

import com.fosu.enums.ResultEnum;
import com.fosu.enums.TeacherResultEnum;

public class TeacherException extends RuntimeException{
	private Integer code;
	public TeacherException(TeacherResultEnum resultEnum) {
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
