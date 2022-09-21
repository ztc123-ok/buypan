<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
</head>
<body>
<a href="admin_login.jsp">返回</a>
<h1>注册</h1>
<form action="<%=request.getContextPath() %>/servlet_sjzc" >
用户名：<input type="text" name="sellerid"><br/>
密码：<input type="password" name="sellerpw"><br/>
商家姓名：<input type="text" name="sellername"><br/>
商家电话：<input type="text" name="sellerphone"><br/>
<input type="submit" value="注册">
</form>
</body>
</html>