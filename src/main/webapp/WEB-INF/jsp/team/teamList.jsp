<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="container-fluid"><a href="teamForm.htm" class="btn btn-primary active">Add/Update</a> | <a class="btn btn-primary disabled">View All</a></div>
<br/>
<table class="table table-responsive table-striped">
    <tr>
        <th></th>
        <th>Team Name</th>
        <th>Remark</th>
        <th></th>
    </tr>
    <c:set var="count" value="1"/>
    <c:forEach var="teamForm" items="${teamList}">
        <tr>
            <td><c:out value="${count}"/></td>
            <td><c:out value="${teamForm.teamName}"/></td>
            <td><c:out value="${teamForm.remark}"/></td>
            <td><a href='teamForm.htm?id=<c:out value="${teamForm.id}" />'>Edit</a></td>
        </tr>
        <c:set var="count" value="${count+1}"/>
    </c:forEach>
</table>