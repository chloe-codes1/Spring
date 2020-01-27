<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>emp/empList</title>

<style type="text/css">

#home{
	width: 40px;
	position: absolute;
	top: 40px;
	left: 40px;

}

#home_link{
	text-decoration: none;
	font-size: 18pt;

}
#main{

	margin-top: 50px;
}
#list {
	width: 40%;
	margin: 0 auto;
	border: 1px solid gray;
}

#title {
	text-align: center;
	font-size: 20pt;
}

#list_data {
	text-align: center;
	padding-bottom: 10px;
	padding-top: 10px;
}
</style>

</head>

<body>
<div id="home">
	<a href="main" id="home_link">HOME</a>

</div>


	<div id="main">

		<div id="list">
			<p id="title">JH Company's Employee List</p>

			<c:forEach var="data" items="${emplist}">
				<div id="list_data">
					<div>Employee Number - ${data.empNo}</div>
					<div>Employee Name - ${data.eName}</div>
					<div>Job - ${data.job}</div>
					<div>MGR - ${data.mgr}</div>
				</div>
				</c:forEach>
				
		</div>

	</div>
	
</body>
</html>