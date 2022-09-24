package com.servive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Login;
import com.controller.LoginDao;
@Service
public class LoginService 
{
@Autowired
LoginDao logindao;
public String signIn(Login login)
{
	if(logindao.signIn(login)>0)
	{
		return "Success";
	}
	else
	{
		return "Failure";
	}
}
public String signUp(Login login)
{
	if(logindao.signUp(login)>0)
	{
		return "Success";
	}
	else
	{
		return "Failure";
	}
}
}
