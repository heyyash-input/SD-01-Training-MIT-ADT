<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="com.pojo.Product" %>

<%@ include file="header.jsp" %>

<jsp:useBean id="prdUtil" class="com.model.util.ProductUtil" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Products</title>
</head>
<body>

<h2>All Products</h2>

<table border="1">
<tr>

    <th>Name</th>
    <th>Price</th>
    <th>Qty</th>
</tr>

<%
for(Product p : prdUtil.getAllPrds()){
%>
<tr>
  
    <td><%= p.getName() %></td>
    <td><%= p.getPrice() %></td>
    <td><%= p.getQuantity() %></td>
</tr>
<%
}
%>

</table>

</body>
</html>