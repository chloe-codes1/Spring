<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Log-In Result</title>

<style type="text/css">
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

<div id="main">

		<div id="list">
			<p id="title">Employee List</p>

				<div id="list_data">
					<div>Employee Number - ${empInfo.empNo}</div>
					<div>Employee Name - ${empInfo.eName}</div>
					<div>Job - ${empInfo.job}</div>
					<div>MGR - ${empInfo.mgr}</div>
				</div>
				
		</div>

	</div>


</body>
</html>