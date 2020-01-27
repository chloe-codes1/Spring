<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>empList.jsp</title>
</head>
<body>
	<h3>emp/empList</h3>
	<h2>사원 목록</h2>
	
		<table border="1">
		<tr> 
			<th>empno</th> <th>ename</th> <th>job</th> <th>mgr</th>

		</tr>

		<c:forEach var="data" items="${list}">

		<tr> 
	 		<td> ${data.empNo}</td> 
	 		<td> ${data.eName}</td> 
	 		<td> ${data.job}</td> 
	 		<td> ${data.mgr}</td> 
		</tr>
		
		</c:forEach>

		</table>
		
	<br>
	<a href="empMain">메인으로</a>
		
</body>
</html>