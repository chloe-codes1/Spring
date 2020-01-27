<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login.jsp</title>
</head>
<body>

<h3>login.jsp</h3>

<form action="" method="post" onsubmit="return check()">
	<table>
	<tr>
		<td> <input type="text" id="id" name="id" value="${id}" placeholder="ID"/>	</td>
	</tr>
	
	<tr>
		<td><br> <input type="password" id="pw" name="pw" value="" placeholder="PW"/>	</td>
	</tr>
	
	<tr>
		<td> 
		<br><input type="submit" id="submit" value="로 그 인" >
		<br><br><input type="reset" id="reset" value="취 소">
	</td>
	</tr>
	</table>
</form>

</body>
</html>