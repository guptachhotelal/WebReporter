<%@ page language="java" contentType="text/html;  charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="./include.jsp"%>
</head>
<body>
	<div class="container" style="width: 25%;">
		<form:form modelAttribute="loginForm" action="home.htm" method="post" class="form-signin">
			<form:label path="userName" class="sr-only">Email</form:label> <form:input type="email" path="userName" class="form-control" placeholder="Email address" />
			<form:label path="passwd" class="sr-only">Password</form:label> <form:input type="password" path="passwd" class="form-control" placeholder="Password" />
			<div class="checkbox"> <label> <input type="checkbox" value="remember-me">Remember me</label> </div>
			<button class="btn btn-lg btn-primary btn-block" type="submit">Log in</button>
		</form:form>
	</div>
	<%-- <div class="w3-row" style="margin-top: 5%; ">
            <div class="w3-col" style="width: 39%;">&nbsp;</div>
            <div class="w3-col" style="width: 22%;">
                <div class="w3-container w3-small">
                    <form:form modelAttribute="loginForm" action="home.htm" method="post" class="w3-container w3-card-2" >
                        <p>
                            <form:input path="userName" class="w3-input" type="text" value="TestUser"/>
                            <label class="w3-label">User Name</label>
                        </p>
                        <p>
                            <form:password path="passwd" class="w3-input" value="textPassword"/>
                            <label class="w3-label" style="float: left">Password</label><label class="w3-label" style="float: right"><a href="#" class="disabledLink">Forgot Password</a></label>
                        </p><p>&nbsp;</p>
                        <p>
                            <input type="submit" class="w3-btn-block" value="Log in">
                        </p>
                    </form:form>
                </div></div>
            <div class="w3-col" style="width: 39%;"></div>
        </div> --%>
	<%@include file="./footer.jsp"%>
</body>
</html>
