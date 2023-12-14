<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Salary page</title>
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
#input{
height:25px;
width:200px;
margin-top:5px;
margin-bottom:5px;
}
tr{
padding-top:5px;
padding-bottom:5px;
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
<b style="color:Black;font-size:40px;height:25px">Salary Process</b>
</aside style="width:100%">
<center><h2 style="font-family:Lucida Bright">Enter Employee Details:</h2>
 <form action="SalaryProcess.jsp" method="POST" >
 <table >
 
 <tr><td>Employee Name:</td><td><input type="text" id="input" name="ename" autofocus></td></tr>
 <tr><td>Department:</td><td><input type="text" id="input" name="dept"></td></tr><tr></tr>
 <tr><td>Basic Salary:</td><td><input type="text" id="input" name="bsal"></td></tr>
 <tr><td>TA(%):</td><td><input type="text" id="input" name="ta"></td></tr>
 <tr><td>DA(%):</td><td><input type="text" id="input" name="da"></td></tr>
 <tr><td>HRA(%):</td><td><input type="text" id="input" name="hra"></td></tr>
 <tr><td>PF(%):</td><td><input type="text" id="input" name="pf"></td></tr>
 <tr><td>LIC(%):</td><td><input type="text" id="input" name="lic"></td></tr>

 <tr><td></td><td>
 <input type="reset" style="width:102px;height:30px;font-size:16pxp;background:#0f67bf;color:ghostwhite" value="Reset">
 <input type="submit" style="width:102px;height:30px;font-size:16px;background:#4CAF50;color:ghostwhite" value="Evaluate">
 </td></tr>
 </table>
 </center>




</section>
</section>








</div>
</body>
</html>