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

@Controller
public class ProductController 
{
	@Autowired
	ProductService productService;
	@RequestMapping(value = "adminstoreproduct",method = RequestMethod.POST)
	public ModelAndView storeProduct(HttpServletRequest req, Product product) 
	{
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		float price = Float.parseFloat(req.getParameter("price"));
		String category = req.getParameter("category");
		product.setId(id);
		product.setName(name);
		product.setPrice(price);
		product.setCategory(category);
		String result = productService.storeproduct(product);
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", result);
		mav.setViewName("adminstoreproduct.jsp");
		return mav;
	}
	
	@RequestMapping(value = "adminupdateproduct",method = RequestMethod.POST)
	public ModelAndView updateProduct(HttpServletRequest req, Product product) 
	{
		int id = Integer.parseInt(req.getParameter("id"));
		float price = Float.parseFloat(req.getParameter("price"));
		product.setId(id);
		product.setPrice(price);
		String result = productService.updateproduct(product);
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", result);
		mav.setViewName("adminupdateproduct.jsp");
		return mav;
	}
	
	@RequestMapping(value = "viewallproduct",method = RequestMethod.GET)
	public ModelAndView findProduct(HttpServletRequest req) 
	{
		List<Product> listOfProduct=productService.getallproduct();
		ModelAndView mav = new ModelAndView();
		mav.addObject("listOfProduct", listOfProduct);
		mav.setViewName("viewallproductjsp.jsp");
		return mav;
	}
	
	@RequestMapping(value = "viewalluser",method = RequestMethod.GET)
	public ModelAndView findUser(HttpServletRequest req) 
	{
		List<UserLogin> listOfUser=productService.getalluser();
		ModelAndView mav = new ModelAndView();
		mav.addObject("listOfUser", listOfUser);
		mav.setViewName("viewalluser.jsp");
		return mav;
	}
	
	@RequestMapping(value = "searchuser",method = RequestMethod.GET)
	public ModelAndView searchuserbyname(HttpServletRequest req) {
		String name = req.getParameter("name");
		String result = productService.searchuserbyname(name);
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", result);
		mav.setViewName("searchuser.jsp");
		return mav;
	
	}
	
	@RequestMapping(value = "deleteproduct",method = RequestMethod.POST)
	public ModelAndView deleteProduct(HttpServletRequest req) 
	{
		int id = Integer.parseInt(req.getParameter("id"));
		String result = productService.deleteproduct(id);
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", result);
		mav.setViewName("deleteproduct.jsp");
		return mav;
	}
	
	@RequestMapping(value = "searchproduct",method = RequestMethod.GET)
	public ModelAndView searchproduct(HttpServletRequest req) {
		int id=Integer.parseInt(req.getParameter("id"));
		String result = productService.searchproduct(id);
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", result);
		mav.setViewName("searchproduct.jsp");
		return mav;
	
	}
	
	@RequestMapping(value = "viewallorder",method = RequestMethod.GET)
	public ModelAndView findOrder(HttpServletRequest req) 
	{
		List<Example> listOfOrder=productService.getallorder();
		ModelAndView mav = new ModelAndView();
		mav.addObject("listOfOrder", listOfOrder);
		mav.setViewName("viewallorderbyuser.jsp");
		return mav;
	}
	
	@RequestMapping(value = "viewallorderbyadmin",method = RequestMethod.GET)
	public ModelAndView findOrderByAdmin(HttpServletRequest req) 
	{
		List<Example> listOfOrder=productService.getallorder();
		ModelAndView mav = new ModelAndView();
		mav.addObject("listOfOrder", listOfOrder);
		mav.setViewName("viewallorderbyadmin.jsp");
		return mav;
	
	}
	
	
}
