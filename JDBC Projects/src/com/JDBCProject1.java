package com;
import java.sql.*;
import java.util.*;
public class JDBCProject1
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded Successfully...");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining","root","Sharmila@11");
			System.out.println("Connected Successfully...");
	       

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}