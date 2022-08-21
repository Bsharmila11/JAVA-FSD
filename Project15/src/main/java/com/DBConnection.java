package com;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
* Servlet implementation class ProductDetails
*/
@WebServlet("/ProductDetails")
public class DBConnection extends HttpServlet {
        private static final long serialVersionUID = 1L;
       
    /**
* @see HttpServlet#HttpServlet()
*/
    public DBConnection() {
        super();
        // TODO Auto-generated constructor stub
    }

        /**
         * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
         */
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                // TODO Auto-generated method stub
                
                try {
                         PrintWriter out = response.getWriter();
                         out.println("<html><body>");
                        Class.forName("com.mysql.cj.jdbc.Driver");
                		out.println("Driver Loaded Successfully...");
                		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining","root","Sharmila@11");
                		out.println("Connected Successfully...");
                        CallableStatement stmt = conn.prepareCall("{call add_product(?, ?)}");
                        stmt.setString(1, "new product");
                        stmt.setBigDecimal(2, new BigDecimal(1900.50));
                        stmt.executeUpdate();
                        out.println("Stored procedure has been executed.<Br>");
                        stmt.close();
                        out.println("</body></html>");
                        conn.close();
                     } 
                catch (ClassNotFoundException e) {
                        e.printStackTrace();
                } 
                catch (SQLException e) {
                        e.printStackTrace();
                }
        }
}

