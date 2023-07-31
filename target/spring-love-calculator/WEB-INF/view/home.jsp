<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Love Calculator</title>
</head>

<body>
	<h1 style="font-family: sans-serif; font-weight: bolder;"
		align="center">Welcome To Love Calculator App</h1>
	<hr>

<form:form action="processHomePage" method="get" modelAttribute="userInfo">


	<div align="center">
		<p>
			<label for="yname">Your Name :</label> <form:input type="text" id="yname"
				path="userName" />
		</p>

		<p>
			<label for="cname">Crush Name :</label> <form:input type="text" id="cname"
				path="crushName" />
		</p>

		<input type="submit" value="calculate"/>

	</div>
</form:form>

</body>
</html>