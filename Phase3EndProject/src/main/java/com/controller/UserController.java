package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Example;
import com.bean.Product;
import com.bean.UserLogin;
import com.service.ProductService;
import com.service.UserLoginService;

@Controller
public class UserController 
{
	@Autowired
	UserLoginService userloginservice;
	@Autowired
	ProductService productservice;
	@RequestMapping(value = "userlogin",method = RequestMethod.POST)
	public ModelAndView userlogin(HttpServletRequest req,UserLogin login) 
	{			
			String name = req.getParameter("name");
			String password = req.getParameter("password");
			login.setName(name);
			login.setPassword(password);
			String result=userloginservice.userlogin(login);
			ModelAndView mav = new ModelAndView();
			if(result.equals("Success")) 
			{
				mav.setViewName("usersuccesslogin.jsp");
			}
			else 
			{
				mav.setViewName("userfailurelogin.jsp");
			}
			
			return mav;
		
	}
	
	
	
		
	@RequestMapping(value = "usersignin",method = RequestMethod.POST)
	public ModelAndView usersignin(HttpServletRequest req, UserLogin login) {			
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		login.setName(name);
		login.setPassword(password);
		String result = userloginservice.usersignin(login);
		ModelAndView mav = new ModelAndView();
		mav.addObject("obj", result);					
		mav.setViewName("userlogin.jsp");
		return mav;
	}
	
	@RequestMapping(value = "viewallproductbyuser",method = RequestMethod.GET)
	public ModelAndView findProduct(HttpServletRequest req) 
	{
		List<Product> listOfProduct=productservice.getallproduct();
		ModelAndView mav = new ModelAndView();
		mav.addObject("listOfProduct", listOfProduct);
		mav.setViewName("viewallproductbyuser.jsp");
		return mav;
	}
	
	@RequestMapping(value = "storeorder",method = RequestMethod.POST)
	public ModelAndView storeProduct(HttpServletRequest req, Example product) 
	{
		int id = Integer.parseInt(req.getParameter("id"));
		int pid = Integer.parseInt(req.getParameter("pid"));
		product.setId(id);
		product.setPid(pid);
		String result = userloginservice.storeorder(product);
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", result);
		mav.setViewName("placeorder.jsp");
		return mav;
	}
	
	
	
	
	
}
