<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bill page</title>
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
    <div>
        <h1>Enter Billing Details</h1>
        <form:form action="process-bill" modelAttribute="billingInfo" method="get">
            <p>
             <form:label path="card">Card Details: </form:label>
               <form:input path="card"/>
            </p>
            <p>
                <form:label path="amount">Amount: </form:label>
                <form:input path="amount"/>
            </p>
            <input type="submit" value="submit" id="submit">
        </form:form>
    </div>
</body>
</html>
