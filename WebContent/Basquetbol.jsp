<%@page import="com.solucionesenjambre.interapp.fs.dto.Players"%>
<%@page import="com.solucionesenjambre.interapp.tier.PlayersTier"%>
<%@page import="com.solucionesenjambre.interapp.fs.dto.VwGames"%>
<%@page import="com.solucionesenjambre.interapp.tier.VwGamesTier"%>
<%@page import="com.solucionesenjambre.interapp.fs.dto.VwSports"%>
<%@page import="com.solucionesenjambre.interapp.tier.VwSportsTier"%>
<%@page import="com.solucionesenjambre.interapp.tier.GamesTier"%>
<%@page import="com.solucionesenjambre.interapp.fs.dto.Games"%>
<%@page import="com.solucionesenjambre.interapp.tier.PlayersStatsTier"%>
<%@page import="com.solucionesenjambre.interapp.fs.dto.PlayersStats"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>IS | Basquet</title>
	<link rel="stylesheet" type="text/css" href="aaaCssGeneralInterWebApp.css">
	<script>
		function postFunction()
		{  
		  document.getElementById("frmMain").submit();
		}
	</script>
</head>
<body>
<h1 class="Titulo">Resultados de Basquet</h1>

<%
	String jugId;
	int jugadorId;
	String goles;
	
	HttpSession sesion = request.getSession();
	String eid = sesion.getAttribute("eid").toString();
	
	Enumeration<String> parameterNames = request.getParameterNames();
	
	String deporteId = request.getParameter("deporteId") == null ? "0" : request.getParameter("deporteId");
	int depId = Integer.parseInt(deporteId);
	
	String partidoId = request.getParameter("partidoId") == null ? "0" : request.getParameter("partidoId");
	int partId = Integer.parseInt(partidoId);
	
	String ResLocal = request.getParameter("ResLocal") == null ? "0" : request.getParameter("ResLocal");
	int Res1 = Integer.parseInt(ResLocal);
	
	String ResVisita = request.getParameter("ResVisita")== null ? "0" : request.getParameter("ResVisita");
	int Res2 = Integer.parseInt(ResVisita);
	
	GamesTier gamesTier = new GamesTier();
	int team1Result = Res1;
	int team2Result = Res2;
	int gameId		= partId;
	
	System.out.println(depId);
	System.out.println(partId);	
	
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
			
			goles = request.getParameter(gol.toString()) == null ? null : request.getParameter(gol.toString());
			
			//System.out.println(gol);
			//System.out.println(goles);
			
			PlayersStats playersStats = new PlayersStats();
			playersStats.setGameId(partId);
			playersStats.setPlayerId(jugadorId);
			playersStats.setPoints(Integer.parseInt(goles));
			
			PlayersStatsTier playersStatsTier = new PlayersStatsTier();
			boolean insert = playersStatsTier.save(playersStats);
		}

	}
	
	if(partId !=0 && (request.getParameter("ResLocal") != null  || request.getParameter("ResVisita") != null ))
	{
		Games games = new Games();
		games.setAlreadyPlayed(1);
		games.setTeam1Result(team1Result);
		games.setTeam2Result(team2Result);
		games.setGameId(gameId);
		
		boolean update = gamesTier.save(games);
		partId = 0;
	}
