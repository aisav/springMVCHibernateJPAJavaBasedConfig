
<%--
  Created by IntelliJ IDEA.
  User: art
  Date: 20.12.2016
  Time: 14:16
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
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
<%--<jsp:include page="../navbar.jsp"/>--%>
<%@include file="../navbar.jsp" %>

<h1>Admin</h1>

<table border="1" cellpadding="5">
<caption><h3>List of users</h3></caption>
    <tr>
        <th>        <spring:message code="user.id.table" /></th>
        <th>        <spring:message code="user.username.table" /></th>
    </tr>
    <c:forEach items="${users}" var="currentUser" varStatus="status">
        <tr>
            <td>${currentUser.id}</td>
            <td>${currentUser.username}</td>
        </tr>
    </c:forEach>
</table>

<%--<a href="${pageContext.request.contextPath}/newblogpost.html">new</a>--%>
<br>
<a href="${contextPath}/" >
    <button >
        <spring:message code="user.home.page" />
    </button>
</a>
</body>
</html>
