<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>사원정보</title>
</head>
<body>
	사원번호 :${emp.empNo} <br>
	이름 :${emp.eName}	<br>
	직업 :${emp.job}	<br>
	관리자 :${emp.mgr}	<br>
	입사일 :${emp.hiredate}	<br>
	급여 :${emp.sal}	<br>
	보너스 :${emp.comm}	<br>
	<br>
	<a href = "./insert.do?empno=${emp.empno }"> 수정 </a>
</body>
</html>