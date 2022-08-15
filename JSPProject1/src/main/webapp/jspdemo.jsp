<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Demo on JSP</title>
<%!int a=20,b=50,c; %>
<% 
	out.println("<h1>"+"<br/>Welcome to JSP Demo"+"</h1>");
	out.println("<h3>"+"<br/>This is a Simple JSP Program"+"</h3>");
	c=a+b;
	out.println("<br/><font color=red>Sum of two Numbers :"+c +"</font>");
%>
<br/>
<font color=red>Sum of <%=a %> And <%=b %> is <%=c %></font>
</head>
<body>

</body>
</html>