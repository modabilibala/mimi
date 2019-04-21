package com.fosu.pojo.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description= "返回响应错误数据")
public class Result <T>{
		
		//错误码
	@ApiModelProperty(value = "错误码")
		private Integer code;
		
	@ApiModelProperty(value = "提示信息")
		//提示信息
		private String msg;
	
	@ApiModelProperty(value = "具体内容")
		//具体内容
		private T data;

		public Integer getCode() {
			return code;
		}

		public void setCode(Integer code) {
			this.code = code;
		}

		public String getMsg() {
			return msg;
		}

		public void setMsg(String msg) {
			this.msg = msg;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}
		
}
