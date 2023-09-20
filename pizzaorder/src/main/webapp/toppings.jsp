<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Toppings!</title>
</head>
<body>
	<h1>Pick your toppings!</h1>
	<strong><p> You have chosen a ${userToppings.getSize()} pizza! Now pick a topping! <br/></p></strong>
	<form action ="getToppingServlet" method="post">
	What topping would you like? <br/>
	<input type="text" name="pizzaTopping" size="20">
	<input type="submit" value="confirm order" />
	</form>
<a href="index.jsp">Would you like to order another pizza?</a>
</body>
</html>