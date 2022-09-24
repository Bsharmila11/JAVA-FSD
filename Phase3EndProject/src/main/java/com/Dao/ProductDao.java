package com.Dao;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Example;
import com.bean.Product;
import com.bean.UserLogin;
@Repository
public class ProductDao 
{
	@Autowired
	SessionFactory sf;
	public int storeproduct(Product product) 
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
	
	
	
	public int updateproduct(Product product) 
	{
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		Product p=session.get(Product.class,product.getId());
		if (p==null)
		{
			return 0;	
		}
		else
		{
			tran.begin();
			p.setPrice(product.getPrice());
			session.update(p);
			tran.commit();
			return 1;
		}
	}
	
	public int deleteproduct(int id) 
	{
		Session session=sf.openSession();
		Transaction tran=session.getTransaction();
		Product p=session.get(Product.class, id);
		if(p==null) 
		{
			return 0;
		}
		else 
		{
			tran.begin();
			session.delete(p);
			tran.commit();
			return 1;
		}
	}
	
	public List<Product> getallproduct()
	{
		Session session =sf.openSession();
		TypedQuery qry=session.createQuery("select p from Product p");
		List<Product> listOfProduct=qry.getResultList();
		
		return listOfProduct;
		
	}
	
	public List<UserLogin> getalluser()
	{
		Session session =sf.openSession();
		TypedQuery qry=session.createQuery("select l from UserLogin l");
		List<UserLogin> listOfUser=qry.getResultList();
		
		return listOfUser;
		
	}
	
	public UserLogin searchuserbyname(String name)
	{
		Session session =sf.openSession();
		UserLogin p=session.get(UserLogin.class,name);
		return p;
		
	}
	
	public Product searchproduct(int id)
	{
		Session session =sf.openSession();
		Product p=session.get(Product.class,id);
		return p;
		
	}
	
	public List<Example> getallorder()
	{
		Session session =sf.openSession();
		TypedQuery qry=session.createQuery("select p from Example p");
		List<Example> listOfOrder=qry.getResultList();
		return listOfOrder;
		
	}
	
	
	}
	
	
	

