<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to Pizza Pizza World!</title>
</head>
<body>
	<h1>Welcome to Pizza Pizza World!</h1>
	<form action ="getSizeServlet" method="post">
	What size of pizza would you like to order? <br/>
	<input type="text" name="userSize" size="10">
	<input type="submit" value="toppings" />
	</form>
</body>
</html>