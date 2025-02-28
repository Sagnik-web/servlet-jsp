package myweb.sb.register.dao;

import myweb.sb.register.model.Register;
import java.sql.*;

public class RegisterDao {

	
	public void userRegister(Register register) throws ClassNotFoundException {
//		String INSERT_DATA = "insert into register(name,email,password,phone_no,address) values(?,?,?,?,?);";
		
		Class.forName("org.postgresql.Driver");
		
		try(Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb?useSSL=false", "postgres", "1234")){
			System.out.print("Hi "+register.getName());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
//		System.out.print("Hi "+register.getName());
	}
	
}
