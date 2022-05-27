package loginandlogout;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class add extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");

		PrintWriter out =res.getWriter();
		req.getRequestDispatcher("link.html").include(req, res);
		HttpSession session = req.getSession(false);
		if(session!=null)
		{
req.getRequestDispatcher("addnumber.html").include(req, res);  

		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k= i+j;
		out.println("Sum of the number is: " +k);

	}else{  
 out.print("Please login First");  
 req.getRequestDispatcher("loginservlet.html").include(req, res);  

	}
}
}