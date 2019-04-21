package com.fosu.controller.exam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fosu.pojo.result.Result;
import com.fosu.service.exam.ExamService;
import com.fosu.utils.ResultUtil;
import com.fosu.vo.exam.AccuacyBlankExam;
import com.fosu.vo.exam.AccuacyChoiceExam;
import com.fosu.vo.exam.AccuacyExam;
import com.fosu.vo.exam.AccuacyShortExam;
import com.fosu.vo.exam.WeekExam;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RequestMapping("/exam")
@RestController()
@Api(value="考试controller",tags={"考试操作接口"})
public class ExamController {

	@Autowired
	private ExamService examService;
	
	/*
	 * 每周成绩查询
	 */
	@ApiOperation(value="每周成绩查询",notes="MiKi 1-8")
	@GetMapping(value="/findWeekExam/{exam_CreateTime}/{student_id}")
	public Result<Map<String,List<WeekExam>>>findWeekExam(@PathVariable String exam_CreateTime,
			@PathVariable Integer student_id) throws Exception
	{
		List<WeekExam> findWeekExam = examService.findWeekExam(exam_CreateTime, student_id);
		Map<String,List<WeekExam>> weekExam = new HashMap<String, List<WeekExam>>();
		weekExam.put("week", findWeekExam);
		return ResultUtil.success(weekExam);
	}
	
	/*
	 * 章节choice正确率
	 */
	@ApiOperation(value="章节choice正确率",notes="MiKi 1-8")
	@GetMapping(value="/findChoiceAccuacyExam/{student_id}")
	public Result<List<AccuacyChoiceExam>> findChoiceAccuacyExam(@PathVariable Integer student_id) throws Exception
	{
			List<AccuacyChoiceExam> findChoiceAccuacyExam = examService.findChoiceAccuacyExam(student_id);
			return ResultUtil.success(findChoiceAccuacyExam);
	}
	
	/*
	 * 章节Blank正确率
	 */
	@ApiOperation(value="章节blank正确率",notes="MiKi 1-8")
	@GetMapping(value="/findBlankAccuacyExam/{student_id}")
	public Result<List<AccuacyBlankExam>> findBlankAccuacyExam(@PathVariable Integer student_id) throws Exception{
		
		List<AccuacyBlankExam> findBlankAccuacyExam = examService.findBlankAccuacyExam(student_id);
		return ResultUtil.success(findBlankAccuacyExam);
	}
	/*
	 * 章节Short正确率
	 */
	@ApiOperation(value="章节Short正确率",notes="MiKi 1-8")
	@GetMapping(value="/findShortAccuacyExam/{student_id}")
	public Result<List<AccuacyShortExam>> findShortAccuacyExam(@PathVariable Integer student_id) throws Exception{
		
		List<AccuacyShortExam> findShortAccuacyExam = examService.findShortAccuacyExam(student_id);
		return ResultUtil.success(findShortAccuacyExam);
	}
	
	/*
	 * 章节全题型正确率
	 */
	@ApiOperation(value="章节全题型正确率",notes="MiKi 1-8")
	@GetMapping(value="/findAccuacyExam/{student_id}")
	public Result<AccuacyExam> findAccuacyExam(@PathVariable Integer student_id) throws Exception{
		
		AccuacyExam findAccuacyExam = examService.findAccuacyExam(student_id);
		return ResultUtil.success(findAccuacyExam);
	}
}
