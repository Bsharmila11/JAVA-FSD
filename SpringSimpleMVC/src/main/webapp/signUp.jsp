<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Creating Account</h3>
	<form action="signUp" method="post">
	<label>EmailID : </label>
	<input type="email" name="email">
	<label>Password : </label>
	<input type="password" name="password">
	<input type="submit" value="Click to Login">
	</form>
	<br/>
	<a href="loginDb.jsp">Login Page</a>
</body>
</html>