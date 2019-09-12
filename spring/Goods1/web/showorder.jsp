<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 晨曦
  Date: 2019/6/24
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>小物流</title>
    <style>
        table,th,td{
            border:1px solid black;
        }
        span{
            color:red;
            font-size:40px;
        }
        a{
            color:purple;
            font-size:25px;
        }
    </style>
</head>
<body>
    <c:if test="${totlePag==0}">
        <%
            session.setAttribute("resultIfo","大佬，你好没有订单信息！");
            response.sendRedirect("/choose.jsp");
        %>
    </c:if>

    <c:if test="${pagNow!=1}">
        <a href="/showorder?pagNow=${pagNow-1}">上一页</a>
    </c:if>
    <c:forEach begin="1" end="${totlePag}" var="pag">
        <c:if test="${pagNow==pag}">
            <span>${pag}</span>
        </c:if>
        <c:if test="${pagNow!=pag}">
            <a href="/showorder?pagNow=${pag}">${pag}</a>
        </c:if>
    </c:forEach>
    <c:if test="${pagNow!=totlePag}">
        <a href="/showorder?pagNow=${pagNow+1}">下一页</a>
    </c:if>


    <c:forEach items="${list}" var="order" varStatus="vs">
        <h3>当前订单编号是：${vs.count}</h3>
        <table>
            <tr>
                <th>发件人信息</th>
                <th>收件人信息</th>
            </tr>
            <tr>
                <td>${order.getfName()}</td>
                <td>${order.getsName()}</td>
            </tr>
            <tr>
                <td>${order.getfPhone()}</td>
                <td>${order.getsPhone()}</td>
            </tr>
            <tr>
                <td>${order.getfAddress()}</td>
                <td>${order.getsAddress()}</td>
            </tr>
            <tr>
                <td colspan="2">${order.getComments()}</td>
            </tr>
        </table>
    </c:forEach>

    <a href="/choose.jsp">回到选择页</a>
</body>
</html>
