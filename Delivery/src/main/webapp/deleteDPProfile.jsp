<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>delete account</title>
	<link rel="stylesheet" type = "text/css" href="${pageContext.request.contextPath}/css/deleteDPProfile.css" />
	<%@ include file="header.jsp" %>
</head>

<body>

	<%
	//catching values passed through a paramater in dpProfile.jsp
	
		String dp_id = request.getParameter("dp_id"); // param name is given here
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String dob = request.getParameter("dob");
		
	%>
	
	<br><br>
	
	<p id="topic">Click delete to permanently delete your account</p> 
	
	<br> <Br>
	
	<div id="tbl"> 
	<br>
	
	
	<form action="delete" method="post">
	<table>
		<tr>
			<td>ID</td>
			<td><input type="text" name="id" value="<%=dp_id %>" readonly ></td>
		</tr>
		
		<tr>
			<td>Name</td>
			<td><input type="text" name="name" value="<%=name %>"readonly></td>
		</tr>
		
		<tr>
			<td>Mobile number</td>
			<td><input type="text" name="phone" value="<%=phone %>"readonly></td>
		</tr>
		
		<tr>
			<td>Email</td>
			<td><input type="text" name="email" value="<%=email %>"readonly></td>
		</tr>
		
		<tr>
			<td>Address</td>
			<td><input type="text" name="address" value="<%=address %>"readonly></td>
		</tr>
		
		<tr>
			<td>Date of birth</td>
			<td><input type="text" name="dob" value="<%=dob %>"readonly></td>
		</tr>
		
		
	</table>
	
	<br>
	<input type="submit" name="submit" value="Delete account" onclick="DeliveryPersonDBUtil.deleteDPProfile(dp_id)">
	
	</form>
	</div>
	
	<br> <br> <br> <br>

</body>
</html>