<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="fi">
<head>
<meta name="description" content="Kirjautumissivu">
<meta name="author" content="Team Blue / Softala 1">
<meta charset=UTF-8>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<link href="css/login.css" rel="stylesheet">

<title>Kirjautuminen</title>
</head>

<body>

	<div class="container">
     
     	<form action="j_spring_security_check" method="post">
     		<fieldset>
     			<table>
     				<tr><td>Käyttäjätunnus:</td><td><input type='text' name='j_username' value=''></td></tr>
     				<tr><td>Salasana:</td><td><input type='password' name='j_password' /></td></tr>
     				<tr><td>&nbsp;</td><td><button type="submit">Kirjaudu</button></td></tr>
     			</table>
     		</fieldset>
     	</form>
     
	</div> <!-- /container -->
</body>
</html>