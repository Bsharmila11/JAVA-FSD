<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
</head>
<body>
	<h3>Enter Your Credentials to Login to Admin Home Page</h3>
	<form action="adminlogin" method="post">
		<label>Name : </label>
		<input type="text" name="name">
		<label>Password : </label>
		<input type="password" name="password">
		<input type="submit" value="Click here to Login to Admin Page">
		<input type="reset" value="Reset">
	</form>
</body>
</html>