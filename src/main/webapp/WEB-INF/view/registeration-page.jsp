<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register for LC App</title>
<style type="text/css">
.error {
	color: red;
	position: fixed;
}
</style>
</head>
<body>

	<h1 align="center">Love Calculator</h1>

	<div align="center"
		style="border: inherit; border-style: double; border-radius: inherit; border-color: cyan;">

		<form:form action="regSuccess" modelAttribute="regDto">
			<p>
				<label for="regName">Name:</label>
				<form:input path="name" id="regName" />
				<form:errors path="name" cssClass="error"></form:errors>
				<br />
			</p>
			<p>
				<label for="regUname">User Name:</label>
				<form:input path="userName" id="regUname" />
				<form:errors path="userName" cssClass="error"></form:errors>
				<br />
			</p>
			<p>
				<label for="regPwd">Password:</label>
				<form:password path="password" id="regPwd" />
				<br />
			</p>

			<p>
				<label for="regCountry">Country:</label>
				<form:select path="country" id="regCountry">
					<form:option value="Ind">India</form:option>
					<form:option value="Aus">Australia</form:option>
					<form:option value="Pak">Pakisthan</form:option>
					<form:option value="Sl">Sri Lanka</form:option>
				</form:select>
			</p>

			<p>
				<Label>Hobbies:</Label> Cricket:
				<form:checkbox path="hobbies" value="cricket" />
				Football:
				<form:checkbox path="hobbies" value="football" />
				Gaming:
				<form:checkbox path="hobbies" value="gaming" />
				Gym:
				<form:checkbox path="hobbies" value="gym" />
			</p>

			<p>
				<label for="regGender">Gender:</label> Male
				<form:radiobutton path="gender" id="regGender" value="male" />
				Female
				<form:radiobutton path="gender" id="regGender" value="female" />
			</p>

			<p>
				<label for="regAge">Age:</label>
				<form:input path="age" id="regAge" />
				<form:errors path="age" cssClass="error"></form:errors>
			<div align="center">
				<h1>Communication Details</h1>
				<p>
					<label>Email:</label>
					<form:input path="communicationDto.email" />
					<form:errors path="communicationDto.email" cssClass="error"></form:errors>
				</p>
				<br />

				<p>
					<label>Phone:</label>
					<form:input path="communicationDto.phone" />
					<form:errors path="communicationDto.phone" cssClass="error"></form:errors>
				</p>
			</div>
			<p>
				<input type="submit" value="Register">
			</p>
		</form:form>



	</div>
</body>
</html>