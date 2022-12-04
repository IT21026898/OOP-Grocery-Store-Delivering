<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delivery Person Register</title>
	<link rel="stylesheet" type = "text/css" href="${pageContext.request.contextPath}/css/dpRegister.css" />
</head>
<body>


	<div class="split1">
  		<div class="centered">
			 <img id="leftImg" src="images/r4.jpg" alt="leftImg">
	  </div>
	</div>


	<div class="split2">
		    <div id="tbl">
		    
	
			
			<form action="insert" method="post">
			<br>
			<p id="topic">Register here</p> 
			
			<table>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name" required></td>
			</tr>
			
			<tr>
				<td>Mobile number</td>
				<td><input type="tel" name="phone" pattern="[0][7][0-9]{8}" title="Phone number must start with '07' preceeded by 8 numbers" required></td>
			</tr>
			
			<tr>
				<td>Email</td>
				<td> <input type="email" name="email"></td>
			</tr>
			
			<tr>
				<td>Address</td>
				<td><input type="text" name="address" required></td>
			</tr>
			
			<tr>
				<td>Date of birth</td>
				<td><input type="text" name="dob"></td>
			</tr>
			
			<tr>
				<td>User name</td>
				<td><input type="text" name="username" required></td>
			</tr>
			
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="
				password must contain at least one number and one uppercase and lowercase letter, with 8 or more characters" required></td>
			</tr>
			</table>	
				
			<br><br>	
			<input type="submit" name="submit" value="Register">
				
			<br><br><br><br>
			</form>
			</div>
	
	 	</div>

	

	
	
	

</body>
</html>