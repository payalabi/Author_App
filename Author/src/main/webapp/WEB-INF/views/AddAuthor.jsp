<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Author</title>
</head>
<body>
<form:form action="addAuthor" modelAttribute="author" method="POST">


First Name: <input type="text" id="firstName" name="firstName" >
Last Name: <input type="text" id="lastName" name="lastName">
Email:<input type="text" id="email" name="email">
<input type="submit"> 
</form:form>
</body>
</html>