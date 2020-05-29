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
	int depid		= 0;
	
	String eventoId = request.getParameter("eid") == null ? "": request.getParameter("eid");
	
	try
	{
		conn = ResourceManager.getConnection();
		
		stmt = conn.createStatement();
		
		sql  = "SELECT d.Descripcion, d.deporte_id FROM deporte_activo da, deporte d WHERE d.deporte_id = da.ID_De AND da.ID_S = " + eventoId + " ORDER BY d.deporte_id";
		
		System.out.println(sql);
		
		rs   = stmt.executeQuery(sql);
		
		out.print("[");
		
		if(rs.next()){
			dep = rs.getString("Descripcion");
			depid = rs.getInt("deporte_id");
			out.print("{\"deporte\": \""+dep+"\", \"id\": "+depid+"}");
		}
		
		while(rs.next()){
			dep = rs.getString("Descripcion");
			depid = rs.getInt("deporte_id");
			out.print(",{\"deporte\": \""+dep+"\", \"id\": "+depid+"}");
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