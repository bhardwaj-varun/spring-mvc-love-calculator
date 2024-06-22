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
<form action="process-homepage" method="get">
    <div>
        <p>
            <label for="user-name">User Name: </label><input type="text" name="userName" id="user-name"/>
        </p>
        <p>
            <label for="crush-name">Crush Name: </label><input type="text" name="crushName" id="crush-name"/><br/>
        </p>
        <input type="submit" value="calculate"/>
    </div>
</form>
</body>
</html>
