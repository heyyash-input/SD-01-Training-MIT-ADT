<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Display</h2>
<table class = "table">
	<thead>
	<tbody>
		<c:forEach var="prd" items = "${prdUtil.getAllPrds()}">
			<tr>
				<td>
				
	
	</tbody>
	
	</table>
</body>
</html>