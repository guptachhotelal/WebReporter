<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div><a>Add/Update</a> | <a href="activityList.htm">View All</a></div>
<br/>
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
        <tr><td>&nbsp;</td></tr>
        <tr>
            <td align="right"><input type="submit" value="Save" id="btnSave" name="btnSave"/></td>
            <td><input type="button" value="Cancel" onclick="javascript:history.back()"></td>
        </tr>
    </table>
</form:form>