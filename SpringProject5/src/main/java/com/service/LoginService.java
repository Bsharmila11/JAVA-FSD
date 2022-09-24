package com.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bean.Login;
import com.Dao.LoginDao;
@Service
public class LoginService 
{
	@Autowired
	LoginDao logindao;
	public String signIn(Login login)
	{
		if(logindao.signIn(login)>0)
		{
			return "Congratulations You Logged In Successfully";
		}
		else
		{
			return "Failed to Lagin Try with Another Credentials";
		}
	}
	public String signUp(Login login)
	{
		if(logindao.signUp(login)>0)
		{
			return "Congratulations Your Account Created Successfully";
		}
		else
		{
			return "Failured to Create the Account";
		}
	}
}
