package com.briup.apps.poll.service;

import java.util.List;

import com.briup.apps.poll.bean.Answers;

public interface IAnswersService {
	//提交或者更新答卷信息
	void saveOrUpdate(Answers answers) throws Exception;
	
	//通过课调id查询属于该课调的所有答卷
	List<Answers> findAnswersBySurveyId(long surveyId) throws Exception;
}
