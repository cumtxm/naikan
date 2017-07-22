<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8">
	<title>库存管理</title>
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</head>
<body style="background:#E8E8E8;">
<div class="container">
    <div class="col-md-2 column">
		</div>
	<div class="col-md-8 column">
	<form class="form-horizontal" role="form" action="stockupdate" method="post">
	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">商品名</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="firstname" name="name"
				   value="${goods.name}">
		</div>
	</div>
	<div class="form-group">
		<label for="lastname" class="col-sm-2 control-label">库存</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="lastname"  name="stock"
				   value="${goods.stock}">
			<input type="hidden" name="id" value="${goods.id}">
		</div>
	</div>
	<div class="form-group">
		<div class="col-sm-offset-2 col-sm-10">
			<button type="submit" class="btn btn-info">修改</button>
		</div>
		</div>
</form>
	</div>
	<div class="col-md-2 column">   
	</div>
</div>
</body>
</html>