<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Error</title>
</head>
<body>
<form action="OfficeLobby.jsp" method="post">
<center>
<tr>
<table height="200px" width="300px">
<td>
<tr>
<td>UserName</td>
<td><input type="text" name="username" placeholder="Enter Username" required></td>
</tr>
<tr><td>Password</td>
<td><input type="password" name="password" placeholder="********" required></td>
</tr>
<td><input type="submit" name="login"></td>
</form>
<h3>Please enter valid credentials</h3>
</center>
</table>
</form>
</body>
</html>