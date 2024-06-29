<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="addition" method="post">
		N1:<input type="Text" name="n1" />${n1Error }<Br>
		<Br> N2: <input type="text" name="n2" />${n2Error }<Br>
		<Br> <input type="submit" value="Add" />
	</form>
</body>
</html>