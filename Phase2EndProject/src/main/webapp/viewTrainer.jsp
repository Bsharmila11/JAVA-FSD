<%@page import="java.util.Iterator"%>
<%@page import="com.bean.Trainer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Trainer</title>
</head>
<body>
<h3>View All Trainer Details</h3>
<table border="1">
<tr>
	<th>Trainer ID</th>
	<th>Trainer Name</th>
</tr>
<%
Object obj = session.getAttribute("listofTrainer");
List<Trainer> listofTrainer = (List<Trainer>)obj;
Iterator<Trainer> li = listofTrainer.iterator();
while(li.hasNext()){
	Trainer t = li.next();
	%>
	<tr>
	<td><%=t.getTid() %> </td>
	<td><%=t.getTname()%> </td>
	</tr>
	<% 
}
%>
</table>
<br/>

<a href="Home.jsp">Main Page</a>
</body>
</html>