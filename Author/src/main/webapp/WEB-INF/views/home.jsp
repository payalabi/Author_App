<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Author Management</title>
</head>
<body
	style=" background-image:url('<spring:url value="/img/4.jpg"></spring:url>'); ">

	<img style="margin-left: 70%" width="20%" alt=""
		src="<spring:url value="/img/2.png"></spring:url>">
	
	
		
	
	<div style="margin-left: 70%; margin-top:10%;">
	<p style="text-align:justify; ">
	<font color="white" size="5px" >Author Management</font><br><font color="white"> System has been developed to Manage Author and their text details. 
	Click on the Admin to Manage Author. Click on Login Author to Manage the Text Details.</font>
		</p>
	</div>
	
	<div style="margin-left: 70%; margin-top: 6%">
		<form:form action="./author" method="GET">

			<button type="submit" style="font-size: 40px;">Admin</button>

		</form:form>
		<br> <br>
		<form:form action="./LoginAuthor" method="GET">

			<button type="submit" style="font-size: 40px;">Login Author</button>
		</form:form>



	</div>


</body>
</html>



