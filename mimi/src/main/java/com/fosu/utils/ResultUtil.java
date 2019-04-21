package com.fosu.utils;

import org.apache.commons.lang3.StringEscapeUtils;

import com.fosu.pojo.result.Result;

public class ResultUtil {

	public static Result success(Object object) {
		
		Result result = new Result();
		result.setCode(200);
		//StringEscapeUtils.unescapeJavaScript(object);
		result.setData(object);
		return result;
		 
	}
	public static Result success() {
		return success(null);
	}
	public static Result error(Integer code, String msg) {
		Result result = new Result();
		result.setCode(code);
		result.setMsg(msg);
		return result;
	}
}
