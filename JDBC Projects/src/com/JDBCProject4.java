package com;

import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCProject4 
{
	public static void main(String args[])
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded Successfully...");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining","root","Sharmila@11");
			System.out.println("Connected Successfully...");
			CallableStatement stmt = conn.prepareCall("{call add_product(?, ?)}");
			stmt.setString(1, "new product");
			stmt.setBigDecimal(2, new BigDecimal(1900.50));
			stmt.executeUpdate();
			System.out.println("Stored procedure has been executed.");
			stmt.close();
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
