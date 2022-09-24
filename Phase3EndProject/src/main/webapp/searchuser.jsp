<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search User</title>
</head>
<body>
	<h2>Search User</h2>
${requestScope.msg}
<form action="searchuser" method="get">
<label>Name :</label>
<input type="text" name="name">

<input type="submit" value="Search User">
<input type="reset" name="Reset">
</form>
<br/>
<a href="adminsuccesslogin.jsp">Admin Dashboard</a>
</body>
</html>