/**
 * Project Name:poll2.1
 * File Name:SurveyVM.java
 * Package Name:com.briup.apps.poll.bean.extend
 * Date:2018年6月29日上午9:10:00
 * Copyright (c) 2018, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.briup.apps.poll.bean.extend;


import com.briup.apps.poll.bean.Course;
import com.briup.apps.poll.bean.User;

/**
 * ClassName:SurveyVM <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2018年6月29日 上午9:10:00 <br/>
 * 
 * @author lichunyu
 * @version
 * @since JDK 1.6
 * @see
 */
public class SurveyVM {
	private Long id;
	private Double average;
	private String status;
	private String code;
	private String surveydate;
	
	
	private Course course;
	private ClazzVM clazzVM;
	private User teacher;
	private QuestionnaireVM qnVM;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getSurveydate() {
		return surveydate;
	}
	public void setSurveydate(String surveydate) {
		this.surveydate = surveydate;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public ClazzVM getClazzVM() {
		return clazzVM;
	}
	public void setClazzVM(ClazzVM clazzVM) {
		this.clazzVM = clazzVM;
	}

	public User getTeacher() {
		return teacher;
	}
	public void setTeacher(User teacher) {
		this.teacher = teacher;
	}
	public QuestionnaireVM getQnVM() {
		return qnVM;
	}
	public void setQnVM(QuestionnaireVM qnVM) {
		this.qnVM = qnVM;
	}
	public Double getAverage() {
		return average;
	}
	public void setAverage(Double average) {
		this.average = average;
	}
}
