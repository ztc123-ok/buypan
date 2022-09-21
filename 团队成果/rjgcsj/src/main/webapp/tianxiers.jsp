<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>个人信息填写结果</title>
</head>
<body>
<%
String realname=request.getParameter("realname");
String phonenum=request.getParameter("phonenum");
String address=request.getParameter("address");
int rname=0,pnum=0,ass=0;
if(realname.length()==0)
{
	rname=1;
	%>错误：真实姓名不能为空  </br><%
}
if(phonenum.length()==0)
{
	pnum=1;
	%>错误：电话号码不能为空  </br><%
}
if(address.length()==0)
{
	ass=1;
	%>错误：收货地址不能为空  </br><%
}

if(phonenum.length()!=11&&phonenum.length()!=0)
{
	pnum=1;
	%>错误：电话号码为11位数字  </br><%
	}
else if(phonenum.length()==11&&phonenum.length()!=0)
{
	for(int i=0;i<phonenum.length();i++)
		if(phonenum.charAt(i)>'9'||phonenum.charAt(i)<'0'){
			pnum=1;
			%>错误：电话号码为11位数字  </br><%
			break;
		}	

}

if(rname==0&&pnum==0&&ass==0)
    {
    %>
 		<h1>填写成功</h1>	 
    	<a href="cus_shop.jsp">返回商城</a><br/> 	 
   <% 
    } 
else 
    {
    	%>
    	<h1>填写失败</h1>
    	<a href="cus_buyit.jsp">重新填写</a><br/>
    	<%
   	 }

%>
</body>
</html>