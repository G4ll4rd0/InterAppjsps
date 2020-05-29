<%@page import="java.util.Enumeration"%>
<%@page import="org.anahuac.garibaldi.fs.dto.Deporte"%>
<%@page import="java.util.List"%>
<%@page import="org.anahuac.garibaldi.tier.DeportesTier"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ejemplo autoposteo</title>
<script>
function postFunction(val)
{
  //alert("The input value has changed. The new value is: " + val);
  
  //var x = document.getElementById("frmMain").name;
  
  document.getElementById("frmMain").submit();
}
</script>
</head>
<body>
<%
	Enumeration<String> parameterNames = request.getParameterNames();

	while (parameterNames.hasMoreElements())
	{
	
	    String paramName = parameterNames.nextElement();
	
	    String paramValue = request.getParameter(paramName);
		
		out.write("<br/>Nombre parametro: " + paramName + " valor parametro: " + paramValue);
		
		//if (paramName.indexOf("goles") >= 0)
		{
			//jugadorid = paramName.substring(6);
			
		//	goles = request.getParameter("goles|" + jugadorid);
			//ta = request.getParameter("ta|" + jugadorid);
		//	tr = request.getParameter("tr|" + jugadorid);
			
		//	SQL = "INSERT INTO estadistoicads....";
			
			//stmt.executeUpdate(sql);
		}
	
	}
	String keyId = request.getParameter("keyId") == null ? "0" : request.getParameter("keyId");

	int id = Integer.parseInt(keyId);

	String equiposId = request.getParameter("equiposId") == null ? "0" : request.getParameter("equiposId");
%>
<form action="autopost.jsp" method="post" name="frmMain" id="frmMain">
	
	
<%
	DeportesTier tier = new DeportesTier();
	List<Deporte> deportes = tier.browse(null);
	
	out.println("id [" + id + "]");
	
	out.println("<br/> <select name=\"keyId\" id=\"keyId\" onchange=\"postFunction()\">");
	out.println("<option value=\"0\" selected>Seleccionar una opcion</option>");
	
	for (Deporte deporte : deportes)
	{
		out.println("<option " + (id == deporte.getDeporteId() ? "selected " : "") + "value=\"" + deporte.getDeporteId() + "\">" + deporte.getDescripcion() + "</option>");
	}
	
	out.println("</select><br/>");
	
	if (id > 0)
	{
		out.println("<br/>Pintar el siguiente combo");
		
		out.println("<br/><input type=\"text\" name=\"equiposId\" id=\"equiposId\" value=\"1\">");
		
		if (!equiposId.equals("0"))
		{
			out.println("<br/>Lista lo demas");
		}
	}
	


%>
	<input type="text" name="id" id="id" value="<%=keyId%>">
	<br/>
	<button type="submit">Enviar</button><br>
</form>
</body>
</html>