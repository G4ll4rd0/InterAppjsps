<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
final boolean DEBUG = true;
String us = "";
String pw = "";
if (DEBUG)
{
	us = "capturista";
	pw = "CAP";
}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Intersalesianos|Log In</title>
	<link rel="stylesheet" type="text/css" href="aaaCssGeneralInterWebApp.css">
</head>
<body>
<!--Titulo-->
	<h1 class= "Titulo">intersalesianos</h1> 
			
	</div>

	<!--Usuario-->
	<div>
			<p class="subtitulos" style="position: absolute; top:20%; left:41%; font-size: 1.55em;">Nombre de Usuario</p>
	</div>

	<!--Contrase�a-->
	<div>
			<p class="subtitulos" style="position: absolute; top:40%; left:41%; font-size: 1.55em;">Contrase�a</p>	
	</div>
<form action="LogInFile.jsp" method="post">
<input type="text" style="position: absolute; width: 20%; height: 50px; top: 28%; left: 40%;" placeholder="Enter Username" name="us" id="us" value=<%=us %>>
<br/>
<input type="text" style="position: absolute; width: 20%; height: 50px; top: 48%; left: 40%;" placeholder="Contrase�a" name="pw" id="pw" value=<%=pw %>>
<br/>
<button type="submit" style="position: absolute; width: 11%; height: 6%; top: 65%; left: 52.5%; font-size: .9em;">Login</button>
</form>
</body>
</html>