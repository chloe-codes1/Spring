<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1">
<link href="https://fonts.googleapis.com/css?family=Domine&display=swap" rel="stylesheet">


<title>My Page</title>

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
 	width: 700px;
 	height: 100px;
 	margin: 0 auto;
 	margin-top: 30px;
 	padding-top: 20px;
}

#title_text{
	font-size: 23pt;
	text-align: center;
	
}

legend{
	font-size: 18pt;
}

#form{
	margin: 0 auto;
	margin-top: 30px;
	width: 500px;
	padding: 30px;
	line-height: 30px;
	text-align: center;
}
#btn{
	text-align: center;
}

.btns{
	margin: 10px;
}

#links{
	position: absolute;
	top: 30px;
	left: 40px;
	background-color: black;
	border-radius: 5px;
	padding: 10px;
}


#home{
	text-decoration: none;
	color: white;
}

</style>

</head>
<body>

<div id= "title">

<p id="title_text">My Page </p>

</div>

<form action="list_saving.do" method="post">

<fieldset id="form">
	<legend>Check Your Savings Account Balance</legend>

	Account Number :
	<input type="text" id="accountNumber" name="accountNumber" onFocus="this.value=''"> <br/>
	User Name :
	<input type="text" id="username" name="username" onfocus="this.value=''"><br/>
	
	<div id="btn">
	<input type="submit" value="Submit" class="btns">
	<input type="reset" value="Reset" class="btns">
	</div>

</fieldset>


</form>


<form action="list_loan.do" method="post">

<fieldset id="form">
	<legend>Check Your Loan Account Balance</legend>

	Account Number :
	<input type="text" id="accountNumber" name="accountNumber" onFocus="this.value=''"> <br/>
	User Name :
	<input type="text" id="username" name="username" onfocus="this.value=''"><br/>
	
	<div id="btn">
	<input type="submit" value="Submit" class="btns">
	<input type="reset" value="Reset" class="btns">
	</div>

</fieldset>

</form>
<div id="links">
<a href="index.jsp" id="home">HOME</a>
</div>
</body>
</html>