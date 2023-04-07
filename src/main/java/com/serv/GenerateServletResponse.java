package com.serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class GenerateServletResponse extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String name = req.getParameter("user_name");
		String email = req.getParameter("user_email");
		String gender = req.getParameter("user_gender");
		String course = req.getParameter("user_course");
		if(req.getParameter("checked") != null) {
		out.println("<html><body>");
		out.print("<h2>HELLO<h2>");
		out.print("<h2>Your name is : " + name + "<h2>");
		out.print("<h2>Your gender is : " + gender + "<h2>");
		out.print("<h2>Your email is : " + email + "<h2>");
		out.print("<h2>Your course is : " + course+ "<h2>");
		
		out.println("</body></html>");
		}else {
			out.print("<h1>Please accept terms and conditions </h1>");
		}
		
	}
}
