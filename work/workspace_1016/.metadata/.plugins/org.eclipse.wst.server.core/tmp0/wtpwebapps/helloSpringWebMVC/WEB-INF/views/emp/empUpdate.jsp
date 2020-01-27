<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page session="false" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Info. Update</title>


<style type="text/css">

#title{
	text-align: center;
	font-size: 25pt;
}

#update_empno{
 width: 40%;
 margin: 0 auto;
}

fieldset {
	text-align: center;

}


</style>



</head>
<body>

<p id="title"> &#128541; Update Employee Info. &#128548;</p>

<form action="updateResult" method="post">

<div id="update_empno">
	<fieldset>
		<legend>Type an Employee Number</legend>	
		<input type="text" id="empNo" name="empNo" autofocus="autofocus"/>

		<input type="submit" value="Submit"/>
		<input type="reset" value="Cancel"/>
		
	</fieldset>
</div>

</form>


</body>
</html>