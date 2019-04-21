package com.fosu.serviceInf.exam;

import java.util.List;

import com.fosu.vo.exam.AccuacyBlankExam;
import com.fosu.vo.exam.AccuacyChoiceExam;
import com.fosu.vo.exam.AccuacyExam;
import com.fosu.vo.exam.AccuacyShortExam;
import com.fosu.vo.exam.WeekExam;

public interface ExamInf {

	//每周成绩查询
	List<WeekExam> findWeekExam(String exam_CreateTime,Integer student_id) throws Exception;
	
	//章节choice正确率
	 List<AccuacyChoiceExam> findChoiceAccuacyExam(Integer student_id) throws Exception;
	 
	//章节blank正确率
	 List<AccuacyBlankExam> findBlankAccuacyExam(Integer student_id) throws Exception;
	 
	//章节short正确率
	 List<AccuacyShortExam> findShortAccuacyExam(Integer student_id) throws Exception;
	 
	//章节所有题型正确率
	 AccuacyExam findAccuacyExam(Integer student_id) throws Exception;
}
