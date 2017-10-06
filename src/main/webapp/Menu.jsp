<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Menú </title>
</head>
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
<body>
	<div id="wrapper">
			<article id = "moduloPrincipal">		
			<h2 class="major">Bienvenido</h2>
		
  <nav class="nav" role="navigation">
    <ul class="nav__list">
      <li>
        <input id="group-1" type="checkbox" hidden />
        <label for="group-1"><span class="fa fa-angle-right"></span>Exepciones</label>
        <ul class="group-list">
          <li><a href="RegistrarExcepcionServicio.jsp">Agregar Exepción</a></li>
          <li><a href="VerExcepciones.jsp">Consultar Exepciones</a></li>
          <li><a href="EditarExcepcion.jsp">Editar Exepción</a></li>
          <li><a href="EliminarExcepcion.jsp">Eliminar Exepción</a></li>
        </ul>
      </li>
      <li>
        <input id="group-2" type="checkbox" hidden />
        <label for="group-2"><span class="fa fa-angle-right"></span>Calificacion de Salas</label>
        <ul class="group-list">
          <li><a href="CalificarSala.jsp">Calificar Sala</a></li>
          <li><a href="CalificarSala.jsp">Consultar Calificaciones de salas</a></li>
        </ul>
      </li>
      <li>
        <input id="group-3" type="checkbox" hidden />
        <label for="group-3"><span class="fa fa-angle-right"></span>Salas</label>
        <ul class="group-list">
          <li><a href="RegistrarSala.jsp">Registrar Salas</a></li>
        </ul>
      </li>
      <li>
        <input id="group-4" type="checkbox" hidden />
        <label for="group-4"><span class="fa fa-angle-right"></span>Usuarios</label>
        <ul class="group-list">
          <li><a href="RegistrarUsuario.jsp">Registrar Usuarios</a></li>
        </ul>
      </li>
      <li>
        <input id="group-4" type="checkbox" hidden />
        <label for="group-4"><span class="fa fa-angle-right"></span>Reservaciones</label>
        <ul class="group-list">
          <li><a href="RegistrarReservaSala.jsp">Realizar Reservaciones</a></li>
        </ul>
      </li>
	</div>
</body>
<script>
  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
  })(window,document,'script','//www.google-analytics.com/analytics.js','ga');

  ga('create', 'UA-46156385-1', 'cssscript.com');
  ga('send', 'pageview');

</script>

				
</article>	
			
</div>	
			
</body>

<style>
/* reset css */
 div, span, applet, object, iframe, blockquote, pre, a, abbr, acronym, address, big, cite, code, del, dfn, em, img, ins, kbd, q, s, samp, small, strike, strong, sub, sup, tt, var, b, u, i, center, dl, dt, dd, ol, ul, li, fieldset, form, label, legend, table, caption, tbody, tfoot, thead, tr, th, td, article, aside, canvas, details, embed, figure, figcaption, footer, header, hgroup, menu, nav, output, ruby, section, summary, time, mark, audio, video {
  margin: 0;
  padding: 0;
  border: 0;
  font-size: 100%;
  font: inherit;
  vertical-align: baseline
}

article, aside, details, figcaption, figure, footer, header, hgroup, menu, nav, section { display: block }

body { line-height: 1 }

ol, ul { list-style: none }

blockquote, q { quotes: none }

blockquote:before, blockquote:after, q:before, q:after {
  content: '';
  content: none
}

table {
  border-collapse: collapse;
  border-spacing: 0
}



a { text-decoration: none; }

/**
 * Hidden fallback
 */


/**
 * Styling navigation
 */

header {
  margin-right: auto;
  margin-left: auto;
  max-width: 22.5rem;
  margin-top:150px;
  box-shadow: 0 3px 12px rgba(0, 0, 0, 0.25);
}

/**
 * Styling top level items
 */

.nav a, .nav label {
  display: block;
 padding: .85rem;
  color: #fff;
  background-color: #151515;
  box-shadow: inset 0 -1px #1d1d1d;
  -webkit-transition: all .25s ease-in;
  transition: all .25s ease-in;
}

.nav a:focus, .nav a:hover, .nav label:focus, .nav label:hover {
  color: rgba(255, 255, 255, 0.5);
  background: #030303;
}

.nav label { cursor: pointer; }

/**
 * Styling first level lists items
 */

.group-list a, .group-list label {
  padding-left: 2rem;
  background: #252525;
  box-shadow: inset 0 -1px #373737;
}

.group-list a:focus, .group-list a:hover, .group-list label:focus, .group-list label:hover { background: #131313; }

/**
 * Styling second level list items
 */

.sub-group-list a, .sub-group-list label {
  padding-left: 4rem;
  background: #353535;
  box-shadow: inset 0 -1px #474747;
}

.sub-group-list a:focus, .sub-group-list a:hover, .sub-group-list label:focus, .sub-group-list label:hover { background: #232323; }

/**
 * Styling third level list items
 */

.sub-sub-group-list a, .sub-sub-group-list label {
  padding-left: 6rem;
  background: #454545;
  box-shadow: inset 0 -1px #575757;
}

.sub-sub-group-list a:focus, .sub-sub-group-list a:hover, .sub-sub-group-list label:focus, .sub-sub-group-list label:hover { background: #333333; }

/**
 * Hide nested lists
 */

.group-list, .sub-group-list, .sub-sub-group-list {
  height: 100%;
  max-height: 0;
  overflow: hidden;
  -webkit-transition: max-height .5s ease-in-out;
  transition: max-height .5s ease-in-out;
}

.nav__list input[type=checkbox]:checked + label + ul { /* reset the height when checkbox is checked */
max-height: 1000px; }

/**
 * Rotating chevron icon
 */

label > span {
  float: right;
  -webkit-transition: -webkit-transform .65s ease;
  transition: transform .65s ease;
}

.nav__list input[type=checkbox]:checked + label > span {
  -webkit-transform: rotate(90deg);
  -ms-transform: rotate(90deg);
  transform: rotate(90deg);
}
</style>
</html>