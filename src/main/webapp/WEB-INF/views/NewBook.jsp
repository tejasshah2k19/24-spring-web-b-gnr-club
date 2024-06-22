<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
	<h2>New Book</h2>
	<form action="savebook" method="post">
	
		Title :  <input type="text" name="title"/><br><br> 
		AuthorName :<input type="text" name="authorName"/><br><br> 
		Category :<input type="text" name="category"/><br><br> 
		Price : <input type="text" name="price"/><br><br> 
	
		<input type="submit" value="Save Book"/>
	</form>

</body>
</html>