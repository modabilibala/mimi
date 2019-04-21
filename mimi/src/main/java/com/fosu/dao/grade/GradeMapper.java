package com.fosu.dao.grade;

import java.util.List;

import com.fosu.pojo.Grade;
import com.fosu.vo.GradeQueryVo;

public interface GradeMapper {
	//增加年级单位 - 不重复
		void insertGrade(Grade grade);
	//查询年级单位返回id
		List<Integer> findGrade(GradeQueryVo gradeQueryVo);
		
	//查询年级单位返回id -grade单位
		List<Integer> findGrade_base(Grade grade);
		

}
