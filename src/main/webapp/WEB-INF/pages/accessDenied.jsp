<%--
  Created by IntelliJ IDEA.
  User: art
  Date: 11.01.2017
  Time: 11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Access is denied</title>
</head>
<body>
<div class = "container">
    <h1>Access is denied</h1>
</div>
<a href="${contextPath}/" >
    <button >
        <spring:message code="user.home.page" />
    </button>
</a>
</body>
</html>
