<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="dp.model.*"%>
<%@page import="dp.util.*"%>
<%@page import="dp.servlet.*"%>
<%@page import="java.util.*"%>
<%
DeliveryPerson dpDetails = (DeliveryPerson) request.getSession().getAttribute("dp");
request.setAttribute("dpDetails", dpDetails);
%>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link rel="stylesheet" type = "text/css" href="${pageContext.request.contextPath}/css/orderDelivering.css" />
	<%@ include file="header.jsp" %>
</head>

<body>



	<%
		String order_id = request.getParameter("order_id");
		String payment_method = request.getParameter("payment_method");
		String location = request.getParameter("location");
		String username = request.getParameter("username");
		String odp_id = request.getParameter("odp_id");
	%>
	
	<br><br>
	
	<p id="topic">Pending Deliveries</p>
	
	<br><br>
	
	<div id="tbl"> 
	<br>

		<form action="order" method="post">
	
 		
 		<table>
		<tr>
			<td>Order ID</td>
			<td><%=order_id %></td>
		</tr>
		
		<tr>
			<td>Payment method</td>
			<td><%=payment_method %></td>
		</tr>
		
		<tr>
			<td>Location</td>
			<td><%=location %></td>
		</tr>
		
		<tr>
			<td>Assigned delivery person</td>
			<td><%=dpDetails.getUsername() %></td>
		</tr>
		
		<tr>
			<td></td>
 			<td><input type="hidden" name="od_id"  value="<%=dpDetails.getDp_id() %>" readonly>
 		</td>
		</tr>
		
	
	</table>
	
	<input type="submit" name="order" value="Refresh deliveries">

	
	</form>
	
	</div>
	
	<br> <br><br>

</body>
</html>