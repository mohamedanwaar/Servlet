<%--
  Created by IntelliJ IDEA.
  User: mmoha
  Date: 4/12/2025
  Time: 3:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
 Rashed
<c:forEach var="tempusers" items="${StudentsList}" >
    ${tempusers}<br>
</c:forEach>

</body>
</html>
