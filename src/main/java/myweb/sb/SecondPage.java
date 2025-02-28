package myweb.sb;

import java.io.PrintWriter;
import java.io.IOException;

import javax.servlet.http.*;

public class SecondPage extends HttpServlet{

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
//		int total = (int)req.getAttribute("total");
		
		HttpSession session = req.getSession();
		
		int total =(int) session.getAttribute("total");
		
		Cookie cookies[] = req.getCookies();
		
		PrintWriter pw = res.getWriter();
		for(Cookie cookie:cookies) {
			pw.println(cookie.getValue());
		}
		
		
		pw.print("Total "+ total);
	}
	
}
