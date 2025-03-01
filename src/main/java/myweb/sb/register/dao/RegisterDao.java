package myweb.sb.register.dao;

import myweb.sb.register.model.Register;
import java.sql.*;

public class RegisterDao {

	
	public void userRegister(Register register) throws ClassNotFoundException {
		String INSERT_DATA = "insert into register(name,email,password,phone_no,address) values(?,?,?,?,?);";
		
		Class.forName("org.postgresql.Driver");
		
		try(Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb?useSSL=false", "postgres", "1234");
				PreparedStatement ps = conn.prepareStatement(INSERT_DATA)	){
			
			
			ps.setString(1, register.getName());
			ps.setString(2, register.getEmail());
			ps.setString(3, register.getPassword());
			ps.setString(4, register.getPhone_no());
			ps.setString(5, register.getAddress());
	
			int result = ps.executeUpdate();
			
			if(result == 1) {
				System.out.println("Data Inserted Successfully.");
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
//		System.out.print("Hi "+register.getName());
		
	}
	
}
