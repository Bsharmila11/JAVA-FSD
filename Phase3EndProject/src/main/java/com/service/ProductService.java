package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.ProductDao;
import com.bean.Example;

import com.bean.Product;
import com.bean.UserLogin;

@Service
public class ProductService 
{
	@Autowired
	ProductDao productDao;
	public String storeproduct(Product product) 
	{
		if(product.getPrice()<1000) 
		{
			return "Product price must be > 1000";
		}
		else if(productDao.storeproduct(product)>0)
		{
			return "Product details stored successfully";
		}
		else 
		{
			return "Product details didn't store";
		}
	}
	
	public String updateproduct(Product product) 
	{
		if(productDao.updateproduct(product)>0)
		{
				return "Product details updated successfully";
		}
		else 
		{
				return "Product details didn't update";
		}
	}
	
	public String deleteproduct(int id) 
	{
		if(productDao.deleteproduct(id)>0) 
		{
			return "Record deleted successfully";
		}
		else 
		{
			return "Record not present";
		}
	}
	
	public List<Product> getallproduct()
	{
		return productDao.getallproduct();
	}
	
	public List<UserLogin> getalluser()
	{
		return productDao.getalluser();
	}
	
	public String searchuserbyname(String name) 
	{
		UserLogin p=productDao.searchuserbyname(name);
		if(p==null) 
		{
			return "Record Not Present";
		}
		else 
		{
			return p.toString();
		}
	}
	
	public String searchproduct(int id) 
	{
		Product p=productDao.searchproduct(id);
		if(p==null) 
		{
			return "Record Not Present";
		}
		else 
		{
			return p.toString();
		}
	}
	
	public List<Example> getallorder()
	{
		return productDao.getallorder();
	}
	
	
	
	
}
