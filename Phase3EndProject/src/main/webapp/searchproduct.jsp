<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Product</title>
</head>
<body>
<h2>Search Product</h2>
${requestScope.msg}
<form action="searchproduct" method="get">
<label>ID : </label>
<input type="number" name="id">
<input type="submit" value="Search Product">
<input type="reset" name="Reset">
</form>
</body>
<br/>

<a href="adminsuccesslogin.jsp">Admin Dashboard</a>
</html>