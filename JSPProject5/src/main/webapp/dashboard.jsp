<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard Page</title>
</head>
<body>
<% 
	String email=(String)session.getAttribute("name");
	out.println("Hello Welcome to Home Page "+email);
%>
<a href="logout.jsp">Logout</a>
</body>
</html>