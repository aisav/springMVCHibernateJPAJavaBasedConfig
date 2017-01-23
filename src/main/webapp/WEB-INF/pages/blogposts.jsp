<%--
  Created by IntelliJ IDEA.
  User: art
  Date: 23.01.2017
  Time: 22:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>blogposts</title>
</head>
<body>
<c:forEach items="${blogposts}" var="item">
    ${item.id}<pre></pre>
    ${item.title}<pre></pre>
    ${item.content}<br>
</c:forEach>
</body>
</html>
