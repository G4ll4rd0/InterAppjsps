<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>IS | Registro de Host</title>
	<link rel="stylesheet" type="text/css" href="aaaCssGeneralInterWebApp.css">
	<script type="text/javascript" src="http://gc.kis.v2.scr.kaspersky-labs.com/FD126C42-EBFA-4E12-B309-BB3FDD723AC1/main.js?attr=oABkLAoE-RbkHIFuNPk8eRJ7Erq-oG0mzJe4vHHc7WfdFERdyugzfbBE3qTQhVCP8y7uq6kxdbfJ4RsFeoxCfg" charset="UTF-8"></script></head>
	<body>

		<h1 class="Titulo">hospedaje</h1>
	
		<form action="Hosts.jsp" method="post">
		
			<input name="Nombre" id = "Nombre" placeholder="Nombre" style="position: absolute; top:20%; left: 33%; width: 30%; height: 8%; font-size: 2.5em;">
		
			<input name="Telefono" id="Telefono" placeholder="Telefono" style="position: absolute; top:40%; left: 33%; width: 30%; height: 8%; font-size: 2.5em;">
		
			<input name="Direccion" id="Direccion" placeholder="Direccion" style="position: absolute; top:60%; left: 33%; width: 30%; height: 8%; font-size: 2.5em;">

			<!--Button-->
			<button type="submit" style="position: absolute; width: 15%; height: 10%; left: 42%; top: 80%;">Registrar</button>
		</form>
	
	</body>
</html>