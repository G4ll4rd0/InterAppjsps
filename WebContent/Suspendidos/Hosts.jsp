<%@page import="com.solucionesenjambre.interapp.fs.jdbc.ResourceManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*" %>
<%
	boolean DEBUG	= false;

	String db		= "interapp";
	String usuario	= "interapp";
	String passwd	= "oH3C7!Jo5PZw5Zfc";
	
	Connection conn	= null;
	Statement stmt	= null;
	String sql		= null;
	
	String nombre;
	String telefono;
	String direccion;
	
	nombre		= request.getParameter("Nombre") == null ? "" : request.getParameter("Nombre");
	telefono 	= request.getParameter("Telefono") == null ? "" : request.getParameter("Telefono");
	direccion	= request.getParameter("Direccion") == null ? "" : request.getParameter("Direccion");
	
	try
	{
		conn = ResourceManager.getConnection();
		
		stmt=conn.createStatement();
		
		sql="INSERT INTO hosts (nombre, direccion, telefono) VALUES ('" + nombre + "', '" + direccion + "', '" + telefono + "')";
		
		System.out.println(sql);
		
		stmt.executeUpdate(sql);
			
			String servidor = "";
			String pagina1	= "./IntersHost.jsp"; //Esta es para volver al registro
			String pagina2	= "./MenuPrincipal.jsp";
			
			out.println("<!DOCTYPE html>");
			out.println("<html>");	
			out.println("	<head>");
			out.println("		<title>resultado</title>");			
			out.println("		<link rel=\"stylesheet\" type=\"text/css\" href=\"aaaCssGeneralInterWebApp.css\">");				
			out.println("	</head>");
			out.println("	<body>");
			out.println("		<div class=\"Aviso\" style=\"top: 35%; left: 20%;\">");
			out.println("			<div>Host registrado con exito</div>");
			out.println("			<a  href=\"./IntersHost.jsp\"><button class=\"BotonAviso\" style=\"position: absolute; left: 15%; top: 50%;\">Registrar Otro</button></a>");
			out.println("			<a  href=\"./MenuPrincipal.jsp\"><button class=\"BotonAviso\" style=\"position: absolute; left: 55%; top: 50%;\">Menu Principal</button></a>");
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
