package com.Dao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.bean.Product;
@Repository
public class ProductDao 
{
		@Autowired
		JdbcTemplate jdbcTemplate;
		public int retrieveProductDetails(Product product) 
		{
			try 
			{
				List ll=jdbcTemplate.queryForList("select * from login where id= ?",product.getId());
				return ll.size();
			}
			catch (Exception e) 
			{
				System.out.println(e);
				return 0;
			}
		
		}
}
