<%--
  Created by IntelliJ IDEA.
  User: 晨曦
  Date: 2019/6/24
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>小物流</title>
</head>
<body>
<form action="/addOrder" method="post">
    <p>发件人姓名：</p>
    <input type="text" name="fName" placeholder="发件人姓名">
    <hr>
    <p>发件人电话：</p>
    <input type="text" name="fPhone" placeholder="发件人电话">
    <hr>
    <p>发件人地址：</p>
    <input type="text" name="fAddress" placeholder="发件人地址">
    <hr>
    <hr>
    <hr>

    <p>收件人姓名：</p>
    <input type="text" name="sName" placeholder="收件人姓名">
    <hr>
    <p>收件人电话：</p>
    <input type="text" name="sPhone" placeholder="收件人电话">
    <hr>
    <p>收件人地址：</p>
    <input type="text" name="sAddress" placeholder="收件人地址">
    <hr>

    <p>备注：</p>
    <input type="text" name="comments" placeholder="备注信息">
    <p><input type="submit" value="提交"></p>

</form>
</body>
</html>
