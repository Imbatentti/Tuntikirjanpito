<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ page session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta name="description" content="Tulostussivu">
<meta name="author" content="Team Blue / Softala 1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset=UTF-8>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="../resources/styles/tyyli.css">
<title>Tuntien näyttö</title>
</head>
<body>
	<div class="container">
		<nav class="navbar navbar-default">
			<div class="container-fluid">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#navbar" aria-expanded="false"
						aria-controls="navbar">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="../sisalto/uusitunti">Tuntikirjanpito</a>
				</div>
				<div id="navbar" class="navbar-collapse collapse">
					<ul class="nav navbar-nav">
						<li><a href="../sisalto/uusitunti">Tuntien kirjaus</a></li>
						<li class="active"><a href="tulostus">Näytä
								tunnit</a></li>
						<li><a href="#">Lisää jotain</a></li>
					</ul>
				</div>
				<!--/.nav-collapse -->
			</div>
			<!--/.container-fluid -->
		</nav>


		<div class="jumbotron">
			
				<div id="navbar" class="navbar-collapse collapse">
						<ul class="nav navbar-nav">
							<li><a href="../nayta/tulostus">Kaikki tunnit</a></li>
							<li class="active"><a href="kayttajaTunnit">Käyttäjäkohtaiset tunnit</a></li>
						</ul>
					</div>
			
		
			<form action="TulostusServlet" method="get">
				<h2>Kirjatut tunnit</h2>
				<table class="table table-striped">
					<tr>
						<th>Käyttäjä</th>
						<!--  <th>Tunti ID</th> -->
						
						
					</tr>
					<c:forEach items="${kayttajaTulostus}" var="kayttajaTulostus">
						<tr>							
							<td><c:out value="${kayttajaTulostus.kayttajatunnus }" /></td>
							<td><c:out value="${kayttajaTulostus.tuntiMaara }" /></td>
						</tr>
					</c:forEach>
				</table>
			</form>
		</div>
	</div>
</body>
</html>