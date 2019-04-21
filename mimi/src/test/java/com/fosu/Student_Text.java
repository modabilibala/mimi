package com.fosu;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Student_Text {


	
	@Test
	public void Test_getGradeClass(String period,String grade_class) {
		
		String number = "20160310108";
		
		//去除空格
		String number_safe = number.replaceAll(" ","");
		
		//最长
		int endIndex = number_safe.length();
		//最短
		int beginIndex = 0;
		
		period = number_safe.substring(beginIndex, 4);
		
		grade_class = number_safe.substring(endIndex-4,endIndex-2);
		
	}
	public static void main(String[] args) {
		
		Student_Text me = new Student_Text();
		
		String period = null;
		String grade_class = null;
		
		me.Test_getGradeClass(period, grade_class);
		
		System.out.println(period);
		System.out.println(grade_class);
	}

}
