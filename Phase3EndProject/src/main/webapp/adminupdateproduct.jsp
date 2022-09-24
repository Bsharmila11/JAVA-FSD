<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Update Product</title>
</head>
<body>
	<center>
	<h3>Enter Product Details to Update</h3>
	</center>
	<form action="adminupdateproduct" method="post">
	<label>Product ID :</label>
	<input type="number" name="id">
	<label>Product Price :</label>
	<input type="number" name="price">
	<input type="submit" value="Click here to Update Product">
	<input type="reset" value="Reset">
	</form>
	<br/>
	<a href="adminsuccesslogin.jsp">Admin Dashboard</a>
</body>
</html>