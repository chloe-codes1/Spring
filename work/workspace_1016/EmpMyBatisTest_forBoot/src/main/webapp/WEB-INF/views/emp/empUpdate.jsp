<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page session="false" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Info. Update</title>


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

#title{
	text-align: center;
	font-size: 25pt;
	margin-top: 70px;
	margin-bottom: 50px;
}

#instruction{

	text-align: center;
	font-size: 12pt;

}

#update_empno{
 width: 40%;
 margin: 0 auto;
 margin-top: 40px;
}

fieldset {
	text-align: center;
	height: 60px;
	padding-top: 50px;
 	padding-bottom: 50px;
}


legend {
	font-size: 15pt;
}


</style>



</head>
<body>
<div id="home">
	<a href="main" id="home_link">HOME</a>

</div>

<p id="title"> &#128541; Update Employee Information &#128548;</p>

<p id="instruction">Please fill out the form below to help us verify.</p>

<form action="updateResult" method="post">

<div id="update_empno">
	<fieldset>
		<legend>Type Your Employee Number</legend>	
		<input type="text" id="empNo" name="empNo" autofocus="autofocus"/>

		<input type="submit" value="Submit"/>
		<input type="reset" value="Cancel"/>
		
	</fieldset>
</div>

</form>


</body>
</html>