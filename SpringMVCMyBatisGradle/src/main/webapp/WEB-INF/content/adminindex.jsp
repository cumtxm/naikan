<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>后台管理系统</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="assets/css/dpl-min.css" rel="stylesheet" type="text/css" />
<link href="assets/css/bui-min.css" rel="stylesheet" type="text/css" />
<link href="assets/css/main-min.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div class="header">
    
      <div class="dl-title">
          <span class="lp-title-port">奈看</span><span class="dl-title-text">后台管理系统</span>
        </a>
      </div>

    <div class="dl-log">欢迎您，<span class="dl-log-user"></span><a href="###" title="退出系统" class="dl-log-quit">[退出]</a>
    </div>
  </div>
   <div class="content">
    <div class="dl-main-nav">

      <ul id="J_Nav"  class="nav-list ks-clear">
        <li class="nav-item dl-selected"><div class="nav-item-inner nav-home">首页</div></li>
      </ul>
    </div>
    <ul id="J_NavContent" class="dl-tab-conten">
    </ul>
   </div>
  <script type="text/javascript" src="assets/js/jquery-1.8.1.min.js"></script>
  <script type="text/javascript" src="./assets/js/bui.js"></script>
  <script type="text/javascript" src="./assets/js/config.js"></script>

  <script>
    BUI.use('common/main',function(){
      var config = [{
          id:'menu', 
          homePage : 'code',
          menu:[{
              text:'商品管理',
              items:[
                {id:'code',text:'index',href:'adminmain',closeable : false},
                {id:'second-menu',text:'商品上新',href:'goodsinsert'},
                {id:'dyna-menu',text:'商品管理',href:'goodsmanagement'}
              ]
            },{
              text:'订单管理',
              items:[
                {id:'operation',text:'用户评价',href:'mcomment'},
                {id:'quick',text:'订单状态',href:'morder'}  
              ]
            },{
              text:'库存管理',
              items:[
                {id:'resource',text:'库存情况',href:'goodsstock'},
                {id:'loader',text:'商品树形管理',href:'tree'} 
              ]
            }]
          }];
      new PageUtil.MainPage({
        modulesConfig : config
      });
    });
  </script>
</body>
</html>