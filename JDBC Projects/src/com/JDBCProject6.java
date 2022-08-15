package com;
import java.sql.*;
import java.util.*;
public class JDBCProject6
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded Successfully...");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","Sharmila@11");
			System.out.println("Connected Successfully...");
			Statement stmt=con.createStatement();
			System.out.println("Statement is Ready...");
			int result=stmt.executeUpdate("create database java");
			if(result>0)
			{
				System.out.println("Database Created Successfully");
			}
			else
			{
				System.out.println("Database Already Exists");
			}
            stmt.executeUpdate("use java");
            System.out.println("Database Changed Successfully");
            stmt.executeUpdate("drop database java");
            System.out.println("Database Dropped Successfully");

		stmt.close();
		con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

