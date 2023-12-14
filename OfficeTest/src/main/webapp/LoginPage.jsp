<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Login Page </title>
<link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">


<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous"><link rel="stylesheet" href="./style.css">

</head>
<body>
<form action="Login_check.jsp" method="post">
<!-- partial:index.partial.html -->
<div class="box-form">
	<div class="left">
		<div class="overlay">
		<h1>Super Saiyans</h1>
		<p></p>
		<span>
			<p>About Us In Social Media</p>
			<a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a>
			&nbsp &nbsp &nbsp &nbsp<a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a>
			<a href="#"><i class="fa fa-instagram" aria-hidden="true"></i></a>
		</span>
		</div>
	</div>
	
	
		<div class="right">
		<h5>Login</h5>
		<p>_____________________________________________________________</p>
		<div class="inputs">
			<input type="text" placeholder="user name" name="username">
			<br>
			<input type="password" placeholder="password" name="password">
		</div>
			
			<br><br>
			
		<div class="remember-me--forget-password">
				<!-- Angular -->
	<%--<label>
		<input type="checkbox" name="item" checked/>
		<span class="text-checkbox"></span>
	</label> --%>
			<p>forget password?</p>
		</div>
			
			<br>
			<button>Login</button>
	</div>
	
</div>
<!-- partial -->
  </form>
</body>
</html>
