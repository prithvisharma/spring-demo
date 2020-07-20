<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>WELCOME BOIS !!!</h2>
<h3>Customer Details</h3><hr><br><br>

<%--display customers with their subscription plan --%>
<%-- <c:out value="${msg}"/><br><br><br>
<c:forEach items="${list}" var="c">
<c:out value="${c}"/> Plan: <c:out value="${c.getSubscription().getPlan()}" /><br>
</c:forEach>
<br> --%>
<c:out value="${bank.getName()}"/>
<hr><hr>
<c:forEach items="${bank.getCustomerList()}" var="customer">
Name: <c:out value="${customer.getName()}"/><br>
Plan: <c:out value="${customer.getSubscription().getPlan()}"/><hr>
</c:forEach>
</body>
</html>