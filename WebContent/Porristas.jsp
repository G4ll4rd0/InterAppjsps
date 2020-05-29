<%@page import="org.anahuac.garibaldi.fs.jdbc.ResourceManager"%>
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
			String db 		= "interapp";
			String user 	= "interapp";
			String passwd	= "oH3C7!Jo5PZw5Zfc";
			
			Connection conn = null;
			Statement stmt	= null;
			String sql		= null;
			Statement stmt2	= null;
			String sql2		= null;
			ResultSet rs	= null;
			
			String eqId;
			String pnts;
			String puntos;
			
			String equipo;
			int id;
			
			String servidor = "";;
			String pagina 	= "./IntersResultados.jsp";
			
			try
			{
				conn = ResourceManager.getConnection();
				
				stmt 	= conn.createStatement();
				stmt2	= conn.createStatement();
			}
			catch(SQLException e){}
			
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
			    	
			    	sql = "INSERT INTO porristas (ID_E, puntos) VALUES (" + eqId + ", " + puntos + ")";
			    	
			    	try
			    	{
			    		stmt.executeUpdate(sql);
			    	}
			    	catch(SQLException e)
			    	{
			    		out.println("SQLException caught: " + e.getMessage());
			    	}
			    }
			    out.println("<div \"Aviso\" style=\"top: 35%; left: 20%;\">							<div>Registro Exitoso</div>								<a  href=\"" + pagina + "\"><button class=\"BotonAviso\" style=\"position: absolute; left: 55%; top: 50%;\">Volver</button></a></div>");
			}
		%>
		<form action="Porristas.jsp" method="post">
			<%
				try
				{
					sql2 = "SELECT * FROM vw_equipos WHERE nombre_equipo LIKE '%Porristas%' AND seccion_id = 2";
					rs	 = stmt2.executeQuery(sql2);
					
					out.println("<table style=\"position: absolute; left:28%; width: 50%;\"><tr><th class=\"nombre\">Equipo</th><th class=\"nombre\">Puntaje</th></tr>");
					
					while(rs.next())
					{
						out.println("<tr><td></td></tr><tr><td></td></tr><tr><td></td></tr>");//esto es para dar espacio
						equipo = rs.getString("Nombre");
						id	   = rs.getInt("equipo_id");
						out.println("<tr><td class=\"nombre\">" + equipo + "</td><td><input class=\"input\" name=\"puntos|" + id + "\" id=\"puntos|" + id + "\" value=\"0\" style=\" position: relative; width: 40%; left: 30%;\"></td></tr>");
					}
					
					out.println("</table>");
				}
				catch(SQLException e)
				{
					out.println("SQLException caught: " + e.getMessage());
				}
				finally
				{
					try{rs.close();} catch(Exception e){}
					try{stmt2.close();} catch(Exception e){}
					try{stmt.close();} catch(Exception e){}
					try{conn.close();} catch(Exception e){}
				}
			%>
			<br>
			<button type="submit" style="position: fixed; width: 15%; height: 10%; left: 80%; top: 50%;">Registrar</button> 
		</form>
	</body>
</html>