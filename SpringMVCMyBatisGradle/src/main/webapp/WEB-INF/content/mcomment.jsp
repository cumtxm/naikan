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
		<caption>用户评价管理</caption>
		<thead>
			<tr>
				<th>订单</th>
				<th>评论</th>
				<th>物流</th>
				<th>质量</th>
				<th>服务</th>
				<th>图片<th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${requestScope.comment_list}" var="comment">
			<tr>
				<td>${comment.order_id}</td>
				<td>${comment.comment}</td>
				<td>${comment.logistics}分</td>
				<td>${comment.quality}分</td>
				<td>${comment.service}分</td>
				<td>${comment.picture}</td>
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