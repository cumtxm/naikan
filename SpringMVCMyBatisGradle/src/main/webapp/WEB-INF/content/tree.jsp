<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="UTF-8">
	<title>Basic Tree - jQuery EasyUI Demo</title>
	<link rel="stylesheet" type="text/css" href="css/easyui1.css">
	<link rel="stylesheet" type="text/css" href="css/icon1.css">
	<link rel="stylesheet" type="text/css" href="css/demo.css">
	<script type="text/javascript" src="js/jquery1.min.js"></script>
	<script type="text/javascript" src="js/jquery.easyui.min.js"></script>
</head>
<body>
	<h2>商品树形管理</h2>
	<p></p>
	<div style="margin:20px 0;"></div>
	<div class="easyui-panel" style="padding:5px">
		<ul class="easyui-tree">
			<li>
				<span>女装</span>
				<ul>
					<li data-options="state:'open'">
						<span>裙装</span>
						<ul>
							<li data-options="state:'closed'">
								<span>连衣裙</span>
								<ul>
							<li>
								<span>雪纺连衣裙</span>
							</li>
							<li>
								<span>无袖牛仔连衣裙</span>
							</li>
							<li>
								<span>纯色收腰连衣裙</span>
							</li>
						</ul>
							</li>
							<li data-options="state:'closed'">
								<span>半身裙</span>
							<ul>
							<li>
								<span>复古拼色百褶裙</span>
							</li>
							<li>
								<span>高腰雪纺半身裙</span>
							</li>
							<li>
								<span>a字百褶裙</span>
							</li>
							<li>
								<span>包臀半身裙</span>
							</li>
						</ul>
							</li>
						</ul>
					</li>
					<li data-options="state:'closed'">
						<span>T恤</span>
						<ul>
							<li data-options="state:'closed'">
								<span>短袖</span>
								<ul>
							<li>
								<span>休闲绿色上衣</span>
							</li>
						</ul>
							</li>
							<li data-options="state:'closed'">
								<span>吊带</span>
								<ul>
							<li>
								<span>吊带背心</span>
							</li>
							<li>
								<span>无袖背心</span>
							</li>
							<li>
								<span>吊带打底裙</span>
							</li>
						</ul>
							</li>
						</ul>
					</li>
					<li data-options="state:'closed'">
						<span>裤装</span>
						<ul>
							<li data-options="state:'closed'">
								<span>阔腿裤</span>
								<ul>
							<li>
								<span>阔腿九分裤</span>
							</li>
						</ul>
							</li>
							<li data-options="state:'closed'">
								<span>短裤</span>
								<ul>
							<li>
								<span>高腰百搭短裤</span>
							</li>
						</ul>
							</li>
						</ul>
					</li>
					<li data-options="state:'closed'">
						<span>套装</span>
						<ul>
							<li data-options="state:'closed'">
								<span>两件套</span>
								<ul>
							<li>
								<span>火烈鸟两件套</span>
							</li>
						</ul>
							</li>
							<li data-options="state:'closed'">
								<span>时尚套装</span>
								<ul>
							<li>
								<span>修身两件套连衣裙</span>
							</li>
							<li>
								<span>打底衫两件套</span>
							</li>
						</ul>
							</li>
						</ul>
					</li>
					<li data-options="state:'closed'">
						<span>上衣</span>
						<ul>
							<li data-options="state:'closed'">
								<span>衬衣</span>
								<ul>
							<li>
								<span>休闲七分袖衬衣</span>
							</li>
							<li>
								<span>水墨印花衬衫</span>
							</li>
						</ul>
							</li>
							<li data-options="state:'closed'">
								<span>防晒衣</span>
								<ul>
							<li>
								<span>长袖防晒服</span>
							</li>

						</ul>
							</li>
						</ul>
					</li>
				</ul>
			</li>
		</ul>
	</div>

</body>
</html>