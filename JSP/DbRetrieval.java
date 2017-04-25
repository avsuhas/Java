package com.samson;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbRetrieval {

	public static void main(String[] args) throws SQLException{
		
		
		String url = "jdbc:mysql://localhost:3306/sakila";
		String user_name = "root";
		String password = "suhas123";
		
		//1. get connection to db
		Connection myConn = DriverManager.getConnection(url,user_name,password);
		//2. create statement
		Statement myStat = myConn.createStatement();
		//3. write sql query
		String sql = "select actor_id,first_name,last_name from sakila.actor";
		
		ResultSet myRs = myStat.executeQuery(sql);
	
		while(myRs.next()){
			String actor_id = myRs.getString("actor_id");
			String first_name = myRs.getString("first_name");
			String last_name = myRs.getString("last_name");
			
			
			System.out.println("actor_id " + actor_id + "--> "+ "First_Name " + first_name +"--> "+ "Last_Name "+last_name );
			
		}
		
	}
}