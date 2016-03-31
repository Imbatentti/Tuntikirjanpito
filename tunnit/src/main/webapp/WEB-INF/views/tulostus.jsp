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
					<a class="navbar-brand" href="#">Tuntikirjanpito</a>
				</div>
				<div id="navbar" class="navbar-collapse collapse">
					<ul class="nav navbar-nav">
						<li><a href="../hallitse/uusitunti">Tuntien kirjaus</a></li>
						<li class="active"><a href="TulostusServlet.java">Näytä
								tunnit</a></li>
						<li><a href="#">Lisää jotain</a></li>
					</ul>
				</div>
				<!--/.nav-collapse -->
			</div>
			<!--/.container-fluid -->
		</nav>


		<div class="jumbotron">
			<form action="TulostusServlet" method="get">
				<h2>Kirjatut tunnit</h2>
				<table class="table table-striped">
					<tr>
						<th>Tuntien määrä</th>
						<th>Tunti ID</th>
						<th>Kuvaus</th>
						<th>Käyttäjän ID</th>
						<th>Päivämäärä</th>
						<th>Poista</th>
					</tr>
					<c:forEach items="${tulostus}" var="tulostus">
						<tr>
							<td><c:out value="${tulostus.tuntiMaara }" /></td>
							<td><c:out value="${tulostus.tuntiId }" /></td>
							<td><c:out value="${tulostus.kuvaus }" /></td>
							<td><c:out value="${tulostus.kayttajaId }" /></td>
							<td><c:out value="${tulostus.pvm }" /></td>
							<td>
								<a href="<c:url var="deleteUrl" value="poisto"/>">Poista</a>
								<form id="${formId }" action="${deleteUrl}" method="post">
									<input id="poistettava" name="poistettava" 
									type="hidden" value="${tulostus.tuntiId }"/>
								</form>
						</tr>
					</c:forEach>
				</table>
			</form>
		</div>
	</div>
</body>
</html>