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
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr>
	<th>TID</th>
	<th>TName</th>
	<th>Tech</th>
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
	<td><%=t.getTech() %></td>
	</tr>
	<% 
}
%>
</table>
<br/>

<a href="Home.jsp">Main</a>
</body>
</html>