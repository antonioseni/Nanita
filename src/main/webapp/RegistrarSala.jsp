<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar Salas de Reunión</title>
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
				<h1>Registrar nueva sala de reunión</h1>
					<form name = "formulario registro" action="RegistrarSala" method="post">
						<div class="field half first">
							<label for="codigo">Código: </label>
							<input type="text" name="identificador" id="identificador" value="" placeholder="" />
						</div>
						<div class="field half">
							<label for="nombre">Nombre de la sala: </label>
							<input type="text" name="nombre" id="nombre" value="" placeholder=" " />
						 <div class="field half first">
							<label for="descripcion">Descripción de la sala: </label>
							<input type="text" name="descripcion" id="descripcion" value="" placeholder=" " />
						</div>
						<div class="field half first">
							<label for="capacidad">Capacidad: </label>
							<input type="text" name="capacidad" id="capacidad" value="" placeholder="1...n" />
						</div>
						<ul class="actions">
							<li><input type="submit" value="Calificar" class="special"/></li>
						</ul>
					</form>
				</header>
		</div>

</body>
</html>