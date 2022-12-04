<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update DP Profile</title>
		<link rel="stylesheet" type = "text/css" href="${pageContext.request.contextPath}/css/updateDPProfile.css" />
		<%@ include file="header.jsp" %>

</head>
<body>
<br>


		

	<%

	
		String dp_id = request.getParameter("dp_id"); // param name is given here
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String dob = request.getParameter("dob");
		
	%>
	
	<br>
	
	<p id="topic">Update Profile</p> 
	
	<br> <Br>
	
	<div id="tbl"> 
	<br>

	<form action="update" method="post">
	<table>
		<tr>
			<td>ID</td>
			<td><input type="text" name="id" value=<%=dp_id %> readonly ></td>
		</tr>
		
		<tr>
			<td>Name</td>
			<td><input type="text" name="name" value=<%=name %>></td>
		</tr>
		
		<tr>
			<td>Mobile number</td>
			<td><input type="text" name="phone" value="<%=phone %>"></td>
		</tr>
		
		<tr>
			<td>Email</td>
			<td><input type="text" name="email" value="<%=email %>"></td>
		</tr>
		
		<tr>
			<td>Address</td>
			<td><input type="text" name="address" value="<%=address %>"></td>
		</tr>
		
		<tr>
			<td>Date of birth</td>
			<td><input type="text" name="dob" value="<%=dob %>"></td>
		</tr>
		
		<tr>
			<td>User name</td>
			<td><input type="text" name="username" value="<%=username %>"></td>
		</tr>
		
		<tr>
			<td>Password</td>
			<td><input type="password" name="password" value="<%=password %>"></td>
		</tr>
		
	</table>
	
	<br>
	<input type="submit" name="submit" value="Update Profile">
	
	</form>
	</div>
	
	<br> <br> <br> <br>

</body>
</html>