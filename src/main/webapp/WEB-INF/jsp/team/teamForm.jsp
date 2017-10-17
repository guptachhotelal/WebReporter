<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div><a>Add/Update</a> | <a href="teamList.htm">View All</a></div>
<br/>
<form:form modelAttribute="teamForm" action="teamForm.htm">
    <table>
        <tr>
            <td>Team Name<form:hidden path="id"/></td>
            <td><form:input path="teamName"/></td>
        </tr>
        <tr>
            <td>Remarks</td>
            <td><form:textarea path="remark" cols="30" rows="5"/></td>
        </tr>
        <tr>
            <td align="right"><input type="submit" value="Save" id="btnSave" name="btnSave"/> </td>
            <td><input type="button" value="Cancel" onclick="javascript:history.back()"></td>
        </tr>
    </table>
</form:form>