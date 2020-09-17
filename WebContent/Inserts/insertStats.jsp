<%@page import="com.solucionesenjambre.interapp.fs.jdbc.ResourceManager"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<% //@ include file="Database.jsp" %>
<%
final boolean DEBUG = false;
	//String db = request.getParameter("db");
	String db 		= "interapp";
	String user 	= "interapp";
	String passwd	= "oH3C7!Jo5PZw5Zfc";
	
	Connection conn = null;
	Statement stmt	= null;
	String sql 		= null;
	
	Random rand = new Random();
	
	int ID_J		= 0;
	int partido_id	= 0;
	int Goles		= 0;
	int TA			= 0;
	int TR			= 0;
	
	int i		= 0;
	int limit	= 549;	//Cambiar limite a 2001
	
	try
	{
		conn = ResourceManager.getConnection();
		
		for(i = 1;i < limit;i++){
			
			ID_J		= i;
			partido_id	= rand.nextInt(54);
			Goles		= 0;
			TA			= 0;
			TR			= 0;
			
			partido_id	+= 1;
			
			stmt = conn.createStatement();
			
			sql = "INSERT INTO estadisticas_jugador (ID_J, partido_id, Goles, Tarjetas_Am, Tarjetas_Ro) VALUES ("+ID_J+", "+partido_id+", "+Goles+", "+TA+", "+TR+")";
			
			out.println(sql);
			
			stmt.executeUpdate(sql);
			
			stmt.close();
			
		}
		
		out.println("Procedimiento finalizado");
		
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