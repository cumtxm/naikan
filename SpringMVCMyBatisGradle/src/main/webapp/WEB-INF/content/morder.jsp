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
				<th>订单编号</th>
				<th>用户</th>
				<th>金额</th>
				<th>状态</th>
				<th>下单时间</th>
				<th>更改订单状态</th>
				<th>通知</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${requestScope.order_list}" var="order">
			<tr>
				<td>${order.id}</td>
				<td>${order.user_id}</td>
				<td>${order.payment}</td>
				<td>${order.status}</td>
				<td>${order.time}</td>
				<td><a href="updateorder?id=${order.id}" class="btn btn-success" role="button">发货</a>
				<a href="updateorder1?id=${order.id}" class="btn btn-danger" role="button">已完成</a></td>
				<td><a href="listuser?id=${order.user_id}" class="btn btn-primary" role="button">通知</a></td>
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