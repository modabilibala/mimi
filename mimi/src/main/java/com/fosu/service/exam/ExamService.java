package com.fosu.service.exam;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fosu.dao.exam.ExamMapper;
import com.fosu.enums.NormalEnum;
import com.fosu.enums.ResultEnum;
import com.fosu.enums.TeacherResultEnum;
import com.fosu.exception.NormalException;
import com.fosu.exception.StudentException;
import com.fosu.exception.TeacherException;
import com.fosu.serviceInf.exam.ExamInf;
import com.fosu.vo.exam.AccuacyBlankExam;
import com.fosu.vo.exam.AccuacyChoiceExam;
import com.fosu.vo.exam.AccuacyExam;
import com.fosu.vo.exam.AccuacyShortExam;
import com.fosu.vo.exam.TimeExam;
import com.fosu.vo.exam.WeekExam;

@Service
public class ExamService implements ExamInf {

	@Autowired
	private ExamMapper examMapper;
	
	@Autowired
	private ExamService examService;
	//每周成绩查询
	@Override
	public List<WeekExam> findWeekExam(String exam_CreateTime, Integer student_id) throws Exception {
		// TODO Auto-generated method stub
		
		//时间格式 星期
		String tsStr = "";  
		String detailStr="";
        DateFormat sdf = new SimpleDateFormat("E");
        DateFormat detailTime = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 ");
        
		List<WeekExam> findWeekExam = examMapper.findWeekExam(exam_CreateTime, student_id);
		//查询为空
		if(findWeekExam.size()==0)
		{
			throw new NormalException(NormalEnum.EXAM_WEEK_ERROR);
		}
		for (WeekExam weekExam : findWeekExam) {
			for(TimeExam timeExam :weekExam.getTime_exam()) {
			//遍历获取日期 并 转换为 星期 String 格式
				tsStr = sdf.format(timeExam.getExam_CreateTime());  
				detailStr = detailTime.format(timeExam.getExam_CreateTime());
		
			//将 星期 修改入 exam_week 中
				timeExam.setExam_week(tsStr);
	            timeExam.setExam_time(detailStr);
		
			}
		}
		return findWeekExam;
	}
	
	//章节choice正确率
	public List<AccuacyChoiceExam> findChoiceAccuacyExam(Integer student_id) throws Exception{
		
		List<AccuacyChoiceExam> findChoiceAccuacyExam = examMapper.findChoiceAccuacyExam(student_id);
		
		if(findChoiceAccuacyExam.size()==0)
		{
			throw new StudentException(ResultEnum.STUDENT_findNULL);
		}
		
		for (AccuacyChoiceExam accuacyChoiceExam : findChoiceAccuacyExam) {
			if(accuacyChoiceExam.getAccuacy() == 0.0)
			{
				accuacyChoiceExam.setAccuacy(-1);
			}
		}
		return findChoiceAccuacyExam;
		
	}

	
	//章节blank正确率
	@Override
	public List<AccuacyBlankExam> findBlankAccuacyExam(Integer student_id) throws Exception {
		// TODO Auto-generated method stub
		List<AccuacyBlankExam> findBlankAccuacyExam = examMapper.findBlankAccuacyExam(student_id);
		
		if(findBlankAccuacyExam.size()==0)
		{
			throw new StudentException(ResultEnum.STUDENT_findNULL);
		}
		for (AccuacyBlankExam accuacyBlankExam : findBlankAccuacyExam) {
			if(accuacyBlankExam.getAccuacy() == 0.0)
			{
				accuacyBlankExam.setAccuacy(-1);
			}
		}
		return findBlankAccuacyExam;
	}

	//章节Short正确率
	@Override
	public List<AccuacyShortExam> findShortAccuacyExam(Integer student_id) throws Exception {
		// TODO Auto-generated method stub
		
		List<AccuacyShortExam> findShortAccuacyExam = examMapper.findShortAccuacyExam(student_id);
		
		if(findShortAccuacyExam.size() == 0)
		{
			throw new StudentException(ResultEnum.STUDENT_findNULL);
		}
		
		for (AccuacyShortExam accuacyShortExam : findShortAccuacyExam) {
			if(accuacyShortExam.getAccuacy() == 0.0)
			{
				accuacyShortExam.setAccuacy(-1);
			}
		}
		return findShortAccuacyExam;
	}

	
	/*
	 * 章节所有题型正确率
	 */
	
	@Override
	public AccuacyExam findAccuacyExam(Integer student_id) throws Exception {
		// TODO Auto-generated method stub

		AccuacyExam accuacyExam = new AccuacyExam();
		
		List<AccuacyChoiceExam> findChoiceAccuacyExam = examService.findChoiceAccuacyExam(student_id);
		
		List<AccuacyBlankExam> findBlankAccuacyExam = examService.findBlankAccuacyExam(student_id);
		
		List<AccuacyShortExam> findShortAccuacyExam = examService.findShortAccuacyExam(student_id);
		
		accuacyExam.setAccuacyChoiceExam(findChoiceAccuacyExam);
		accuacyExam.setAccuacyBalankExam(findBlankAccuacyExam);
		accuacyExam.setAccuacyShortExam(findShortAccuacyExam);
		
		return accuacyExam;
	}
	


}
