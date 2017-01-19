
<%--
  Created by IntelliJ IDEA.
  User: art
  Date: 20.12.2016
  Time: 14:16
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="secuirity" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
    <link rel="stylesheet" type="text/css" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">


    <title>Welcome !!!</title>
</head>
<body>
<h1><spring:message code = "welcome.text"/></h1>
<secuirity:authorize access="hasAnyRole('ADMIN', 'USER')">
    <p><a href="${pageContext.request.contextPath}/admin.html">
        <spring:message code="admin.dashboard" />
    </a></p>
    <b>You are logged in as: </b><secuirity:authentication property="principal.username" />
    with the role of: <secuirity:authentication property="principal.authorities" />
    <br>
    <p><a href="<c:url value="/logout" /> ">Logout</a></p>
</secuirity:authorize>
<a href="${pageContext.request.contextPath}/newblogpost.html">
    <spring:message code="user.create.blogpost" />
</a>
</body>
</html>
