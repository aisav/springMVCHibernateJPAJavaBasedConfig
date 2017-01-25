<%--
  Created by IntelliJ IDEA.
  User: art
  Date: 23.01.2017
  Time: 22:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>blogposts</title>
</head>
<body>
<table border="1" cellpadding="5">
    <caption><h3>List of Blogposts</h3></caption>
    <tr>
        <th>        <spring:message code="user.blogpost.id.table" /></th>
        <th>        <spring:message code="user.blogpost.title.table" /></th>
        <th>        <spring:message code="user.blogpost.content.table" /></th>
        <th>        <spring:message code="user.blogpost.publishDate.table" /></th>
    </tr>
    <c:forEach items="${blogposts}" var="currentBlog" varStatus="status">
        <tr>
            <td>${currentBlog.id}</td>
            <td>${currentBlog.title}</td>
            <td>${currentBlog.content}</td>
            <td>${currentBlog.publishDate}</td>
        </tr>
    </c:forEach>
</table>
<br>
<a href="${contextPath}/" >
    <button >
        <spring:message code="user.home.page" />
    </button>
</a>

</body>
</html>
