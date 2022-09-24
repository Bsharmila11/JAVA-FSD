package com.service;

public class AurhenticationService
{
	public String authenticateUser(String email,String password,String id)
	{
		if(email.equals("raghu@gmail.com") && password.equals("Raghu") && id.equals("S02ASH10"))
		{
			return "Congratulations You are Valid User";
		}
		else
		{
			return "Verification Failed You are not a Valid User";
		}
	}
}
