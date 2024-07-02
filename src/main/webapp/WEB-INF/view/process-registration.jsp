<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration successful</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <table class="table table-primary">
        <thead>
        <tr>
            <th scope="col">Key</th>
            <th scope="col">Value</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>Name</td>
            <td>${userReg.name}</td>
        </tr>
        <tr>
            <td>Username</td>
            <td>${userReg.userName}</td>
        </tr>
        <tr>
            <td>Password</td>
            <td>${userReg.password}</td>
        </tr>
        <tr>
            <td>Country</td>
            <td>${userReg.country}</td>
        </tr>
        <tr>
            <td>Hobbies</td>
            <td>
                <c:forEach var="hobbie" items="${userReg.hobbies}">
                    ${hobbie}, 
                </c:forEach>
            </td>
        </tr>
        <tr>
            <td>Gender</td>
            <td>${userReg.gender}</td>
        </tr>
        <tr>
            <td>Email</td>
            <td>${userReg.communicationDto.email}</td>
        </tr>
        <tr>
            <td>Phone</td>
            <td>${userReg.communicationDto.phone}</td>
        </tr>

        </tbody>
    </table>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>
