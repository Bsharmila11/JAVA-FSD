package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.FeedbackDao;

import com.bean.Feedback;

@Service
public class FeedbackService 
{
	@Autowired
	FeedbackDao feedbackdao;
	public Feedback getFeedbackById(int id) {
		return feedbackdao.getUserFeedbackById(id);
	}
	public String storeFeedback(Feedback f) {
		if(feedbackdao.storeFeedback(f)>0) {
			return "Feedback Stored Successfully";
		}
		else {
			return "Feedback didn't Store";
		}
}
}
