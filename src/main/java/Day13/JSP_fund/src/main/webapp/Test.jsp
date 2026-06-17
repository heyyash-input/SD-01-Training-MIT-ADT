
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>JSP servlet demo</h1>
<!--  this is Html --> 
<%! int a= 10 , b = 20 ; %>
num1 = <%=a  %><br>
<%=b %>
<br>
Add = <%= (a+b) %>
<br> 
<%= "This is java here with html" %>
<%  
int[] arr = {4,5,6,7,8,9,10}; 

for(int i : arr ){
	System.out.println(i); //server 
	out.println(); //browser
}%>

</body>
</html>