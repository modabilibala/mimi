package com.fosu.serviceInf.book;

import java.util.List;

import com.fosu.vo.book.BookBaseChoice;
import com.fosu.vo.exam.AccuacyChoiceExam;

public interface BookInf {

	//查询该学生选择题总体情况
	List<BookBaseChoice> findBookChoice(Integer Student_id) throws Exception;
	
}
