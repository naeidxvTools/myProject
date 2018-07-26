<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>Title</title>
</head>
<body>
<h2>用户登录</h2>
<s:actionerror cssStyle="color: blue"/>
<hr>
<s:fielderror cssStyle="color:green"/>
<s:form action="login3Action" theme="simple">
    username:<s:textfield name="username"/><br>
    password:<s:password name="password"/><br>
    age:<s:textfield name="age"/><br><br>
    <s:submit value="submit"/>
</s:form>
</body>
</html>
