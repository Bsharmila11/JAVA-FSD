<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>
</head>
<body>
	<h3>Enter your Credentials to Login to User Home Page</h3>
	<form action="userlogin" method="post">
	<label>Name : </label>
	<input type="text" name="name">
	<label>Password : </label>
	<input type="password" name="password">
	<input type="submit" value="Click Here to Login to User Page">
	<input type="reset" value="Reset">
	</form>
	<a href="usersignin.jsp">SignIn</a>
</body>
</html>