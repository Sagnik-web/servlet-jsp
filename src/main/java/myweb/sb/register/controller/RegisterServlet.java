package myweb.sb.register.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import myweb.sb.register.dao.RegisterDao;
import myweb.sb.register.model.Register;

public class RegisterServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res)  {
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String phone_no = req.getParameter("phone_no");
		String address = req.getParameter("address");
		
		
		Register reg = new Register();
		reg.setName(name);
		reg.setEmail(email);
		reg.setPassword(password);
		reg.setPhone_no(phone_no);
		reg.setAddress(address);
		
		RegisterDao regDao  = new RegisterDao();
		try {
			regDao.userRegister(reg);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		PrintWriter pw = res.getWriter();
//		pw.println(name+"");
		
	}
}
