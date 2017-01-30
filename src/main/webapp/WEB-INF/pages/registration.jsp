<%--
  Created by IntelliJ IDEA.
  User: art
  Date: 29.01.2017
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>registration</title>
</head>
<body>
<%@include file="navbar.jsp" %>
<table border="0" width="90%">
    <form:form modelAttribute="user" method="POST" enctype="utf8">
        <br>

        <tr>
            <td>
                <label>
                    <spring:message code="label.user.username"></spring:message>
                </label>
            </td>
            <td>
                <form:input path="username" value=""/>
            </td>
            <td>
                <form:errors path="username" element="div"/>
            </td>
        </tr>


        <tr>
            <td>
                <label>
                    <spring:message code="label.user.password"></spring:message>
                </label>
            </td>
            <td>
                <form:input path="password" value="" type="password"/>
            </td>
            <td>
                <form:errors path="password" element="div"/>
            </td>
        </tr>


        <tr>
            <td>
                <label>
                    <spring:message code="label.user.confirmPass"></spring:message>
                </label>
            </td>
            <td>
                <form:input path="confirmPassword" value="" type="password"/>
            </td>
            <td>
                <form:errors path="confirmPassword" element="div"/>
            </td>
        </tr>


        <tr>
            <td></td>
            <td>
                <button type="submit">
                    <spring:message code="label.form.submit"></spring:message>
                </button>
            </td>
            <td></td>
        </tr>
    </form:form>
</table>
<br>
<a href="<c:url value="login" />">
    <spring:message code="label.form.loginLink"></spring:message>
</a>

</body>
</html>
