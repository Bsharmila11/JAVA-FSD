package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JDBCDemo5
 */
public class JDBCDemo5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JDBCDemo5() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter out=response.getWriter();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			out.println("<br/>Driver Loaded Successfully...");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining","root","Sharmila@11");
			out.println("<br/>Connected Successfully...");
			Statement stmt=con.createStatement();
			out.println("<br/>Statement is Ready...");
			int result=stmt.executeUpdate("insert into employee values(1241,'Anitha',0)");
			if(result>0)
			{
				out.println("<br/>Inserted Successfully");
			}
			int result1=stmt.executeUpdate("delete from employee where salary=0");
			if(result>0)
			{
				out.println("<br/>Deleted Successfully");
			}
			else
			{
				out.println("<br/>Record Not Present");
			}
			int result2=stmt.executeUpdate("update employee set salary = 29000 where salary=34000");
			if(result>0)
			{
				out.println("<br/>Updated Successfully");
			}
			else
			{
				out.println("<br/>Record Not Present");
			}
			ResultSet rs=stmt.executeQuery("select * from employee");
			while(rs.next())
			{
				out.println("<br/>id is " +rs.getInt("id")+" name is "+rs.getString("name")+" Salary is "+rs.getFloat("salary"));
			}
		stmt.close();
		con.close();
		}
		catch(Exception e)
		{
			out.println(e);
		}
	}

}
