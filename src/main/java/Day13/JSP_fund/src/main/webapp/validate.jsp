<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%= "Welcome To Validate JSP: " %>
<%-- retrieve data from login.html --%>
<%-- retrieve data from login.html --%>
Requestes At: <%= LocalDate.now() %>
<% 
String username = request.getParameter("username");
String pwd = request.getParameter("pwd");
System.out.println("----------Validate JSP----------");
%>
<h3>Welcome user</h3>
</body>
</html>