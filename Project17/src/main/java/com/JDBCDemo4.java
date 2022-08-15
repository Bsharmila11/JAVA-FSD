package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JDBCDemo4
 */
public class JDBCDemo4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JDBCDemo4() {
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
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","Sharmila@11");
			out.println("<br/>Connected Successfully...");
			Statement stmt=con.createStatement();
			out.println("<br/>Statement is Ready...");
			int result=stmt.executeUpdate("create database java");
			if(result>0)
			{
				out.println("<br/>Database Created Successfully");
			}
			else
			{
				out.println("<br/>Database Already Exists");
			}
            stmt.executeUpdate("use java");
            out.println("<br/>Database Changed Successfully");
            stmt.executeUpdate("drop database java");
            out.println("<br/>Database Dropped Successfully");

		stmt.close();
		con.close();
		}
		catch(Exception e)
		{
			out.println(e);
		}
	}

}
