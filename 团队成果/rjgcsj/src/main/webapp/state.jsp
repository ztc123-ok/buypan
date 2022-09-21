<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改商品状态</title>
</head>
<body>
<a href="admin_function.jsp">返回</a>
<h1>修改商品状态</h1>
<form action="<%=request.getContextPath() %>/servlet_xgzt" >
商品id：<input type="text" name="waresid"><br/>
修改为：<input type="text" name="waresstate"><br/>
<input type="submit" value="修改">
</form>
</body>
</html>