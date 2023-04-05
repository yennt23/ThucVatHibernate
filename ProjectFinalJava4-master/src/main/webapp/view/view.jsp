<%--
  Created by IntelliJ IDEA.
  User: nguyenvv
  Date: 03/04/2023
  Time: 12:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<header>
    <div class="container">
        <h2>Button Styles</h2>
        <button type="button" class="btn"> <a href="/ThucVat/view_add">add</a></button>
    </div>
</header>
<table class="table">
    <thead>
    <tr>
        <th>Id</th>
        <th>ten</th>
        <th>loai</th>
        <th>gioi tinh</th>
        <th>gia</th>
        <th>nguon goc</th>
        <th>Action</th>
    </tr>
    </thead>
    <tbody>

        <c:forEach items="${listThucVat}" var="l">
            <tr>
            <td>${l.id}</td>
            <td>${l.ten}</td>
                <c:if test="${l.loai == 1}">
                    <td>Trung</td>
                </c:if>
                <c:if test="${l.loai == 0}">
                    <td>Bac</td>
                </c:if>
                <c:if test="${l.loai == 2}">
                    <td>Nam</td>
                </c:if>
            <td>${l.gioiTinh == 0 ? "Nu" : "Nam"}</td>
            <td>${l.gia}</td>
            <td>${l.nguonGoc}</td>
            <td>
                <button type="button" class="btn btn-default" ><a href="/ThucVat/view_update?id=${l.id}">update</a></button>
                <button type="button" class="btn btn-default" ><a href="/ThucVat/delete?id=${l.id}">delete</a></button>
            </td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
