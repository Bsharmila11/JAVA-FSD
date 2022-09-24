<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View All User</title>
</head>
<body>
<core:forEach items="${requestScope.listOfUser}" var="login">
<span>Name : ${login.name} Password : ${login.password} </span>
</core:forEach>
<br/>
<br/>
<a href="adminsuccesslogin.jsp">Admin Dashboard</a>
</body>
</html>