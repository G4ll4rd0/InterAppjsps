<%@page import="com.solucionesenjambre.interapp.fs.dto.Cheerleaders"%>
<%@page import="com.solucionesenjambre.interapp.tier.CheerleadersTier"%>
<%@page import="com.solucionesenjambre.interapp.fs.dto.VwTeams"%>
<%@page import="com.solucionesenjambre.interapp.tier.VwTeamsTier"%>
<%@page import="java.util.*"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>IS | Porristas</title>
		<link rel="stylesheet" type="text/css" href="aaaCssGeneralInterWebApp.css">
	</head>
	<body>
		<%			
			String eqId;
			String pnts;
			String puntos;
			
			String equipo;
			int id;
			
			String servidor = "";;
			String pagina 	= "./IntersResultados.jsp";
			
			HttpSession sesion = request.getSession();
			String eid = sesion.getAttribute("eid").toString();
			
			Enumeration<String> parameterNames = request.getParameterNames();
			
			while (parameterNames.hasMoreElements())
			{
				String paramName = parameterNames.nextElement();
			    String paramValue = request.getParameter(paramName);
			    
			    if (paramName.indexOf("puntos") >= 0)
			    {
			    	eqId = paramName.substring(7);
			    	
			    	pnts = "puntos|" + eqId;
			    	
			    	puntos = request.getParameter(pnts);
			    				    	
			    	CheerleadersTier cheerleadersTier = new CheerleadersTier();
			    	Cheerleaders cheerleaders = new Cheerleaders();
			    	
			    	int teamId = Integer.parseInt(eqId);
			    	int points = Integer.parseInt(puntos);
			    	
			    	cheerleaders.setPoints(points);
			    	cheerleaders.setTeamId(teamId);
			    	
			    	boolean insert = cheerleadersTier.save(cheerleaders);
			    	
			    }
			    	
			    out.println("<div \"Aviso\" style=\"top: 35%; left: 20%;\">							<div>Registro Exitoso</div>								<a  href=\"" + pagina + "\"><button class=\"BotonAviso\" style=\"position: absolute; left: 55%; top: 50%;\">Volver</button></a></div>");
			}
		%>
		<form action="Porristas.jsp" method="post">
			<%
				try
				{
					VwTeamsTier vwTeamsTier = new VwTeamsTier();
					List<VwTeams> vwTeams = null;
					
					String[] params = new String[2];
					params[0] = "Porristas";
					params[1] = eid;
					
					vwTeams = vwTeamsTier.browse(params);
					
					out.println("<table style=\"position: absolute; left:28%; width: 50%;\"><tr><th class=\"nombre\">Equipo</th><th class=\"nombre\">Puntaje</th></tr>");
					
					for(VwTeams team : vwTeams)
					{
						out.println("<tr><td></td></tr><tr><td></td></tr><tr><td></td></tr>");//esto es para dar espacio
						equipo = team.getTeamName();
						id	   = team.getTeamId();
						out.println("<tr><td class=\"nombre\">" + equipo + "</td><td><input class=\"input\" name=\"puntos|" + id + "\" id=\"puntos|" + id + "\" value=\"0\" style=\" position: relative; width: 40%; left: 30%;\"></td></tr>");
					}
					
					out.println("</table>");
				}
				finally{}
			%>
			<br>
			<button type="submit" style="position: fixed; width: 15%; height: 10%; left: 80%; top: 50%;">Registrar</button> 
		</form>
	</body>
</html>