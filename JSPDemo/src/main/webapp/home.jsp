<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<%
	String name=(String)request.getAttribute("obj");
	out.println("Welcome to Home Page "+name);
%>
</body>
</html>