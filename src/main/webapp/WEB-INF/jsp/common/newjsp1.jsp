<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <%@include file="./include.jsp"%>
    </head>
    <body>
        <div class="w3-row" style="margin-top: 5%; ">
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
        </div>
    </body>
</html>
