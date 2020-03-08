<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit</title>
</head>
<body>
<c:url value="/edit" var="var"/>
<form:form method="POST" action="${var}">
    <table>
        <tr>
            <td><label for="producers">Producer</label></td>
            <td><select name="producers_id" id="producers">
                <c:forEach var="prod" items="${producers}">
                    <option value="${prod.id}">${prod.name}</option>
                </c:forEach>
            </select></td>
        </tr>
        <input type="hidden" name="id" value="${phone.id}">
        <tr>
            <td><label for="phone_name">Name</label></td>
            <td><input type="text"  name="name" id="phone_name" value="${phone.name}"></td>
        </tr>
        <tr>
            <td><label for="screen">Screen</label></td>
            <td><input type="text" name="screen" id="screen" value="${phone.screen}"></td>
        </tr>
        <tr>
            <td><label for="camera">Camera</label></td>
            <td><input type="text" name="camera" id="camera" value="${phone.camera}"></td>
        <tr>
            <td><label for="ram">Ram</label></td>
            <td><input type="text" name="ram" id="ram" value="${phone.ram}"></td>
        </tr>
        <tr>
            <td><label for="memory">Memory</label></td>
            <td><input type="text" name="memory" id="memory" value="${phone.memory}"></td>
        </tr>
        <tr>
            <td><label for="sim">Sim</label></td>
            <td><input type="text" name="sim" id="sim" value="${phone.sim}"></td>
        </tr>
        <tr>
            <td><label for="price">Price</label></td>
            <td><input type="text" name="price" id="price" value="${phone.price}"></td>
        </tr>
    </table>
    <input type="submit" value="Edit phone">
</form:form>
</body>
</html>
