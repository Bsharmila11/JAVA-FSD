<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Update Product</h2>
${requestScope.msg}
<form action="updateProduct" method="post">
<label>PID</label>
<input type="number" name="pid">
<label>Price</label>
<input type="number" name="price">
<label>URL</label>
<input type="url" name="url">
<input type="submit" value="Update Product">
<input type="reset" name="Reset">
</form>
<br/>
<a href="index.jsp">Back</a>
</body>
</body>
</html>