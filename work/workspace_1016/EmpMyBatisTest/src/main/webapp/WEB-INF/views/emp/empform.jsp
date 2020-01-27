<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPEhtml>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>empform</title>
</head>

<body>
	<spring:hasBindErrors name="emp" />
	<form:errors path="emp" />
		<!-- 전체적인 error를 띄워줌 -->
	
	<form action="./insert.do" method="post">
		EMPNO: <input type="text" name="empNo" value="${emp.empNo}"> 
		<form:errors path="emp.empNo"/> <br>
		ENAME: <input type="text" name="eName" value="${emp.eName}">
		<form:errors path="emp.eName" /><br> 
		JOB:
		<input type ="text" name="job" value="${emp.job}"> 
		<form:errors path="emp.job" /> <br>
		MGR: 
		<input type="text" name="mgr" value="${emp.mgr}">
		<form:errors path="emp.mgr"/><br>
		HIREDATE: 
		<input type="text" name="hiredateStr" value="${emp.hiredate}" placeholder="2012-01-01"> 
		<form:errors path="emp.hiredateStr"/><br> 
		SAL: 
		<input type="text" name="sal" value="${emp.sal}"> 
		<form:errors path="emp.sal"/><br> 
		COMM: 
		<input type="text" name="comm" value="${emp.comm}"> 
		<form:errors path="emp.comm"/><br> 
		
		<input type="submit" value="Submit">
		<input type="reset" value="Reset">
	</form>			
	
	<br>
	
	Result : <br>
		${emp}
	