<%@ page language="java" errorPage="MyErrorPage.jsp"  contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>This is Result Page </h2>
<%
int num1 = Integer.parseInt(request.getParameter("num1"));
int num2 = Integer.parseInt(request.getParameter("num2"));
int num3 = num1/num2;
%>
<h4>Div=<%= num3 %></h4> 
</body>
</html>