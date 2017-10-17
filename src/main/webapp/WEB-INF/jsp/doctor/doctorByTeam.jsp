<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="container-fluid"><a class="btn btn-primary active">Add/Update</a> | <a href="doctorList.htm" class="btn btn-primary active">View All</a></div>
<br/>
<c:out value="${teamForm.teamName}"/>
<table>
    <tr>
        <th></th>
        <th>Doctor's Name</th>
    </tr>
    <c:forEach items="${doctorForms}" var="doctorForm">
        <tr>
            <td></td>
            <td><c:out value="${doctorForm.name}"/></td>
        </tr>
    </c:forEach>
</table>