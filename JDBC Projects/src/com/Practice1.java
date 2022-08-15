package com;
import java.sql.*;
import java.util.*;
public class Practice1
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded Successfully...");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining","root","Sharmila@11");
			System.out.println("Connected Successfully...");
			//Statement stmt=con.createStatement();
			//System.out.println("Statement is Ready...");
			//int result=stmt.executeUpdate("insert into employee values(1241,'Anitha',0)");
			//if(result>0)
			//{
				//System.out.println("Inserted Successfully");
			//}
			//int result=stmt.executeUpdate("delete from employee where salary=0");
			//if(result>0)
			//{
				//System.out.println("Deleted Successfully");
			//}
			//else
			//{
				//System.out.println("Record Not Present");
			//}
			//int result=stmt.executeUpdate("update employee set salary = 34000 where salary=29000");
			//if(result>0)
			//{
				//System.out.println("Updated Successfully");
			//}
			//else
			//{
				//System.out.println("Record Not Present");
			//}
			//ResultSet rs=stmt.executeQuery("select * from employee");
			//while(rs.next())
			//{
				//System.out.println("id is " +rs.getInt("id")+" name is "+rs.getString("name")+" Salary is "+rs.getFloat("salary"));
			//}
			Scanner sc=new Scanner(System.in);
			//PreparedStatement pstmt=con.prepareStatement("insert into employee values(?,?,?)");
			//System.out.println("Enter the Id");
			//int id=sc.nextInt();
			//pstmt.setInt(1, id);
			//System.out.println("Enter the Name");
			//String name=sc.next();
			//pstmt.setString(2,name);
			//System.out.println("Enter the Salary");
			//float salary =sc.nextFloat();
			//pstmt.setFloat(3,salary);
			//int result=pstmt.executeUpdate();
			//if(result>0)
			//{
				//System.out.println("Inserted Successfully");
			//}
			//else
			//{
				//System.out.println("Not Inserted");
			//}
			//PreparedStatement pstmt=con.prepareStatement("delete from employee where id=?");
			//System.out.println("Enter the Id");
			//int id=sc.nextInt();
			//pstmt.setInt(1, id);
			//int result=pstmt.executeUpdate();
			//if(result>0)
			//{
				//System.out.println("Deleted Successfully");
			//}
			//else
			//{
				//System.out.println("Record Not Present");
			//}
			//PreparedStatement pstmt=con.prepareStatement("update employee set salary = ? where id=?");
			//System.out.println("Enter the Id");
			//int id=sc.nextInt();
			//pstmt.setInt(2, id);
			//System.out.println("Enter the Salary");
			//float salary=sc.nextFloat();
			//pstmt.setFloat(1, salary);
			//int result=pstmt.executeUpdate();
			//if(result>0)
			//{
				//System.out.println("Updated Successfully");
			//}
			//else
			//{
				//System.out.println("Record Not Present");
			//}
			PreparedStatement pstmt=con.prepareStatement("select * from employee where salary=?");
			System.out.println("Enter the Salary");
			float salary=sc.nextFloat();
			pstmt.setFloat(1, salary);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
				System.out.println("id is " +rs.getInt("id")+" name is "+rs.getString("name")+" Salary is "+rs.getFloat("salary"));
			}
		pstmt.close();		
		//rs.close();	
		//stmt.close();
		con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
