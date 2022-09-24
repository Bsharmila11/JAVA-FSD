<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View All Products</title>
</head>
<body>
<core:forEach items="${requestScope.listOfProduct}" var="product">
<span>ID : ${product.id} Name : ${product.name} Price : ${product.price} Category : ${product.category}</span>
</core:forEach>
<br/>
<br/>
<a href="adminsuccesslogin.jsp">Admin Login Page</a>
</body>
</html>