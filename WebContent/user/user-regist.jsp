<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/static/css/styles.css"/>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-3.4.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/md5.js"></script>
</head>
<body>
<!-- 验证 -->

<script type="text/javascript">
$(function(){ 
    changeImg();
  });   
  // 定义一个当src发生改变时就到后台去获得一个随机的验证码  
  function changeImg() {     
    // 获得验证码图片元素 使用JavaScript获得     
    var img = document.getElementById("img");     
    // 当src的路径发生改变，都会到后台去请求一次     
    // new Date().getTime() 避免浏览器不去后台请求数据，因为有缓存     
    img.src="${pageContext.request.contextPath}/codeimg?"+new Date().getTime();
  }
</script>
<div id="container">
    	<div id="header">
    		<div id="tool-bar">&nbsp;&nbsp; 欢迎光临智远图书网， [<a href="user-login.jsp">请登录</a>]&nbsp;[<a href="user-regist.jsp">免费注册</a>]&nbsp;&nbsp;&nbsp;<a href="index.jsp">首页</a>&nbsp;|&nbsp;<a href="cart.jsp">购物车</a>&nbsp;|&nbsp;<a href="#">我的订单</a>&nbsp;|&nbsp;<a href="#">帮助</a></div>
    		<h1>智远图书网-<span style="font-size: 48px; font-family: Arial; font-weight: lighter;">Book</span></h1>
    	</div>
    	<div id="main">
    		<div class="box" id="register">
    			<div class="title">新用户注册</div>
<form action="${pageContext.request.contextPath}/saveUser" method="post" style="margin: 10px;">
	<table cellspacing="0" class="no-border">
    	<tr>
    		<td style="text-align: right;">登录账号：</td>
    		<td><input type="text" name="userId" class="txt" value="" /></td>
    	</tr>
    	<tr>
    		<td style="text-align: right;">登录密码：</td>
    		<td><input type="password" name="userPsw" class="txt" value="" /></td>
    	</tr>
    	<tr>
    		<td style="text-align: right;">再次输入密码：</td>
    		<td><input type="password" name="userPsw" class="txt" value="" /></td>
    	</tr>
    	<tr>
    		<td style="text-align: right;">真实姓名：</td>
    		<td><input type="text" name="userName" class="txt" value="" /></td>
    	</tr>
    	<tr>
    		<td style="text-align: right;">验证码：</td>
    		<td><input type="text" name="code" class="txt" id="checks" /></td>
    	</tr>
    	<tr>
    		<td>&nbsp;</td>
    		<td><img id="img" src="${pageContext.request.contextPath}/static/images/code.jpg" />&nbsp;&nbsp;看不清？<a href="#" style="color: #64A26F;" onclick="changeImg()">换张图</a></td>
    	</tr>
    	<tr>
    		<td>&nbsp;</td>
    		<td><input type="submit" value=" 注  册 " class="btn" />&nbsp;&nbsp;</td>
    	</tr>
    </table>
</form>
    		</div>
    	</div>  	
		<div id="footer"><p>版权所有&copy;智远教育</p></div>
	</div>
</body>
</html>