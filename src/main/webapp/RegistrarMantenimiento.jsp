<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
			<h1>Registrar Mantenimiento de Sala de Reunión,</h1>
				<form name = "formulario registro" action="AnadirEquipoEspecializado" method="post">
					<div class="field half first">
						<label for="fechaInicio">Fecha de Inicio</label>
						<input type="fechaInicio" name="fechaInicio" id="fechaInicio" value="" placeholder="fechaInicio" />
					</div>
					<div class="field half">
						<label for="fechaFinalizacion"> Fecha de finalización</label>
						<input type="text" name="fechaFinalizacion" id="fechaFinalizacion" value="" placeholder="fechaFinalizacion" />
					</div>
					<div class="field half">
						<label for="descripcion">Tipo de Mantenimiento de la Sala de Reunión</label>
						<label class="radio-inline"><input type="radio" name="optradio">Preventivo</label>
						<label class="radio-inline"><input type="radio" name="optradio">Correctivo</label>
					</div>
					<div class="field half">
						<label for="horasInvertidas">Cantidad de horas invertidas</label>
						<input type="text" name="horasInvertidas" id="horasInvertidas" value="" placeholder="horasInvertidas" />
					</div>
					<div class="field half">
						<label for="presupuestoPorHora">Costo pot hora</label>
						<input type="text" name="presupuestoPorHora" id="presupuestoPorHora" value="" placeholder="presupuestoPorHora" />
					</div>
					<div class="field half">
						<label for="presupuestoTotal">Presupuesto Total</label>
						<input type="text" name="presupuestoTotal" id="presupuestoTotal" value="" placeholder="presupuestoTotal" />
					</div>
					<ul class="actions">
						<li><input type="submit" value="Registrar Mantenimiento de la Sala de Reunión" class="special"/></li>
					</ul>
				</form>
			</header>
	</div>
</body>
</html>
