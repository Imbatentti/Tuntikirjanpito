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
								data-toggle="collapse" data-target="#navbar"
								aria-expanded="false" aria-controls="navbar">
								<span class="sr-only">Toggle navigation</span> <span
									class="icon-bar"></span> <span class="icon-bar"></span> <span
									class="icon-bar"></span>
							</button>
						</div>
						<div id="navbar" class="navbar-collapse collapse">
							<ul class="nav navbar-nav">
								<li class="active"><a href="tulostus">Kaikki tunnit</a></li>
							</ul>
						</div>
						<!--/.nav-collapse -->
					</div>
					<!--/.container-fluid -->
				</nav>

				<form:form action="tulostusLista" modelAttribute="tulostus"
					method="post">
					<c:forEach items="${kayttajatulostus}" var="kayttajatulostus">
						<input type="hidden" id="kayttaja" name="kayttaja" value="${kayttajatulostus.kayttajatunnus }">
						<input type="submit" value="${kayttajatulostus.kayttajatunnus }" />
					</c:forEach>
				</form:form>

				<form action="TulostusServlet" method="get">
					<h2>Kirjatut tunnit</h2>
					<c:forEach items="${projektiSumma}" var="projektiSumma">
						<td>Tunnit yhteensä: <c:out
								value="${projektiSumma.kaikkiTunnit }" /></td>
					</c:forEach>

					<c:forEach items="${kayttajatulostus}" var="kayttajatulostus">
						<c:out value="${kayttajatulostus.kayttajatunnus }" />
					</c:forEach>

						<h2>Kirjatut tunnit</h2>
						<table class="table table-striped">
							<tr>
								<th>Tuntien määrä</th>
								<th>Käyttäjä</th>
								<th>Kuvaus</th>
								<th>Päivämäärä</th>
								<th>Poista</th>

							</tr>
							<c:forEach items="${tulostus}" var="tulostus">
								<tr>
									<td><c:out value="${tulostus.tuntiMaara }" /></td>
									<td><c:out value="${tulostus.kayttajatunnus }" /></td>
									<td><c:out value="${tulostus.kuvaus }" /></td>
									<td><c:out value="${tulostus.pvm }" /></td>
									<td><form:form action="poista" modelAttribute="poista" method="post">
											<input id="poistoId" name="poistoId" type="hidden" value="${tulostus.tuntiId}" />
											<button type="submit">Poista</button>
									</form:form></td>
								</tr>

							</c:forEach>
						</table>
				</form>
							
</body>
</html>