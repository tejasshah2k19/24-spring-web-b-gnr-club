<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table border="1">

		<tr>
			<th>ProductName</th>
			<th>Category</th>
			<th>Image</th>
		</tr>

		<tr>
			<td>${products[0].productName}</td>
			<td>${products[0].category}</td>
			<td><img src="${products[0].productImagePath}"  height="100px" width="100px"/></td>
		</tr>


		<tr>
			<td>${products[1].productName}</td>
			<td>${products[1].category}</td>
			<td><img src="${products[1].productImagePath}"  height="100px" width="100px" /></td>
		</tr>
	</table>


</body>
</html>