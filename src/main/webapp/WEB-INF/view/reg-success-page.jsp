
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Successful</title>
</head>
<body>
<h1>Registeration Details are shown below</h1>
	<div align="center">
		<p> Name : ${regDto.name} </p>
		<p> UserName : ${regDto.userName} </p>
		<p> Password : ${regDto.password} </p>
		<p> Country : ${regDto.country} </p>
		<p> Hobbies : 
		
		<c:forEach var="hobby" items="${regDto.hobbies}">
			<div>
			${hobby} <br/>
			</div>
		</c:forEach>
		
		</p>
		<p> Gender : ${regDto.gender} </p>
		
		<p>Email : ${regDto.communicationDto.email}</p>
		
		<p>Phone Number : ${regDto.communicationDto.phone} </p>		
		
		
	</div>
</body>
</html>