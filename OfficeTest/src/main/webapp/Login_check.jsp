<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Administator</title>
</head>
<body>
<%
 String username=request.getParameter("username");
 String password=request.getParameter("password");
 if((username.equals("admin")&&password.equals("12345")))
 {
	 response.sendRedirect("OfficeLobby.jsp");
 }else
 {
	 System.out.println("INVALIDE LOGIN CREDENTIALS");
	 RequestDispatcher rd=request.getRequestDispatcher("Error.jsp");
	 rd.forward(request, response);
 }
%>
</body>
</html>