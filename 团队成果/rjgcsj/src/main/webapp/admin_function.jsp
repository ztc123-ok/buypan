<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>选择功能</title>
</head>
<body>
<a href="admin_login.jsp">返回</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%-- <a href="add.jsp">填写商家具体信息</a>--%>
<h1>选择功能</h1>
<a href="<%=request.getContextPath()%>/servlet_spxx">查看商品</a><br>
<a href="<%=request.getContextPath()%>/servlet_jl">查看申请记录</a><br>
<a href="admin_change.jsp">修改密码</a><br>
</body>
</html>