<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login.jsp</title>
</head>
<body>

<h3>emp/login.jsp</h3>

<form action="loginResult" method="get">

	<input type="text" id="empNo" name="empNo" value="${empNo}" autofocus="autofocus" placeholder="empNo"/>	
	
	<br><br><input type="submit" id="submit" value="로 그 인" >
	<input type="reset" id="reset" value="취 소">
	
</form>

<br>
<a href="empMain">메인으로</a>

</body>
</html>