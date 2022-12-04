package dp.servlet;


import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dp.model.DeliveryPerson;


@WebServlet("/UpdateDPProfileServlet")
public class UpdateDPProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	//assign updates into these variables
		String dp_id = request.getParameter("id"); //id is the field name of input type
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String dob = request.getParameter("dob");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
	
		boolean isTrue;
		
		isTrue = dp.util.DeliveryPersonDBUtil.updateDPProfile(dp_id, name, phone, email, address, dob, username, password);
	
		if (isTrue == true) {
			
			//accessing method through list object

			List<DeliveryPerson> dpDetails = dp.util.DeliveryPersonDBUtil.getDPDetails(dp_id);
			request.setAttribute("dpDetails", dpDetails);

			// receives requests from the client and sends them
			RequestDispatcher dispatch = request.getRequestDispatcher("dpDashboard.jsp");
			dispatch.forward(request, response);
			
		}
		else {
			List<DeliveryPerson> dpDetails = dp.util.DeliveryPersonDBUtil.getDPDetails(dp_id);
			request.setAttribute("dpDetails", dpDetails);
			
			RequestDispatcher dispatch = request.getRequestDispatcher("dpProfile.jsp");
			dispatch.forward(request, response);
		}
	}

}


