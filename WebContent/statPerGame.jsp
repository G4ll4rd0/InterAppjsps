<%@page import="org.anahuac.garibaldi.fs.jdbc.ResourceManager"%>
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
	String dep		= null;
	int cod 		= 0;
	int ta			= 0;
	int tr 			= 0;
	int depid		= 0;
	
	String eq = request.getParameter("equipoId") == null ? "": request.getParameter("equipoId");
	String part = request.getParameter("partidoId") == null ? "": request.getParameter("partidoId");
	
	try
	{
//		Class.forName("org.gjt.mm.mysql.Driver");
	//	conn = DriverManager.getConnection("jdbc:mysql://arkesol.ddnsfree.com/" + db, user, passwd);
		
		conn = ResourceManager.getConnection();
	
		stmt = conn.createStatement();
		
		sql  = "SELECT * FROM estadisticas_jugador ej, jugadores j WHERE ej.ID_J = j.jugadores_id AND j.ID_Eq = " + eq + " AND ej.partido_id = " + part;
		
		System.out.println(sql);
		
		rs   = stmt.executeQuery(sql);
		
		out.print("[");
		
		if(rs.next()){
			dep = rs.getString("primer_apellido").toUpperCase();
			depid = rs.getInt("Numero");
			cod = rs.getInt("Goles");
			ta = rs.getInt("Tarjetas_Am");
			tr = rs.getInt("Tarjetas_Ro");
			out.print("{\"numero\": " + depid + ", \"primerApellido\": \"" + dep + "\", \"goles\": " + cod + ", \"ta\": " + ta + ", \"tr\": " + tr + "}");
		}
		
		while(rs.next()){
			dep = rs.getString("primer_apellido").toUpperCase();
			depid = rs.getInt("Numero");
			cod = rs.getInt("Goles");
			ta = rs.getInt("Tarjetas_Am");
			tr = rs.getInt("Tarjetas_Ro");
			out.print(",{\"numero\": " + depid + ", \"primerApellido\": \"" + dep + "\", \"goles\": " + cod + ", \"ta\": " + ta + ", \"tr\": " + tr + "}");
		}
		
		out.print("]");		
		
		try{conn.close();}catch(Exception e){}
					
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