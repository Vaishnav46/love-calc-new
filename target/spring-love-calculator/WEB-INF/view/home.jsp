<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Love Calculator</title>
<style type="text/css">
.error {
	color: red;
	position: fixed;
	text-align: left;
	margin-left: 30px;
}
</style>

</head>

<body>
	<h1 style="font-family: sans-serif; font-weight: bolder;"
		align="center">Welcome To Love Calculator App</h1>
	<hr>

	<form:form action="processHomePage" method="get"
		modelAttribute="userInfo">


		<div align="center">
			<p>
				<label for="yname">Your Name :</label>
				<form:input type="text" id="yname" path="userName" />
				<form:errors path="userName" cssClass="error"></form:errors>
			</p>

			<p>
				<label for="cname">Crush Name :</label>
				<form:input type="text" id="cname" path="crushName" />
				<form:errors path="crushName" cssClass="error"></form:errors>
			</p>
			
			<p>
				<form:checkbox path="termsAndConditions" id = "checkBox"/>
				<label>I am agreeing that this is for fun</label>
				<form:errors path="termsAndConditions" cssClass="error"></form:errors>
			</p>

			<input type="submit" value="calculate" />

		</div>
	</form:form>

</body>
</html>