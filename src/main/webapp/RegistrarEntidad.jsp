<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrar Entidad</title>
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
				<h1>Registro entidad</h1>
					<form name = "formulario registro" action="ControladorAgregarEntidad" method="post">
						<div class="field half first">
							<label for="demo-name">Nombre Entidad: </label>
							<input type="text" name="nombreEntidad" id="nombreEntidad" value="" placeholder="Nombre" />
						</div>
						<div class="field half">
							<label for="descripcionEntidad">Descripción de la Entidad: </label>
							<input type="text" name="descripcionEntidad" id="descripcionEntidad" value="" placeholder="Descripción" />
						</div>
						<div class="field half first">
							<label for="tipoEntidad">Tipo entidad: </label>
							<input type="text"	 name="tipoEntidad" id="tipoEntidad" value="" placeholder="Académica-Administrativa" />
						</div>
						<ul class="actions">
							<li><input type="submit" value="Registrar Entidad" class="special"/></li>
						</ul>
						
					</form>
				</header>
		</div>
</body>
</html>