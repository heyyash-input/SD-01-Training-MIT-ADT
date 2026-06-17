<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor ='gray'>
<% 
	String username = "admin";
String pass = "123" ;

if(username.equals("admin") && pass.equals("123"))
	%>
	
	<jsp:forward page = "welcome.jsp"> 
	<jsp:param value = "MIT Pune" name = "clgname"> 
	</jsp:forward> 


</body>
</html>