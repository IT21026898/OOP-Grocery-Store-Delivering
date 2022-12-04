<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Delivery Person Dashboard</title>
		<link rel="stylesheet" type = "text/css" href="${pageContext.request.contextPath}/css/dpDashboard.css" />
			<%@ include file="header.jsp" %>
		
	</head>
	
<body>
         
			
	<!-- creating a loop -->

	<c:forEach var = "dp" items = "${dpDetails}"> 
		 
		<!-- internally calls the getId() method of DeliveryPerson class -->
		<c:set var ="dp_id" value = "${dp.dp_id}"/>
		
		<c:set var ="username" value = "${dp.username}"/>
		<c:set var ="password" value = "${dp.password}"/>
		<c:set var ="name" value = "${dp.name}"/>
		<c:set var ="phone" value = "${dp.phone}"/>
		<c:set var ="email" value = "${dp.email}"/>
		<c:set var ="address" value = "${dp.address}"/>
		<c:set var ="dob" value = "${dp.dob}"/>
		
	</c:forEach>
	
	<c:forEach var = "od" items = "${oDetails}"> 
		
		
		<c:set var ="order_id" value = "${od.order_id}"/>
		<c:set var ="payment_method" value = "${od.payment_method}"/>
		<c:set var ="location" value = "${od.location}"/>
		<c:set var ="username" value = "${od.username}"/>
		<c:set var ="odp_id" value = "${od.odp_id}"/>
		
	</c:forEach>
	
	
	
<!-- //////////////////////////////////////////////// -->
			
			
	
	

	
	<!-- My profile button  -->
	
				<c:url value="dpProfile.jsp" var="dpp"> 
			
					<c:param name="dp_id" value="${dp_id}"/>
					<c:param name="username" value="${username}"/>
					<c:param name="password" value="${password}"/>
					<c:param name="name" value="${name}"/>
					<c:param name="phone" value="${phone}"/>
					<c:param name="email" value="${email}"/>
					<c:param name="address" value="${address}"/>
					<c:param name="dob" value="${dob}"/>
					
				</c:url>
				
	<!-- Update Profile button -->		
	
				<c:url value="updateDPProfile.jsp" var="udp"> 
		
					<c:param name="dp_id" value="${dp_id}"/>
					<c:param name="username" value="${username}"/>
					<c:param name="password" value="${password}"/>
					<c:param name="name" value="${name}"/>
					<c:param name="phone" value="${phone}"/>
					<c:param name="email" value="${email}"/>
					<c:param name="address" value="${address}"/>
					<c:param name="dob" value="${dob}"/>
					
				</c:url>			
	<!-- Delete account button -->
	
				<c:url value="deleteDPProfile.jsp" var="dpDelete"> 
	
					<c:param name="dp_id" value="${dp_id}"/>
					<c:param name="username" value="${username}"/>
					<c:param name="password" value="${password}"/>
					<c:param name="name" value="${name}"/>
					<c:param name="phone" value="${phone}"/>
					<c:param name="email" value="${email}"/>
					<c:param name="address" value="${address}"/>
					<c:param name="dob" value="${dob}"/>
				
				</c:url>			
				
				
	<!-- Order delivering  -->
	
				<c:url value="orderDeliveringUI.jsp" var="oDeliver"> 
			
					<c:param name="order_id" value="${order_id}"/>
					<c:param name="payment_method" value="${payment_method}"/>
					<c:param name="location" value="${location}"/>
					<c:param name="username" value="${username}"/>
					<c:param name="odp_id" value="${odp_id}"/>
					
				</c:url>			
				
	<br><br>
		
		<div id="button_set">		
			<ul class = "ul1">
				<li>
					<a href="#" class="active" >
						<input type="button" id="button2" name="dash" value="Dashboard">
					</a>
				</li>
				
				<li>
					<a href="${dpp}" >
						<input type="button" id="button2" name="dpp" value="My Profile">
					</a>
				</li>
				
				<li>
					<a href="${udp}">
						<input type="button" id="button2" name="udp" value="Update Profile">
						</a>
				</li>
				
				<li>
					<a href = "${dpDelete}">
							<input type="button" id="button2" name="delete" value="Delete Profile">
						</a> 
				</li>
				
				<li>
				
					
					<a href = "${oDeliver}">
						<input type="button" id="button2" name= "oDeliver" value="Assigned deliveries">
					</a>
					
				</li>
				
				<li>
					<a href = "dpLogin.jsp">
							<input type="button" id="button2" name="logout" value="Log out">
						</a> 
				</li>
				
			</ul>
	</div>
			
        
   
     
     <div class="container" style="margin-left:15%;padding:1px;height:700px;">
  		
  		<div class="container1" style="margin-left:10%;">
  		<p id="topic">Welcome ${dp.name}!</p> 
  			<br><br>
  		     <div>
  		     <div class="container">
  <div class="box">
    <div class="imgBx">
      <img src="images/pack3.jpg">
    </div>
    <div class="content">
      <div>
        <h2>Safely Packed</h2>
        <p>All our items are packed in a way that you'll receive the good undamaged and fresh as it is.
        </p>
      </div>
    </div>
  </div>
  <div class="box">
    <div class="imgBx">
      <img src="images/handover2.jpg">
    </div>
    <div class="content">
      <div>
        <h2>Perfect Hand Over</h2>
        <p>We make sure to hand over the goods to you undamaged and fresh as it is within the delivery period.
        </p>
      </div>
    </div>
  </div>
  <div class="box">
    <div class="imgBx">
      <img src="images/pickup.png">
    </div>
    <div class="content">
      <div>
        <h2>Track your package</h2>
        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Commodi accusamus molestias quidem iusto.
        </p>
      </div>
    </div>
  </div>
  
</div>
  		     </div>
  		</div>
   
	</div>

      

</body>
</html>