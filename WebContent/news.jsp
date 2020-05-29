<%@page import="org.anahuac.garibaldi.fs.jdbc.ResourceManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*" %>
<% 
	final boolean DEBUG = false;

	String db		= "interapp";
	String usuario	= "interapp";
	String passwd	= "oH3C7!Jo5PZw5Zfc";
	
	Connection conn	= null;
	Statement stmt	= null;
	String sql		= null;
	
	String titulo = request.getParameter("Titulo") == null ? "" : request.getParameter("Titulo");
	String img = request.getParameter("img") == null ? "" : request.getParameter("img");
	String desc = request.getParameter("desc") == null ? "" : request.getParameter("desc");
	String eid = request.getParameter("eid") == null ? "" : request.getParameter("eid");
	
	try
	{
		conn = ResourceManager.getConnection();
		
		stmt = conn.createStatement();
		
		sql = "INSERT INTO noticias(Titulo, Descripcion, evento_id, desc_larga) VALUES ('" + titulo + "', 'https://solucionesenjambre.com/interapp/imagenes/" + img + "', " + eid + ", '" + desc + "');";
		
		System.out.println(sql);
		
		stmt.executeUpdate(sql);
		
		String servidor = "";
		String pagina1	= "./IntersNews.jsp";
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");	
		out.println("	<head>");
		out.println("		<title>IS | Noticias</title>");			
		out.println("		<link rel=\"stylesheet\" type=\"text/css\" href=\"aaaCssGeneralInterWebApp.css\">");				
		out.println("	</head>");
		out.println("	<body>");
		out.println("		<div class=\"Aviso\" style=\"top: 35%; left: 20%;\">");
		out.println("			<div>Noticia registrada con exito</div>");
		out.println("			<a  href=\"./IntersNews.jsp\"><button class=\"BotonAviso\" style=\"position: absolute; left: 15%; top: 50%;\">Registrar Otra</button></a>");
		out.println("		</div>");
		out.println("	</body>");	
		out.println("</html>");
	}
	catch(SQLException e)
	{
		out.println("SQLException caught: " + e.getMessage());
	}
	finally
	{
		try{stmt.close();} catch(Exception e){}
		try{conn.close();} catch(Exception e){}
	}
%>