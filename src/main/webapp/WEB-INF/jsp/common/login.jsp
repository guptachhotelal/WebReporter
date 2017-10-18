<%@ page language="java" contentType="text/html;  charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="./include.jsp"%>
    </head>
    <body>
        <div class="container" style="width: 25%; margin: auto;">
            <div class="center-block">
                <form:form modelAttribute="loginForm" action="home.htm" method="post" class="form-signin">
                    <form:label path="userName" class="sr-only">Email</form:label> <form:input type="email" path="userName" class="form-control" placeholder="Email address" />
                    <form:label path="passwd" class="sr-only">Password</form:label> <form:input type="password" path="passwd" class="form-control" placeholder="Password" />
                        <div class="checkbox"> <label> <input type="checkbox" value="remember-me">Remember me</label> </div>
                        <button class="btn btn-lg btn-primary btn-block" type="submit">Log in</button>
                </form:form>
            </div>
        </div>
        <%@include file="./footer.jsp"%>
    </body>
</html>
