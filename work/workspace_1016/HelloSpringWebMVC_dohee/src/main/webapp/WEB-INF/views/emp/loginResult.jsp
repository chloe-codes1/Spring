<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>emp/loginResult.jsp</title>
</head>
<body>

<h3>loginResult.jsp</h3>



${emp}


<c:if test="${empty emp}">
일치하는 정보가 없습니다.
</c:if>

<br><br>
<a href="empMain">메인으로</a>

</body>
</html>