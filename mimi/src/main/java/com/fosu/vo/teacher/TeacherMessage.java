package com.fosu.vo.teacher;

import java.util.List;

import com.fosu.pojo.Grade;
import com.fosu.pojo.Teacher;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@ApiModel(description="老师的信息", value="TeacherMessage")
public class TeacherMessage {

	@ApiModelProperty(value="class - 老师")
	private Teacher teacher;
	@ApiModelProperty(value="class - 年级<list>")
	private List<Grade> grade;
}
