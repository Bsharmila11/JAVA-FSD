package com;
import java.sql.*;
import java.util.*;
public class JDBCProject7
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded Successfully...");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining","root","Sharmila@11");
			System.out.println("Connected Successfully...");
			Statement stmt=con.createStatement();
			System.out.println("Statement is Ready...");
			int result=stmt.executeUpdate("insert into employee values(1241,'Anitha',0)");
			if(result>0)
			{
				System.out.println("Inserted Successfully");
			}
			int result1=stmt.executeUpdate("delete from employee where salary=0");
			if(result>0)
			{
				System.out.println("Deleted Successfully");
			}
			else
			{
				System.out.println("Record Not Present");
			}
			int result2=stmt.executeUpdate("update employee set salary = 29000 where salary=34000");
			if(result>0)
			{
				System.out.println("Updated Successfully");
			}
			else
			{
				System.out.println("Record Not Present");
			}
			ResultSet rs=stmt.executeQuery("select * from employee");
			while(rs.next())
			{
				System.out.println("id is " +rs.getInt("id")+" name is "+rs.getString("name")+" Salary is "+rs.getFloat("salary"));
			}
		stmt.close();
		con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
