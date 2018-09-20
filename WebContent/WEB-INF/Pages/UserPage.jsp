<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ include file = "head.html" %>
<%@ include file = "footer.html" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="UpdateInfo" method="POST">


<div class="subfield">
	<label>Username</label><input type="text" id="user_name" name="user_name" value=${username}>

</div>

<div class="subfield">
	<label>friend code</label><input type="text" id="friendcode" name="friendcode" value=${friendcode}>

</div>

<div class="subfield">
	<label>team</label><input type="text" id="team" name="team" value=${team}>

</div>


<div class="subfield">
	<label>password</label><input type="text" id="password" name="password" value=${password}>

</div>

<div class="subfield">
	<label>Location</label><input type="text" id="location" name="location" value=${location}>

</div>

<button type="submit" class="UpdateInfo">Update</button>


</form>




</body>

</html>