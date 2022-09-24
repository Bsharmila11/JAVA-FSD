<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Product</title>
</head>
<body>
	<center>
	<h3>Enter Product Details to Delete</h3>
	</center>
	<form action="deleteproduct" method="post">
	<label>ID : </label>
	<input type="number" name="id">
	<input type="submit" value="Delete Product">
	<input type="reset" name="Reset">
</form>
<br/>
	<a href="adminsuccesslogin.jsp">Admin Dashboard</a>
</body>
</html>