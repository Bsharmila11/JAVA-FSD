<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Delete Product</h2>
${requestScope.msg}
<form action="deleteProduct" method="post">
<label>PID</label>
<input type="number" name="pid">

<input type="submit" value="Delete Product">
<input type="reset" name="Reset">
</form>
<br/>
<a href="index.jsp">Back</a>
</body>
</html>