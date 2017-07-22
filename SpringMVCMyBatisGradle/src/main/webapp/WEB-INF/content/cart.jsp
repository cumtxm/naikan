<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="now" class="java.util.Date" scope="session"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>奈看</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>

</head>
<body>
<div class="container">
	    <nav class="navbar navbar-default" role="navigation">
    <div class="container-fluid">
    <div class="navbar-header">
     <a class="navbar-brand" href="#"><font face="方正舒体" size=5>奈看</font></a>
    </div>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="index"><span class="glyphicon glyphicon-home"></span> 首页</a></li>
      <li><a href="register"><span class="glyphicon glyphicon-user"></span> 注册</a></li>
      <li><a href="login"><span class="glyphicon glyphicon-log-in"></span> 登录</a></li>
       <li><a href="collect?user_id=${sessionScope.user.id}"> <span class="glyphicon glyphicon-star"></span>收藏夹</a></li>
      <li><a href="cart?user_id=${sessionScope.user.id}"> <span class="glyphicon glyphicon-shopping-cart"></span>购物车</a></li>
    </ul>
  </div>
</nav>
 <ol class="breadcrumb">
	<li class="active"><font face="方正舒体" size=5>${sessionScope.user.id}欢迎${sessionScope.user.username}登录&nbsp&nbsp&nbsp&nbsp
	<a href="update">修改密码 </a>&nbsp&nbsp&nbsp&nbsp
	<a href="order?user_id=${sessionScope.user.id}">我的订单</a>
	&nbsp&nbsp&nbsp&nbsp 当前在线：<% out.println(application.getAttribute("count"));%>
	</font></li>
	</ol>
<p class="text-center"><img src="images/logo.jpg">
<div class="text-center">
<ol class="breadcrumb">
	<li>
		<div class="btn-group">
	<button type="button" class="btn btn-default dropdown-toggle" 
			data-toggle="dropdown">
		所有分类 <span class="caret"></span>
	</button>
	<ul class="dropdown-menu" role="menu">
<li><a href="allgoods">所有商品</a></li>
		<li><a href="sort1">和风轻许，与耐而合</a></li>
		<li><a href="sort2">怦然心动</a></li>
		<li><a href="sort3">情迷莎翁</a></li>
		<li><a href="sort4">雾是沉睡的海</a></li>
	</ul>

</div>
</li>
		<li><a href="index">首页</a></li>
	<li><a href="allgoods">所有商品</a></li>
		<li><a href="sort1">和风轻许，与耐而合</a></li>
		<li><a href="sort2">怦然心动</a></li>
		<li><a href="sort3">情迷莎翁</a></li>
		<li><a href="sort4">雾是沉睡的海</a></li>
	<li class="active">七月上</li>
</ol>
</div>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-2 column">
		</div>
		<div class="col-md-8 column">
        <table class="table table-condensed">
	<thead>
		<tr>
			<th><input type="checkbox" />全选</th>
			<th>图片</th>
			<th>商品</th>
			<th>单价</th>
			<th>数量</th>
			<th>操作</th>
		</tr>
	</thead>
	<tbody>
	   <c:forEach items="${requestScope.cart_list }" var="cart">
		<tr>
			<td><input type="checkbox" /></td>
			<td><img alt="300x200" class="img-responsive" src="images/${cart.image}" /></td>
			<td>${cart.name}</td>
			<td>
			${cart.price}
			<c:set value="${cart.price * cart.quantity+sum}" var="sum"></c:set>
			</td>
			<td><input type="text" id="quantity"  name="quantity" size=3 value="${cart.quantity}"></td>
			<td>加入收藏<br/><a href="removecart?id=${cart.id}">删除</a></td>
		</tr>
			</c:forEach>
	</tbody>
    <tfoot>
        <tr>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td>总计:</td>
			<td><font color="red" size=5>￥${sum}</font></td>
		</tr>
    </tfoot>
</table>
        <div class="text-right">
            <button type="button" class="btn btn-danger"><font size=4><a href="order1?payment=${sum}&time=2017-${sessionScope.now.month+1}-${sessionScope.now.date}&status=待发货&user_id=${sessionScope.user.id}">立即购买</a></font></button>
		</div>
		<div class="col-md-2 column">
		</div>
	</div>
</div>
</div>
<ol class="breadcrumb">
	<li class="active"><font face="方正舒体" size=5>打破所有的枷锁，你就找到了我</font></li>
</ol>
</div>
</body>
</html>