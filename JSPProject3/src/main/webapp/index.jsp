<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> PageMain</title>
</head>
<body>
	<h4>Enter Your Credentials to Login</h4>
	<form action="validate.jsp" method="post">
		<label>Email ID : </label>
		<input type="email" name="email">
		<label>Password : </label>
		<input type="password" name="password">
		<input type="submit" value="Click Me to Login">
		<input type="reset" value="Reset">
	</form>
</body>
</html>