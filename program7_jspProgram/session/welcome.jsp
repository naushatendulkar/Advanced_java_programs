/* 7a. Build a Session Management using JSP program set with one minute session expiry time to get
your name through text box and press submit to display the message by greeting Hello your name!.
Check the expiry of the session after one minute. */

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String name=request.getParameter("uname");
out.print("Welcome!"+name);
out.print("<br>Session has started ... "+name);
session.setAttribute("user",name);
out.print("<br>your name has been stored in session object");
session.setMaxInactiveInterval(60);
out.print("<br>One minute is set for the session expiry");
out.print("<br>Kindly press the following link to check it<br>");
%>
<a href="second.jsp">Display the value</a>
</body>
</html>
