package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping(value="hello",method=RequestMethod.GET)
	public ModelAndView sayHello()
	{
		ModelAndView mav=new ModelAndView();
		System.out.println("I came Here");
		mav.setViewName("display.jsp");
		return mav;
	}
}
