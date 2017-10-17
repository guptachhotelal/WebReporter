<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div class="w3-container w3-red">
    <!--<div class="table" style="width: 300px; height: 100px; position: absolute;top: 0;bottom: 0;left:0; right: 0; margin: auto">-->
    <form:form modelAttribute="loginForm" action="home.htm" method="post">
        <fieldset>
            <div class="row" style="display: table-row">
                <div class="cell" style="display: table-cell">User Name</div>
                <div class="cell" style="display: table-cell"> <form:input path="userName" cssClass="acceptor"/></div>
            </div>
            <div class="row" style="display: table-row">
                <div class="cell" style="display: table-cell">Password</div>
                <div class="cell" style="display: table-cell"> <form:password path="passwd" cssClass="acceptor" /></div>
            </div> 
            <div class="row" style="display: table-row; text-align: center; margin: auto;"><input type="submit" class="clsButton" value="Login" name="btnLogin"></div>
        </fieldset>
    </form:form>
</div>
<!--
<table style="margin: 0px auto;">
    <tr>
        <td>
<form:form modelAttribute="loginForm" action="home.htm" method="post">
    <fieldset style="display: inline;border-radius: 4px; border: outset;">
    <%-- <legend>Login</legend> --%>
    <table>
        <tr>
            <td align="right">User Name</td>
            <td><form:input path="userName" cssClass="acceptor"/></td>
        </tr>
        <tr>
            <td align="right">Password</td>
            <td><form:password path="passwd" cssClass="acceptor" /></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" class="clsButton" value="Login" name="btnLogin"></td>
        </tr>
    </table>
</fieldset>
</form:form>
</td>
</tr>
</table>-->
