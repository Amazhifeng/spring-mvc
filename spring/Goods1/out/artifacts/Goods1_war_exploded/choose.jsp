<%--
  Created by IntelliJ IDEA.
  User: 晨曦
  Date: 2019/6/24
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>小物流</title>
    <style>
        h1{
            color:red;
        }
        h3{
            color:orange;
        }
        a{
            color:purple;
            font-size:35px;
            margin-right:20px;
        }
    </style>
</head>
<body>
    <h1>大佬，请下单！</h1>
    <h3>${param.resultIfo}</h3>
    <c:if test="${param.resultIfo==null}">
        <a href="/addorder.jsp">下单</a>
    </c:if>
    <c:if test="${param.resultIfo!=null}">
        <a href="/addorder.jsp">继续下单</a>
    </c:if>
    <a href="/showorder">查询订单</a>
</body>
</html>
