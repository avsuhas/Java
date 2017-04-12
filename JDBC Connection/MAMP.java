package com.jdbc;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.*;

public class JDBCConnect {
	
	public Connection connect() {
        Connection conn = null;
 
        try {
            String userName = "root";
            String password = "suhas123";
            String url = "jdbc:mysql://localhost:3306/demo";
            System.out.println("Came here");
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            System.out.println("Here 1");
            conn = DriverManager.getConnection(url, userName, password);
            
            System.out.println("Database connection established");
 
        } catch (Exception e) {
 
            System.err.println("Cannot connect to database server");
            e.printStackTrace();
 
        }
        return conn;
 
    }

	public static void main(String args[])
	{
		JDBCConnect jdbc=new JDBCConnect();
		Connection con=jdbc.connect();
		
	}
	
}
