<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 5/04/2023
  Time: 12:06 am
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container mt-3">
  <h2>Stacked form</h2>
  <form action="/ThucVat/add" method="post">
    <div class="mb-3 mt-3">
      <label for="ten">ten:</label>
      <input type="text" class="form-control" id="ten" name="ten">
    </div>
    <div class="custom-select" style="width:200px;">
      <p>Loai:</p>
      <select name="loai">
        <option value="0">Bac</option>
        <option value="1">Trung</option>
        <option value="2">Nam</option>
      </select>
    </div>
    <p>Gioi tinh:</p>
    <input type="radio" id="gioiTinh1" name="gioiTinh" value="0">
    <label for="gioiTinh1">Nam</label><br>
    <input type="radio" id="gioiTinh2" name="gioiTinh" value="2">
    <label for="gioiTinh2">Nu</label><br>

    <div class="mb-3">
      <label for="gia">gia:</label>
      <input type="number" class="form-control" id="gia"  name="gia">
    </div>
    <div class="mb-3">
      <label for="nguonGoc">nguon goc:</label>
      <input type="text" class="form-control" id="nguonGoc"  name="nguonGoc">
    </div>
    <button type="submit" class="btn btn-primary">add</button>
  </form>
</div>

</body>
</html>
