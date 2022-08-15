package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String emailId=request.getParameter("emailId");
		String password=request.getParameter("pass");
		HttpSession hs=request.getSession();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining","root","Sharmila@11");
			PreparedStatement pstmt=con.prepareStatement("select * from login where email=? and password=?");
			pstmt.setString(1,emailId);
			pstmt.setString(2,password);
			RequestDispatcher rd1 = request.getRequestDispatcher("HomePage");
			RequestDispatcher rd2 = request.getRequestDispatcher("index.html");
			ResultSet rs=pstmt.executeQuery();
			if(rs.next())
			{
				out.println("Your Logged in Successfully");
				//request.setAttribute("obj",emailId);
				//rd1.forward(request, response);  
				hs.setAttribute("obj",emailId);
				//hs.invalidate();
				response.sendRedirect("HomePage");
			}
			else
			{
				out.println("Failed to Login Try Again");
				
				rd2.include(request, response);    
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String emailId=request.getParameter("emailId");
		String password=request.getParameter("pass");
		RequestDispatcher rd1 = request.getRequestDispatcher("index.html");
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining","root","Sharmila@11");
			PreparedStatement pstmt=con.prepareStatement("insert into login values(?,?)");
			pstmt.setString(1,emailId);
			pstmt.setString(2,password);
			int result=pstmt.executeUpdate();
			if(result>0)
			{
				out.println("Account Created Successfully");
			}
			else
			{
				out.println("Failed to Create Try Again");
				
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		rd1.include(request, response);
		
	}

}
