<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>$Title$</title>
    <script src="script/jquery-3.3.1.js"></script>
    <script>
        $(function () {
           $("#button1").click(function () {
               $.ajax({
                   type:"POST",
                   url:"MyServlet",
                   dataType:"html",
                   success: function (data) {
                       $("#result").val(data);
                   }
               });
           });
        });


    </script>
</head>
<body>
<input type="text" id="result"> <input type="button"  value="get content from server" id="button1">
</body>
</html>
