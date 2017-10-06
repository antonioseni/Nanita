<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calificar una sala</title>
	<LINK REL="StyleSheet" HREF="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" TYPE="text/css" MEDIA=screen>
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, shrink-to-fit=no, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- Bootstrap Core CSS -->
    <link href="bootstrap.min.css" rel="stylesheet">
    <!-- Custom CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"></script>
			<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"></script>
			<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"></script>
			<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"></script>
</head>
<body>
	<div id="wrapper">
			<header id="header">
				<h1>Calificar una sala</h1>
					<form name = "formulario registro" action="CalificarSala" method="post">
						<div class="field half first">
							<label for="comentario">Comentario: </label>
							<input type="text" name="comentario" id="comentario" value="" placeholder="Me parece..." />
						</div>
						<div class="field half">
							<label for="calificacion">Calificación: </label>
							<input type="text" name="calificacion" id="calificacion" value="" placeholder="1...5" />
						</div>
						<div class="field half first">
							<label for="sala">Identificador de la sala: </label>
							<input type="text" name="sala" id="sala" value="" placeholder="B7-01" />
						</div>
						<ul class="actions">
							<li><input type="submit" value="Calificar" class="special"/></li>
						</ul>
					</form>
				</header>
		</div>
</body>
</html>