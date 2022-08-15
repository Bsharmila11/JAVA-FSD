<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Main Page</title>
</head>
<body>
	<form action="check.jsp" method="get">
		<label>Email ID</label>
		<input type="email" name="email">
		<label>Password</label>
		<input type="password" name="password">
		<input type="submit" value="Click Me to Login">
		<input type="reset" name="Reset">
	</form>
</body>
</html>