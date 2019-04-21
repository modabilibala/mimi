package com.fosu;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fosu.dao.book.BookMapper;
import com.fosu.vo.book.BookBaseChoice;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Book_Text {

	@Autowired
	private BookMapper bookMapper;
	
	@Test
	public void findOneStudent_Text() {
		
		List<BookBaseChoice> findBookChoice = bookMapper.findBookChoice(1);
		for (BookBaseChoice bookBaseChoice : findBookChoice) {
			System.out.println(bookBaseChoice);
		}
	}
}
