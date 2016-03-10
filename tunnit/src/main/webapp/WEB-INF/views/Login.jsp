<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="fi">
<head>
<meta name="description" content="Kirjautumissivu">
<meta name="author" content="Team Blue / Softala 1">
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<link href="css/login.css" rel="stylesheet">

<title>kirjautuminen</title>
</head>

  <body>

    <div class="container">
      <form class="form-signin">
        <h2 class="form-signin-heading">Kirjaudu sisään tunnuksillasi</h2>
        <label for="inputEmail" class="sr-only">Käyttäjätunnus</label>
        <input type="email" id="inputEmail" class="form-control" placeholder="Käyttäjätunnus" required autofocus>
        <label for="inputPassword" class="sr-only">Salasana</label>
        <input type="password" id="inputPassword" class="form-control" placeholder="Salasana" required>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> Muista kirjautumiseni
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Kirjaudu</button>
      </form>
    </div> <!-- /container -->
  </body>
</html>