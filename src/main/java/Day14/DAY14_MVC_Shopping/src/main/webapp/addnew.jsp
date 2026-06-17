<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="header.jsp" %>

<jsp:useBean id="prdDao" class="com.shopping.dal.ProductDao" />
<jsp:useBean id="prd" class="com.shopping.model.Product" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Product</title>
</head>
<body>

<h2>Add New Product</h2>

<form action="addnew.jsp">

    Id :
    <input type="text" name="id"><br><br>

    Name :
    <input type="text" name="name"><br><br>

    Price :
    <input type="text" name="price"><br><br>

    Qty :
    <input type="text" name="qty"><br><br>

    <input type="submit" value="Save">

</form>

<%
String id = request.getParameter("id");

if(id != null){

    prd.setId(Integer.parseInt(id));
    prd.setName(request.getParameter("name"));
    prd.setPrice(Double.parseDouble(request.getParameter("price")));
    prd.setQty(Integer.parseInt(request.getParameter("qty")));

    int rows = prdDao.addNewPrd(prd);

    if(rows > 0){
        out.println("<h3>Product Added Successfully</h3>");
    }
    else{
        out.println("<h3>Product Not Added</h3>");
    }
}
%>

</body>
</html>