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
import javax.servlet.http.HttpSession;

import dp.model.DeliveryPerson;
import dp.util.DeliveryPersonDBUtil;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Prints formatted representations of objects to a text-output stream
		PrintWriter print = response.getWriter();
		response.setContentType("text/html");
		
		
		//Catch the inserted username password entered through Login.jsp page
		String username = request.getParameter("username");
		String password = request.getParameter("pwd");
		
		
		
		try {
			//calling validateup method and passing it's into a list object
			List<DeliveryPerson> dpDetails = DeliveryPersonDBUtil.validateup(username, password);
			
			//stores/set the details needed to be redirected
			request.setAttribute("dpDetails", dpDetails);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		boolean isTrue = DeliveryPersonDBUtil.validate(username, password);
		
		
		//if connection is successful		
		if (isTrue == true) {
			
			//creating session
			HttpSession session = request.getSession();
			
			//create new object from DeliveryPerson class and accessing getDeliveryPerson method through it
			DeliveryPerson dp = DeliveryPersonDBUtil.getDeliveryPerson(username);

			//setting session attribute
			session.setAttribute("dp", dp);
		
			// redirect the session details into dpDashboard page
			RequestDispatcher dis = request.getRequestDispatcher("dpDashboard.jsp");
			
			//Forwards a request froma servlet to another resource 
			dis.forward(request, response);
		}
		else {
			//if unsucccessful print error message
			
			print.println("<script type = 'text/javascript'>");
			print.println("alert('Your username or password is incorrect');");
			print.println("location = 'dpLogin.jsp'");
			print.println("</script>");
		}
		
		 
		
		

		
	}

}
