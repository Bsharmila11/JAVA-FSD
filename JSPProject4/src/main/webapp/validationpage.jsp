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
		%>
		<jsp:forward page="homepage.jsp"></jsp:forward>
		<%
	}
	else
	{
		out.println("Failed to Login!! Please Try by giving Different Credentials");
		//rd2.include(request,response);
		%>
		<jsp:include page="indexpage.jsp"></jsp:include>
		<% 
	}
	%>
</body>
</html>