<%@page import="com.solucionesenjambre.interapp.fs.dto.Users"%>
<%@page import="com.solucionesenjambre.interapp.tier.UsersTier"%>
<%@page import="com.solucionesenjambre.interapp.fs.jdbc.ResourceManager"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
   <head>
      <title>Intersalesianos</title>
      <link rel="stylesheet" type="text/css" href="aaaCssGeneralInterWebApp.css">
   </head> 
   <body>
    	<!-- Barra superior -->
		<h1 class= "Titulo">INTERAPP</h1> 
	
    <!-- Div -->
    <div>
<%@page import="java.sql.*"%>
<%
final boolean DEBUG = false;
	
	String sql 		= null;
	String prnt 	= "<br/>Usuario o contraseña incorrectos";
	int t 			= 0;
	int id 			= 0;
	int eid			= 0;
	String us 		= null;
	String pw = null;
	
	us = request.getParameter("us") == null ? "": request.getParameter("us");
	pw = request.getParameter("pw") == null ? "": request.getParameter("pw");
	
	HttpSession sesion = request.getSession();
	
	try
	{		
		UsersTier tier = new UsersTier();
		List<Users> usuarios = tier.findUser(us, pw);
		
		for (Users users : usuarios)
		{
			t  	= users.getUserTypeId();
			id 	= users.getUserId();
			eid = users.getEventId();
			sesion.setAttribute("eid", eid);
			sesion.setAttribute("idr", id);
			sesion.setAttribute("tr",t);
		}
		String servidor = "http://" + request.getServerName()+ ":" + request.getServerPort()+ "/interapps/";
		String pagina;
		
		switch (t)
		{
			case 1:
				pagina = "./MenuPrincipal.html";
		    	response.sendRedirect(pagina);
				break;
			case 2:
				pagina = "./IntersRegistro.jsp";
			    response.sendRedirect(pagina);
				break;
			default:
				out.println("<br/><button type= \"button\" class = \"logInButton\" style = \"position: absolute;width: 22%;height: 25%; top: 46%; left: 39%;font-family:Roboto Slab;font-style: normal;font-size: 1.25em;\" href=\"#\" onclick=\"javascript:window.history.back();\"> " + prnt + " volver</a>");
				break;
		}
		
	}finally{}
%>

    	</div>
	</body>
</html>