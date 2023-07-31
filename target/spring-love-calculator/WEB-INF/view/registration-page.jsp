<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register for LC App</title>
</head>
<body>

<h1 align="center">Love Calculator</h1>

<div align="center" style="border: inherit; border-style: double; border-radius: inherit;">

	<form:form action="regSuccess" modelAttribute="regDto">
		<label for="regName">Name</label>
		<form:input type="text" path="name" id ="regName"/><br>
		<label for="regUname">User Name</label>
		<form:input type="text" path="userName" id ="regUname"/><br>
		<label for="regPwd">Password</label>
		<form:password type="text" path="password" id ="regPwd"/><br>
		
		
		<input type="submit" value = "Register">
	
	</form:form>



</div>
</body>
</html>