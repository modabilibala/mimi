package com.fosu.serviceInf.grade;

import com.fosu.pojo.Grade;

public interface GradeInf {
	//增加年级用户 -不重复
	public void insertGrade(Grade grade);
	//查询年级单位返回id
	public Integer findGrade_base(Grade grade)throws Exception;
	
	//查询年级单位返回id(没有就增加)
	public Integer findGradeAdd(Grade grade) throws Exception;
}
