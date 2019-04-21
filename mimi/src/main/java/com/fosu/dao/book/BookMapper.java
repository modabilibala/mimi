package com.fosu.dao.book;

import java.util.List;

import com.fosu.vo.book.BookBaseChoice;

public interface BookMapper {

	//查询book 错题本choice所有信息
	List<BookBaseChoice> findBookChoice(Integer student_id); 
	
	
	//获取已做选择题题数
	
	//获取填空题题数
	
	//获取简答题题数
}
