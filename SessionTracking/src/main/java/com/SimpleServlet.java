package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SimpleServlet
 */
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimpleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	int count;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
    	PrintWriter out=response.getWriter();
		HttpSession hs=request.getSession();
		out.println("Session ID :"+hs.getId());
		if(hs.isNew())
		{
			out.println("<br/>New Client");
		}
		else
		{
			out.println("<br/>Old Client");
		}
		out.println("<br/>Session Creation time :"+hs.getCreationTime());
		out.println("<br/>Session Creation time :"+new Date(hs.getCreationTime()));
		out.println("<br/>Last Access Time :"+new Date(hs.getLastAccessedTime()));
		out.println("<br/>Default Time :"+hs.getMaxInactiveInterval());
		hs.setMaxInactiveInterval(600);
		out.println("<br/>Default Time :"+hs.getMaxInactiveInterval());
		count++;
		if(count%5==0)
		{
			hs.invalidate();
		}
		out.println("<br/>Count value"+count);
	}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}
}
