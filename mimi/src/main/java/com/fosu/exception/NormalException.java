package com.fosu.exception;

import com.fosu.enums.NormalEnum;
import com.fosu.enums.ResultEnum;

public class NormalException extends RuntimeException{

	private Integer code;
	public NormalException(NormalEnum resultEnum) {
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
