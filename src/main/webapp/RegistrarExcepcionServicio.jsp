<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrar Excepción de Servicio</title>
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
			<h1>Registrar Excepción de Servicio</h1>
				<form name = "formulario registro" action="RegistrarExcepcionServicio" method="post">
					<div class="field half first">
						<label for="fechaInicio">Fecha de Inicio</label>
						<input type="text" name="fechaInicio" id="fechaInicio" value="" placeholder="fechaInicio" />
					</div>
					<div class="field half">
						<label for="fechaFinalizacion">Fecha de Finalización</label>
						<input type="text" name="fechaFinalizacion" id="fechaFinalizacion" value="" placeholder="fechaFinalizacion" />
					</div>
					<div class="field half">
						<label for="horaInicio">Hora de Inicio</label>
						<input type="text" name="horaInicio" id="horaInicio" value="" placeholder="horaInicio" />
					</div>
					<div class="field half">
						<label for="horaFin">Hora de Finalización</label>
						<input type="text" name="horaFin" id="horaFin" value="" placeholder="horaFin" />
					</div>
					<div class="field half">
						<label for="comentario">Comentario</label>
						<input type="text" name="comentario" id="comentario" value="" placeholder="comentario" />
					</div>
					<ul class="actions">
						<li><input type="submit" value="Registrar Excepcion de Servicio" class="special"/></li>
					</ul>
				</form>
			</header>
	</div>
</body>
</html>