<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>


<!-- JSTL의 Core Tag와 유사한 Spring form Tag -->
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>


emp  ->  ${emp } <br>
emp2 ->  ${emp2 } <br>
emp3 ->  ${emp3 } <br>




<br/><br/>

	<!-- action에 아무것도 쓰지 않으면 자기 자신 호출함 -->
	<!-- form:form tag의 method default는 POST -->
	<form:form action="empForm3" commandName="emp2"> 
				<!-- emp class의 reference emp -->

	
	empNo : <form:input path="empNo"/>
	eName : <form:input path="eName"/>
	job : <form:input path="job"/>
	mgr : <form:input path="mgr"/>
	
		<input type="submit">
	
	</form:form>




</body>
</html>