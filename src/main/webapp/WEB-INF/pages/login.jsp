<html xmlns:th="http://www.thymeleaf.org" xmlns:tiles="http://www.thymeleaf.org">
<head>
    <link rel="stylesheet" type="text/css" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">

    <title tiles:fragment="title">Messages : Create</title>
</head>
<body>
<%--<jsp:include page="navbar.jsp"/>--%>
<%@include file="navbar.jsp" %>

<div tiles:fragment="content">
    <form name="f" th:action="@{/login}" method="post">
        <fieldset>
            <legend>Please Login</legend>
            <div th:if="${not empty param.error}" class="alert alert-error">
                Invalid username and password.
            </div>
            <div th:if="${not empty param.logout}" class="alert alert-success">
                You have been logged out.
            </div>
            <label for="username">Username</label>
            <input type="text" id="username" name="username"/>
            <label for="password">Password</label>
            <input type="password" id="password" name="password"/>
            <div class="form-actions">
                <button type="submit" class="btn">Log in</button>
            </div>
        </fieldset>
    </form>
</div>
<div>
    <a href="<c:url value="/user/registration" />">
        <spring:message code="user.validation.registration" />
    </a>
</div>
</body>
</html>