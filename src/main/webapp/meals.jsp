<%--
  Created by IntelliJ IDEA.
  User: nikomart
  Date: 18.07.17
  Time: 17:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Meals</title>
    <style type="text/css">
        tr.green td {
            background-color: green;
            color: black;
        }

        tr.red td {
            background-color: red;
            color: black;
        }
    </style>
</head>
<body>

<table style="border: 2px solid;  text-align:center">
    <thead style="">
    <tr>
        <th>Дата/Время</th>
        <th>Описание</th>
        <th>Калории</th>
    </tr>
    </thead>
    <tbody>
    <jsp:useBean id="mealsList" scope="request" type="java.util.List"/>
    <c:forEach items="${mealsList}" var="meal">
        <c:choose>
            <c:when test="${meal.exceed}">
                <tr class="red">
            </c:when>
            <c:otherwise>
                <tr class="green">
            </c:otherwise>
        </c:choose>
        <td><c:out value="${fn:replace(meal.dateTime, 'T', ' ')}"/></td>
        <td><c:out value="${meal.description}"/></td>
        <td><c:out value="${meal.calories}"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
