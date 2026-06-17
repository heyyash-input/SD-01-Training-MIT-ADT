<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="header.jsp" %>

<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core"%>

<jsp:useBean id="prdDao" class="com.shopping.dal.ProductDao" /> 


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Products</title>
</head>
<body>

<h3>Welcome to Show All Products</h3>

<table class="table">
    <thead>
        <tr>
            <th>Prd id</th>
            <th>Prd name</th>
            <th>Prd price</th>
            <th>Prd qty</th>
        </tr>
    </thead>

    <tbody>
        <c:forEach var="prd" items="${prdDao.getAllPrds()}">
              <tr>
        <td>${prd.getId()}</td>
        <td>${prd.getName()}</td>
        <td>${prd.getPrice()}</td>
        <td>${prd.getQty()}</td>
    </tr>
        </c:forEach>
    </tbody>
</table>

</body>
</html>