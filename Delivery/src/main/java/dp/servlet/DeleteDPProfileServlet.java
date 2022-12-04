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


@WebServlet("/deleteDPProfileServlet")
public class DeleteDPProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String dp_id = request.getParameter("id");
	
		boolean isTrue;
		
		isTrue = dp.util.DeliveryPersonDBUtil.deleteDPProfile(dp_id);
	
		//if connection is successful		

		if (isTrue == true) {
			
			RequestDispatcher dispatch = request.getRequestDispatcher("dpRegister.jsp");
			dispatch.forward(request, response);
		}
		else {
			
			//if connection is unsuccessful		

			
			List<DeliveryPerson> dpDetails = dp.util.DeliveryPersonDBUtil.getDPDetails(dp_id);
			request.setAttribute("dpDetails", dpDetails);
			
			RequestDispatcher dispatch = request.getRequestDispatcher("dpDashboard.jsp");
			dispatch.forward(request, response);
		}
	}

}
