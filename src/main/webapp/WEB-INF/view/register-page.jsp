<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>

<h1 class="text-center">Register Here</h1>
<hr />

<div class="container">
    <form:form action="process-registration" method="get" modelAttribute="userReg">
    <div class="row">
        <div class="col">
        </div>
        <div class="col-6">
            <form>
                <div class="input-group mb-3">
                    <span class="input-group-text " id="name">Name</span>
                    <form:input type="text" class="form-control"
                           aria-describedby="name" path="name"/>
                </div>
                <div class="input-group mb-3">
                    <span class="input-group-text" id="userName">Username</span>
                    <form:input type="text" class="form-control"
                           aria-describedby="userName" path="userName"/>
                </div>
                <div class="input-group mb-3">
                    <span class="input-group-text" id="password">Password</span>
                    <form:input type="password" class="form-control"
                           aria-describedby="password" path="password"/>
                </div>
                <div class="input-group mb-3">
                    <span class="input-group-text" id="country">Country</span>
                    <form:select class="form-select"
                            aria-describedby="country" path="country">
                        <form:option value="IND">India</form:option>
                        <form:option value="USA">USA</form:option>
                        <form:option value="SL">Sri Lanka</form:option>
                        <form:option value="PAK">Pakistan</form:option>
                    </form:select>
                </div>
                <div class="input-group mb-3">
                    <span class="input-group-text" id="Hobbies">Hobbies</span>
                    <div class="form-check ms-2 mt-2 form-check-inline">
                        <label class="form-check-label">
                            Cricket
                        </label>
                        <form:checkbox class="form-check-input" value="Cricket"  path="hobbies"/>

                    </div>
                    <div class="form-check ms-2 mt-2 form-check-inline">
                        <label class="form-check-label">
                            Programming
                        </label>
                        <form:checkbox class="form-check-input" value="Programming" path="hobbies" />
                    </div>
                    <div class="form-check ms-2 mt-2 form-check-inline">
                        <label class="form-check-label">
                            Food
                        </label>
                        <form:checkbox class="form-check-input"  value="Food" path="hobbies"/>

                    </div>
                    <div class="form-check ms-2 mt-2 form-check-inline">
                        <label class="form-check-label">
                            Travel
                        </label>
                        <form:checkbox class="form-check-input"   value="Travel" path="hobbies"/>
                    </div>
                </div>

                <div class="input-group mb-3">
                    <span class="input-group-text">Gender</span>
                    <div class="form-check mt-2 ms-2 form-check-inline">
                        <form:radiobutton class="form-check-input"  path="gender" value="Male"/>
                        <label class="form-check-label">
                            Male
                        </label>
                    </div>
                    <div class="form-check form-check-inline mt-2 ms-2">
                        <form:radiobutton class="form-check-input"  path="gender" value="Female"/>
                        <label class="form-check-label">
                            Female
                        </label>
                    </div>
                </div>
                <div class="float-end"><input type="submit" class=" btn btn-primary" /></div>
            </form>
        </div>
        <div class="col"></div>
    </div>
    </form:form>
</div>

        <%--Username: <form:input path="userName"/>
        <br/>
        Password: <form:password path="password"/>
        <br/>
        Country: <form:select path="country">
                 <form:option value="IND" label="India"/>
                 <form:option value="USA" label="United States"/>
                 <form:option value="SL" label="Sri Lanka"/>
                 <form:option value="PAK" label="Pakistan"/>
                 </form:select>
        <br/>
        Hobbies:
        Cricket: <form:checkbox path="hobbies" value="Cricket"/>
        Travel: <form:checkbox path="hobbies" value="Travel"/>
        Food: <form:checkbox path="hobbies" value="Food"/>
        Programming: <form:checkbox path="hobbies" value="Programming"/>
        <br/>
        Gender:
        Male:<form:radiobutton path="gender" value="Male"/>
        Female: <form:radiobutton path="gender" value="Female"/>
        </form:form>--%>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>
