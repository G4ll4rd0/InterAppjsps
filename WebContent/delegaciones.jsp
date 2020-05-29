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
	String cod 		= null;
	int depid		= 0;
	
	String eventoId = request.getParameter("eid") == null ? "": request.getParameter("eid");
	
	try
	{
//		Class.forName("org.gjt.mm.mysql.Driver");
	//	conn = DriverManager.getConnection("jdbc:mysql://arkesol.ddnsfree.com/" + db, user, passwd);
		
		conn = ResourceManager.getConnection();
	
		stmt = conn.createStatement();
		
		sql  = "SELECT * FROM delegaciones WHERE evento_id = " + eventoId;
		
		System.out.println(sql);
		
		rs   = stmt.executeQuery(sql);
		
		out.print("[");
		
		if(rs.next()){
			dep = rs.getString("Nombre");
			depid = rs.getInt("delegaciones_id");
			cod = rs.getString("Codigo");
			out.print("{\"delegacion\": \""+dep+"\", \"id\": "+depid+", \"codigo\": \""+cod+"\"}");
		}
		
		while(rs.next()){
			dep = rs.getString("Nombre");
			depid = rs.getInt("delegaciones_id");
			cod = rs.getString("Codigo");
			out.print(",{\"delegacion\": \""+dep+"\", \"id\": "+depid+", \"codigo\": \""+cod+"\"}");
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