/**
 * Project Name:poll2.1
 * File Name:SurveyController.java
 * Package Name:com.briup.apps.poll.web.controller
 * Date:2018年6月29日上午8:25:46
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.briup.apps.poll.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.poll.bean.Survey;
import com.briup.apps.poll.bean.extend.SurveyVM;
import com.briup.apps.poll.service.ISurveyService;
import com.briup.apps.poll.util.MsgResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * ClassName:SurveyController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年6月29日 上午8:25:46 <br/>
 * @author   lichunyu
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Api(description="课调相关接口")
@RestController
@RequestMapping("/survey")
public class SurveyController {
	@Autowired
	private ISurveyService surveyService;
	
	@ApiOperation(value="通过ID查询课调"
			,notes="级联查询出课调关联的课程，班级，讲师，问卷")
	@GetMapping(value="findSurveyById")
	public MsgResponse findSurveyById(long id) {
		try {
			SurveyVM surveyVM = surveyService.findById(id);
			return MsgResponse.success("success", surveyVM);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@ApiOperation(value="查询所有课调"
			,notes="级联查询出课调关联的课程，班级，讲师，问卷")
	@GetMapping(value="findAllSurvey")
	public MsgResponse findAllSurvey() {
		try {
			List<SurveyVM> list = surveyService.findAll();
			return MsgResponse.success("success", list);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	
	@ApiOperation(value="保存或更新课调"
			,notes="只需要输入courseId,userId,clazzId,questionnaireId")
	@PostMapping(value="saveOrUpdateSurvey")
	public MsgResponse saveOrUpdateSurvey(Survey survey) {
		try {
			surveyService.saveOrUpdate(survey);
			return MsgResponse.success("保存或修改成功", null);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
}













