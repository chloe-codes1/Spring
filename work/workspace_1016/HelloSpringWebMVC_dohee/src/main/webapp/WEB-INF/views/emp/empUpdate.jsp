<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>emp/empUpdate.jsp</title>
</head>
<body>

	<h3>emp/empUpdate.jsp</h3>
	<h4>정보를 수정할 사원의 사원번호를 입력하세요.</h4>
	<form action="updateSelect" method="get">

		<input type="text" id="empNo" name="empNo" value="${empNo}" autofocus="autofocus" placeholder="empNo" /> <br>
		<br>
		<input type="submit" id="submit" value="입 력"> 
		<input type="reset" id="reset" value="취 소">

	</form>
	
	<br><br>
	<hr>

	<c:if test="${!empty emp}">
		<h4>현재 회원 정보</h4>

		<table border="1">
			<tr>
				<th>empno</th> <th>ename</th> <th>job</th> <th>mgr</th>
			</tr>
			<tr>
				<td>${emp.empNo}</td>
				<td>${emp.eName}</td>
				<td>${emp.job}</td>
				<td>${emp.mgr}</td>
			</tr>
		</table>


		<br>
		<h4>${emp.empNo}사원의 정보 수정</h4>
		<form action="updateEmp" method="get">
			<input type="hidden" id="empNo" name="empNo" value="${emp.empNo}">
			<input type="text" id="eName" name="eName" autofocus="autofocus" placeholder="eName" /> <br><br> 
			<input type="text" id="job" name="job" placeholder="job" /><br><br> 
			<input type="text" id="mgr" name="mgr" placeholder="mgr" /><br><br>
			
			<input type="submit" id="submit" value="입 력"> 
			<input type="reset" id="reset" value="취 소">
		</form>
		
	</c:if>


	<c:if test="${!empty list}">
		<h4>회원 목록</h4>
		<table border="1">
			<tr>
				<th>empno</th> <th>ename</th> <th>job</th> <th>mgr</th>
			</tr>
			
			<c:forEach var="data" items="${list}">

				<tr>
					<td>${data.empNo}</td>
					<td>${data.eName}</td>
					<td>${data.job}</td>
					<td>${data.mgr}</td>
				</tr>

			</c:forEach>

		</table>
	</c:if>

<br>
<a href="empMain">메인으로</a>


</body>
</html>