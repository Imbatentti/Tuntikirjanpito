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
  	<link href="css/tyyli.css" rel="stylesheet">
	<title>Tuntien syöttö lomake</title>
</head>

	<body>
	
	<div class="container">
      <nav class="navbar navbar-default">
        <div class="container-fluid">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Tuntikirjanpito</a>
          </div>
          <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
              <li class="active"><a href="lomake.jsp">Tuntien kirjaus</a></li>
              <li><a href="TulostusServlet">Näytä tunnit</a></li>
              <li><a href="#">Lisää jotain</a></li>
          </div><!--/.nav-collapse -->
        </div><!--/.container-fluid -->
      </nav>
	  
	  

      <div class="jumbotron">
       
			<form action="KayttajaServlet" method="post" name="tunnit">
			<input type="hidden" name="action" value="tunnit"/>
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
					
					<button type="submit" class="btn btn-primary">Lähetä</button>
				</p>
				
			</form>
      </div>
		

		</div>
		
	</body>
	
</html>