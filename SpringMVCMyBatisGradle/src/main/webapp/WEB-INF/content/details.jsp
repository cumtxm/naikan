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
		<div class="col-md-4 column">
				<div id="myCarousel" class="carousel slide" width="300px">
			<!-- 轮播（Carousel）指标 -->
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
				<li data-target="#myCarousel" data-slide-to="2"></li>
			</ol> 
			<!-- 轮播（Carousel）项目 -->
			<div class="carousel-inner" >
				<div class="item active">
					<img class="img-responsive" src="images/${goods.image1}" alt="First slide">
				</div>
				<div class="item">
					<img class="img-responsive" src="images/${goods.image2}" alt="Second slide">
				</div>
				<div class="item">
					<img class="img-responsive" src="images/${goods.image3}" alt="Third slide">
				</div>
			</div>
			<!-- 轮播（Carousel）导航 -->
			<a class="carousel-control left" href="#myCarousel" 
			data-slide="prev">&lsaquo;</a>
			<a class="carousel-control right" href="#myCarousel" 
			data-slide="next">&rsaquo;</a>
		</div> 
		</div>
		<div class="col-md-3 column">
		<form action="cart1?image=${goods.image}&name=${goods.name}&price=${goods.price}&user_id=${sessionScope.user.id}" method="post">
			<h1><font face="方正舒体">${goods.name}</font></h1>
            <br><input type="hidden" name="id" value="${goods.id}"></br>
			<h1><font color="red">¥${goods.price}</font></h1>
			<h3><font color="orange"><span class="glyphicon glyphicon-star"></span><a href="collect1?image=${goods.image}&name=${goods.name}&price=${goods.price}&user_id=${sessionScope.user.id}&goods_id=${goods.id}">收藏商品</a></font></h3>
			<br></br>
			数量：<input type="text" id="quantity" size=3 name="quantity">

			<br></br>
                <p>
                    <a href="order1?payment=${goods.price}&time=2017-${sessionScope.now.month+1}-${sessionScope.now.date}&status=待发货&user_id=${sessionScope.user.id}" class="btn btn-primary" role="button">
                        购买
                    </a>
					&nbsp&nbsp&nbsp&nbsp
					<button class="btn btn-default" type="submit">
                   
                        加入购物车
                    </button>
                </p>
             </form>
		</div>
		<div class="col-md-3 column">
		</div>
	</div>
</div>
<div><br></br></div>
<ol class="breadcrumb col-sm-12 col-md-12">
	<li class="active"><font face="方正舒体" size=5>打破所有的枷锁，你就找到了我</font></li>
</ol>
</div>
</body>
</html>