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
<h2>登录信息</h2>
    用户名：${requestScope.username}<br>
    密　码：${requestScope.password}<br>
    年　龄：${requestScope.age}<br>
<hr>
    username:<s:property value="username"/><br>
    password:<s:property value="password"/><br>
    age:<s:property value="age"/>
</body>
</html>
