package com.Dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import com.Product;
import java.util.*;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.sql.*;

public class ProductDao 
{
	public int storeProduct(Product product) 
	{
		try 
		{
			Configuration con=new Configuration();
			con.configure("hibernate.cfg.xml");
			SessionFactory sf=con.buildSessionFactory();
			Session session=sf.openSession();
			Transaction tran=session.getTransaction();
			tran.begin();
			session.save(product);
			tran.commit();
			return 1;
		}
		catch(Exception e) 
		{
			System.out.println(e);
			return 0;
		}
	}		
		
		
		public int deleteProduct(int id) 
		{
				Configuration con=new Configuration();
				con.configure("hibernate.cfg.xml");
				SessionFactory sf=con.buildSessionFactory();
				Session session=sf.openSession();
				Transaction tran=session.getTransaction();
				Product p=session.get(Product.class,id);
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
		
		public int updateProduct(Product product) 
		{
				Configuration con=new Configuration();
				con.configure("hibernate.cfg.xml");
				SessionFactory sf=con.buildSessionFactory();
				Session session=sf.openSession();
				Transaction tran=session.getTransaction();
				Product p=session.get(Product.class,product.getId());
				if(p==null)
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
		
		
		public Product findProduct(int id) 
		{
				Configuration con=new Configuration();
				con.configure("hibernate.cfg.xml");
				SessionFactory sf=con.buildSessionFactory();
				Session session=sf.openSession();
				Product p=session.get(Product.class,id);
				return p;
				
	}
		public List<Product> findAllProduct() 
		{
				Configuration con=new Configuration();
				con.configure("hibernate.cfg.xml");
				SessionFactory sf=con.buildSessionFactory();
				Session session=sf.openSession();
				TypedQuery qry=session.createQuery("select p from Product p");
				List<Product> listofProduct=qry.getResultList();
				return listofProduct;
		}
		
		public List<Product> findAllProductUsingPrice(float price) 
		{
				Configuration con=new Configuration();
				con.configure("hibernate.cfg.xml");
				SessionFactory sf=con.buildSessionFactory();
				Session session=sf.openSession();
				TypedQuery qry=session.createQuery("select p from Product p where p.price > :price");
				qry.setParameter("price", price);
				List<Product> listofProduct=qry.getResultList();
				return listofProduct;
		}
		
		public List<String> retrieveOnlyProductName() 
		{
				Configuration con=new Configuration();
				con.configure("hibernate.cfg.xml");
				SessionFactory sf=con.buildSessionFactory();
				Session session=sf.openSession();
				TypedQuery qry=session.createQuery("select p.name from Product p");
				List<String> listofProduct=qry.getResultList();
				return listofProduct;
		}
		
		
		public List<Float> retrieveOnlyProductPrice() 
		{
				Configuration con=new Configuration();
				con.configure("hibernate.cfg.xml");
				SessionFactory sf=con.buildSessionFactory();
				Session session=sf.openSession();
				TypedQuery qry=session.createQuery("select p.price from Product p");
				List<Float> listofProduct=qry.getResultList();
				return listofProduct;
		}
		
		public List<Object[]> retrieveProductNameAndPrice() 
		{
				Configuration con=new Configuration();
				con.configure("hibernate.cfg.xml");
				SessionFactory sf=con.buildSessionFactory();
				Session session=sf.openSession();
				TypedQuery qry=session.createQuery("select p.name,p.price from Product p");
				List<Object[]> listofProduct=qry.getResultList();
				return listofProduct;
		}
	
	
}
	

	

