<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Verified</title>

<style type="text/css">
#home {
	width: 40px;
	position: absolute;
	top: 40px;
	left: 40px;
}

#home_link {
	text-decoration: none;
	font-size: 18pt;
}

#main {
	padding-top: 40px;
}

#ename {
	color: #59AE6F;
}

#list {
	width: 40%;
	margin: 0 auto;
	border: 1px solid gray;
	margin-top: 50px;
}

#title {
	text-align: center;
	font-size: 20pt;
}

#subtitle {
	text-align: center;
	font-size: 16pt;
}

#list_data {
	text-align: center;
	padding-bottom: 40px;
	padding-top: 10px;
}
</style>

</head>
<body>

	<div id="home">
		<a href="main" id="home_link">HOME</a>

	</div>

	<form action="update" method="get">
		<div id="main">
			<p id="title">
				Now You May Update Your Personal Information, <span id="ename">${empInfo.eName}</span>.
			</p>
			<div id="list">
				<p id="subtitle">Personal Information</p>

				<div id="list_data">
					<div>
					<input type="hidden" id="empNo" name="empNo" value="${empInfo.empNo}">
					</div>
					<div>Employee Name : 
						<input type="text" id="eName" name="eName" placeholder="${empInfo.eName}"
						 onblur="checkField(this)" onfocus="clearField(this)">
					</div>
					<div>Job : 
						<input type="text" id="job" name="job" placeholder="${empInfo.job}"
						onblur="checkField(this)" onfocus="clearField(this)">
					</div>
					<div>MGR : 
						<input type="text" id="mgr" name="mgr" placeholder="${empInfo.mgr}"
						onblur="checkField(this)" onfocus="clearField(this)">
					</div>
					
					<input type="submit" value="Update"/>
					<input type="reset" value="Cancel"/>
				</div>

			</div>

		</div>
	</form>
</body>
</html>