
<%--
  Created by IntelliJ IDEA.
  User: art
  Date: 27.12.2016
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>new Blog</title>
</head>
<body>

<div class="container">
    <h1>New Blog</h1>

    <c:if test="${not empty message}">
        ${message}
    </c:if>

    <form action="${pageContext.request.contextPath}/saveBlogPost" method="POST">
        <table>
            <tr>
                <td>Title:</td>
                <td><input type="text" name="title"></td>
            </tr>
            <tr>
                <td>Content:</td>
                <td><textarea name="content"></textarea> </td>
            </tr>
            <tr>
                <td>Draft:</td>
                <td><input type="checkbox" name="draft"></td>
            </tr>
            <tr>
                <td colspan="2"><input type="reset" value="Reset"></td>
                <td colspan="2"><input type="submit" value="Save"></td>
            </tr>
        </table>
    </form>

    <a href="${contextPath}/" >
        <button >
            <spring:message code="user.home.page" />
        </button>
    </a>
</div>
</body>
</html>
