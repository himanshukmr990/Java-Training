<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>

<html>

<head>
    <title>Student Confimation</title>
</head>


<body>


The student is confirmed: ${student.firstName} ${student.lastName}

<br></br>

Country: ${student.country}

<br></br>

Language: ${student.favouriteLanguage}

<br></br>

Operating Systems:

<ul>
    <c:forEach var="temp" items="${student.operatingSystems}">
    
    <li> ${temp} </li>
    
    </c:forEach>
</ul>

<br></br>
</body>

</html>