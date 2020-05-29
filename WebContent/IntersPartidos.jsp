<%@page import="org.anahuac.garibaldi.fs.jdbc.ResourceManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>
	<head>
		<title>IS | Registro de Partidos</title>
		<link rel="stylesheet" href="aaaCssGeneralInterWebApp.css">
	</head>
<body style="margin: 0; padding: 0;">
	<h1 class="Titulo">Registro de Partidos.</h1>
<form action="Partidos.jsp" method="post">
<%@page import="java.sql.*" %>
<% 
String db="interapp";
String usuario="interapp";
String passwd="oH3C7!Jo5PZw5Zfc";
Connection conn=null;
Statement stmt=null;
Statement stmt2=null;
Statement stmt3=null;
Statement stmt5=null;
Statement stmt6=null;
Statement stmt7=null;
Statement stmt8=null;
ResultSet rs=null;
ResultSet rs2=null;
ResultSet rs3=null;
ResultSet rs5=null;
ResultSet rs6=null;
ResultSet rs7=null;
ResultSet rs8=null;
String sql=null;
String sql2=null;
String sql3=null;
String sql5=null;
String sql6=null;
String sql7=null;
String sql8=null;
String disciplina=null;
String rama=null;
String cancha=null;
String hora=null;
String local=null;
String visitante=null;
String seccion=null;
try{
	conn = ResourceManager.getConnection();
	
	stmt=conn.createStatement();
	stmt2=conn.createStatement();
	stmt3=conn.createStatement();
	stmt5=conn.createStatement();
	stmt6=conn.createStatement();
	stmt7=conn.createStatement();
	stmt8=conn.createStatement();
	
	sql="SELECT deporte_id, Descripcion FROM deporte ORDER BY Descripcion";
	sql2="SELECT rama_id, Descripcion FROM rama";
	sql3="SELECT cancha_id, Descripcion FROM cancha";		
	sql5="SELECT delegaciones_id, Codigo FROM delegaciones ORDER BY Codigo";
	sql6="SELECT delegaciones_id, Codigo FROM delegaciones ORDER BY Codigo";
	sql7="SELECT seccion_id, Descripcion FROM seccion ORDER BY seccion_id";
	sql8="SELECT * FROM ronda_partido ORDER BY ronda_id DESC";
	
	rs=stmt.executeQuery(sql);
	out.println("<select style=\"position: absolute; top: 25%; left: 15%; height: 8%;\" id=\"disciplina\" name=\"disciplina\">	<option selected>--Selecciona un deporte--</option>");
	while(rs.next()){
		disciplina=rs.getString("Descripcion");
		out.println("<option value=\""+ rs.getInt("deporte_id") +"\">"+disciplina+"</option>");
	} out.println("</select>");
	
	rs2=stmt2.executeQuery(sql2);
	out.println("<select style=\"position: absolute; top: 25%; left: 40%; height: 8%;\" id=\"rama\" name=\"rama\">	<option selected>--Selecciona una rama--</option>");
	while(rs2.next()){
		rama=rs2.getString("Descripcion");
		out.println("<option value=\""+ rs2.getInt("rama_id")+"\">"+rama+"</option>");
	} out.println("</select>");
	
	rs3=stmt3.executeQuery(sql3);
	out.println("<select style=\"position: absolute; top: 49%; left: 15%; height: 8%;\" id=\"cancha\" name=\"cancha\"> <option selected>--Selecciona una cancha--</option>");
	while(rs3.next()){
		cancha=rs3.getString("Descripcion");
		out.println("<option value=\""+ rs3.getInt("cancha_id")+"\">"+cancha+"</option>");
	} out.println("</select>");
	
	rs5=stmt5.executeQuery(sql5);
	out.println("<select style=\"position: absolute; top: 70%; left: 27%; height: 8%;\" id=\"local\" name=\"local\"> <option selected>--Selecciona un equipo--</option>");
	while(rs5.next()){
		local=rs5.getString("Codigo");
		out.println("<option value=\""+ rs5.getInt("delegaciones_id")+"\">"+local+"</option>");
	} out.println("</select>");
	
	rs6=stmt6.executeQuery(sql6);
	out.println("<select style=\"position: absolute; top: 70%; left: 55%; height: 8%;\" id=\"visitante\" name=\"visitante\">	<option selected>--Selecciona un equipo--</option>");
	while(rs6.next()){
		visitante=rs6.getString("Codigo");
		out.println("<option value=\""+ rs6.getInt("delegaciones_id")+"\">"+visitante+"</option>");
	} out.println("</select>");
	
	rs7=stmt7.executeQuery(sql7);
	out.println("<select style=\"position: absolute; top: 25%; left: 65%; height: 8%;\" id=\"seccion\" name=\"seccion\">		<option selected>--Selecciona una sección--</option>");
	while(rs7.next()){
		seccion=rs7.getString("Descripcion");
		out.println("<option value=\""+ rs7.getInt("seccion_id")+"\">"+seccion+"</option>");
	} out.println("</select>");
	
	rs8=stmt8.executeQuery(sql8);
	out.println("<select style=\"position: absolute; top: 70%; left: 2.5%; height: 8%;\" id=\"ronda\" name=\"ronda\">		<option selected>--Selecciona una Ronda--</option>");
	while(rs8.next()){
		seccion = rs8.getString("Descripcion");
		out.println("<option value=\""+ rs8.getInt("ronda_id")+"\">" + seccion + "</option>");
	} out.println("</select>");
}
catch(SQLException e)
{
	out.println("SQLException caught: " + e.getMessage());
}
finally
{
	try{rs.close();} catch(Exception e){}
	try{rs2.close();} catch(Exception e){}
	try{rs3.close();} catch(Exception e){}
	try{rs5.close();} catch(Exception e){}
	try{rs6.close();} catch(Exception e){}
	try{rs7.close();} catch(Exception e){}
	try{rs8.close();} catch(Exception e){}
	try{stmt.close();} catch(Exception e){}
	try{stmt2.close();} catch(Exception e){}
	try{stmt3.close();} catch(Exception e){}
	try{stmt5.close();} catch(Exception e){}
	try{stmt6.close();} catch(Exception e){}
	try{stmt7.close();} catch(Exception e){}
	try{stmt8.close();} catch(Exception e){}
	try{conn.close();} catch(Exception e){}
}
%>

