package myweb.sb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class Index extends HttpServlet{
		
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
//		
		int num1 = Integer.parseInt(req.getParameter("a"));
		int num2 = Integer.parseInt(req.getParameter("b"));
		
		
//		PrintWriter pw = res.getWriter();
//		pw.print(num1+num2);
		
		
//		req.setAttribute("total", num1+num2);
//		RequestDispatcher dispatcher = req.getRequestDispatcher("sq");
//		dispatcher.forward(req, res);
		
		
		HttpSession session = req.getSession();
		session.setAttribute("total", num1+num2);
		
		Cookie cookie = new Cookie("total", ""+(num1+num2));
		res.addCookie(cookie);
		
		res.sendRedirect("sq");
		
	}
}
