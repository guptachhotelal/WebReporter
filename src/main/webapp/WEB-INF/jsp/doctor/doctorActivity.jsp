<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div class="w3-padding"><a href="doctorForm.htm" class="w3-btn">Add/Update</a> | <a href="doctorList.htm" class="w3-btn">View All</a> | <a>Doctor's Activities</a></div>

<form:form modelAttribute="doctorActivity" action="doctorActivityForm.htm">
    <table>
        <tr>
            <td>Doctor Name <form:hidden path="daId"/></td>
            <td><form:input path="doctorForm.name" readonly="true"/></td>
        </tr>
        <tr>
            <td>Activities</td>
            <td>
                <table>
                    <tr>
                        <td>
                            <table border="1">
                                    <c:forEach items="${doctorActivity.activityForms}" var="activity">
                                    <tr>
                                        <td> <form:checkbox path="activityForms" value="${activity.aid}" /> <c:out value="${activity.activityName}"/></td>
                                        <td> <form:input path="${activity.startDate}" class="startDate" name="startDate"/></td>
                                        <td> <form:input path="${activity.endDate}" class="endDate" name="endDate"/></td>
                                    </tr>
                                    </c:forEach>
                            </table>
                        </td>
                        <td></td>
                        <td></td>
                    </tr>
                </table>
            </td>
        </tr>
        <tr>
            <td>Remarks</td>
            <td></td>
        </tr>
        <tr><td>&nbsp;</td></tr>
        <tr>
            <td align="right"><input type="submit" value="Save" id="btnSave" name="btnSave"/></td>
            <td><input type="button" value="Cancel" onclick="javascript:history.back()"></td>
        </tr>
    </table>
</form:form>