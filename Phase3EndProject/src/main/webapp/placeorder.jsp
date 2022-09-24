<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Place Order</title>
</head>
<body>
	<center>
	<h3>Enter Order Details</h3>
	</center>
	<form action="storeorder" method="post">
	<label>Product ID :</label>
	<input type="number" name="id">
	<label>Order ID :</label>
	<input type="number" name="pid">
	<input type="submit" value="Click here to Place Order">
	<input type="reset" value="Reset">
	</form>
	<br/>
	<a href="usersuccesslogin.jsp">User Dashboard</a>
</body>
</html>