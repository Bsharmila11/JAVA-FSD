<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<h3>Login Page from a Database</h3>
	<form action="signIn" method="post">
	<label>EmailID : </label>
	<input type="email" name="email">
	<label>Password : </label>
	<input type="password" name="password">
	<input type="submit" value="Click to Login">
	<input type="reset" value="Reset to provide New Credentias">
	</form>
	<br>
	<hr>
	<a href="signIn.jsp">Sign Up</a>
</body>
</html>