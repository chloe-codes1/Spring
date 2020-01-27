<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
							<!-- prefix는 ctrl + spacebar하면 short name을 가져옴 -->
    <!-- 
    
    uri는 url과 다르다!
    url이면 접속이 가능하겠지만, uril는 현재 project 안에서 불러내는 식별자이고, 
    url의 형식을 갖고있을 뿐이다! indicator u know 

    -->
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>user/form</title>

<style type="text/css">
.btns{
	display: inline;
}
</style>


</head>
<body>


									<!-- modelAttribute = commandName -->
	<form:form action="register" modelAttribute="user" method="post">
	<!-- 이 form.jsp가 user/formView 라서 user/register를 호출하려면
		 action에서 user빼고 register만 쓰면 됨! 이미 user 밑에 있는 formView 위치니까! -->
	
	<pre>
	
	사용자 아이디 : <form:input path="userId"/>  <form:errors path="userId"/> <br>
	비밀번호 :     <form:input path="password"/> <form:errors path="password"/> <br>
	이름 :        <form:input path="name"/> <form:errors path="name"/> <br>
	이메일 :      <form:input path="email"/> <form:errors path="email"/> <br>
	
	<button type="submit" class="btns"> 회원 가입 </button>
	</pre>
	</form:form>

	Result : <br/>
	${user}
	
	

</body>
</html>