<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
<script src="//code.jquery.com/jquery-1.11.2.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$('.ValRmvr').click(function() {
			$(this).val("");
		});
	});
</script>
</head>
<body>
	<h1>
		<b>Sign Up</b>
	</h1>
	<br />
	<table>
		<tr>
			<td><input type="text" value="First Name" class="ValRmvr"></td>
			<td><input type="text" value="Last Name" class="ValRmvr"></td>
		</tr>
		<tr>
			<td><input type="text" value="Email" class="ValRmvr"></td>
		</tr>
		<tr>
			<td><input type="text" value="User Name" class="ValRmvr"></td>
		</tr>
		<tr>
			<td><input type="text" value="Password" class="ValRmvr"></td>
		</tr>
	</table>
	BirthDay
	<br>
	<input type="text" value="Month">
	<input type="text" value="Day">
	<input type="text" value="Year">
	<br>
	<input name="sex" type="radio" value="F">Female
	<input name="sex" type="radio" value="M">Male
	<input type="submit" value="Register">
</body>
</html>