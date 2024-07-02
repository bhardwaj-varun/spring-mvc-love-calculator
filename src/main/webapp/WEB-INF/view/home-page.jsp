<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
    <style>
        h1{
            text-align: center;
        }
        div{
            text-align: center;
        }
        .error{
            position: fixed;
            color: red;
            text-align: left;
            margin-left: 30px;
        }
    </style>
</head>
<body>
<h1>Love Calculator</h1>
<hr>
<form:form action="process-homepage" method="get" modelAttribute="userInfo">
    <div>
        <p>
            <form:label path="userName">User Name: </form:label><form:input  path="userName"/>
            <form:errors path="userName" cssClass="error"/>
        </p>
        <p>
            <form:label path="crushName">Crush Name: </form:label><form:input path="crushName"/>
            <form:errors path="userName" cssClass="error"/>
        </p>
        <p>
            <form:checkbox path="termsAndConditions"/><form:label path="termsAndConditions">Terms and Condition</form:label>
        <form:errors path="termsAndConditions" cssClass="error"/>
        </p>
        <input type="submit" value="calculate"/>
    </div>
</form:form>
</body>
</html>
