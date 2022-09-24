package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Feedback;
import com.service.FeedbackService;

@RestController
public class FeedbackController {
	@Autowired 
	FeedbackService feedbackservice;
	@RequestMapping(value="getFeedbackById/{id}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public Feedback grtFeedbackById(@PathVariable("id") int id){
		return feedbackservice.getFeedbackById(id);
		
	}
	
	@RequestMapping(value="storeFeedback",consumes=MediaType.APPLICATION_JSON_VALUE,method=RequestMethod.POST)
	public String storeFeedback(@RequestBody Feedback f) {
		return feedbackservice.storeFeedback(f);
	}
}
