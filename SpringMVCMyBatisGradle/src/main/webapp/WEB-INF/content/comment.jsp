<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>奈看</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<meta name="description" content="" />
<meta name="keywords" content="" />
<meta name="owner" content="" />
<meta name="robots" content="index, follow" />
<meta name="googlebot" content="index, follow" />
<style type="text/css">
<!--
body {background:#fff;text-align:center;margin:0 auto;padding: 0;font:12px Arial;color:#000;line-height:1.2em}
div,form,img,ul,ol,li,dl,dt,dd {margin: 0; padding: 0; border: 0;}
h1,h2,h3,h4,h5,h6 { margin:0; padding:0;}
table,td,tr,th{font-size:12px;}


/* 星级评分 */
.shop-rating {
    height: 25px;
    overflow: hidden;
    zoom: 1;
    padding: 2px 0px;
    position: relative;
    z-index: 999;
}

.shop-rating span {
    height: 23px;
    display: block;
    line-height: 23px;
    float: left;
}

.shop-rating span.title {
    width: 125px;
    text-align: right;
    margin-right: 5px;
}

.shop-rating ul {
    float: left;
	margin:0;padding:0
}

.shop-rating .result {
    margin-left: 20px;
    padding-top: 2px;
}

.shop-rating .result span {
	color: #ff6d02;
}
.shop-rating .result em {
    color: #f60;
    font-family: arial;
    font-weight: bold;
}
.shop-rating .result strong {
	color: #666666;
	font-weight: normal;
}
.rating-level,
.rating-level a {
    background: url(http://a.tbcdn.cn/app/rc/img/star_v2.png) no-repeat scroll 1000px 1000px;
}
.rating-level {
    background-position: 0px 0px;
    width: 120px;
    height: 23px;
    position: relative;
    z-index: 1000;
}
.rating-level li {
    display: inline;
}

.rating-level a {
    line-height: 23px;
    height: 23px;
    position: absolute;
    top: 0px;
    left: 0px;
    text-indent: -999em;
    *zoom: 1;
    outline: none;
}


.rating-level a.one-star {
    width: 20%;
    z-index: 6;
}

.rating-level a.two-stars {
width: 40%;
z-index: 5;
}

.rating-level a.three-stars {
    width: 60%;
    z-index: 4;
}

.rating-level a.four-stars {
    width: 80%;
    z-index: 3;
}

.rating-level a.five-stars {
    width: 100%;
    z-index: 2;
}

.rating-level .current-rating,.rating-level a:hover{background-position:0 -28px;}
.rating-level a.one-star:hover,.rating-level a.two-stars:hover,.rating-level a.one-star.current-rating,.rating-level a.two-stars.current-rating{background-position:0 -116px;}
.rating-level .three-stars .current-rating,.rating-level .four-stars .current-rating,.rating-level .five-stars .current-rating{background-position:0 -28px;}

-->
</style>
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
	<div class="row clearfix">
		<div class="col-md-3 column">
		</div>
		<div class="col-md-6 column">
		<form role="form" action="comment" method="post">
        <div class="form-group">
            <div class="shop-rating">
	<span class="title">物流服务：</span>
	<ul class="rating-level" id="stars1">
		<li><a class="one-star" star:value="1" href="#">1</a></li>
		<li><a class="two-stars" star:value="2" href="#">2</a></li>
		<li><a class="three-stars" star:value="3" href="#">3</a></li>
		<li><a class="four-stars" star:value="4" href="#">4</a></li>
		<li><a class="five-stars" star:value="5" href="#">5</a></li>
	</ul>
	<span class="result" id="stars1-tips"></span>
	<input type="hidden" id="stars1-input" name="logistics" value="" size="2" />
</div>

<!--
	# 星级评分
	# star:value = 分数
-->
<div class="shop-rating">
	<span class="title">商品质量：</span>
	<ul class="rating-level" id="stars2">
		<li><a class="one-star" star:value="1" href="#">1</a></li>
		<li><a class="two-stars" star:value="2" href="#">2</a></li>
		<li><a class="three-stars" star:value="3" href="#">3</a></li>
		<li><a class="four-stars" star:value="4" href="#">4</a></li>
		<li><a class="five-stars" star:value="5" href="#">5</a></li>
	</ul>
	<span class="result" id="stars2-tips"></span>
	<input type="hidden" id="stars2-input" name="quality" value="" size="2" />
</div>
<div class="shop-rating">
	<span class="title">服务：</span>
	<ul class="rating-level" id="stars3">
		<li><a class="one-star" star:value="1" href="#">1</a></li>
		<li><a class="two-stars" star:value="2" href="#">2</a></li>
		<li><a class="three-stars" star:value="3" href="#">3</a></li>
		<li><a class="four-stars" star:value="4" href="#">4</a></li>
		<li><a class="five-stars" star:value="5" href="#">5</a></li>
	</ul>
	<span class="result" id="stars3-tips"></span>
	<input type="hidden" id="stars3-input" name="service" value="" size="2" />
</div>
<!-- END 星级评分 -->




<script type="text/javascript">
var Class = {
	create: function() {
		return function() { this.initialize.apply(this, arguments); }
	}
}
var Extend = function(destination, source) {
	for (var property in source) {
		destination[property] = source[property];
	}
}
function stopDefault( e ) {
	 if ( e && e.preventDefault ){
		e.preventDefault();
	}else{
		window.event.returnValue = false;
	}
	return false;
} 
/**
 * 星星打分组件
 *
 * @author	Yunsd
 * @date		2010-7-5
 */
var Stars = Class.create();
Stars.prototype = {
	initialize: function(star,options) {
		this.SetOptions(options); //默认属性
		var flag = 999; //定义全局指针
		var isIE = (document.all) ? true : false; //IE?
		var starlist = document.getElementById(star).getElementsByTagName('a'); //星星列表
		var input = document.getElementById(this.options.Input) || document.getElementById(star+"-input"); // 输出结果
		var tips = document.getElementById(this.options.Tips) || document.getElementById(star+"-tips"); // 打印提示
		var nowClass = " " + this.options.nowClass; // 定义选中星星样式名
		var tipsTxt = this.options.tipsTxt; // 定义提示文案
		var len = starlist.length; //星星数量
		

		for(i=0;i<len;i++){ // 绑定事件 点击 鼠标滑过
			starlist[i].value = i;
			starlist[i].onclick = function(e){
				stopDefault(e);
				this.className = this.className + nowClass;
				flag = this.value;
				input.value = this.getAttribute("star:value");
				tips.innerHTML = tipsTxt[this.value]
			}
			starlist[i].onmouseover = function(){
				if (flag< 999){
					var reg = RegExp(nowClass,"g");
					starlist[flag].className = starlist[flag].className.replace(reg,"")
				}
			}
			starlist[i].onmouseout = function(){
				if (flag< 999){
					starlist[flag].className = starlist[flag].className + nowClass;
				}
			}
		};
		if (isIE){ //FIX IE下样式错误
			var li = document.getElementById(star).getElementsByTagName('li');
			for (var i = 0, len = li.length; i < len; i++) {
				var c = li[i];
				if (c) {
					c.className = c.getElementsByTagName('a')[0].className;
				}
			}
		}
	},
	//设置默认属性
	SetOptions: function(options) {
		this.options = {//默认值
			Input:			"",//设置触保存分数的INPUT
			Tips:			"",//设置提示文案容器
			nowClass:	"current-rating",//选中的样式名
			tipsTxt:		["1分-严重不合格","2分-不合格","3分-合格","4分-优秀","5分-完美"]//提示文案
		};
		Extend(this.options, options || {});
	}
}

var Stars1 = new Stars("stars1")
var Stars2 = new Stars("stars2")
var Stars3 = new Stars("stars3")
</script>
        </div>
		<div class="form-group">
		<input type="hidden" value="${order.id}" name="order_id" id="order_id">
		<label for="inputfile"><font size=5>上传图片</font></label>
		<br></br>
		<input type="file" id="inputfile" name="picture">
		</div>
		<br></br>
	    <div class="form-group">
		<label for="name"><font size=5>订单评论</font></label>
		<br></br>
		<textarea class="form-control" rows="3" name="comment"></textarea>
	    </div>


	    <button type="submit" class="btn btn-default">提交</button>
     </form>
		</div>
		<div class="col-md-3 column">
		</div>
	</div>
</div>
</body>
</html>