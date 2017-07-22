<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head lang="en">
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>登录页面</title>

    <meta name="description" content="Source code generated using layoutit.com">
    <meta name="author" content="LayoutIt!">

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
<script>
  window.onload = function(){
    var oForm = document.getElementById('loginForm');
    var oUser = document.getElementById('username');
    var oPswd = document.getElementById('password');
    var oRemember = document.getElementById('remember');
    //页面初始化时，如果帐号密码cookie存在则填充
    if(getCookie('username') && getCookie('password')){
      oUser.value = getCookie('username');
      oPswd.value = getCookie('password');
      oRemember.checked = true;
    }
    //复选框勾选状态发生改变时，如果未勾选则清除cookie
    oRemember.onchange = function(){
      if(!this.checked){
        delCookie('username');
        delCookie('password');
      }
    };
    //表单提交事件触发时，如果复选框是勾选状态则保存cookie
    oForm.onsubmit = function(){
      if(remember.checked){ 
        setCookie('username',oUser.value,7); //保存帐号到cookie，有效期7天
        setCookie('password',oPswd.value,7); //保存密码到cookie，有效期7天
      }
    };
  };
  //设置cookie
  function setCookie(name,value,day){
    var date = new Date();
    date.setDate(date.getDate() + day);
    document.cookie = name + '=' + value + ';expires='+ date;
  };
  //获取cookie
  function getCookie(name){
    var reg = RegExp(name+'=([^;]+)');
    var arr = document.cookie.match(reg);
    if(arr){
      return arr[1];
    }else{
      return '';
    }
  };
  //删除cookie
  function delCookie(name){
    setCookie(name,null,-1);
  };
</script>
  </head>
 <body background='images\login.jpg'>

    <div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
			<p>
				<br></br>
				<br></br>
				<br></br>
				<br></br>
				<br></br>
			</p>
		</div>
	</div>
	<div class="row">
		<div class="col-md-6">
		</div>
		<div class="col-md-4" >
			<form class="form-horizontal" role="form" bgcolor='E6E6FA' id="loginForm" action="login" method="post">
				<div class="form-group" >
					 
					<label class="col-sm-2 control-label" >
						用户名
					</label>
					<div class="col-sm-10">
						<input class="form-control" type="text" name="username" id="username" >
					</div>
				</div>
				<div class="form-group">
					 
					<label class="col-sm-2 control-label" for="inputPassword3">
						密&nbsp&nbsp&nbsp&nbsp码
					</label>
					<div class="col-sm-10">
						<input class="form-control" type="password" name="password" id="password">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<div class="checkbox">
							 
							<label>
								<input type="checkbox" name="remember" id="remember"> 记住密码
							</label>
							&nbsp&nbsp
							<label>
								<a href="forget">忘记密码？</a>
							</label>
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10" align=right>
						 
						<button class="btn btn-default" type="submit" >
							登录
						</button>
						&nbsp&nbsp
						<button class="btn btn-default" type="submit">
							<a href="register">注册</a>
						</button>
					</div>
				</div>
			</form>
		</div>
		<div class="col-md-2">
		</div>
	</div>
</div>  
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/scripts.js"></script>
    
  </body>
</html>