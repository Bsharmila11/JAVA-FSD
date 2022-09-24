package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.UserLoginDao;
import com.bean.Example;
import com.bean.Product;
import com.bean.UserLogin;


@Service
public class UserLoginService 
{
	@Autowired
	UserLoginDao userlogindao;
	public String userlogin(UserLogin login)
	{
		if(userlogindao.userlogin(login)>0)
		{
			return "Success";
		}
		else
		{
			return "Failure";
		}
	}
	public String usersignin(UserLogin login)
	{
		if(userlogindao.usersignin(login)>0)
		{
			return "Success";
		}
		else
		{
			return "Failure";
		}
	}
	
	public String storeorder(Example product) 
	{
		if(userlogindao.storeorder(product)>0)
		{
			return "Product details stored successfully";
		}
		else 
		{
			return "Product details didn't store";
		}
	}
	
	
	
}
