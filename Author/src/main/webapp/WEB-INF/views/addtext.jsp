<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Author Text</title>
</head>
<body>



<fieldset>
    <legend>Text List</legend>
    <table >
      <tr>
        <th>Title</th>
        <th>Text</th>
      
        <th>Operations</th>
      </tr>
      <c:forEach items="${authortextslist}" var="authortext">
        <tr>
          <td>${authortext.strTitle}</td>
          <td>${authortext.strText}</td>
        
          <td>
        
          <a href="deletetext/${authortext.id}">delete </a>
        
</td>
        </tr>
      </c:forEach>

    </table>
  </fieldset>

<br><br>
<form:form action="addtext" modelAttribute="authortext" method="POST">



Title: <input type="text" id="strTitle" name="strTitle" placeholder="Enter Title">
Text: <textarea rows="1" cols="50" placeholder="Enter Text" id="strText" name="strText"></textarea>
<input type="submit" value="Add Text	"> 


<a href="../"><input type="button" value="Signout"> </a>
</form:form>






</body>
</html>