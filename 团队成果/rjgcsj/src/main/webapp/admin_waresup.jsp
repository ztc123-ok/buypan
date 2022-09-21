<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>发布商品</title>
</head>
<body>
<h1>发布商品</h1>
<a href="yifabu.jsp">返回</a><br/>
<form action="<%=request.getContextPath() %>/servlet_tjsp">
	商品id：<input type="text" name="waresid"><br/>
	商品名称：<input type="text" name="waresname"><br/>
	商品价格：<input type="text" name="waresprice"><br/>
	商品库存：<input type="text" name="waresnumber"><br/>
	店铺id：<input type="text" name="shopid"><br/>
	商品状态：<input type="text" name="waresstate"><br/>
	商品图片：<input type="text" name="warespicture"><br/>
	商品类别：<input type="text" name="waresclass"><br/>
	营销信息：<input type="text" name="matketing"><br/>
	<input type="submit" value="发布">
	</form>
</body>
</html>