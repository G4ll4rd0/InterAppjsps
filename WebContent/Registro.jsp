<%@page import="org.anahuac.garibaldi.fs.jdbc.ResourceManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@page import="java.sql.*" %>
<%
	boolean DEBUG	= false;

	String db      	= "interapp";
	String usuario 	= "interapp";
	String passwd  	= "oH3C7!Jo5PZw5Zfc";
	
	Connection conn			= null;
	Statement stmt  		= null;
	String sql2 			= null;
	
	String delegacion      	= null;
	String deporte         	= null;
	String seccion         	= null;
	String rama            	= null;
	String nombres         	= null;
	String PrimerApellido  	= null;
	String SegundoApellido 	= null;
	
	int entero				= 0;
	int numero				= 0;
	String numeroStr;
	
	delegacion	    =	request.getParameter("equipo") == null ? "": request.getParameter("equipo");
	nombres 	    =	request.getParameter("nombres") == null ? "": request.getParameter("nombres");
	PrimerApellido	=	request.getParameter("PrimerApellido") == null ? "": request.getParameter("PrimerApellido");
	SegundoApellido	=	request.getParameter("SegundoApellido") == null ? "": request.getParameter("SegundoApellido");
	numeroStr		= 	request.getParameter("numero")	== null ? "": request.getParameter("numero");
	
	try{
		numero = Integer.parseInt(numeroStr);
	}
	catch(Exception e){}
	try
	{
		conn = ResourceManager.getConnection();
		
		stmt=conn.createStatement(); //Nombre, primer_apellido,segundo_apellido,Numero,ID_Eq
		sql2="INSERT INTO jugadores(Nombre,primer_apellido,segundo_apellido,Numero,ID_Eq) VALUES('"+nombres+"','"+PrimerApellido+"','"+SegundoApellido+"',"+numero+","+delegacion+")";
		
		System.out.println(sql2);
		
		stmt.executeUpdate(sql2);
		
		System.out.println("Registro hecho");
		
		String servidor = "";
		String pagina1	= "./IntersRegistro.jsp?equipoId=" + delegacion; // Esta es para volver al registro
		String pagina2	= "./MenuPrincipal.jsp";
		
		System.out.println(servidor+pagina1);
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");	
		out.println("	<head>");
		out.println("		<title>resultado</title>");			
		out.println("		<link rel=\"stylesheet\" type=\"text/css\" href=\"aaaCssGeneralInterWebApp.css\">");				
		out.println("	</head>");
		out.println("	<body>");
		out.println("		<div class=\"Aviso\" style=\"top: 35%; left: 20%;\">");
		out.println("			<div>Jugador registrado con exito</div>");			
		
		HttpSession sesion = request.getSession();
		int tdu = (Integer)(sesion.getAttribute("tr"));
		
		if(tdu == 1)
		{
			out.println("			<a  href=\"./IntersRegistro.jsp?equipoId=" + delegacion + "\"><button class=\"BotonAviso\" style=\"position: absolute; left: 15%; top: 50%;\">Registrar otro</button></a>");
			out.println("			<a  href=\"./MenuPrincipal.jsp\"><button class=\"BotonAviso\" style=\"position: absolute; left: 55%; top: 50%;\">menu principal</button></a>");
		}
		else
		{
			out.println("			<a  href=\"./IntersRegistro.jsp?equipoId=" + delegacion + "\"><button class=\"BotonAviso\" style=\"position: absolute; left: 15%; top: 50%;\">Registrar otro</button></a>");
		}
		
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