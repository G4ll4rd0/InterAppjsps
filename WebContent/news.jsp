<%@page import="com.solucionesenjambre.interapp.fs.dto.News"%>
<%@page import="com.solucionesenjambre.interapp.tier.NewsTier"%>
<%@page import="com.solucionesenjambre.interapp.fs.jdbc.ResourceManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*" %>
<% 
	final boolean DEBUG = false;
	
	String title = request.getParameter("Titulo") == null ? "" : request.getParameter("Titulo");
	String img = request.getParameter("img") == null ? "" : request.getParameter("img");
	String desc = request.getParameter("desc") == null ? "" : request.getParameter("desc");
	String erid = request.getParameter("eid") == null ? "" : request.getParameter("eid");
	
	int eid = Integer.parseInt(erid);
	
	String pagina1	= "./IntersNews.jsp";
	
	String serverImage = "https://solucionesenjambre.com/interapp/imagenes/";
	
	img = serverImage + img;
	
	try
	{
		NewsTier tier = new NewsTier();
		
		News news = new News();
		news.setDescription(desc);
		news.setEventId(eid);
		news.setImage(img);
		news.setTitle(title);
		
		boolean insertion = tier.save(news);
		
		if(insertion)
		{
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
		else
		{
			out.println("<!DOCTYPE html>");
			out.println("<html>");	
			out.println("	<head>");
			out.println("		<title>IS | Noticias</title>");			
			out.println("		<link rel=\"stylesheet\" type=\"text/css\" href=\"aaaCssGeneralInterWebApp.css\">");				
			out.println("	</head>");
			out.println("	<body>");
			out.println("		<div class=\"Aviso\" style=\"top: 35%; left: 20%;\">");
			out.println("			<div>Hubo un problema al registrar la noticia, revise porfavor.</div>");
			out.println("			<button class=\"BotonAviso\" style=\"position: absolute; left: 15%; top: 50%;\" href=\"#\" onclick=\"javascript:window.history.back();\">Registrar Otra</button>");
			out.println("		</div>");
			out.println("	</body>");	
			out.println("</html>");
		}
	}
	finally{}
%>