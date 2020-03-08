<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add</title>
</head>
<body>
<c:url value="/add" var="var"/>
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
        <tr>
            <td><label for="name">Name</label></td>
            <td><input type="text" name="name" id="name"></td>
        </tr>
        <tr>
            <td><label for="screen">Screen</label></td>
            <td><input type="text" name="screen" id="screen"></td>
        </tr>
        <tr>
            <td><label for="camera">Camera</label></td>
            <td><input type="text" name="camera" id="camera"></td>
        <tr>
            <td><label for="ram">Ram</label></td>
            <td><input type="text" name="ram" id="ram"></td>
        </tr>
        <tr>
            <td><label for="memory">Memory</label></td>
            <td><input type="text" name="memory" id="memory"></td>
        </tr>
        <tr>
            <td><label for="sim">Sim</label></td>
            <td><input type="text" name="sim" id="sim"></td>
        </tr>
        <tr>
            <td><label for="price">Price</label></td>
            <td><input type="text" name="price" id="price"></td>
        </tr>
    </table>
    <input type="submit" value="Add new phone">
</form:form>
</body>
</html>
