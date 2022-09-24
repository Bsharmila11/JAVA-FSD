<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Spring Boot</h3>
	<form action="checkUser" method="post">
	<label>Email : </label>
	<input type="email" name="email">
	<label>Password : </label>
	<input type="password" name="password">
	<input type="submit" value="Login">
	<input type="reset" value="Reset">
	</form>
</body>
</html>