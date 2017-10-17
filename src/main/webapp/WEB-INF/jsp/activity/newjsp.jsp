<form:form modelAttribute="activityForm" action="activityForm.htm" >
    <table>
        <tr>
            <td>Activity Name <form:hidden path="id"/></td>
            <td><form:input path="activityName"/></td>
        </tr>
        <tr>
            <td>Remarks</td>
            <td><form:input path="remark"/></td>
        </tr>
        <tr>
            <td align="right"><input type="submit" value="Save" id="btnSave" name="btnSave"/> </td>
            <td><input type="button" value="Cancel" onclick="javascript:history.back()"></td>
        </tr>
    </table>
</form:form>