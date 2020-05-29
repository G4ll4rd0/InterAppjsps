<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>IS | Noticias</title>
		<link rel="stylesheet" type="text/css" href="aaaCssGeneralInterWebApp.css">
	</head>
	<body>
		<h1 class="Titulo">NOTICIAS</h1>
		<form action="news.jsp" method="post">
			<input style="position: absolute; top:25%; left:25%; width: 20%; height: 7%; font-size: 1.5em;" name="Titulo" id = "Titulo" placeholder="Titulo de la noticia">
			<input style="position: absolute; top:40%; left:25%; width: 20%; height: 7%; font-size: 1.5em;" name="img" id = "img" placeholder="Nombre de la imagen">
			<input style="position: absolute; top:55%; left:25%; width: 20%; height: 7%; font-size: 1.5em;" name="eid" id = "eid" placeholder="Codigo de Evento">
			<input style="position: absolute; top:25%; left:55%; width: 20%; height: 40%; font-size: 1.5em;" name="desc" id = "desc" placeholder="Descripcion Larga">
			<button style="position: absolute; top:80%; left:65%;" type="submit">Registrar</button>
		</form>
	</body>
</html>