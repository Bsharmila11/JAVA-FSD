<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Page</title>
</head>
<body>
	<h3>Enter Your Product Details</h3>
	<form action="addProduct.jsp" method="post">
	<label>Product ID</label>
	<input type="name" name="id">
	<label>Product Name</label>
	<input type="name" name="name">
	<label>Product Price</label>
	<input type="name" name="price">
	<input type="submit" value="Submit Product Details">
	<input type="reset" value="Reset">
	</form>
</body>
</html>