package com.briup.apps.poll.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.bean.Answers;
import com.briup.apps.poll.service.IAnswersService;
import com.briup.apps.poll.util.MsgResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(description="学生答卷相关接口")
@RestController
@RequestMapping("/answers")
public class AnswersController {
	@Autowired
	private IAnswersService answersService;
	
	@ApiOperation(value="提交答卷，每个学生提交一份")
	@PostMapping("submitAnswer")
	public MsgResponse submitAnswer(Answers answers){
		try {
			// 1. 判断用户是否具有答卷权限（是否提交过）
			
			// 2. 保存答卷信息
			answersService.saveOrUpdate(answers);
			return MsgResponse.success("提交成功！您的意见是我们的改进方向！", null);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
}











