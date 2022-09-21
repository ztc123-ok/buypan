<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.vo.Order"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="admin_function.jsp">返回</a><br/>
<table>
	<tr>
		<td>订单id</td>
		<td>商品id</td>
		<td>客户id</td>
		<td>商品交易数量</td>
		<td>申请时间</td>
	</tr>
	<%
		List<Order> asd= new ArrayList<Order>();
		asd=(List<Order>)session.getAttribute("zcxx");
		Iterator it=asd.iterator();
		Order qwe=null;
		while(it.hasNext()){
			qwe=new Order();
			qwe=(Order)it.next();%>
				<tr>
					<td><%=qwe.getOrderid() %></td>
					<td><%=qwe.getWaresid() %></td>
					<td><%=qwe.getBuyerid() %></td>
	
					<td><%=qwe.getWaresnumber()%></td>
					<td><%=qwe.getOrdertime() %></td>
				</tr>
			<%
		}
	%>
</table>

</body>
</html>