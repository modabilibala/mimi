package com.fosu;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fosu.dao.exam.ExamMapper;
import com.fosu.vo.exam.AccuacyChoiceExam;
import com.fosu.vo.exam.TimeExam;
import com.fosu.vo.exam.WeekExam;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Exam_Text {

	@Autowired
	private ExamMapper examMapper;
	
	@Test
	public void findWeekExam() {
		//long now=System.currentTimeMillis();
		List<WeekExam> findWeekExam = examMapper.findWeekExam("2019-2-20", 1);
		
		//SimpleDateFormat myFmt = new SimpleDateFormat("E");
		//System.out.println(myFmt.format("2019-2-27"));
		//String newWeek = "";
		String tsStr = "";  
		String detailStr="";
        DateFormat sdf = new SimpleDateFormat("E");
        DateFormat detailTime = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 ");
		for (WeekExam weekExam : findWeekExam) {
			//newWeek = myFmt.format(weekExam.getExam_UpdateTime());
		for(TimeExam timeExam :weekExam.getTime_exam()) {
			System.out.println(timeExam.getExam_CreateTime().getClass());
			
			tsStr = sdf.format(timeExam.getExam_CreateTime());  
			detailStr = detailTime.format(timeExam.getExam_CreateTime());

			timeExam.setExam_week(tsStr);
            timeExam.setExam_time(detailStr);

		}
			System.out.println(weekExam);
		}
	}
	@Test 
	public void exam_findChoiceAccuacyExam() {
		
		List<AccuacyChoiceExam> findChoiceAccuacyExam = examMapper.findChoiceAccuacyExam(1);
		
		System.out.println(findChoiceAccuacyExam);
	}
	
}
