<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrar Encargado</title>
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
				<h1>Registrar Encargado</h1>
					<form name = "formulario registro" action="RegistrarEncargado" method="post">
						<div class="field half first">
							<label for="nombreEncargado">Nombre: </label>
							<input type="text" name="nombreEncargado" id="nombreEncargado" value="" placeholder="Ingrese un nombre" />
						</div>
						<div class="field half">
							<label for="fechaNacimiento">Fecha Nacimiento: </label>
							<input type="text" name="fechaNacimiento" id="fechaNacimiento" value="" placeholder="2017.10.06" />
						 class="field half first">
							<label for="email">Correo Electrónico: </label>
							<input type="text" name="email" id="email" value="" placeholder="usuario@dominio.com" />
						</div>
						<div class="field half first">
							<label for="descripcionEncargado">Descripción encargado: </label>
							<input type="text" name="descripcionEncargado" id="descripcionEncargado" value="" placeholder="Director de carrera de..." />
						</div>
						<ul class="actions">
							<li><input type="submit" value="Calificar" class="special"/></li>
						</ul>
					</form>
				</header>
		</div>
</body>
</html>