<%@page import="org.anahuac.garibaldi.fs.jdbc.ResourceManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
   <head>
      <title>Intersalesianos</title>
   </head> 
   <body>
    	<!-- Barra superior -->
		<header>Intersalesianos 2020</header>

    <!-- Div -->
    <div>
<%@page import="java.sql.*"%>
<% //@ include file="Database.jsp" %>
<%
final boolean DEBUG = false;
	//String db = request.getParameter("db");
	String db 		= "interapp";
	String user 	= "interapp";
	String passwd	= "oH3C7!Jo5PZw5Zfc";
	
	Connection conn = null;
	Statement stmt	= null;
	ResultSet rs	= null;
	
	String sql 		= null;
	String prnt 	= "<br/>Usuario o contraseña incorrectos";
	int t 			= 0;
	int id 			= 0;
	String us 		= null;
	String pw = null;
	
	us = request.getParameter("us") == null ? "": request.getParameter("us");
	pw = request.getParameter("pw") == null ? "": request.getParameter("pw");
	
	HttpSession sesion = request.getSession();
	
	try
	{
		conn = ResourceManager.getConnection();
		
		stmt = conn.createStatement();
		
		sql  = "SELECT ID_TdU, usuario_id FROM usuario WHERE Username ='" + us + "' AND Pssword ='" + pw + "'";
		
		rs   = stmt.executeQuery(sql);
		
		if (rs.next())
		{
			t  = rs.getInt("ID_TdU");
			id = rs.getInt("usuario_id");
			sesion.setAttribute("idr", id);
			sesion.setAttribute("tr",t);
		}
		String servidor = "http://" + request.getServerName()+ ":" + request.getServerPort()+ "/interapps/";
		String pagina;
		
		try{conn.close();}catch(Exception e){}
		
		switch (t)
		{
			case 1:
				pagina = "./MenuPrincipal.jsp";
		    	response.sendRedirect(pagina);
				break;
			case 2:
				pagina = "./IntersRegistro.jsp";
			    response.sendRedirect(pagina);
				break;
			default:
				out.println("<br/><button type= \"button\" class = \"logInButton\" style = \"position: absolute;width: 22%;height: 8%; top: 46%; left: 39%;font-family:Roboto Slab;font-style: normal;font-size: 1.25em;\" href=\"#\" onclick=\"javascript:window.history.back();\"> " + prnt + " volver</a>");
				break;
		}
					
		rs.close();
		
	}
	catch(SQLException e)
	{
		out.println("SQLException caught: " + e.getMessage());
	}
	finally
	{
		try{rs.close();} catch(Exception e){}
		try{stmt.close();} catch(Exception e){}
		try{conn.close();} catch(Exception e){}
	}
%>

    </div>
	</body>
</html>