package com.fosu.controller.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fosu.pojo.result.Result;
import com.fosu.service.book.BookService;
import com.fosu.utils.ResultUtil;
import com.fosu.vo.book.BookBaseChoice;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RequestMapping("/Book")
@RestController()
@Api(value="做题记录controller",tags={"做题记录操作接口"})
public class BookController {

	@Autowired
	private BookService bookService;
	
	//查询该学生选择题总体情况
	@ApiOperation(value="查询该学生选择题总体情况",notes="MiKi 1-8")
	@GetMapping(value="/findWeekExam/{student_id}")
	public Result<List<BookBaseChoice>> findBookChoice(@PathVariable Integer student_id) throws Exception{
		
		List<BookBaseChoice> findBookChoice = bookService.findBookChoice(student_id);
		
		return ResultUtil.success(findBookChoice);
	}
}
