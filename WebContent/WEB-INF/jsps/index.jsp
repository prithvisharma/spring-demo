<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>HELLO INDEX !!!</h1>
<c:out value="${msg} "/>
<br><br><br>
<a href="${pageContext.request.contextPath}/welcome?msg=<c:out value="${msg} "/>">Go to Welcome</a>
</body>
</html>