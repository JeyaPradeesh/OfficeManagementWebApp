<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table style="width:100%" border="1">
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ page import="javax.sql.*" %>
<%
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/staffdb","root","admin");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from emp");
while(rs.next())
{
%>
  <tr>
  <td><%=rs.getString(1)%></td>
  <td><%=rs.getString(2)%></td>
  <td><%=rs.getString(3)%></td>
  <td><%=rs.getString(4)%></td>
  <td><%=rs.getString(5)%></td>
  </tr>
<%
}
%>
</table>

</body>
</html>