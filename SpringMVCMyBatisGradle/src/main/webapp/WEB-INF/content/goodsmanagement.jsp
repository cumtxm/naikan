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
		<caption>后台商品管理</caption>
		<thead>
			<tr>
				<th>id</th>
				<th></th>
				<th>商品</th>
				<th>图片1</th>
				<th>图片2</th>
				<th>图片3</th>
				<th>价格</th>
				<th>操作<th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${requestScope.goodsmanagement_list }" var="goods">
			<tr>
				<td>${goods.id}</td>
				<td><img alt="300x200" class="img-responsive" src="images/${goods.image}" width="50px" height="50px"/></td>
				<td>${goods.name}</td>
				<td><img alt="300x200" class="img-responsive" src="images/${goods.image1}" width="50px" height="50px"/></td>
				<td><img alt="300x200" class="img-responsive" src="images/${goods.image2}" width="50px" height="50px"/></td>
				<td><img alt="300x200" class="img-responsive" src="images/${goods.image3}" width="50px" height="50px"/></td>
				<td>${goods.price}￥</td>
				<td><a href="removegoods?id=${goods.id}">删除</a>&nbsp&nbsp&nbsp&nbsp<a href="listgoods?id=${goods.id}" class="btn btn-default" role="button">修改</a></td>
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