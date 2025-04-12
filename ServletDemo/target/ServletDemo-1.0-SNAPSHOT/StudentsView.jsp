<%--
  Created by IntelliJ IDEA.
  User: mmoha
  Date: 4/12/2025
  Time: 5:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Student Table </h1>
<table border="1">
    <tr>
        <th>first Name</th>
        <th>last Name</th>
        <th>Email</th>
    </tr>
    <c:forEach var="tempStudent" items= "${students}" >

        <tr>
            <td>${tempStudent.firstName}</td>
            <td>${tempStudent.lastName}</td>
            <td>${tempStudent.email}</td>
        </tr>

    </c:forEach>
</table>
</body>
</html>
