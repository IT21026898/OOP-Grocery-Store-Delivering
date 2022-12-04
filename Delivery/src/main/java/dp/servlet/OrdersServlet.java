package dp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dp.model.OrderDelivering;
import dp.util.DeliveryPersonDBUtil;


@WebServlet("/OrdersServlet")
public class OrdersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter print = response.getWriter();
		response.setContentType("text/html");
		
		String od_id = request.getParameter("od_id");

		
		boolean isTrue = DeliveryPersonDBUtil.validateOrder(od_id);
		
		//if connection is successful		

		if (isTrue == true) { 

			//accessing method through list object
			List<OrderDelivering> oDetails = DeliveryPersonDBUtil.getOrder(od_id);
			request.setAttribute("oDetails", oDetails);
			
			// receives requests from the client and sends them
			RequestDispatcher dis = request.getRequestDispatcher("dpDashboard.jsp");
			dis.forward(request, response);
		}
		else {
			//if connection is not successful		

			print.println("<script type = 'text/javascript'>");
			print.println("alert('incorrect');");
			print.println("location = 'orderDeliveringUI.jsp'");
			print.println("</script>");
		}
	
	}

}
