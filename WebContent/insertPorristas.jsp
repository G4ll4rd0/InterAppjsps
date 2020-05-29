<%@page import="org.anahuac.garibaldi.fs.jdbc.ResourceManager"%>
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
	
	int puntos;
	
	int i;
	int limit	= 12;	//Cambiar limite a 2001
	
	try
	{
		conn = ResourceManager.getConnection();
		
		for(i = 1;i < limit;i++){
			
			puntos = rand.nextInt(200);
			
			puntos += 1;
			
			stmt = conn.createStatement();
			
			sql = "INSERT INTO porristas (ID_E, puntos) VALUES ("+i+", "+puntos+")";
			stmt.executeUpdate(sql);
			
			out.println(sql);
			
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