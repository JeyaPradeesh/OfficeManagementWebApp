<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Department page</title>
</head>
<style>
#dash:hover{
color:ghostwhite;
font-size:30px;
}
#dash{
text-align:left;
font-size:20px;
}
#admin
{
text-align:left;
}
#dept 
{
width:100%;
display:inline-block;
}
#dept aside
{
display:inline-block;
border:solid black 1px;
height:120px;
margin:0px 30px 0px 30px;
}
#dept1
{
padding:0px 60px 0px 60px;
}
button {
	background-color: #4CAF50;
	border: none;
	color: white;
	padding: 10px 20px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
	margin: 4px 2px;
	cursor: pointer;
}
tr{
height:50px;
}
td{
text-align:center;
}
</style>
<body style="background-color:#d9d7de">
<div style="width:100%;height:auto">
<header style="width:100%;height:50px;background-color:#6308bf;color:#FFFAF0;font-size:42px;padding-left:10px"><a>Office Manager</a>
<a href="LoginPage.jsp" style="text-decoration:none;padding-left:930px;font-size:25px;color:white"><img src="logout-512.png" style="width:18px;height:18px">&nbsp Logout</a>
</header>
<section style="width:100%;height:600px;">
<aside style="float:left;width:226px;height:600px;background-color:#1b1c1c">
<div id="admin" style="background-color:#070808;height:90px"><img src="kindpng_101213.png" style="width:30px;hieght:40px;padding:10px 0px 0px 10px"><a style="color:#F0FFF0;">&nbsp Administrator</a></div><br>
<div style="height:465px">
<h3 id="dash"><img src="dashboard-512.png" style="width:18px;height:18px"><a href="OfficeLobby.jsp" style="text-decoration:none;color:white">&nbsp Dashboard</a></h3><br>
<h3 id="dash"><img src="Departmenticon.png" style="with:18px;height:18px"><a href="Department.jsp" style="text-decoration:none;color:white">&nbsp Department</a></h3><br>
<h3 id="dash"><img src="Stafs.png" style="width:18px;height:18px"><a href="Staff.jsp" style="text-decoration:none;color:white">&nbsp Staff</a></h3><br>
<h3 id="dash"><img src="rupee-512.png" style="width:18px;height:18px"><a href="Salary.jsp" style="text-decoration:none;color:white">&nbsp Salary</a></h3><br>
<h3 id="dash"><img src="leave.png" style="width:18px;height:18px"><a href="Leave.jsp" style="text-decoration:none;color:white">&nbsp Leave</a></h3><br>
</div>
</aside>
<section style="width:83%;height:600px;float:left">
<aside style="width:100%;height:50px">
<b style="color:Black;font-size:40px;height:25px">Department</b>
</aside>
		<div>
			<h2 style="font-size:30px">List of Departments</h2><hr>
			
			<div style="text-align:left">
				<button><a href="DeptAdd.jsp" style="font-size:20px;color:ghostwhite;text-decoration:none">
						Add New Department</a>
				</button>
			</div>
			<br>
		
		<table rules="colounm" border="2" align="center" width="1000"
				height="200">
				<tr>
				<th>id</th>       
				<th>Department Name</th>
				<th>Actions</th>
				</tr>
				
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ page import="javax.sql.*" %>
<%@ page import="com.officemanagement.dao.DeptDAO"%>
<%@ page import="com.officemanagement.model.Dept" %>
<%
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dept","root","admin");
Statement st=con.createStatement();
//Statement dst=con.createStatement();
ResultSet rs=st.executeQuery("select * from dept_tb");
//ResultSet drs=dst.executeQuery("delete from emp where id=?");
while(rs.next())
{
%>		
				<tr>
			        <td><%=rs.getString(1)%></td>
			        <td><%=rs.getString(2)%></td>
				   <td align="center"><a style="text-decoration:none;background:#0f67bf;color:ghostwhite;font-size:20px;padding:3px 3px 3px 3px;border-radius:6px"
				   href="DeptUpdate.jsp">
				  Edit</a>&nbsp&nbsp
		          <a href="Ddelete.jsp?id=<%=rs.getString("id")%>"
		          style="text-decoration:none;background:#f21916;color:ghostwhite;font-size:20px;padding:3px 3px 3px 3px;border-radius:6px">
				  Delete</a></td></tr>
<%
}
%>								
				 
				
			</table>
		</div>
	</div>
	</section>
	</section>
</body>
</html>