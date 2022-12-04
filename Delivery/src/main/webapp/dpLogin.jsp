<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">

	<link rel="stylesheet" type = "text/css" href="${pageContext.request.contextPath}/css/dpLogin.css" />

<title>Login</title>
</head>

	<body>
		<div class="area" >
	    	<ul class="circles">
	                    <li></li>
	                    <li></li>
	                    <li></li>
	                    <li></li>
	                    <li></li>
	                    <li></li>
	                    <li></li>
	                    <li></li>
	                    <li></li>
	                    <li></li>
	          </ul>
	            
	            
	         <br> <br>
	         
	          <p id = "topic">Delivery Person Login</p>
	          
	          <br> <br>
		
			<div id="beforeForm">
		
				<form action="login" method="post" id="loginF"> <br>
			
					<p id="label">User name</p> <br>
					<input type="text" name="username" placeholder="Enter username" required> <br><br> <br>
					
					<p id="label">Password</p> <br>
					<input type="password" name="pwd" placeholder="Enter password" required> <br><br>
					
					<br><br>
					
					<div id="btnD">
					<input type="submit" name="submit" value="Login">
					</div>
					
					<br> <br>
					
					<div style="text-align:center;">
						<a href="dpRegister.jsp">New? Register here</a>
					</div>
					
				</form>
			</div>
	    </div >	
	</body>
</html>