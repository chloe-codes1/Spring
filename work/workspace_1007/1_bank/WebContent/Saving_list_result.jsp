<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width,initial-scale=1">

<link href="https://fonts.googleapis.com/css?family=Domine&display=swap" rel="stylesheet">


<title>Your Savings Account Info.</title>

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
	height: 30%;
 	margin: 0 auto;
 	margin-top: 30px;
 	padding-top: 20px;
 	margin-bottom: 30px;
}

#title_text{
	font-size: 23pt;
	text-align: center;
	
}

#main{
	width: 700px;
	height: 70%;
	margin: 0 auto;
}

#list{

	border: 1px solid gray;
	padding: 10px;
}

.rows{
	margin: 3px;
	padding: 3px;
	font-size: 14pt;
}
span{
	font-weight: bold;

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

<p id="title_text"> ${username} </p>

</div>

<div id="main"> 
<c:forEach var="data" items="${saving_list}">
				
				<div id="list">

						<div class="rows">
						<span>Account Number : </span>${data.accountNumber}
						</div>
						<div class="rows">
						<span>User Name : </span>${data.username}
						</div>
						<div class="rows">
						<span>Period of Fixed Deposit : </span>${data.accountPeriod}
						</div>
						<div class="rows">
						<span>Amount of Deposit : </span>${data.monthlyDeposit}
						</div>
						<div class="rows">
						<span>Interest Rate : </span>${data.interestRate}
						</div>
						<div class="rows">
						<span>Interest : </span>${data.interest}
						</div>
						<div class="rows">
						<span>Total Input : </span>${data.totalInput}
						</div>
						<div class="rows">
						<span>Total Balance : </span>${data.total}
						</div>
				</div>
				</c:forEach>



</div>
<div id="links">
<a href="index.jsp" id="home">HOME</a>
</div>

</body>
</html>