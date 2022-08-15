<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.*"%>
    <%@ page import="java.util.*"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Main Logic</title>
</head>
<body>
	<%! String id,name,price; %>
	<%
	id=(String)request.getParameter("id");
	name=(String)request.getParameter("name");
	price=(String)request.getParameter("price");
	ProductBean pb=new ProductBean();
	pb.setId(id);
	pb.setName(name);
	pb.setPrice(price);
	List<ProductBean> listofProduct;
	Object obj=session.getAttribute("obj");
	if(obj==null)
	{
		listofProduct=new ArrayList<ProductBean>();
		listofProduct.add(pb);
		session.setAttribute("obj", listofProduct);
		for (ProductBean s:listofProduct)
		{
			out.println(s+"<br/>");
		}
		%>
		<jsp:include page="index.jsp"></jsp:include>
		<% 	
		}
		else
		{
			listofProduct=(List<ProductBean>)session.getAttribute("obj");
			listofProduct.add(pb);
			for (ProductBean s:listofProduct)
			{
				out.println(s+"<br/>");
			}
			%>
			<jsp:include page="index.jsp"></jsp:include>
			<%
		}
	%>
</body>
</html>