package sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController 
{
	@RequestMapping(value="hello",method=RequestMethod.GET)
	public String sayHello()
	{
		System.out.println("I came Here");
		return "display";
	}
	
	@RequestMapping(value="hi",method=RequestMethod.GET)
	public String sayHi(Model mm)
	{
		mm.addAttribute("msg","Sharmila");
		System.out.println("I came Here");
		
		return "info";
	}
}
