<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Send Email</title>
</head>
<body>
<h1>Hi ${userName} </h1>
<p>Send email to your email id</p>
<p>

    <form:form action="/spring_mvc_love_calculator/process-email" method="get" modelAttribute="emailInfo">
        <label>Your Email ID:</label>
        <form:input path="email"/>
        <input type="submit" value="send">
    </form:form>
</p>
</body>
</html>
