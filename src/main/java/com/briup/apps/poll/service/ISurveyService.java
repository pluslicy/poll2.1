/**
 * Project Name:poll2.1
 * File Name:ISurveyService.java
 * Package Name:com.briup.apps.poll.service
 * Date:2018年6月29日上午8:30:43
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.briup.apps.poll.service;

import java.util.List;

import com.briup.apps.poll.bean.Survey;
import com.briup.apps.poll.bean.extend.SurveyVM;

/**
 * ClassName:ISurveyService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年6月29日 上午8:30:43 <br/>
 * @author   lichunyu
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public interface ISurveyService {
	void saveOrUpdate(Survey survey) throws Exception;
	
	List<SurveyVM> findAll() throws Exception;
	
	SurveyVM findById(long id) throws Exception;
}









