<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<meta charset="UTF-8">
<title>[Dept] Log-In</title>

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

#title {
	text-align: center;
	font-size: 25pt;
	margin-top: 70px;
}

#login_empno {
	width: 40%;
	margin: 0 auto;
	margin-top: 40px;
}

fieldset {
	height: 70px;
	padding-top: 30px;
	padding-bottom: 50px;
}

legend {
	font-size: 15pt;
	text-align: center;
}


#empNo, #eName{
	font-size: 13pt;
	margin-left: 60px;
	margin-top: 5px;
	margin-bottom: 5px;
	width: 300px;
	text-align: center;
}

.btns{
	margin-left: 10px;
	width: 70px;
	height: 30px;
	font-size: 13pt;
}
</style>

</head>
<body>

	<div id="home">
		<a href="main" id="home_link">HOME</a>

	</div>

	<p id="title">&#128541; Log-In to JH Company &#128548;</p>

	<form action="login2" method="post">

			empNo1<input type="text" name="emps[0].empNo"><br>
			eName1<input type="text" name="emps[0].eName"><br>
			job1<input type="text" name="emps[0].job"><br>
			mgr1<input type="text" name="emps[0].mgr"><br>
		===================================================<br/>
			empNo2<input type="text" name="emps[1].empNo"><br>
			eName2<input type="text" name="emps[1].eName"><br>
			job2<input type="text" name="emps[1].job"><br>
			mgr2<input type="text" name="emps[1].mgr"><br>
			<input type="submit" class="btns" value="insert" /> 


	</form>


</body>
</html>