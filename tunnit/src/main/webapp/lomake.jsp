<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="fi">
<head>
    <meta name="description" content="Tuntien syöttö lomake">
    <meta name="author" content="Team Blue / Softala 1">
	<meta charset="utf-8">
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  	<link href="/css/tyyli.css" rel="stylesheet">
	<title>Tuntien syöttö lomake</title>
</head>

	<body>
	
		<div class="container">
		
			<form action="tunnit" method="post">
			
				<h2>Syötä tiedot:</h2>
				
				<p>
					<input type="text" name="nimi" placeholder="Nimi"/>
				</p>
				<p>
					<input type="text" name="tunnit" placeholder="Tunnit"/>
				</p>
				<p>
					<input type="text" name="kuvaus" placeholder="Kuvaus"/>
				</p>
				<p>
					<button type="button" class="btn btn-primary" type="submit">Lähetä</button>
				</p>
				
			</form>

		</div>
		
	</body>
	
</html>