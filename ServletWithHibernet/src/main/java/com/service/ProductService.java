package com.service;
import java.util.*;
import java.util.List;
import com.Product;
import com.Dao.ProductDao;

public class ProductService {
ProductDao ed = new ProductDao();
    
    public String storeProduct(Product product) {
        if(product.getPrice()<1000) {
            return "Product Price must be > 1000";
        }else if(ed.storeProduct(product)>0) {
            return "Record inserted successfully";
        }else {
            return "Record didn't insert";
        }
    }
    
    
    public String deleteProduct(int id) {
        if(ed.deleteProduct(id)>0) 
        {
            return "Product Deleted Successfully";
        }
        else {
            return "Product Not Present";
        }
  
    }
    
    public String updateProduct(Product product) {
    	Product p=ed.findProduct(product.getId());
    	if(p==null)
    	{
    		return "Product Not Present";
    	}
    	else if(product.getPrice()<p.getPrice()) 
        {
            return "New Price must be greater than Old Price";
        }
        else if(ed.updateProduct(product)>0){
            return "Product updated Successfully";
        }
        else
        {
        	return "Product didnt Update";
        	
        }
  
    }
    public String findProduct(int id)
    {
    	Product p=ed.findProduct(id);
    	if(p==null)
    	{
    		return "Product Not Present";
    	}
    	else
    	{
    		return p.toString() ;
    	}
    }
    
    public List<Product> findallProduct()
    {
    	List<Product> listofProduct=ed.findAllProduct();
    	Iterator<Product> li=listofProduct.iterator();
    	while(li.hasNext())
    	{
    		Product pp=li.next();
    		pp.setPrice(pp.getPrice()-pp.getPrice()*0.10f);
    	}
    	return listofProduct;
    }
    
    public List<Object[]> retrieveProductNameAndPrice()
    {
    	return ed.retrieveProductNameAndPrice();
    	
    }
}
