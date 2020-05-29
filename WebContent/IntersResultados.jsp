<%@page import="java.sql.*"%>

<% //@ include file="Database.jsp" %>
<%
final boolean DEBUG = false;
	
	String Futbol		= "Futbol.jsp";
	String Basquetbol	= "Basquetbol.jsp";
	String Porristas	= "Porristas.jsp";
	String Voleibol		= "Voleibol.jsp";
%>
<!DOCTYPE html>
<html>
<head>
	<title>IS | Resultados</title>
	<link rel="stylesheet" href="aaaCssGeneralInterWebApp.css">
</head>
<body>

<h1 class="Titulo">Resultados</h1>


	<a href="<% out.println(Futbol); %>">
		<button class="botonHome" style=" position: absolute; top:20%; left: 31%; width: 35%; ">
			<b>Futbol</b>
		</button>
	</a>

	<a href="<% out.println(Basquetbol); %>">
		<button class="botonHome" style="position: absolute; top:40%; left: 31%; width: 35%;">
			<b>Basquetbol</b>
		</button>
	</a>

	<a href="<% out.println(Voleibol); %>">
		<button class="botonHome" style="position: absolute; top: 60%; left: 31%; width: 35%;">
			<b>Voleibol</b>
		</button>
	</a>

	<a href="<% out.println(Porristas); %>">
		<button class="botonHome" style="position: absolute; top: 80%; left: 31%; width: 35%;">
			<b>Porristas</b>
		</button>
	</a>
 
</body>
</html>