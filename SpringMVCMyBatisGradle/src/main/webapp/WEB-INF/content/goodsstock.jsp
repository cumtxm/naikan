<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
	<title>商品管理</title>
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</head>
<body style="background:#E8E8E8;">
<div class="container">
    <div class="col-md-2 column">
		</div>
	<div class="col-md-8 column">

    <div class="table-responsive">   
	<table class="table">
		<caption>库存管理</caption>
		<thead>
			<tr>
				<th></th>
				<th>商品</th>
				<th>库存</th>
				<th>销量</th>
				<th>修改</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${requestScope.goodsstock}" var="stock">
			<tr>
				<td>${stock.id}</td>
				<td>${stock.name}</td>
				<td>${stock.stock}</td>
				<td>${stock.sell}</td>
				<td><a href="liststock?id=${stock.id}" class="btn btn-default" role="button">修改</a></td>
			</tr>
		</c:forEach>
		</tbody>
</table>
</div>
</div>
	<div class="col-md-2 column">   
	</div>
</div>
</body>
</html>