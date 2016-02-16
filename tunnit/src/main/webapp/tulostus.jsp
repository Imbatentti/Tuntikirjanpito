<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="fi">
<head>
<meta name="description" content="Tulostussivu">
<meta name="author" content="Team Blue / Softala 1">
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<link href="css/tyyli.css" rel="stylesheet">
<title>Tuntien n‰yttˆ</title>
<style>
table, td, th {
	border: 1px solid black;
}
</style>
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
						<li><a href="lomake.jsp">Tuntien kirjaus</a></li>
						<li class="active"><a href="TulostusServlet.java">N‰yt‰
								tunnit</a></li>
						<li><a href="#">Lis‰‰ jotain</a></li>
					</ul>
				</div>
				<!--/.nav-collapse -->
			</div>
			<!--/.container-fluid -->
		</nav>


		<div class="jumbotron">
			<form action="TulostusServlet" method="get">
				<table>
					<tr>
						<td>Tuntien m‰‰r‰</td>
						<td>P‰iv‰m‰‰r‰</td>
						<td>Kuvaus</td>
						<td>K‰ytt‰j‰n ID</td>
					</tr>
					<c:forEach items="${tunnit}" var="tunnit">

						<tr>
							<td><c:out value="${tunnit.tuntimaara }" /></td>
							<td><c:out value="${tunnit.paivamaara }" /></td>
							<td><c:out value="${tunnit.kuvaus }" /></td>
							<td><c:out value="${tunnit.kayttajaid }" /></td>
					</c:forEach>
				</table>
			</form>
		</div>
	</div>
</body>
</html>