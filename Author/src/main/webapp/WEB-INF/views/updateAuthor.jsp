<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update Author</title>
</head>
<body>

<form:form action="editAuthor" modelAttribute="author" method="POST">

	<table>
	<tr>
	<td>Id</td>
	<td>${author.id} </td>
	</tr>
		<tr>
			<td>First Name</td>
			<td>
			<input type="text" value="${author.firstName}" id="firstName" name="firstName">
			</td>
		</tr>

		<tr>
			<td>Last Name</td>
			<td><input type="text" value="${author.lastName}" id="lastName" name="lastName"></td>
		</tr>
		<tr>
			<td>Email</td>
			<td><input type="text" value="${author.email}" id="email" name="email"></td>
		</tr>
		<tr>
			<td>
			</td>
			<td></td>
		</tr>
	</table>
	
	<input type="submit">
	 
</form:form>	
</body>
</html>