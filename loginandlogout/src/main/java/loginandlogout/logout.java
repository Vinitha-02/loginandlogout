package loginandlogout;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class logout extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");

		HttpSession session= req.getSession();
		session.invalidate();
		PrintWriter out= res.getWriter();
		out.println("You are succesfully logged out!");
		 req.getRequestDispatcher("loginservlet.html").include(req, res);  

		
	}

}
