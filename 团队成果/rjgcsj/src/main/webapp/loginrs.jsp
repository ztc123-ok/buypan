<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录结果页面</title>
</head>
<body>
<%
String uname=request.getParameter("uname");
String pwd=request.getParameter("pwd");
String zhanghao="1234";
String mima="1234";

//mima=request.getParameter("mima");
int a=0,b=0;
if(zhanghao.equals(uname)&&mima.equals(pwd))
{
	a++;
}
else if(zhanghao.equals(uname))
{
	b++;
}

if(a==1)
    {
    %>
 		<h1>登录成功</h1>	 
    	<a href="admin_function.jsp">选择功能</a><br/> 	 
   <% 
    } 
else if(a==0&&b==1)
    {
    	%>
    	<h1>登录密码错误</h1>
    	<a href="admin_login.jsp">重新登录</a><br/>
    	<%
   	 }
else if(b==0)
{
	%>
	<h1>用户名或密码错误</h1>
	<a href="admin_login.jsp">重新登录</a><br/>
	<%
	 }
 %>

</body>
</html>