<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Welcome to JSP Demo</h2>
	<%--JSP Comments Tag --%>
	<%!int a,b,sum; %>
	<%
	//int a;
	//int b;
	//int sum=a+b;
	sum=a+b;
	out.println("<br/>Welcome to JSP");
	out.println("<br/>Sum of two Numbers :"+sum);
	int a=100;
	int b=200;
	int sum=a+b;
	out.println("<br/><font color=red>Sum of two Numbers :"+sum +"</font>");
	%>
	<br/>
	<p>Sum of Two Numbers is <%=10+20 %></p>
	<p>Sum of Two Numbers is <%=sum%></p>
	<font color=red>Sum of <%=a %> And <%=b %> is <%=sum %></font>
</body>
</html>