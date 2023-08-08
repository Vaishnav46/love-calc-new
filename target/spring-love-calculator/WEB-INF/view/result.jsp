<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result Page</title>
</head>
<body>
<h1 align="center">Love Calculator App</h1>
<Hr>

<br/>
<h2>
The Love Calculator predicts :
</h2>
${userInfo.userName} and ${userInfo.crushName} are :
<br/>
Friends


<br/>

<a href="/spring-love-calculator/sendEmail">Send result to your mail</a>
</body>
</html>