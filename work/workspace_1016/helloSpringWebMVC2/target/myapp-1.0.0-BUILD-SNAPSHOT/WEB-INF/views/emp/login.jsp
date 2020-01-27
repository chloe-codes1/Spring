<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>  
<html>
<head>
<meta charset="UTF-8">
<title>Log-In</title>
</head>
<body>
		
</head>
<body>

<h2> &#128541; Log-In &#128548;</h2>

<form action="login.jsp" method="get">


	<table border="1"> 
		<tbody>
			<tr>
				<td> <label for="id"> ID </label></td>
				<td> <input type="text" id="id" name="id" value=""/>  </td>
			</tr>
			<tr>
				<td> <label for="pw"> PW </label></td>
				<td> <input type="password" id="pw" name="pw" value=""/>  </td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="login">  <!--login 버튼을 누르면 위에 form action으로 가게 됨 => form의 action page로 전송-->
					<input type="reset" value="cancel">
					<a href="http://localhost:8000/5_ajax/users/users.html"> 회원가입 </a>
					
					</td>
			</tr>
		
		</tbody>
	
	</table>
	

</form>
</body>
</html>