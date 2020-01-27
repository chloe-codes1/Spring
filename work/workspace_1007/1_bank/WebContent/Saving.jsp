<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1">

<link href="https://fonts.googleapis.com/css?family=Domine&display=swap" rel="stylesheet">
<title>Saving Account</title>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<script>
const log = console.log;

jQuery(function () { 

});


</script>

<style>

*{
	font-family: 'Domine', serif;
}

#title {	
 	width: 500px;
 	height: 150px;
 	margin: 0 auto;
 	margin-top: 30px;
 	padding-top: 20px;
}

#title_text{
	font-size: 23pt;
	text-align: center;
	
}
#title_interestRate{
	font-size: 13pt;
	text-align: center;
}
#interestRate_span{
	color: #F0785A;
}
legend{
	font-size: 18pt;
}

#form{
	margin: 0 auto;
	width: 500px;
	padding: 30px;
	line-height: 30px;
	text-align: center;
}


#username, #period, #amount{
	color: blue;
	padding-left: 10px;
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

<p id="title_text">Open an Account - Savings </p>
<p id="title_interestRate"> Current Interest Rate for Savings Account : <span id="interestRate_span">5.7%</span></p>
</div>

<form action="saving.do" method="post" >
<fieldset id="form">
	<legend>Account Opening Form</legend>
	User Name :
	<input type="text" id="username" name="username" value="Type Your Name" onFocus="this.value=''"> <br/>
	Period of Fixed Deposit : 
	<input type="text" id="period" name="period" value="Type the Month" onFocus="this.value=''"> <br/>
	Amount of Deposit : 
	<input type="text" id="amount" name="amount" value="Type it in Korean Won" onFocus="this.value=''"><br/><br/>
	
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