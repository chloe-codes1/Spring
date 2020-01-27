<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>empList.jsp</title>
</head>
<body>
	<h3>dept/empList</h3>
		<table border="1">
		<tr> 
			<th>empno</th> <th>ename</th> <th>job</th> <th>mgr</th> <th>hiredate</th> <th>sal</th> <th>comm</th> <th>deptno</th>

		</tr>

		<c:forEach var="data" items="${emplist}">

		<tr> 
	 		<td> ${data.empno}</td> 
	 		<td> ${data.ename}</td> 
	 		<td> ${data.job}</td> 
	 		<td> ${data.mgr}</td> 
	 		<td> ${data.hiredate}</td> 
	 		<td> ${data.sal}</td> 
	 		<td> ${data.comm}</td> 
	 		<td> ${data.deptno}</td> 
		</tr>
		
		</c:forEach>

		</table>
		
</body>
</html>