<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
</head>
<body>
<h1>登录</h1>

<form action="<%=request.getContextPath()%>/servlet_dl" method="post">
用户名：<input type="text" name="uname"><br/>
密码：<input type="password" name="pwd"><br/>
<input type="submit" name="sub1" value="登录">
<a href="zhuce.jsp">注册</a>
</form>
<%--
<jsp:useBean id="deal" class="com.sell.deal" scope="page" />
<%
String u_n=null;
String pwd=null;
boolean t=false;
try{
	u_n=request.getParameter("uname");
	pwd=request.getParameter("pwd");
	if(u_n!=null&&pwd!=null){
		if(deal.loginCheck(u_n, pwd)){
			%><jsp:forward page="gongneng.jsp"/><%
		}
	}
}catch(Exception e){out.print(e);}
%>
 --%>
</body>
</html>