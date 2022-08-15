package com.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Product;
import com.service.ProductService;

/**
 * Servlet implementation class RetrieveProductNameAndPrice
 */
public class RetrieveProductNameAndPrice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RetrieveProductNameAndPrice() {
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
		ProductService ps=new ProductService();
		List<Object[]> listofProduct=ps.retrieveProductNameAndPrice();
		out.println("<h1>All Product Details</h2>");
		out.println("<table border=1>");
		out.println("<tr>  <th>PNAME</th> <th>PPRICE</th> </tr>");
		Iterator<Object[]> li=listofProduct.iterator();
		while(li.hasNext())
		{
			Object obj[] =li.next();
			out.println("<tr> <td>"+obj[0]+"</td><td>"+obj[1] +"<td/></tr>");
			
		}
		out.println("</table>");
		out.println("</br>");
		out.println("<a href='index.html'>Main Page<a/>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
	}

}
