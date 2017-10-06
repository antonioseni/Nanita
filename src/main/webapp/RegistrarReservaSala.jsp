<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrar Reserva de Sala</title>
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
			<h1>Registrar Reserva de Sala</h1>
				<form name = "formulario registro" action="AnadirEquipoEspecializado" method="post">
					<div class="field half first">
						<label for="fechaReservacion">Fecha de Reservacion</label>
						<input type="text" name="fechaReservacion" id="fechaReservacion" value="" placeholder="fechaReservacion" />
					</div>
					<div class="field half">
						<label for="cantidadParticipantes">Cantidad de Participantes</label>
						<input type="text" name="cantidadParticipantes" id="cantidadParticipantes" value="" placeholder="cantidadParticipantes" />
					</div>
					<div class="field half">
						<label for="salaDeReunion">Sala de Reunión</label>
						<input type="text" name="salaDeReunion" id="salaDeReunion" value="" placeholder="salaDeReunion" />
					</div>
					<div class="field half">
						<label for="responsableReunion">Responsable de la reunión</label>
						<input type="text" name="responsableReunion" id="responsableReunion" value="" placeholder="responsableReunion" />
					</div>
					<ul class="actions">
						<li><input type="submit" value="Registrar Equipo Especializado" class="special"/></li>
					</ul>
				</form>
			</header>
	</div>
</body>
</html>