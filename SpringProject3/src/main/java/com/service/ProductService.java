package com.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bean.Product;
import com.Dao.ProductDao;
@Service
public class ProductService 
{
	@Autowired
	ProductDao productdao;
	public String retrieveProductDetails(Product product)
	{
		if(productdao.retrieveProductDetails(product)>0)
		{
			return "Product Details Retrieved Successfully";
		}
		else
		{
			return "Product ID not found in the Database ";
		}
	}
}
