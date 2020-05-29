<%@page import="org.anahuac.garibaldi.fs.jdbc.ResourceManager"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="org.anahuac.garibaldi.fs.dto.Jugadores"%>
<%@page import="org.anahuac.garibaldi.tier.JugadoresTier"%>
<%@page import="org.anahuac.garibaldi.tier.VwPartidosTier"%>
<%@page import="org.anahuac.garibaldi.fs.dto.VwPartidos"%>
<%@page import="org.anahuac.garibaldi.fs.dto.Deporte"%>
<%@page import="org.anahuac.garibaldi.tier.DeportesTier"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>IS | Futbol</title>
	<link rel="stylesheet" type="text/css" href="aaaCssGeneralInterWebApp.css">
	<script>
		function postFunction()
		{  
		  document.getElementById("frmMain").submit();
		}
	</script>
</head>
<body>
<h1 class="Titulo">Resultados de futbol</h1>

<%
	String db 		= "interapp";
	String user 	= "interapp";
	String passwd	= "oH3C7!Jo5PZw5Zfc";
	
	Connection conn = null;
	Statement stmt	= null;
	Statement stmt2	= null;
	String sql		= null;
	String sql2		= null;
	
	String jugId;
	int jugadorId;
	String goles;
	String ta;
	String tr;
	
	try
	{
		conn = ResourceManager.getConnection();
		
		stmt 	= conn.createStatement();
		stmt2 	= conn.createStatement();
	}catch(SQLException e){}
	
	Enumeration<String> parameterNames = request.getParameterNames();
	

	String deporteId = request.getParameter("deporteId") == null ? "0" : request.getParameter("deporteId");
	int depId = Integer.parseInt(deporteId);
	
	String partidoId = request.getParameter("partidoId") == null ? "0" : request.getParameter("partidoId");
	int partId = Integer.parseInt(partidoId);
	
	String ResLocal = request.getParameter("ResLocal") == null ? "0" : request.getParameter("ResLocal");
	int Res1 = Integer.parseInt(ResLocal);
	
	String ResVisita = request.getParameter("ResVisita")== null ? "0" : request.getParameter("ResVisita");
	int Res2 = Integer.parseInt(ResVisita);
	
	sql2 = "UPDATE partido SET Res_E1 = " + Res1 + ", Res_E2 = " + Res2 + ", YaJugado = 1 WHERE partido_id = " + partId;
	
	System.out.println(depId);
	System.out.println(partId);
	System.out.println(sql2);		
	
	while (parameterNames.hasMoreElements())
	{
	
	    String paramName = parameterNames.nextElement();
	
	    String paramValue = request.getParameter(paramName);
		
		//out.write("<br/>Nombre parametro: " + paramName + " valor parametro: " + (paramValue == null ? 0 : paramValue));
		
		if (paramName.indexOf("goles") >= 0)
		{
			jugId = paramName.substring(6);
			
			jugadorId = Integer.parseInt(jugId);
			
			String gol = "goles|" + jugadorId;
			String tas = "ta|" + jugadorId;
			String trs = "tr|" + jugadorId;
			
			goles = request.getParameter(gol.toString()) == null ? null : request.getParameter(gol.toString());
			ta = request.getParameter(tas.toString()) == null ? null : request.getParameter(tas.toString());
			tr = request.getParameter(trs.toString()) == null ? null : request.getParameter(trs.toString());
			
			//System.out.println(gol);
			//System.out.println(goles);
			
			sql = "INSERT INTO estadisticas_jugador (ID_J, partido_id, Goles, Tarjetas_Am, Tarjetas_Ro) VALUES(" + jugadorId + ", " + partId + ", '" + (goles == null ? 0 : goles) + "', " + (ta == null ? 0 : ta) + ", " + (tr == null ? 0 : tr) + ")";
			
			System.out.println(sql);
			
			try{stmt.executeUpdate(sql);}catch(SQLException e){out.println("SQLException caught: " + e.getMessage());}
		}

	}
	
	if(partId !=0 && (request.getParameter("ResLocal") != null  || request.getParameter("ResVisita") != null ))
	{
		System.out.println("Entre");
		try{stmt2.executeUpdate(sql2);}catch(SQLException e){}
		partId = 0;
	}
	
	try{conn.close();}catch(SQLException e){}
