<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Page</title>
</head>
<body>
	<h3>Enter your Credentials to Login</h3>
	<form action="LoginController" method="post">
		<label>EmailId : </label>
		<input type="email" name="email">
		<label>Password : </label>
		<input type="password" name="password">
		<input type="submit" value="Click Me to Login">
		<input type="reset" value="Reset">
	</form>
</body>
</html>