<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div><a href="doctorForm.htm" >Add/Update</a> | <a>View All</a></div>
<br/>
<table class="w3-table">
    <thead>
    <tr>
        <th></th>
        <th>Status</th>
        <th>Name</th>
        <th>Degree</th>
        <th>Type</th>
        <th>Team</th>
        <th>Remark</th>
        <th></th>
    </tr>
    </thead>
    <c:set var="count" value="1"/>
    <tbody>
    <c:forEach var="doctorForm" items="${doctorList}">
        <tr>
            <td><c:out value="${count}"/></td>
            <td style="text-align: center;"><input type="checkbox" disabled <c:if test="${doctorForm.status eq true}"><c:out value="checked"/></c:if>></td>
            <td><label id="<c:out value='${doctorForm.id}' />"><c:out value="${doctorForm.name}"/></label></td>
            <td><c:out value="${doctorForm.degree}"/></td>
            <td><c:out value="${doctorForm.type}"/></td>
            <td><a href="doctorByTeam.htm?tid=<c:out value="${doctorForm.teamForm.id}"/>"><c:out value="${doctorForm.teamForm.teamName}"/></a></td>
            <td><c:out value="${doctorForm.remark}"/></td>
            <td><a href='doctorForm.htm?id=<c:out value="${doctorForm.id}" />'>Edit</a></td>
        </tr>
        <c:set var="count" value="${count+1}"/>
    </c:forEach>
    </tbody>
</table>
    
<div id="activityDialog" style="display: none;" title="Activities">Hello</div>