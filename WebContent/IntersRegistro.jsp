<%@page import="com.solucionesenjambre.interapp.fs.dto.VwTeams"%>
<%@page import="java.util.List"%>
<%@page import="com.solucionesenjambre.interapp.tier.VwTeamsTier"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
	<head>
		<title>IS | Registro de Jugadores</title>
		<link rel="stylesheet" href="aaaCssGeneralInterWebApp.css">
	</head>
	<body>
		<!--Titulo-->
		<h1 class="Titulo">Registro de Jugadores</h1>
		<form action="Registro.jsp" method="post">
		<%@page import="java.sql.*" %>
		<%
			HttpSession sesion = request.getSession();
			String eId = sesion.getAttribute("eid").toString();
			int eventId = Integer.parseInt(eId);
			
			String equipo = null;
			int equipoId;
			int equipoIdLocal;
			String equipoIdPost;
			
			VwTeamsTier vwTeamsTier = new VwTeamsTier();
			List<VwTeams> vwTeams = null;
			
			equipoIdPost = request.getParameter("equipoId") == null ? "0" : request.getParameter("equipoId");
			equipoIdLocal = Integer.parseInt(equipoIdPost);
			
			try
			{				
				vwTeams = vwTeamsTier.getByEvent(eventId);
				
				//<!--delegacion-->
				out.println("	<select  type=\"text\" id=\"equipo\" name=\"equipo\" placeholder=\"EQUIPO\" style=\"position: absolute; width: 30%;height: 10%;left: 51%;top: 28%;\"><option selected>EQUIPO</option>");
				for(VwTeams vwTeam : vwTeams)
				{
					equipo = vwTeam.getTeamName(); 
					equipoId = vwTeam.getTeamId();
					if(equipoIdLocal == equipoId)
						out.println("		<option selected value=\"" + equipoId + "\">" + equipo + "</option>");
					else
						out.println("		<option value=\"" + equipoId + "\">" + equipo + "</option>");
				}
				
				out.println("	</select>");
		
			}
			finally{}	
		%>
		
	
		
		<!--Nombres-->
		<input type="text" id="nombres" name="nombres" placeholder="NOMBRES" style="position: absolute; width: 25%;height: 8%;left: 18%;top: 20%; font-size: 2em;">
	
		<!--PRIMER APELLIDO-->
		<input class="General" type="text" id="PrimerApellido" name= "PrimerApellido" placeholder="PRIMER APELLIDO" style="position: absolute; width: 25%;height: 8%;left: 18%;top: 38%; font-size: 2em;">
	
		<!--Segundo APELLIDO-->
		<input class="General" type="text" id="SegundoApellido" name="SegundoApellido" placeholder="SEGUNDO APELLIDO" style="position: absolute; width: 25%;height: 8%;left:18%;top: 56%; font-size: 2em;">
	
		<!--numero-->
		<input class="General" type="text" id="numero" name="numero" placeholder="NUMERO" style="position: absolute; width: 25%;height: 8%;left: 18%;top: 74%; font-size: 2em;">
	
		<!--Boton-->
		<button class="General" type="submit" style="position: absolute;width: 15%; height: 9%;left: 58%; top: 50%;">Registrar</button>
	
	</form>
		
	</body>
</html>