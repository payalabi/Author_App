<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Author</title>
</head>
<body>


<form:form action="authorpage" method="get">

 <fieldset>
    <legend>Authors List</legend>
    <table >
      <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Email</th>
        <th>Operations</th>
      </tr>
      <c:forEach items="${authors}" var="author">
        <tr>
          <td>${author.firstName}</td>
          <td>${author.lastName}</td>
         <td>${author.email}</td>
          <td>
          <a href="${author.id}/delete">delete </a>
         <a href="${author.id}/openAuthor" > update</a>
</td>
        </tr>
      </c:forEach>

    </table>
  </fieldset>

<div style="margin-top:20px; ">
<input type="submit" value="Add Author">
<a href="./"><input type="button" value="Home"> </a>
</div>
</form:form>

</body>
</html>