%>
	<form action="Futbol.jsp" method="post" name="frmMain" id="frmMain">
	<%
		DeportesTier  tier = new DeportesTier();
		List<Deporte> deportes = tier.browseUnique("Futbol");
		
		out.println("	<select style=\"position: absolute; top:20.5%; left: 5%; height: 10%;\" name=\"deporteId\" id=\"deporteId\" onchange=\"postFunction()\">");
		out.println("		<option value=\"0\" selected>Seleccione una Categoria</option>");
		
		for (Deporte deporte : deportes)
		{
			out.println("		<option " + (depId == deporte.getDeporteId() ? "selected " : "") + "value=\"" + deporte.getDeporteId() + "\">" + deporte.getDescripcion() + "</option>");
		}
		
		out.println("	</select><br/>");
		
		if(depId > 0)
		{
			VwPartidosTier tier2 = new VwPartidosTier();
			List<VwPartidos> partidos = tier2.get(depId);
			
			out.println("	<select style=\"position: absolute; top:32%; left: 5%; height: 10%;\" name=\"partidoId\" id=\"partidoId\" onchange=\"postFunction()\">");
			out.println("		<option value=\"0\" selected>Seleccione un Partido</option>");
			
			for (VwPartidos partido : partidos)
			{
				out.println("		<option " + (partId == partido.getPartidoId() ? "selected " : "") + "value=\"" + partido.getPartidoId() + "\">" + partido.getLocalCodigoDelegacion() + " vs. " + partido.getVisitanteCodigoDelegacion() + "</option>");
			}
			
			out.println("	</select><br/>");
			
			if(partId > 0)
			{
				System.out.println("Este es el partidoId: " + partId);
				VwPartidos[] part = tier2.browse(partId);
				
				for(VwPartidos parti: part)
				{
					out.println("<div style=\" position: absolute; top:17%; left:30%; width: 50%;\">");
					out.println("	<p class=\"subtitulos\">Seccion: " + parti.getDescripcionSeccion() + "</p>");
					out.println("	<br/><br/><p class=\"subtitulos\">Rama: " + parti.getDescripcionRama() + "</p>");
					out.println("	<br/><br/><p class=\"subtitulos\">Fecha: " + parti.getFecha() + "</p>");
					out.println("	<br/><br/><p class=\"subtitulos\">Hora: " + parti.getHora() + "</p>");
					out.println("</div>");
					out.println("	<br/><br/> <p class=\"subtitulos\" style=\"position: absolute; top: 20%; left: 67.55%; width: 10%; \">" + parti.getLocalCodigoDelegacion() + "</p><p class=\"subtitulos\"> </p><p class=\"subtitulos\" style=\"position: absolute; top: 20%; left: 82%; width: 10%; \">" + parti.getVisitanteCodigoDelegacion() + "</p>");

					out.println("<div  class=\"subtitulos\" style=\"position: absolute; top: 30%; left: 60%; width: 40%; height: 15%;\">");
					out.println("	<br/><input class=\"input\" style=\" position: relative; width: 5%; font-size: 1.5em\" name=\"ResLocal\" id=\"ResLocal\"> vs. <input class=\"input\" style=\" position: relative; width: 5%; font-size: 1.5em\" name=\"ResVisita\" id=\"ResVisita\">");
					out.println("</div>");
					
					JugadoresTier tier3 = new JugadoresTier();
					int local = parti.getLocalEquipoId();
					int visita = parti.getVisitanteEquipoId();
					List<Jugadores> jugadores = tier3.team(local);
					List<Jugadores> jugadores2 = tier3.team(visita);
					
					out.println("	<br/><br/><table style=\"position: absolute; width: 85%; top:50%; left: 1%\">");
					out.println("	<tr><td  style=\"width: 5%\"><td/><td style=\"width: 40%\"><table  style=\"width: 40%\"><tr> <th class=\"nombre\" style=\"font-size: 1.5em;\"> Numero </th> <th class=\"nombre\" style=\"font-size: 1.5em;\"> Nombre </th><th class=\"nombre\" style=\"font-size: 1.5em;\"> Goles </th><th class=\"nombre\" style=\"font-size: 1.5em;\"> Tarjeta <br> Amarilla </th><th class=\"nombre\" style=\"font-size: 1.5em;\"> Tarjeta <br> Roja </th></tr>");
					
					int i = 0;
					
					for(Jugadores jugador : jugadores)
					{
						i++;
						int jId = jugador.getJugadoresId();
						String jNombre = jugador.getNombre() + " " + jugador.getPrimerApellido() + " " + jugador.getSegundoApellido();
						
						out.println("<tr><td class=\"nombre\" style=\" position:relative; width: 10%;\">" + jugador.getNumero() + "</td><td class=\"nombre\" style=\"font-size: 1em;\">" + jNombre + "</td><td><input class=\"input\" style=\"width: 50%;\" value = \"0\" name=\"goles|" + jId + "\" id=\"goles|" + jId + "\"></td><td><input class=\"input\" style=\"width: 60%;\" value = \"0\" name=\"ta|" + jId + "\" id=\"ta|" + jId + "\"></td><td><input class=\"input\" style=\"width: 50%;\" value = \"0\" name=\"tr|" + jId + "\" id=\"tr|" + jId + "\"></td></tr>");
					}
					
					out.println("</table></td><td style=\"width:10%\"></td><td style=\"width: 40%\"><table  style=\"width: 40%\"><tr> <th class=\"nombreRojo\" style=\"font-size: 1.5em;\"> Numero </th> <th class=\"nombreRojo\" style=\"font-size: 1.5em;\"> Nombre </th><th class=\"nombreRojo\" style=\"font-size: 1.5em;\"> Goles </th><th class=\"nombreRojo\" style=\"font-size: 1.5em;\"> Tarjetas <br> Amarillas </th><th class=\"nombreRojo\" style=\"font-size: 1.5em;\"> Tarjetas <br> Rojas </th></tr>");
					
					i = 0;
					
					for(Jugadores jugador2 : jugadores2)
					{
						i++;
						int jId = jugador2.getJugadoresId();
						String jNombre = jugador2.getNombre() + " " + jugador2.getPrimerApellido() + " " + jugador2.getSegundoApellido();
						
						out.println("<tr><td class=\"nombreRojo\" style=\"width: 5%;\">" + jugador2.getNumero() + "</td><td class=\"nombreRojo\" style=\"font-size: 1em;\">" + jNombre + "</td><td><input class=\"inputRojo\" style=\"width: 50%;\" value = \"0\" name=\"goles|" + jId + "\" id=\"goles|" + jId + "\"></td><td><input  class=\"inputRojo\" style=\"width: 60%;\" value = \"0\" name=\"ta|" + jId + "\" id=\"ta|" + jId + "\"></td><td><input class=\"inputRojo\" style=\"width: 50%;\" value = \"0\" name=\"tr|" + jId + "\" id=\"tr|" + jId + "\"></td></tr>");
					}
					
					out.println("</table></td><td style=\"width:5%\"></td></tr></table>");
				}
			}
			
		}
	%>
	<!--Button-->
	<button type="submit" style="position: absolute;top:8%; width: 15%; height: 9%; left: 85%;">Registrar</button>
	</form>
</body>
</html>