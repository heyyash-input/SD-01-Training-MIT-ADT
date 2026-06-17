<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="header.jsp" %>
    <jsp:useBean id="prdDao" class="com.shopping.dal.ProductDao" />
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Search Product By Id</h2>

<form action="searchprd.jsp" method="get">

    Enter Product Id :
    <input type="text" name="id">

    <input type="submit" value="Search">

</form>

<hr>

<%
String pid = request.getParameter("id");

if(pid != null){

    int id = Integer.parseInt(pid);

    com.shopping.model.Product prd =
            prdDao.searchById(id);

    if(prd != null){
%>

        <table border="1">

            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Price</th>
                <th>Qty</th>
            </tr>

            <tr>
                <td><%= prd.getId() %></td>
                <td><%= prd.getName() %></td>
                <td><%= prd.getPrice() %></td>
                <td><%= prd.getQty() %></td>
            </tr>

        </table>

<%
    }
    else{
%>

        <h3>Product Not Found</h3>

<%
    }
}
%>


</body>
</html>