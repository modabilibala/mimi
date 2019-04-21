package com.fosu.dao.exam;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fosu.vo.exam.AccuacyBlankExam;
import com.fosu.vo.exam.AccuacyChoiceExam;
import com.fosu.vo.exam.AccuacyExam;
import com.fosu.vo.exam.AccuacyShortExam;
import com.fosu.vo.exam.WeekExam;

public interface ExamMapper {
	
	//每周成绩查询
	List<WeekExam> findWeekExam(@Param("exam_CreateTime") String exam_CreateTime,@Param("student_id") Integer student_id);

	//章节choice正确率
	List<AccuacyChoiceExam> findChoiceAccuacyExam(Integer student_id);
	
	//章节Blank正确率
	List<AccuacyBlankExam> findBlankAccuacyExam(Integer student_id);
	
	//章节Blank正确率
	List<AccuacyShortExam> findShortAccuacyExam(Integer student_id);
	

}
