<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Author Details</title>
</head>
<body style="align-content:center; ">

<form:form action="${author.id}/entertext" modelAttribute="authortext" method="POST">
<fieldset>
<legend>Author Account</legend>
	<table>
	<tr>
	<td>Id</td>
	<td>${author.id} </td>
	</tr>
		<tr>
			<td>First Name</td>
			<td>
			${author.firstName}
			</td>
		</tr>

		<tr>
			<td>Last Name</td>
			<td>${author.lastName}</td>
		</tr>
		<tr>
			<td>Email</td>
			<td>${author.email}</td>
		</tr>
		<tr>
			<td>
			</td>
			<td></td>
		</tr>
	</table>
 <input type="submit" value="ManageText"> <a href="./"><input type="button" value="Signout"> </a>
</fieldset>
</form:form>




	
</body>
</html>