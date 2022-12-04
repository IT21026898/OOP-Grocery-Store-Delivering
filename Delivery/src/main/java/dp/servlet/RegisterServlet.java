package dp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//Catch the inserted details entered through dpRegister.jsp page

			String name = request.getParameter("name"); //input type name
			String phone = request.getParameter("phone");
			String email = request.getParameter("email");
			String address = request.getParameter("address");
			String dob = request.getParameter("dob");
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			
			boolean isTrue;
			
			
			isTrue = dp.util.DeliveryPersonDBUtil.insertDeliveryPerson(name, phone, email, address, dob, username, password);

			//if connection is successful
			if (isTrue == true) {
				RequestDispatcher disS = request.getRequestDispatcher("dpLogin.jsp");
				disS.forward(request, response);
			}
			else {
				RequestDispatcher disU = request.getRequestDispatcher("dpRegister.jsp");
				disU.forward(request, response);
			}
	
	}

}