%>
	<form action="Basquetbol.jsp" method="post" name="frmMain" id="frmMain">
	<%
	String[] vwSportsParams = new String[2];
	vwSportsParams[0] = "Basquetbol";
	vwSportsParams[1] = eid;

	VwSportsTier vwSportsTier = new VwSportsTier();
	List<VwSports> vwSports = vwSportsTier.browse(vwSportsParams);
		
		out.println("	<select style=\"position: absolute; top:20.5%; left: 5%; height: 10%;\" name=\"deporteId\" id=\"deporteId\" onchange=\"postFunction()\">");
		out.println("		<option value=\"0\" selected>Seleccione una Categoria</option>");
		
		for (VwSports vwSport : vwSports)
		{
			out.println("		<option " + (depId == vwSport.getSportId() ? "selected " : "") + "value=\"" + vwSport.getSportId() + "\">" + vwSport.getDescription() + "</option>");
		}
		
		out.println("	</select><br/>");
		
		if(depId > 0)
		{
			String[] vwGamesParams = new String[2];
			vwGamesParams[0] = deporteId;
			vwGamesParams[1] = "0";
			VwGamesTier vwGamesTier = new VwGamesTier();
			List<VwGames> vwGames = vwGamesTier.pending(vwGamesParams);
			
			out.println("	<select style=\"position: absolute; top:32%; left: 5%; height: 10%;\" name=\"partidoId\" id=\"partidoId\" onchange=\"postFunction()\">");
			out.println("		<option value=\"0\" selected>Seleccione un Partido</option>");
			
			for (VwGames vwGame : vwGames)
			{
				out.println("		<option " + (partId == vwGame.getGameId() ? "selected " : "") + "value=\"" + vwGame.getGameId() + "\">" + vwGame.getLocalCodeDelegacion() + " vs. " + vwGame.getVisitanteCodeDelegacion() + "</option>");
			}
			
			out.println("	</select><br/>");
			
			if(partId > 0)
			{
				System.out.println("Este es el partidoId: " + partId);
				VwGames[] games = vwGamesTier.get(partId);
				
				for(VwGames game : games)
				{
					out.println("<div style=\" position: absolute; top:17%; left:30%; width: 50%;\">");
					out.println("	<p class=\"subtitulos\">Seccion: " + game.getEventName() + "</p>");
					out.println("	<br/><br/><p class=\"subtitulos\">Rama: " + game.getBranchName() + "</p>");
					out.println("	<br/><br/><p class=\"subtitulos\">Fecha: " + game.getDate() + "</p>");
					out.println("	<br/><br/><p class=\"subtitulos\">Hora: " + game.getTime() + "</p>");
					out.println("</div>");
					out.println("	<br/><br/> <p class=\"subtitulos\" style=\"position: absolute; top: 20%; left: 67.55%; width: 10%; \">" + game.getLocalCodeDelegacion() + "</p><p class=\"subtitulos\"> </p><p class=\"subtitulos\" style=\"position: absolute; top: 20%; left: 82%; width: 10%; \">" + game.getVisitanteCodeDelegacion() + "</p>");

					out.println("<div  class=\"subtitulos\" style=\"position: absolute; top: 30%; left: 60%; width: 40%; height: 15%;\">");
					out.println("	<br/><input class=\"input\" style=\" position: relative; width: 5%; font-size: 1.5em\" name=\"ResLocal\" id=\"ResLocal\"> vs. <input class=\"input\" style=\" position: relative; width: 5%; font-size: 1.5em\" name=\"ResVisita\" id=\"ResVisita\">");
					out.println("</div>");
					
					PlayersTier playersTier = new PlayersTier();
					int local = game.getLocalTeamId();
					int visita = game.getVisitanteTeamId();
					List<Players> playersLocal = playersTier.getByTId(local);
					List<Players> playersVisit = playersTier.getByTId(visita);
					
					out.println("	<br/><br/><table style=\"position: absolute; width: 85%; top:50%; left: 1%\">");
					out.println("	<tr><td  style=\"width: 5%\"><td/><td style=\"width: 40%\"><table  style=\"width: 40%\"><tr> <th class=\"nombre\" style=\"font-size: 1.5em;\"> Numero </th> <th class=\"nombre\" style=\"font-size: 1.5em;\"> Nombre </th><th class=\"nombre\" style=\"font-size: 1.5em;\"> Puntos </th></tr>");
									
					for(Players player : playersLocal)
					{
						int jId = player.getPlayerId();
						String jNombre = player.getPlayerName() + " " + player.getFirstLastname() + " " + player.getSecondLastname();
						
						out.println("<tr><td class=\"nombre\" style=\" position:relative; width: 10%;\">" + player.getPlayerNumber() + "</td><td class=\"nombre\" style=\"font-size: 1em;\">" + jNombre + "</td><td><input class=\"input\" style=\"width: 50%;\" value = \"0\" name=\"goles|" + jId + "\" id=\"goles|" + jId + "\"></td></tr>");
					}
					
					out.println("</table></td><td style=\"width:10%\"></td><td style=\"width: 40%\"><table  style=\"width: 40%\"><tr> <th class=\"nombreRojo\" style=\"font-size: 1.5em;\"> Numero </th> <th class=\"nombreRojo\" style=\"font-size: 1.5em;\"> Nombre </th><th class=\"nombreRojo\" style=\"font-size: 1.5em;\"> Puntos </th></tr>");
										
					for(Players player : playersVisit)
					{
						int jId = player.getPlayerId();
						String jNombre = player.getPlayerName() + " " + player.getFirstLastname() + " " + player.getSecondLastname();
						
						out.println("<tr><td class=\"nombreRojo\" style=\"width: 5%;\">" + player.getPlayerNumber() + "</td><td class=\"nombreRojo\" style=\"font-size: 1em;\">" + jNombre + "</td><td><input class=\"inputRojo\" style=\"width: 50%;\" value = \"0\" name=\"goles|" + jId + "\" id=\"goles|" + jId + "\"></td></tr>");
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