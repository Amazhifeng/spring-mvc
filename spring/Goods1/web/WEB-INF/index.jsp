<%--
  Created by IntelliJ IDEA.
  User: 晨曦
  Date: 2019/6/24
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>小物流</title>
    <style>
        h1, h3 {
            color: red;
        }
    </style>
</head>
<body>
<h1>大佬，请登录！</h1>
<form action="login" method="post">
    <p>用&nbsp;户&nbsp;名：<input type="text" name="username"></p>
    <p>密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="password" name="pwd"></p>
    <c:if test="${uspderror!=null}">
        <h3>${uspderror}</h3>
    </c:if>
    <input type="submit" value="确定">
</form>
</body>
</html>
