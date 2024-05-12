<%--
  Created by IntelliJ IDEA.
  User: Savva
  Date: 11.05.2024
  Time: 17:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<c:if test="${sessionScope.user != null}">
    <h1>Hello ${sessionScope.user.name}!</h1>
    <form action="calculator" method="post">
        <input type="text" name="type" placeholder="Type">
        <input type="number" name="num1" placeholder="number1">
        <input type="number" name="num2" placeholder="number2">
        <input type="hidden" name="idUser" value="${sessionScope.user.id}">
        <button>Submit</button>
    </form>
    <p>${operation}</p>
</c:if>
</body>
</html>
