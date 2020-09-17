<%@page import="com.solucionesenjambre.interapp.fs.dto.Games"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="com.solucionesenjambre.interapp.tier.TeamsTier"%>
<%@page import="com.solucionesenjambre.interapp.tier.GamesTier"%>
<%@page import="com.solucionesenjambre.interapp.fs.dto.Teams"%>
<%@page import="com.solucionesenjambre.interapp.fs.dto.VwTeams"%>
<%@page import="com.solucionesenjambre.interapp.tier.VwTeamsTier"%>
<%@page import="com.solucionesenjambre.interapp.fs.jdbc.ResourceManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%
	final boolean DEBUG	= false;

	GamesTier gamesTier = new GamesTier();
	boolean insert;
	
	TeamsTier teamsTier = new TeamsTier();

	String[] team1 = new String[4];
	String[] team2 = new String[4];
	
	int team1Id;
	int team2Id;
	
	DateFormat dateFormat = new SimpleDateFormat("dd mm yyyy");
	DateFormat hourFormat = new SimpleDateFormat("HH:mm");
	
	Date date;
	Date time;
	
	String disciplina	= null;
	String rama			= null;
	String local		= null;
	String visitante	= null;
	String cancha		= null;
	String hora			= null;
	String seccion		= null;
	String ronda		= null;
	
	String minutos;
	String dia;
	String mes;
	String año;
	
	String fecha;
	String tiempo;
	
	disciplina = request.getParameter("disciplina") == null ? "": request.getParameter("disciplina");
	rama = request.getParameter("rama") == null ? "": request.getParameter("rama");
	local = request.getParameter("local") == null ? "": request.getParameter("local");
	visitante = request.getParameter("visitante") == null ? "": request.getParameter("visitante");
	cancha = request.getParameter("cancha") == null ? "": request.getParameter("cancha");
	hora = request.getParameter("hora") == null ? "": request.getParameter("hora");
	dia = request.getParameter("dia") == null ? "": request.getParameter("dia");
	mes = request.getParameter("mes") == null ? "": request.getParameter("mes");
	año = request.getParameter("ano") == null ? "": request.getParameter("ano");
	minutos = request.getParameter("minutos") == null ? "": request.getParameter("minutos");
	seccion = request.getParameter("seccion") == null ? "": request.getParameter("seccion");
	ronda = request.getParameter("ronda") == null ? "": request.getParameter("ronda");
	
	if (DEBUG)
	{
		out.println("<br/>disciplina [" + disciplina + "]");
		out.println("<br/>rama [" + rama + "]");
		out.println("<br/>local [" + local + "]");
		out.println("<br/>visitante [" + visitante + "]");
		out.println("<br/>cancha [" + cancha + "]");
		out.println("<br/>hora [" + hora + "]");
		out.println("<br/>seccion [" + seccion + "]");
	}
	
	try
	{		
		team1[0] = local;
		team1[1] = disciplina;
		team1[2] = rama;
		team1[3] = seccion;
		
		team2[0] = visitante;
		team2[1] = disciplina;
		team2[2] = rama;
		team2[3] = seccion;
		
		team1Id = teamsTier.findId(team1);
		team2Id = teamsTier.findId(team2);
		
		fecha = dia + " " + mes + " " + año;
		date = dateFormat.parse(fecha);
		
		tiempo = hora + ":" + minutos;
		time = hourFormat.parse(tiempo);
		
		//Integer.parseInt(cancha), date, time, team1Id, team2Id, Integer.parseInt(ronda)
		Games games = new Games();
		games.setCourtId(Integer.parseInt(cancha));
		games.setDate(date);
		games.setTime(time);
		games.setTeam1Id(team1Id);
		games.setTeam2Id(team2Id);
		games.setRoundId(Integer.parseInt(ronda));
		
		insert = gamesTier.save(games);
			
		if(insert)
		{
			out.println("<!DOCTYPE html>");
			out.println("<html>");	
			out.println("	<head>");
			out.println("		<title>resultado</title>");			
			out.println("		<link rel=\"stylesheet\" type=\"text/css\" href=\"aaaCssGeneralInterWebApp.css\">");				
			out.println("	</head>");
			out.println("	<body>");
			out.println("		<div class=\"Aviso\" style=\"top: 35%; left: 20%;\">");
			out.println("			<div>Partido registrado con exito</div>");
			out.println("			<a  href=\"./IntersPartidos.jsp\"><button class=\"BotonAviso\" style=\"position: absolute; left: 15%; top: 50%;\">Registrar otro</button></a>");
			out.println("			<a  href=\"./MenuPrincipal.jsp\"><button class=\"BotonAviso\" style=\"position: absolute; left: 55%; top: 50%;\">menu principal</button></a>");
			out.println("		</div>");
			out.println("	</body>");	
			out.println("</html>");
		}
		else
		{
			out.println("<!DOCTYPE html>");
			out.println("<html>");	
			out.println("	<head>");
			out.println("		<title>resultado</title>");			
			out.println("		<link rel=\"stylesheet\" type=\"text/css\" href=\"aaaCssGeneralInterWebApp.css\">");				
			out.println("	</head>");
			out.println("	<body>");
			out.println("		<div class=\"Aviso\" style=\"top: 35%; left: 20%;\">");
			out.println("			<div>Problema al registrar el partido</div>");
			out.println("			<a  href=\"./IntersPartidos.jsp\"><button class=\"BotonAviso\" style=\"position: absolute; left: 15%; top: 50%;\">Registrar otro</button></a>");
			out.println("			<a  href=\"./MenuPrincipal.jsp\"><button class=\"BotonAviso\" style=\"position: absolute; left: 55%; top: 50%;\">menu principal</button></a>");
			out.println("		</div>");
			out.println("	</body>");	
			out.println("</html>");
		}
	}
	finally{}
%>
