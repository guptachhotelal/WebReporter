<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div><a href="activityForm.htm"  >Add/Update</a> | <a >View All</a></div>
<br/>
<table>
    <tr>
        <th></th>
        <th>Name</th>
        <th>Remark</th>
        <th></th>
    </tr>
    <c:set var="count" value="1"/>
    <c:forEach var="activityForm" items="${activityList}">
        <tr>
            <td><c:out value="${count}"/></td>
            <td><c:out value="${activityForm.activityName}"/></td>
            <td><c:out value="${activityForm.remark}"/></td>
            <td><a href='activityForm.htm?id=<c:out value="${activityForm.aid}" />'>Edit</a></td>
        </tr>
        <c:set var="count" value="${count+1}"/>
    </c:forEach>
</table>