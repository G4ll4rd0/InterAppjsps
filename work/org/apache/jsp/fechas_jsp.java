/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.27
 * Generated at: 2020-03-24 04:07:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.anahuac.garibaldi.fs.jdbc.ResourceManager;
import java.sql.*;

public final class fechas_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 //@ include file="Database.jsp" 
      out.write('\r');
      out.write('\n');

final boolean DEBUG = false;
	//String db = request.getParameter("db");
	String db 		= "interapp";
	String user 	= "interapp";
	String passwd	= "oH3C7!Jo5PZw5Zfc";
	
	Connection conn = null;
	Statement stmt	= null;
	ResultSet rs	= null;
	Statement stmt2	= null;
	ResultSet rs2	= null;
	
	String sql 		= null;	
	String sql2		= null;
	String dep		= null;
	int depid		= 0;
	
	String eventoId = request.getParameter("eid") == null ? "": request.getParameter("eid");
	
	try
	{
		conn = ResourceManager.getConnection();
		
		stmt = conn.createStatement();
		stmt2= conn.createStatement();
		
		sql  = "SELECT DISTINCT fecha FROM vw_partidos WHERE seccion_id = " + eventoId;
		sql2 = "SELECT COUNT(DISTINCT fecha) num, seccion_id FROM vw_partidos WHERE seccion_id = " + eventoId;
		
		System.out.println(sql);
		System.out.println(sql2);
		
		rs   = stmt.executeQuery(sql);
		rs2  = stmt2.executeQuery(sql2);
		
		out.print("[");
		
		if(rs2.next()){
			depid = rs2.getInt("num");
			out.print("{\"numero\": " + depid + "}");
		}
		
		while(rs.next()){
			dep = rs.getString("fecha");
			out.print(",{\"fecha\": \"" + dep + "\"}");
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

    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
