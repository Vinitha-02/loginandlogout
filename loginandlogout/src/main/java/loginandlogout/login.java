package loginandlogout;


import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class login extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");

		String user= req.getParameter("username");
		String pass= req.getParameter("password");
		PrintWriter out= res.getWriter();

		if(user.equals("Vinitha")&&pass.equals("12345")) {

	        req.getRequestDispatcher("link.html").include(req, res);  
	        out.println('\n'+"Welcome " +user);
	        HttpSession session=req.getSession();  
	        session.setAttribute("Username",user); 
			}else {
			out.println("Please enter the correct UserName or password");
			RequestDispatcher rd = req.getRequestDispatcher("loginservlet.html");
			rd.include(req, res);
		}

}}