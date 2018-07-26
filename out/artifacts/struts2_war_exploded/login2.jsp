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

<h2>用分号分割的用户名和密码</h2>

<s:actionerror/>
<hr>
<s:fielderror cssStyle="color: green;"/>
<s:form action="login2Action" theme="simple">
    user info :<s:textfield name="user"/><br>
    <s:submit value="submit"/>
</s:form>
</body>
</html>
