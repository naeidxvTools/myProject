<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
<form action="savaPerson.action">
    username:<input type="text" name="username"/><br>
    password:<input type="password" name="password"/><br>
    age:<input type="text" name="age"/><br>
    <input type="submit" value="submit">
</form>
</body>
</html>
