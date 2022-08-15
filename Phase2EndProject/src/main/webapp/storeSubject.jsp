<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Store Subject</title>
</head>
<body>
	<h3>Add Subject Details</h3>
<form action="SubjectsController" method="post">
<label>Subject ID : </label>
<input type="number" name="subid">
<label>Subject Name : </label>
<input type="text" name="subname">
<input type="submit" value="Store Subject">
<input type="reset" value="Reset">
</form>
<br/>
<a href="Home.jsp">Main Page</a>
</body>

</html>