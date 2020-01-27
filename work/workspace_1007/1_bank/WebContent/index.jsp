<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1">

<link href="https://fonts.googleapis.com/css?family=Domine&display=swap" rel="stylesheet">
<title>JH Bank</title>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<script>
const log = console.log;

jQuery(function () { 

});

</script>

<style type="text/css">

*{
	font-family: 'Domine', serif;
}

#title {	
 	width: 500px;
 	height: 40%;
 	margin: 0 auto;
 	margin-top: 70px;
 	padding-top: 50px;
}

#title_text{
	font-size: 25pt;
	text-align: center;
	margin-bottom: 40px;
	margin-top: 70px;
	
}

#options{
	
	width: 700px;
	height: 60%;
	text-align: center;
	margin: 0 auto;
	margin-top: 70px;
}

#saving, #loan{

	display: inline-block;
	width: 300px;
	height: 200px;
	text-align: center;
	margin: 0 auto;
	font-size: 15pt;
}

.links{
	text-decoration: none;
	margin: 10px;
}

#mypage{
	position: absolute;
	top: 30px;
	right: 60px;
	background-color: black;
	border-radius: 5px;
	padding: 10px;
}

#mypage_link{
	text-decoration: none;
	color: white;
}

</style>

</head>
<body>

<div id="title">

	<p id="title_text">Welcome to JH Bank</p>

</div>

<div id="options">

	<div id="saving">
	
	<a href="Saving.jsp" class="links">Open a Savings Account</a>
	
	</div>

	<div id="loan">
	
	<a href="Loan.jsp" class="links">Apply to Personal Loans</a>
	
	</div>
</div>

<div id="mypage">
	<a href="mypage.jsp" id="mypage_link">My Page</a>
</div>


</body>
</html>