<%@page import="org.anahuac.garibaldi.fs.jdbc.ResourceManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
	<title>IS | Registro de Jugadores</title>
	<link rel="stylesheet" href="aaaCssGeneralInterWebApp.css">
</head>
<body>
	<!--Titulo-->
	<h1 class="Titulo">Registro de Jugadores</h1>
	<form action="Registro.jsp" method="post">
	<%@page import="java.sql.*" %>
	<%
	String db="interapp";
	String usuario="interapp";
	String passwd="oH3C7!Jo5PZw5Zfc";
	
	Connection conn=null;
	Statement stmt=null;
	
	ResultSet rs=null;
	
	String sql=null;
	
	String delegacion=null;
	int equipoId;
	int equipoIdLocal;
	String equipoIdPost;
	
	equipoIdPost = request.getParameter("equipoId") == null ? "0" : request.getParameter("equipoId");
	
	equipoIdLocal = Integer.parseInt(equipoIdPost);
	
	try{
		
		conn = ResourceManager.getConnection();
		
		stmt=conn.createStatement();
		
		sql="SELECT * FROM vw_equipos";
		
	//<!--delegacion-->
	rs=stmt.executeQuery(sql);
		out.println("	<select  type=\"text\" id=\"equipo\" name=\"equipo\" placeholder=\"EQUIPO\" style=\"position: absolute; width: 30%;height: 10%;left: 51%;top: 28%;\"><option selected>EQUIPO</option>");
		while(rs.next()){
			delegacion=rs.getString("nombre_equipo");
			equipoId = rs.getInt("equipo_id");
			if(equipoIdLocal == equipoId){
				out.println("		<option selected value=\""+ equipoId +"\">"+delegacion+"</option>");
			}else{
				out.println("		<option value=\""+ equipoId +"\">"+delegacion+"</option>");
			}
		}
		out.println("	</select>");
	
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
	

	
	<!--Nombres-->
	<input type="text" id="nombres" name="nombres" placeholder="NOMBRES" style="position: absolute; width: 25%;height: 8%;left: 18%;top: 20%; font-size: 2em;">

	<!--PRIMER APELLIDO-->
	<input class="General" type="text" id="PrimerApellido" name= "PrimerApellido" placeholder="PRIMER APELLIDO" style="position: absolute; width: 25%;height: 8%;left: 18%;top: 38%; font-size: 2em;">

	<!--Segundo APELLIDO-->
	<input class="General" type="text" id="SegundoApellido" name="SegundoApellido" placeholder="SEGUNDO APELLIDO" style="position: absolute; width: 25%;height: 8%;left:18%;top: 56%; font-size: 2em;">

	<!--numero-->
	<input class="General" type="text" id="numero" name="numero" placeholder="NUMERO" style="position: absolute; width: 25%;height: 8%;left: 18%;top: 74%; font-size: 2em;">

	<!--Boton-->
	<button class="General" type="submit" style="position: absolute;width: 15%; height: 9%;left: 58%; top: 50%;">Registrar</button>

</form>
	
</body>
</html>