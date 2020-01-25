<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 25.01.2020
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>HOME</title>
    <style>
        html, body{ height:100%; margin:0; }
        /* Trick */
        body{
            display:flex;
            flex-direction:column;
        }
        footer{
            margin-top:auto;
        }
    </style>
</head>
<body>
<%@ include file="header.jsp"%>

<table>
    <tr>
        <th>id</th>
        <th>created</th>
        <th>updatet</th>
        <th>descritpion</th>
        <th>exerciseId</th>
        <th>userId</th>
        <th>uri</th>
    </tr>
    <c:forEach items="${solution}" var="solution">
        <tr>
            <th>${solution.id}</th>
            <th>${solution.created}</th>
            <th>${solution.updated}</th>
            <th>${solution.description}</th>
            <th>${solution.exerciseId}</th>
            <th>${solution.usersId}</th>
            <th><a href="/solutionDetail?id=${solution.id}">url</a></th>
        </tr>
    </c:forEach>

</table>

<%@include file="footer.jsp"%>
</body>
</html>
