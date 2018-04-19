package com.suhas;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectH2 {

	public static void main(String[] args) {
		
		try {
			Connection myConn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/interview", "sa", "");
		
			PreparedStatement ps = myConn.prepareStatement("delete from employee where id = ?");
		
			ps.setInt(1, 2);
			
			 ps.executeUpdate();
			
			System.out.println("done !!");
			
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
		
	}

}
