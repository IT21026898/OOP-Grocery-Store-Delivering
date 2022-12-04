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
</head>
<body>
<h1>order Delivering UI</h1>

	<%
		String order_id = request.getParameter("order_id");
		String payment_method = request.getParameter("payment_method");
		String location = request.getParameter("location");
		String username = request.getParameter("username");
		String odp_id = request.getParameter("odp_id");
	%>
	
	
	
	
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
			<td>User name</td>
			<td><%=username %></td>
		</tr>
		
		<tr>
			<td>Delivery Person ID</td>
 			<td><input type="text" name="od_id"  value="<%=dpDetails.getDp_id() %>" readonly>
 		</td>
		</tr>
		
	
	</table>
	
	
	
	
	

</body>
</html>