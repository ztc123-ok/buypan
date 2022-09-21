<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.vo.Wares"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>已发布商品</title>
</head>
<body>
<a href="admin_function.jsp">返回</a><br>
<a href="admin_waresup.jsp">发布商品</a><br>
<a href="state.jsp">修改商品状态</a><br>
<table>
	<tr>
		<td>商品id</td>
		<td>商品名称</td>
		<td>商品价格</td>
		<td>商品库存</td>
		<td>店铺id</td>
		<td>商品状态</td>
		<td>商品图片</td>
		<td>商品类别</td>
		<td>营销信息</td>
		<td>历史价格</td>
	</tr>

	<%
		List<Wares> asd= new ArrayList<Wares>();
		asd=(List<Wares>)session.getAttribute("zcxx");
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
					<td><%=qwe.getWaresstate() %></td>
					<td> <img src="img/<%=qwe.getWarespicture() %>" width="64" height="64"/> </td>
					<td><%=qwe.getWaresclass() %></td>
					<td><%=qwe.getMatkering() %></td>
					<td><%=qwe.getOldprice() %></td>
				</tr>
			<%
		}
	%>
</table>




</body>
</html>