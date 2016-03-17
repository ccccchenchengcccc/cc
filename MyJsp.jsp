<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>复利计算器</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
<form action=""method=post name form>
    <P>存入本金p(元)：<INPUT type="text" name="a">
    <P>年利率比i(%)：<INPUT type="text" name="b">
    <P>存入年限n(年)：<INPUT type="text" name="c">
    <INPUT TYPE="submit" value="计算复利值" name=submit>
</form>
<%--获取用户提交的数据 --%>
<%
String string_a=request.getParameter("a"),
       string_b=request.getParameter("b"),
       string_c=request.getParameter("c");
       double a=0,b=0,c=0;
 %>
 <%--判断字符串是否是空对象，如果是空对象就初始化 --%>
 <%if(string_a==null){
       string_a="0";
        string_b="0";
         string_c="0";
 }
  %>
  <%--计算复利值 --%>
  <%    a=Double.valueOf( string_a).doubleValue();
        b=Double.valueOf( string_b).doubleValue();
        c=Double.valueOf( string_c).doubleValue();
        double d=1;
        for(int i=1;i<=c;i++){
            d=(1+(b/100))*d;
        }
        double fuli=d*a;
        out.print("<BR>"+"复利终止："+fuli);
        
   %>
  </body>
</html>
