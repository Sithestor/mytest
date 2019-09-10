<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/9/9
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>用户</title>
</head>
<body>
<table>
    <tr>
        <td>序号</td>
        <td>编号</td>
        <td>姓名</td>
        <td>性别</td>
        <td>年龄</td>
        <td>地址</td>
    </tr>
    <c:forEach items="${lists}" var="lis" varStatus="s">
        <tr>
            <td>${s.count}</td>
            <td>${lis.id}</td>
            <td>${lis.name}</td>
            <td><c:if test="${lis.sex==0}">女</c:if><c:if test="${lis.sex==1}">男</c:if></td>
            <td>${lis.age}</td>
            <td>${lis.address}</td>
        </tr>

    </c:forEach>
</table>

</body>
</html>
