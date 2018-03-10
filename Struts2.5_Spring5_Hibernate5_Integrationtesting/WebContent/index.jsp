<%@ page language="java" pageEncoding="utf8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>SSH项目整合</title>
</head>
<body>
	<br><hr><br>
	<h2>用户登陆</h2>
	<form method="post" action="login">
		登录名:<input type="text" name="pname" />
		密码:<input type="password" name="password" />
		<button style="color:lightgreen">登陆</button>
	</form>
	<br><hr><br>
	<h2>用户注册</h2>
	<form method="post" action="register">
		登录名:<input type="text" name="pname" />
		密码:<input type="password" name="password" />
		<button style="color:red">注册</button>
	</form>
	<br><hr color="darkred">
</body>
</html>