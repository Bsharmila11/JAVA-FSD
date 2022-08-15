<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<%!String email,password; %>
	<% 

	email=request.getParameter("email");
	password=request.getParameter("password");
	RequestDispatcher rd1=request.getRequestDispatcher("main.jsp");
	RequestDispatcher rd2=request.getRequestDispatcher("index.jsp");
	if(email.equals("sharmila@gmail.com") && password.equals("Raghu"))
	{
		out.println("Logged in Successfully");
		rd1.forward(request,response);
	}
	else
	{
		out.println("Failed to Login!! Please Try by giving Different Credentials");
		rd2.include(request,response); 
	}
	%>
</body>
</html>