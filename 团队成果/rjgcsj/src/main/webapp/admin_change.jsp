<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改密码页面</title>
</head>
<body>
<a href="admin_function.jsp">返回</a><br/> 
<form action="<%=request.getContextPath() %>/servlet_xgsjmm" >

旧密码：<input type="password" name="pwd1"><br/>
新密码：<input type="password" name="pwd2"><br/>
确认密码：<input type="password" name="pwd3"><br/>
<input type="submit" value="修改"><br/>
</body>
</html>