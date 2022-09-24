<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Enter your Credentials to SignIn to User Home Page</h3>
	<form action="usersignin" method="post">
	<label>Name : </label>
	<input type="text" name="name">
	<label>Password : </label>
	<input type="password" name="password">
	<input type="submit" value="Click Here to SignIn to User Page">
	<input type="reset" value="Reset">
	</form>
	<br/>
	<a href="userlogin.jsp">Login</a>
</body>
</html>