/**
 * Project Name:poll2.1
 * File Name:SurveyVMMapper.java
 * Package Name:com.briup.apps.poll.dao.extend
 * Date:2018年6月29日上午9:14:23
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.briup.apps.poll.dao.extend;
/**
 * ClassName:SurveyVMMapper <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2018年6月29日 上午9:14:23 <br/>
 * @author   lichunyu
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */

import java.util.List;

import com.briup.apps.poll.bean.extend.SurveyVM;

public interface SurveyVMMapper {
	List<SurveyVM> selectAll();
	
	SurveyVM selectById(long id);
	
	List<SurveyVM> selectByStatus(String status);
}

