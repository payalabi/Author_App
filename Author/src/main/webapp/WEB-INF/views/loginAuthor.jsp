<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Author</title>
</head>
<body>

	<form:form action="Login" modelAttribute="author" method="POST">
	<fieldset>
	<legend>Login Author</legend>
		<table>
			<tr>
				<td>ID :</td>
				<td><input type="text" placeholder="Enter Id" id="id" name="id"></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><input type="text" placeholder="Enter Email Id" id="email"
					name="email"></td>
			</tr>

		</table>



		<input type="submit" value="Login"> <a href="./"><input type="button" value="Home"> </a>
</fieldset>
	</form:form>
	
</body>
</html>