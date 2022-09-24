<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View All Orders</title>
</head>
<body>
<core:forEach items="${requestScope.listOfOrder}" var="example">
<span>ID : ${example.id} Product ID : ${example.pid}  </span>
</core:forEach>
<br/>
<br/>
<a href="usersuccesslogin.jsp">User Dashboard</a>
</body>
</html>