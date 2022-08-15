<%@page import="java.util.Iterator"%>
<%@page import="com.bean.Students"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>View All Student Details</h2>




<table border="1">
<tr>
	<th>SID</th>
	<th>SName</th>
	<th>Age</th>
</tr>
<%
Object obj = session.getAttribute("listofStudent");
List<Students> listofStudent = (List<Students>)obj;
Iterator<Students> li = listofStudent.iterator();
while(li.hasNext()){
	Students t = li.next();
	%>
	<tr>
	<td><%=t.getSid() %> </td>
	<td><%=t.getSname()%> </td>
	<td><%=t.getAge() %></td>
	</tr>
	<% 
}
%>
</table>
<br/>
<a href="Home.jsp">Main</a>
</body>
</html>