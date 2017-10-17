<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div><a>Add/Update</a> | <a href="doctorList.htm">View All</a></div>
<br/>
<form:form action="doctorForm.htm" modelAttribute="doctorForm">
    <table>
        <tr>
            <td>Doctor's Name<form:hidden path="id"/></td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td>Degree</td>
            <td><form:select path="degree" items="${degrees}" itemValue="value" itemLabel="label">
                </form:select></td>
        </tr>
        <tr>
            <td>Type</td>
            <td><form:select path="type" items="${doctorTypes}" itemValue="value" itemLabel="label">
                </form:select></td>
        </tr>
        <tr>
            <td>Remarks</td>
            <td><form:textarea path="remark" cols="30" rows="5"/></td>
        </tr>
        <tr>
            <td>Executive</td>
            <td><form:select path="teamForm.id" items="${teamsList}" itemValue="id" itemLabel="teamName" >
                </form:select></td>
        </tr>
        <tr>
            <td>Status</td>
            <td><form:checkbox path="status" /></td>
        </tr>
        <tr>
            <td align="right"><input type="submit" value="Save" id="btnSave" name="btnSave"/> </td>
            <td><input type="button" value="Cancel" onclick="javascript:history.back()"></td>
        </tr>
    </table>
</form:form>