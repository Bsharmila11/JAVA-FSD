package com.service;
import java.util.*;
import java.util.List;
import com.Product;
import com.Dao.ProductDao;

public class ProductService {
ProductDao ed = new ProductDao();
    
    public String storeProduct(Product product) {
        if(product.getPrice()<1000) {
            return "Record Not Inserted. For a product to be inserted into Database Product Price must be greater than 1000. Please try with it!!";
        }else if(ed.storeProduct(product)>0) {
            return "Congratulations!! Record Inserted Successfully";
        }else {
            return "Record Not Inserted into Database. You gave a Duplicate Product ID. Please try by giving Another Product ID ";
        }
    }
}
