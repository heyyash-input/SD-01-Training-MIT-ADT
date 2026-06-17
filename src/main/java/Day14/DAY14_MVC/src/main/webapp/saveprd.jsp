<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <jsp:useBean id="prdObj" class="com.pojo.Product">
    <jsp:setProperty name="prdObj" property="*" />
</jsp:useBean>

<jsp:useBean id="prdUtil" class="com.model.util.ProductUtil" />
     <%@ include file = "header.jsp" %>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Product Created</h1>


<%=prdObj %>
<%

prdUtil.addNewPrds(prdObj); // clean separation 



// create Object or product class
//name = request.getParameter("name"); // price qty
//Product prd = new Product();

//ProductUtil prdUtil = new ProductUtil ();
//prdUtil.addNewPrd(prd); 

%>

</body>
</html>