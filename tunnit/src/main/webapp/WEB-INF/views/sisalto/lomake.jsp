<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ page session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

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
						<li class="active"><a href="uusitunti">Tuntien kirjaus</a></li>
						<li><a href="../nayta/tulostus">Näytä tunnit</a></li>
						<li><a href="<c:url value="/logout" />">Logout</a></li>
						<strong>
							<li>
								<sec:authentication property="principal.username" />
							</li>
						</strong>
					</ul>
				</div>
				<!--/.nav-collapse -->
			</div>
			<!--/.container-fluid -->
		</nav>


		<div class="jumbotron">

			<!--/.container-fluid -->



			<form:form modelAttribute="tunnit" method="post">
				<fieldset>
					<legend>
						Hei
						<sec:authentication property="principal.username" />
						!
					</legend>
					<legend>Syötä tunnit</legend>
					<p>
						<form:label path="nimi">Nimi</form:label>
						<br />
						<form:input path="nimi" />
					</p>
					<p>
						<form:label path="tunnit">Tunnit</form:label>
						<br />
						<form:input path="tunnit" />
					</p>
					<p>
						<form:label path="kuvausVali">Kuvaus</form:label>
						<br />
						<form:input path="kuvausVali" />
					</p>
					<p>
						<button type="submit">Lisää</button>
					</p>
				</fieldset>
			</form:form>

		</div>
	</div>
</body>
</html>