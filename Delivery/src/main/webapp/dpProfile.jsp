<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <!-- communicate with jsp page and java class using jstl -->
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>Delivery Person Profile</title>
	<link rel="stylesheet" type = "text/css" href="${pageContext.request.contextPath}/css/dpProfile.css" />
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
            
	<br><br>
	<p id="topic">My  Profile</p> 
	
	<br> <Br>
	

    <div id="tbl">
    <br>
	<table>
	
	<tr>
		<td>Delivery Person ID</td>
		<td id="detail"><%=dp_id %></td>
	</tr>
	
	<tr>
		<td>User name</td>
		<td  id="detail"><%=username %></td>
	</tr>
	
	<tr>
		<td>Name</td>
		<td id="detail"><%=name %></td>
	</tr>
	
	<tr>
		<td>Mobile number</td>
		<td id="detail"><%=phone %></td>
	</tr>
	
	<tr>
		<td>Email</td>
		<td id="detail"><%=email %></td>
	</tr>
	
	<tr>
		<td>Address</td>
		<td id="detail"><%=address %></td>
	</tr>
	
	<tr>
		<td>Date of birth</td>
		<td id="detail"><%=dob %></td>
	</tr>
	

	
	</table>
	<br>

	</div> 
	<br><br><br>

	</div>
	
	
	
</body>
</html>