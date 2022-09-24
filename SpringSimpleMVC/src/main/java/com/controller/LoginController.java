package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Login;
import com.servive.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService loginservice;
	
	@RequestMapping(value = "signIn",method = RequestMethod.POST)
	public ModelAndView signIn(HttpServletRequest req,Login login) {			// DI for HttpServletRequest 
			
			String email = req.getParameter("email");
			String password = req.getParameter("password");
			
			login.setEmail(email);
			login.setPassword(password);
			String result=loginservice.signIn(login);
			ModelAndView mav = new ModelAndView();
			
			if(result.equals("Success")) {
				mav.setViewName("success.jsp");
			}else {
				mav.setViewName("failure.jsp");
			}
			
			return mav;
		
	}
	
	
	
		
	@RequestMapping(value = "signUp",method = RequestMethod.POST)
	public ModelAndView signUp(HttpServletRequest req, Login login) {			// DI for request and login object. 
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		login.setEmail(email);
		login.setPassword(password);
		
		String result = loginservice.signUp(login);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("obj", result);					// request.setAttribute("obj",result);
		mav.setViewName("loginDb.jsp");
		return mav;
	}
	
	


	
	@RequestMapping(value = "checkUser",method = RequestMethod.POST)
	public ModelAndView checkUserDetails(HttpServletRequest req) {			// DI for HttpServletRequest 
			
			String email = req.getParameter("email");
			String password = req.getParameter("password");
			
			ModelAndView mav = new ModelAndView();
			
			if(email.equals("raghu@gmail.com") && password.equals("Raghu")) {
				mav.setViewName("successDb.jsp");
			}else {
				mav.setViewName("failureDb.jsp");
			}
			
			return mav;
	}
}
