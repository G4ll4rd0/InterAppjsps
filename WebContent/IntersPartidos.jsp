<%@page import="com.solucionesenjambre.interapp.fs.dto.Rounds"%>
<%@page import="com.solucionesenjambre.interapp.tier.RoundsTier"%>
<%@page import="com.solucionesenjambre.interapp.fs.dto.Courts"%>
<%@page import="com.solucionesenjambre.interapp.tier.CourtsTier"%>
<%@page import="com.solucionesenjambre.interapp.fs.dto.Events"%>
<%@page import="com.solucionesenjambre.interapp.tier.EventsTier"%>
<%@page import="com.solucionesenjambre.interapp.fs.dto.Branches"%>
<%@page import="com.solucionesenjambre.interapp.tier.BranchesTier"%>
<%@page import="com.solucionesenjambre.interapp.fs.dto.VwSchools"%>
<%@page import="com.solucionesenjambre.interapp.fs.dto.VwSports"%>
<%@page import="com.solucionesenjambre.interapp.tier.VwSchoolsTier"%>
<%@page import="com.solucionesenjambre.interapp.tier.VwSportsTier"%>
<%@page import="com.solucionesenjambre.interapp.fs.dto.Schools"%>
<%@page import="com.solucionesenjambre.interapp.tier.SchoolsTier"%>
<%@page import="com.solucionesenjambre.interapp.fs.dto.Sports"%>
<%@page import="java.util.List"%>
<%@page import="com.solucionesenjambre.interapp.tier.SportsTier"%>
<%@page import="com.solucionesenjambre.interapp.fs.jdbc.ResourceManager"%>
<%@page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>
	<head>
		<title>IS | Registro de Partidos</title>
		<link rel="stylesheet" href="aaaCssGeneralInterWebApp.css">
	</head>
	<body style="margin: 0; padding: 0;">
		<h1 class="Titulo">Registro de Partidos.</h1>
		<form action="Partidos.jsp" method="post">
		<% 
		
			HttpSession sesion = request.getSession();
			String eId = sesion.getAttribute("eid").toString();
			int eventId = Integer.parseInt(eId);
		
			VwSportsTier vwSportsTier = new VwSportsTier(); 
			List<VwSports> sports = null;
			
			VwSchoolsTier vwSchoolsTier = new VwSchoolsTier();
			List<VwSchools> schools = null;
			
			BranchesTier branchesTier = new BranchesTier();
			List<Branches> branches = null;
			
			EventsTier eventsTier = new EventsTier();
			Events events = null;
			
			CourtsTier courtsTier = new CourtsTier();
			List<Courts> courts = null;
			
			RoundsTier roundsTier = new RoundsTier();
			List<Rounds> rounds = null;
		
			String name = null;
			int value = 0;
			
			try
			{				
				sports = vwSportsTier.getByEvent(eventId);
				branches = branchesTier.all();
				courts = courtsTier.all();		
				schools = vwSchoolsTier.getByEvent(eventId);
				events = eventsTier.get(eventId);
				rounds = roundsTier.all();
				
				out.println("<select style=\"position: absolute; top: 25%; left: 15%; height: 8%;\" id=\"disciplina\" name=\"disciplina\">	<option selected>--Selecciona un deporte--</option>");
				for(VwSports sport : sports){
					name = sport.getDescription();
					value = sport.getSportId();
					out.println("<option value=\""+ value +"\">"+name+"</option>");
				} out.println("</select>");
				
				out.println("<select style=\"position: absolute; top: 25%; left: 40%; height: 8%;\" id=\"rama\" name=\"rama\">	<option selected>--Selecciona una rama--</option>");
				for(Branches branch : branches){
					name = branch.getDescription();
					value = branch.getBranchId();
					out.println("<option value=\"" + value + "\">" + name + "</option>");
				} out.println("</select>");
				
				out.println("<select style=\"position: absolute; top: 49%; left: 15%; height: 8%;\" id=\"cancha\" name=\"cancha\"> <option selected>--Selecciona una cancha--</option>");
				for(Courts court : courts){
					name = court.getDescription();
					value = court.getCourtId();
					out.println("<option value=\"" + value + "\">" + name + "</option>");
				} out.println("</select>");
				
				out.println("<select style=\"position: absolute; top: 70%; left: 27%; height: 8%;\" id=\"local\" name=\"local\"> <option selected>--Selecciona un equipo--</option>");
				for(VwSchools school : schools){
					name = school.getDescription();
					value = school.getSchoolId();
					out.println("<option value=\"" + value + "\">" + name + "</option>");
				} out.println("</select>");
				
				out.println("<select style=\"position: absolute; top: 70%; left: 55%; height: 8%;\" id=\"visitante\" name=\"visitante\">	<option selected>--Selecciona un equipo--</option>");
				for(VwSchools school : schools){
					name = school.getDescription();
					value = school.getSchoolId();
					out.println("<option value=\"" + value + "\">" + name + "</option>");
				} out.println("</select>");
				
				out.println("<select style=\"position: absolute; top: 25%; left: 65%; height: 8%;\" id=\"seccion\" name=\"seccion\">		<option selected>--Selecciona un evento--</option>");
				{
					name = events.getEventName();
					value = events.getEventId();
					out.println("<option selected value=\"" + value + "\">" + name + "</option>");
				} out.println("</select>");
				
				out.println("<select style=\"position: absolute; top: 70%; left: 2.5%; height: 8%;\" id=\"ronda\" name=\"ronda\">		<option selected>--Selecciona una Ronda--</option>");
				for(Rounds round : rounds){
					name = round.getDescription();
					value = round.getRoundId();
					out.println("<option value=\"" + value + "\">" + name + "</option>");
				} out.println("</select>");
			}
			finally {}
		%>
		
		<!--Disciplina-->
			<h2 class="subtitulos" style="position: absolute; top: 15%; left: 15%;"><b></b>Disciplina</h2>
		
		<!--Rama-->
			<h2 class="subtitulos" style="position: absolute; top: 15%; left: 40%;;"><b>Rama</b></h2>
			
		<!--Seccion-->
			<h2 class="subtitulos" style="position: absolute; top: 15%; left: 65%;"><b>Seccion</b></h2>
			
		<!--Cancha-->
			<h2 class="subtitulos" style="position: absolute; top: 38.5%; left: 15%;"><b>Cancha</b></h2>
			
			<!--Parsear la hora o introducir opciones-->
		
		<!--Dia-->
			<h2 class="subtitulos" style="position: absolute; top: 40%; left: 46%;"><b>Dia</b></h2>
			
			<input class="InputGeneral" placeholder="dd" style="position: absolute; top: 49%; left: 44.5%; height: 6%; width: 5.5%; font-size:1em;" id="dia" name = "dia">
			<input class="InputGeneral" placeholder="mm" style="position: absolute; top: 49%; left: 51%; height: 6%; width: 5.5%; font-size:1em;" id="mes" name = "mes">
			<input class="InputGeneral" placeholder="yyyy" style="position: absolute; top: 49%; left: 57.5%; height: 6%; width: 7%; font-size:1em;" id="ano" name = "ano">
		
		<!-- Hora -->
			
			<h2 class="subtitulos" style="position: absolute; top: 40%; left: 70%;"><b>Hora (24 hrs)</b></h2>
			<input placeholder="hh" style="position: absolute; top: 49%; left: 70.8%; height: 6%; width: 5.5%; font-size:1em;" id="hora" name = "hora">
			<h2 class="subtitulos1" style="position: absolute; top: 46%; left: 77.2%;"><b>:</b></h2>
			<input placeholder="mm" style="position: absolute; top: 49%; left: 78.2%; height: 6%; width: 5.5%; font-size:1em;" id="minutos" name = "minutos">
		
		<!--Contrincantes-->
		<!--Local-->
			<h2 class="subtitulos" style="position: absolute; top: 60%; left: 35%;"><b>Local</b></h2>	
		<!--Visitante-->
			<h2 class="subtitulos" style="position: absolute; top: 60%; left: 57%;"><b>Visitante</b></h2>
		<!--Versus-->
			<h2 class="subtitulos" style="position: absolute; top: 69%; left: 51%;"><b>VS</b></h2>
		
		<!--Ronda-->
			<h2 class="subtitulos" style="position: absolute; top: 60%; left: 5%;"><b>Ronda</b></h2>
		
		<!--Button-->
			<button type="submit" style="position: absolute;width: 15%; height: 9%;left: 43%; top: 85%;">Registrar</button>
		
		</form>
	</body>
</html>