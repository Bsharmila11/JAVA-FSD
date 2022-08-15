<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Validation Page</title>
</head>
<body>
	<%!String email,password; %>
	<% 

	email=request.getParameter("email");
	password=request.getParameter("password");
	if(email.equals("sharmila@gmail.com") && password.equals("Raghu"))
	{
		out.println("Logged in Successfully");
		session.setAttribute("name", email);
		response.sendRedirect("dashboard.jsp");
	}
	else
	{
		response.sendRedirect("index.jsp");
	}
	%>
</body>
</html>