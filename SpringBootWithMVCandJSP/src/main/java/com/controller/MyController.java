package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String openIndexPage() {
		System.out.println("I Came Here");
		return "index";
	}
	
	
	@RequestMapping(value = "checkUser",method = RequestMethod.POST)
	public String checkUserDetails(HttpServletRequest req) {
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		if(email.equals("raghu@gmail.com") && password.equals("Raghu")) {
			return "success";
		}
		else
		{
			return "failure";
		}
	}
}