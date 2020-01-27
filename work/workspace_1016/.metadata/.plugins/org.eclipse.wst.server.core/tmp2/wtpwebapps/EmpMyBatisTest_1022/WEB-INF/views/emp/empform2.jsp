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
		<!-- 전체적인 error를 띄워줌 -->
	
	<form:form action="register" modelAttribute="emp" method="post">
		EMPNO: 
		<form:input path="empNo"/> 
		<form:errors path="empNo"/> <br>
		ENAME: 
		<form:input path="eName"/>
		<form:errors path="eName" /><br> 
		JOB:
		<form:input path="job"/> 
		<form:errors path="job" /> <br>
		MGR: 
		<form:input path="mgr"/>
		<form:errors path="mgr"/><br>
		HIREDATE: 
		<form:input path="hiredate" placeholder="2012-01-01"/> 
		<form:errors path="hiredateStr"/><br> 
		SAL: 
		<form:input path="sal"/> 
		<form:errors path="sal"/><br> 
		COMM: 
		<form:input path="comm"/> 
		<form:errors path="comm"/><br> 
		
		<input type="submit" value="Submit">
		<input type="reset" value="Reset">
	</form:form>			
	
	<br>
	
	Result : <br>
		${emp}
	