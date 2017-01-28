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
    <title>Welcome !!!</title>
</head>
<body>
<%--<jsp:include page="navbar.jsp"/>--%>
<%@include file="navbar.jsp" %>

<div class="container">
    <h1><spring:message code="welcome.text"/></h1>

    <p><a href="<c:url value="/admin/${11}" />">
        <spring:message code="admin.dashboard"/>
    </a></p>


    <p><a href="${pageContext.request.contextPath}/admin.html">
        <spring:message code="admin.dashboard.link.to.view"/>
    </a></p>


    <secuirity:authorize access="hasAnyRole('ADMIN', 'USER')">

        <b>You are logged in as: </b><secuirity:authentication property="principal.username"/>
        with the role of: <secuirity:authentication property="principal.authorities"/>
        <br><p></p>
    </secuirity:authorize>
</div>
</body>
</html>
