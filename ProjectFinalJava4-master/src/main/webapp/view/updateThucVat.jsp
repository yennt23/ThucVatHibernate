<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 5/04/2023
  Time: 12:54 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container mt-3">
  <h2>Stacked form</h2>
  <form action="/ThucVat/update" method="post">
    <input type="hidden" name="id" value="${thucVat.id}">
    <div class="mb-3 mt-3">
      <label for="ten">ten:</label>
      <input type="text" class="form-control" id="ten" name="ten" value="${thucVat.ten}">
    </div>
    <div class="custom-select" style="width:200px;">
      <p>Loai:</p>
      <select name="loai">
        <option value="0" ${thucVat.loai == 0 ? "selected" : ""}>Bac</option>
        <option value="1" ${thucVat.loai == 1 ? "selected" : ""} >Trung</option>
        <option value="2" ${thucVat.loai == 2 ? "selected" : ""}>Nam</option>
      </select>
    </div>
    <p>Gioi tinh:</p>
    <input type="radio" id="gioiTinh1" name="gioiTinh" value="0" ${thucVat.gioiTinh == 0 ? "checked" : ""}>
    <label for="gioiTinh1">Nam</label><br>
    <input type="radio" id="gioiTinh2" name="gioiTinh" value="2" ${thucVat.gioiTinh == 2 ? "checked" : ""}>
    <label for="gioiTinh2">Nu</label><br>

    <div class="mb-3">
      <label for="gia">gia:</label>
      <input type="number" class="form-control" id="gia"  name="gia" value="${thucVat.gia}">
    </div>
    <div class="mb-3">
      <label for="nguonGoc">nguon goc:</label>
      <input type="text" class="form-control" id="nguonGoc"  name="nguonGoc" value="${thucVat.nguonGoc}">
    </div>
    <button type="submit" class="btn btn-primary">add</button>
  </form>
</div>
</body>
</html>
