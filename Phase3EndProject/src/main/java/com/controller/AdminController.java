package com.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class AdminController 
{
	@RequestMapping(value = "adminlogin",method = RequestMethod.POST)
	public ModelAndView checkUserDetails(HttpServletRequest req) 
	{			
			String name = req.getParameter("name");
			String password = req.getParameter("password");
			ModelAndView mav = new ModelAndView();
			if(name.equals("Raghu") && password.equals("Raghu")) 
			{
				mav.setViewName("adminsuccesslogin.jsp");
			}
			else 
			{
				mav.setViewName("adminfailurelogin.jsp");
			}
			
			return mav;
	}
}
