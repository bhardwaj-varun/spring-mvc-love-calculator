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
    </style>
</head>
<body>
<h1>Love Calculator</h1>
<hr>
<form:form action="process-homepage" method="get" modelAttribute="userInfo">
    <div>
        <p>
            <form:label path="userName">User Name: </form:label><form:input  path="userName"/>
        </p>
        <p>
            <form:label path="crushName">Crush Name: </form:label><form:input path="crushName"/><br/>
        </p>
        <input type="submit" value="calculate"/>
    </div>
</form:form>
</body>
</html>
