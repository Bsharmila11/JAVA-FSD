package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
public class JDBCProject8 
{
		public static void main(String args[])
		{
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","Sharmila@11");
				PreparedStatement pstmt=con.prepareStatement("select * from product where id=?");
				System.out.println("Enter the ID");
				Scanner sc=new Scanner(System.in);
				String id=sc.next();
				pstmt.setString(1,id);
				ResultSet rs=pstmt.executeQuery();
				if(rs.next())
				{
					System.out.println("Product ID : " +rs.getInt("id"));
					System.out.println("Product Name : " +rs.getString("name"));
					System.out.println("Product Price : " +rs.getFloat("price"));
				}
				else
				{
					System.out.println("<br/>Failed to Retreive Product Details");
					System.out.println("<br/>Incorrect Product ID!!! Please try by giving another ProductID");
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}

																													}
