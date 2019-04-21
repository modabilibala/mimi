package com.fosu.service.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fosu.dao.book.BookMapper;
import com.fosu.enums.ResultEnum;
import com.fosu.exception.StudentException;
import com.fosu.serviceInf.book.BookInf;
import com.fosu.vo.book.BookBaseChoice;
import com.fosu.vo.exam.WeekExam;

@Service
public class BookService implements BookInf {

	@Autowired
	private BookMapper bookMapper;
	@Override
	//查询该学生选择题总体情况
	public List<BookBaseChoice> findBookChoice(Integer student_id) throws Exception{
		// TODO Auto-generated method stub
		
		List<BookBaseChoice> bookChoice = bookMapper.findBookChoice(student_id);
		
		//查询为空
		if(bookChoice.size() == 0) {
			throw new StudentException(ResultEnum.STUDENT_findNULL);
		}
		return bookChoice;
	}

}
