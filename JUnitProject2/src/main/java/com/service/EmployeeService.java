package com.service;
public class EmployeeService 
{
	public String checkcredentials(String email,String password)
	{
		if(email.equals("raghu@gmail.com") && password.equals("Raghu"))
		{
			return "Valid Credentials";
		}
		else
		{
			return "Invalid Credentials";
		}
	}
}
