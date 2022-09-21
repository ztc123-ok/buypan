<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.vo.Wares"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商城</title>
</head>
<body>
<a href="cus_buyit.jsp">购买</a>
<table>
	<tr>
		<td>商品id</td>
		<td>商品名称</td>
		<td>商品价格</td>
		<td>商品库存</td>
		<td>店铺id</td>
		<td>商品图片</td>
		<td>商品类别</td>
		<td>营销信息</td>
	</tr>

	<%
		List<Wares> asd= new ArrayList<Wares>();
		asd=(List<Wares>)session.getAttribute("yhspxx");
		Iterator it=asd.iterator();
		Wares qwe=null;
		while(it.hasNext()){
			qwe=new Wares();
			qwe=(Wares)it.next();%>
				<tr>
					<td><%=qwe.getWaresid() %></td>
					<td><%=qwe.getWaresname() %></td>
					<td><%=qwe.getWaresprice() %></td>
					<td><%=qwe.getWaresnumber() %></td>
					<td><%=qwe.getShopid()%></td>
					<td> <img src="img/<%=qwe.getWarespicture() %>" width="64" height="64"/> </td>
					<td><%=qwe.getWaresclass() %></td>
					<td><%=qwe.getMatkering() %></td>
				</tr>
			<%
		}
	%>
</table>
</body>
</html>