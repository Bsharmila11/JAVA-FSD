package com.controller;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.bean.Product;
import com.service.ProductService;
@Controller
public class ProductController 
{
	@Autowired
	ProductService productservice;
	@RequestMapping(value = "retrieveDetails",method = RequestMethod.POST)
	public ModelAndView signIn(HttpServletRequest req,Product product) 
	{			
		int id=Integer.parseInt(req.getParameter("id"));
		product.setId(id);
		String result=productservice.retrieveProductDetails(product);
		ModelAndView mav = new ModelAndView();
		if(result.equals("Product Details Retrieved Successfully")) 
			{
				mav.setViewName("success.jsp");
			}
		else 
			{
				mav.setViewName("failure.jsp");
			}
			return mav;
		
	}}
	
