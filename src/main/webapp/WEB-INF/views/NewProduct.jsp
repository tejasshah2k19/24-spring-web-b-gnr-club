<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Product</title>
</head>
<body>
	<h2>New Product</h2>

	<form action="saveproduct" method="post" enctype="multipart/form-data">
	
		ProductName: <input type="text" name="productName"/><br><br> 
		Price: <input type="text" name="price"/><br><br> 
		Category: <input type="text" name="category"/><br><br> 
		ProductImage: <input type="file" name="productImage"/><br><br>	
		<input type="submit" value="Save Product"/>
	</form>	

</body>
</html>