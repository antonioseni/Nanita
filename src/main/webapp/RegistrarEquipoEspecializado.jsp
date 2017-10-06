<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrar Equipo Especializado</title>
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
			<h1>Registrar Equipo Especializado</h1>
				<form name = "formulario registro" action="AnadirEquipoEspecializado" method="post">
					<div class="field half first">
						<label for="codigo">Codigo del activo y(o) equipo especializado</label>
						<input type="text" name="identificador" id="identificador" value="" placeholder="identificador" />
					</div>
					<div class="field half">
						<label for="descripcion">Descripcion del equipo  especializado</label>
						<input type="text" name="descripcion" id="descripcion" value="" placeholder="descripcion" />
					</div>
					<div class="field half">
						<label for="cantidad">Sala de Reunion</label>
						<input type="text" name="salaDeReunion" id="salaDeReunion" value="" placeholder="salaDeReunion" />
					</div>
					<ul class="actions">
						<li><input type="submit" value="Registrar Equipo Especializado" class="special"/></li>
					</ul>
				</form>
			</header>
	</div>
</body>
</html>