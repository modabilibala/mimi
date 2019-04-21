package com.fosu.controller.question;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RequestMapping("/question")
@RestController()
public class QuestionController {

	//通过题目类型 以及题目id获取所有信息（批量）
	//@ApiOperation(value="通过题目类型 以及题目id获取 question 信息（批量）",notes="MiKi")
	//@PostMapping(path = "/findQuestion")

}
