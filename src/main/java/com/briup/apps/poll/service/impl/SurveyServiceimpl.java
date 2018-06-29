/**
 * Project Name:poll2.1
 * File Name:SurveyServiceimpl.java
 * Package Name:com.briup.apps.poll.service.impl
 * Date:2018年6月29日上午8:31:21
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.briup.apps.poll.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.apps.poll.bean.Survey;
import com.briup.apps.poll.bean.extend.SurveyVM;
import com.briup.apps.poll.dao.SurveyMapper;
import com.briup.apps.poll.dao.extend.SurveyVMMapper;
import com.briup.apps.poll.service.ISurveyService;

/**
 * ClassName:SurveyServiceimpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年6月29日 上午8:31:21 <br/>
 * @author   lichunyu
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
@Service
public class SurveyServiceimpl implements ISurveyService {
	@Autowired
	private SurveyMapper surveyMapper;
	@Autowired
	private SurveyVMMapper surveyVMMapper;
	
	@Override
	public void saveOrUpdate(Survey survey) throws Exception {
		//在保存课调之前先初始化课调信息
		survey.setStatus(Survey.STATUS_INIT);
		survey.setCode("");
		Date surveyDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = sdf.format(surveyDate);		
		survey.setSurveydate(str);
		
		surveyMapper.insert(survey);
	}

	@Override
	public List<SurveyVM> findAll() throws Exception {
		return surveyVMMapper.selectAll();
	}

	@Override
	public SurveyVM findById(long id) throws Exception {
		return surveyVMMapper.selectById(id);
	}

}

