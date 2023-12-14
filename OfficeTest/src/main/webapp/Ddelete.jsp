<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@page import="java.sql.*" %>
<%   
String id=request.getParameter("id");
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/dept","root","admin");
Statement st=con.createStatement();
st.executeUpdate("delete from dept_tb where id='"+id+"'");
response.sendRedirect("Department.jsp");
%>
<script>
alert("Data Deleted Done");

</script>