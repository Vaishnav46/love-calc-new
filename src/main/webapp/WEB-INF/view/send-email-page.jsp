<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Love Calculator</title>
</head>
<body>

	<h1 align="center">Love Calculator App</h1>
	<hr>

	<h1>Hi</h1>

	<h2>Send result to your email</h2>
	<form:form action="processEmail" method="GET" modelAttribute="emailDto">
	
		<label>Enter your email</label>
		<form:input path="userEmail"/>
		
		<input type="submit" value = "Send">
	
	</form:form>
</body>
</html>