<!--Disciplina-->
	<h2 class="subtitulos" style="position: absolute; top: 15%; left: 15%;"><b></b>Disciplina</h2>

<!--Rama-->
	<h2 class="subtitulos" style="position: absolute; top: 15%; left: 40%;;"><b>Rama</b></h2>
	
<!--Seccion-->
	<h2 class="subtitulos" style="position: absolute; top: 15%; left: 65%;"><b>Seccion</b></h2>
	
<!--Cancha-->
	<h2 class="subtitulos" style="position: absolute; top: 38.5%; left: 15%;"><b>Cancha</b></h2>
	
	<!--Parsear la hora o introducir opciones-->

<!--Dia-->
	<h2 class="subtitulos" style="position: absolute; top: 40%; left: 46%;"><b>Dia</b></h2>
	
	<input class="InputGeneral" placeholder="dd" style="position: absolute; top: 49%; left: 44.5%; height: 6%; width: 5.5%; font-size:1em;" id="dia" name = "dia">
	<input class="InputGeneral" placeholder="mm" style="position: absolute; top: 49%; left: 51%; height: 6%; width: 5.5%; font-size:1em;" id="mes" name = "mes">
	<input class="InputGeneral" placeholder="yyyy" style="position: absolute; top: 49%; left: 57.5%; height: 6%; width: 7%; font-size:1em;" id="ano" name = "ano">

<!-- Hora -->
	
	<h2 class="subtitulos" style="position: absolute; top: 40%; left: 70%;"><b>Hora (24 hrs)</b></h2>
	<input placeholder="hh" style="position: absolute; top: 49%; left: 70.8%; height: 6%; width: 5.5%; font-size:1em;" id="hora" name = "hora">
	<h2 class="subtitulos1" style="position: absolute; top: 46%; left: 77.2%;"><b>:</b></h2>
	<input placeholder="mm" style="position: absolute; top: 49%; left: 78.2%; height: 6%; width: 5.5%; font-size:1em;" id="minutos" name = "minutos">

<!--Contrincantes-->
<!--Local-->
	<h2 class="subtitulos" style="position: absolute; top: 60%; left: 35%;"><b>Local</b></h2>	
<!--Visitante-->
	<h2 class="subtitulos" style="position: absolute; top: 60%; left: 57%;"><b>Visitante</b></h2>
<!--Versus-->
	<h2 class="subtitulos" style="position: absolute; top: 69%; left: 51%;"><b>VS</b></h2>

<!--Ronda-->
	<h2 class="subtitulos" style="position: absolute; top: 60%; left: 5%;"><b>Ronda</b></h2>

<!--Button-->
	<button type="submit" style="position: absolute;width: 15%; height: 9%;left: 43%; top: 85%;">Registrar</button>

</form>
</body>
</html>