<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta charset="UTF-8">  
	<meta name="viewport" content="initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <title>管理员登录</title>  
    <link rel="stylesheet" type="text/css" href="css/easyui.css">  
    <link rel="stylesheet" type="text/css" href="css/mobile.css">  
    <link rel="stylesheet" type="text/css" href="css/icon.css">  
    <script type="text/javascript" src="js/jquery1.min.js"></script>  
    <script type="text/javascript" src="js/jquery.easyui.min.js"></script> 
    <script type="text/javascript" src="js/jquery.easyui.mobile.js"></script> 
</head>
<body>
<div class="easyui-navpanel" style="background:url(images/login.jpg);">
		<header>
            <div class="m-toolbar">
				<span class="m-title">后台登录</span>
			</div>
		</header>
		<div style="margin:20px auto;width:100px;height:100px;border-radius:100px;overflow:hidden">
			<img src="images/login1.jpg" style="margin:0;width:100%;height:100%;">
		</div>
		<form action="adminlogin" method="post">
		<div style="padding:0px 100px">
			<div style="margin-bottom:10px">
				<input class="easyui-textbox" data-options="prompt:'Type username',iconCls:'icon-man'" style="width:100%;height:38px" name="username">
			</div>
			<div>
				<input class="easyui-passwordbox" data-options="prompt:'Type password'" style="width:100%;height:38px" name="password">
			</div>
			<div style="text-align:center;margin-top:30px">
			<button class="btn btn-default" type="submit">
							login
			</button>
			</div>
		</div>
		</form>
	</div>
</body>
</html>