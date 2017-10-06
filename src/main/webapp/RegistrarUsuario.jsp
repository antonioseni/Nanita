<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrar Usuario</title>
<LINK REL="StyleSheet" HREF="assets/css/main.css" TYPE="text/css" MEDIA=screen>
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, shrink-to-fit=no, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <!-- Bootstrap Core CSS -->
    <link href="bootstrap.min.css" rel="stylesheet">
    <!-- Custom CSS -->
    <link href="simple-sidebar.css" rel="stylesheet">
    <script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/skel.min.js"></script>
			<script src="assets/js/util.js"></script>
			<script src="assets/js/main.js"></script>
</head>
<body>
	<div id="wrapper">
		<header id="header">
			<h1>Registrar Usuario</h1>
				<form name = "formulario registro" action="AnadirEquipoEspecializado" method="post">
					<div class="field half first">
						<label for="nombreUsuario">Nombre de Usuario</label>
						<input type="text" name="nombreUsuario" id="nombreUsuario" value="" placeholder="nombreUsuario" />
					</div>
					<div class="field half">
						<label for="telefono">Teléfono</label>
						<input type="text" name="telefono" id="telefono" value="" placeholder="telefono" />
					</div>
					<div class="field half">
						<label for="rol">Rol</label>
						<input type="text" name="rol" id="rol" value="" placeholder="rol" />
					</div>
					<div class="field half">
						<label for="fechaNacimiento">Fecha de Nacimiento</label>
						<input type="text" name="fechaNacimiento" id="fechaNacimiento" value="" placeholder="fechaNacimiento" />
					</div>
					<div class="field half">
						<label for="email">Email</label>
						<input type="text" name="email" id="email" value="" placeholder="email" />
					</div>
					<div class="field half">
						<label for="entidad">Entidad</label>
						<input type="text" name="entidad" id="entidad" value="" placeholder="entidad" />
					</div>
					<ul class="actions">
						<li><input type="submit" value="Registrar Usuario" class="special"/></li>
					</ul>
				</form>
			</header>
	</div>
</body>
</html>