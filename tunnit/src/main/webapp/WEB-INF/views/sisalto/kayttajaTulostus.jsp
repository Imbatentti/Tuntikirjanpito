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
						<li class="active"><a href="tulostus">Näytä tunnit</a></li>
						<li><a href="#">Lisää jotain</a></li>
						<!--<li><a href="#">Kirjaudu ulos</a></li>-->
					</ul>
				</div>
				<!--/.nav-collapse -->
			</div>
			<!--/.container-fluid -->
		</nav>


		<div class="jumbotron">
		
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
				</div>
				<div id="navbar" class="navbar-collapse collapse">
					<ul class="nav navbar-nav">
						<li><a href="../nayta/tulostus">Kaikki tunnit</a></li>
					</ul>
						
				</div>
				<div class="dropdown">
						 	<button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Valitse käyttäjä
						 		<span class="caret"></span>
						 	</button>
						 		<ul class="dropdown-menu">
						 			<c:forEach items="${kayttajatulostus}" var="kayttajatulostus">
						   				<li><a href="kayttajaTulostus">${kayttajatulostus.kayttajatunnus }</a></li>
						   				<input type="hidden" name="kayttaja" value="${kayttajatulostus.kayttajatunnus }">
						    		</c:forEach>
						  		</ul>
						</div>
				<!--/.nav-collapse -->
			</div>
			<!--/.container-fluid -->
		</nav>

			<form action="TulostusServlet" method="get">
				<h2>Kirjatut tunnit</h2>
				<h3>Käyttäjä</h3>
						<c:forEach items="${kayttajatunnit}" var="kayttajatunnit">
							<td>Tunnit yhteensä: <c:out
									value="${kayttajatunnit.kaikkiTunnit }" /></td>
						</c:forEach>
				<div class="table-responsive">
				<table class="table table-striped">
					<tr>
					<th>Tunnit</th>
						<th>Käyttäjä</th>
						<th>Kuvaus</th>
						<th>Päivämäärä</th>
						<th>Poisto</th>
						<td>


					</tr>
					<c:forEach items="${tulostus}" var="tulostus">
						<tr>
							<td><c:out value="${tulostus.tuntiMaara }" /></td>
							<td><c:out value="${tulostus.kayttajatunnus }" /></td>
							<td><c:out value="${tulostus.kuvaus }" /></td>
							<td><c:out value="${tulostus.pvm }" /></td>

							<td><a href="<c:url var="deleteUrl" value="/tulostus"/>">Poista</a>
								<form id="${formId }" action="${deleteUrl}" method="post">
									<input id="poistettava" name="poistettava" type="hidden"
										value="${tulostus.tuntiId}" />
								</form>
						</tr>
					</c:forEach>
					<!--  
					<c:forEach items="${kayttajaTulostus}" var="kayttajaTulostus">
						<tr>							
							<td><c:out value="${kayttajaTulostus.kayttajatunnus }" /></td>
							<td><c:out value="${kayttajaTulostus.tuntiMaara }" /></td>
						</tr>
					</c:forEach>
					-->
				</table>
				</div>
			</form>
		</div>
	</div>
</body>
</html>