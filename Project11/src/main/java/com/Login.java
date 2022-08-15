package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");  
		PrintWriter out=response.getWriter();  
		RequestDispatcher rd1 = request.getRequestDispatcher("link.html");
		RequestDispatcher rd2 = request.getRequestDispatcher("index.html");
		String username=request.getParameter("username");  
		String password=request.getParameter("password");  
		if(username.equals("sharmila@gmail.com") && password.equals("uhgaR"))
		{  
			out.println("<br/>Welcome, "+username);
			rd1.include(request,response);
			
		}  
		else
		{
			out.print("Sorry, You have entered wrong Credentials. Please Try by giving Another Credentials");  
			rd2.include(request, response);
			 
		}  
		out.close();  
		    }  

	}


