<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Store Product</title>
</head>
<body>
	<center>
	<h3>Enter Product Details to Store</h3>
	</center>
	<form action="adminstoreproduct" method="post">
	<label>Product ID :</label>
	<input type="number" name="id">
	<label>Product Name :</label>
	<input type="text" name="name">
	<label>Product Price :</label>
	<input type="number" name="price">
	<label>Product Catogery :</label>
	<input type="text" name="category">
	<input type="submit" value="Click here to Store Product">
	<input type="reset" value="Reset">
	</form>
	<br/>
	<a href="adminsuccesslogin.jsp">Admin Dashboard</a>
</body>
</html>