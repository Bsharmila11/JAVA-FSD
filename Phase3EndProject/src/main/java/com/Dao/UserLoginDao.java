package com.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.Example;
import com.bean.Product;
import com.bean.UserLogin;

@Repository
public class UserLoginDao 
{
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Autowired
	SessionFactory sf;
	public int userlogin(UserLogin login) 
	{
		try 
		{
			List ll=jdbcTemplate.queryForList("select * from login where name = ? and password = ?",login.getName(),login.getPassword());
			return ll.size();
		}
		catch (Exception e) 
		{
			System.out.println(e);
			return 0;
		}
	
	}
	
	public int usersignin(UserLogin login) 
	{
		try 
		{
			return jdbcTemplate.update("insert into login values(?,?)",login.getName(),login.getPassword());
		} 
		catch (Exception e) 
		{
			System.out.println(e);
			return 0;
		}
		
	}
	
	public int storeorder(Example product) 
	{
		try 
		{
			Session session = sf.openSession();
			Transaction tran = session.getTransaction();
			tran.begin();
			session.save(product);
			tran.commit();
			return 1;
		} 
		catch (Exception e) 
		{
			System.out.println(e);
			return 0;
		}
	}
}
