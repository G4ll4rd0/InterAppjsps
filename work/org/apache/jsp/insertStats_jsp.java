/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.27
 * Generated at: 2020-02-20 21:34:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class insertStats_jsp extends org.apache.jasper.runtime.HttpJspBase
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
		Class.forName("org.gjt.mm.mysql.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://arkesol.ddnsfree.com/" + db, user, passwd);
		
		for(i = 1;i < limit;i++){
			
			ID_J		= i;
			partido_id	= rand.nextInt(54);
			Goles		= 0;
			TA			= 0;
			TR			= 0;
			
			partido_id	+= 1;
			
			stmt = conn.createStatement();
			
			sql = "INSERT INTO estadisticas_jugador (ID_J, partido_id, Goles, Tarjetas_Am, Tarjetas_Ro) VALUES ("+ID_J+", "+partido_id+", "+Goles+", "+TA+", "+TR+")";
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
