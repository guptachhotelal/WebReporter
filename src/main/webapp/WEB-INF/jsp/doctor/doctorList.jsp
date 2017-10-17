<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="w3-padding"><a href="doctorForm.htm" class="w3-btn">Add/Update</a> | <a>View All</a> | <a class="w3-btn w3-disabled">Doctor's Activities</a></div>
<div class="w3-accordion w3-padding">
    <c:set var="count" value="1"/>
    <c:forEach var="doctorForm" items="${doctorList}">
        <h4 onclick="myFunction('Demo${count}')" class="w3-light-grey w3-padding-left"><c:out value="${doctorForm.name}"/></h4>
        <div id="Demo${count}" class="w3-accordion-content">
            <table>
                <tr>
                    <td>
                        <table class="w3-table">
                            <tr>
                                <td>Status</td>
                                <td><input type="checkbox" disabled <c:if test="${doctorForm.status eq true}"><c:out value="checked"/></c:if>></td>
                            </tr>
                            <tr>
                                <td>Degree</td>
                                <td><c:out value="${doctorForm.degree}"/></td>
                            </tr>
                            <tr>
                                <td>Type</td>
                                <td><c:out value="${doctorForm.type}"/></td>
                            </tr>
                            <tr>
                                <td>Team</td>
                                <td><a href="doctorByTeam.htm?tid=<c:out value="${doctorForm.teamForm.id}"/>"><c:out value="${doctorForm.teamForm.teamName}"/></a></td>
                            </tr>
                            <tr>
                                <td>Remark</td>
                                <td><c:out value="${doctorForm.remark}"/></td>
                            </tr>
                            <tr>
                                <td colspan="2" style="text-align: center"><a href='doctorForm.htm?id=<c:out value="${doctorForm.id}" />'>Edit</a></td>
                            </tr>
                        </table>
                    </td>
                    <td>
                        <table>
                            <tr><td>Activities</td><td>Visits</td></tr>
                            <tr><td><a href="doctorActivity.htm?dId=${doctorForm.id}">Assign Activity</td><td></td></tr>
                        </table>
                    </td>
                </tr>
            </table>
        </div>
        <c:set var="count" value="${count+1}"/>
    </c:forEach>
</div>
<script>
    function myFunction(id) {
        var x = document.getElementById(id);
        if (x.className.indexOf("w3-show") === -1) {
            x.className += " w3-show";
        } else {
            x.className = x.className.replace(" w3-show", "");
        }
    }
</script>
