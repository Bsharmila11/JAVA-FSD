<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>
	<h3>Congratulations You Successfully Logged In</h3>
	<label>User Mail ID : </label>
	${requestScope.obj1}
	<br/>
	<label>User Password : </label>
	${requestScope.obj2}
</body>
</html>