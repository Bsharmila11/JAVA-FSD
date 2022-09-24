<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignIn Page</title>
</head>
<body>
	<h3>Signing In to create a new account</h3>
	<form action="signUp" method="post">
	<label>EmailID : </label>
	<input type="email" name="email">
	<label>Password : </label>
	<input type="password" name="password">
	<input type="submit" value="Click to Login">
	<input type="reset" value="Reset to provide a new Credentials">
	</form>
	<br/>
	<hr/>
	<a href="login.jsp">Login</a>
</body>
</html>