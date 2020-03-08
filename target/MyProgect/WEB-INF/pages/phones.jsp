<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<title>Phones</title>
<body>
<table style="border: 1px solid; width: 100%; text-align:center">
    <thead style="background:#d3dce3">
    <tr>
        <th>id</th>
        <th>producer</th>
        <th>name</th>
        <th>price</th>
        <th>action</th>
    </tr>
    </thead>
    <tbody style="background:#ccc">
   <%-- <c:forEach var="producer" items="${producersList}">--%>
    <c:forEach var="phone" items="${phonesList}">
    <tr>
        <td><a href="<c:url value="/view/${phone.id}"/>">${phone.id}</a></td>
        <td>${phone.producer.name}</td>
        <td>${phone.name}</td>
        <td>${phone.price}</td>
        <td>
            <a href="<c:url value="/edit/${phone.id}"/>">edit</a>
            <a href="<c:url value="/delete/${phone.id}"/>">delete</a>
        </td>
    </tr>
    </c:forEach>
<%--    </c:forEach>--%>
</table>
<h2>Add</h2>
<a href="<c:url value="add"/>">Add new phone</a>
</body>
</html>