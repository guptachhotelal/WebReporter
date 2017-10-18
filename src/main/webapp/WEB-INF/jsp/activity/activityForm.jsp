<%@ page language="java" contentType="text/html;  charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="../common/include.jsp"%>
    </head>
    <body>
        <form:form modelAttribute="activityForm" action="activityForm.htm">
            <table>
                <tr>
                    <td>Activity Name <form:hidden path="aid"/></td>
                    <td><form:input path="activityName"/></td>
                </tr>
                <tr>
                    <td>Remarks</td>
                    <td><form:textarea path="remark" cols="30" rows="5"/></td>
                </tr>
                <tr><td colspan="2">&nbsp;</td></tr>
                <tr>
                    <td align="right"><input type="submit" value="Save" id="btnSave" name="btnSave"/></td>
                    <td><input type="button" value="Cancel" onclick="javascript:history.back()"></td>
                </tr>
            </table>
        </form:form>
    </body>
</html>
