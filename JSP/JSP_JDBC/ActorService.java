package com.samson;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ActorService {

	public List<ActorBO> getActors() throws SQLException {
		List<ActorBO> actorList = new ArrayList<ActorBO>();
		ActorBO aBo = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		String url = "jdbc:mysql://localhost:3306/sakila";
		String user_name = "root";
		String password = "suhas123";
		// 1. get connection to db
		Connection myConn = DriverManager.getConnection(url, user_name, password);
		// 2. create statement
		Statement myStat = myConn.createStatement();
		// 3. write sql query
		StringBuilder sbr = new StringBuilder( "select actor_id,first_name,last_name from sakila.actor" );
        System.out.println("I am executing the query:" + sbr.toString());
		ResultSet myRs = myStat.executeQuery(sbr.toString());
		while (myRs.next()) {
			aBo = new ActorBO();
			aBo.setId(myRs.getInt("actor_id"));
			aBo.setFirst_Name(myRs.getString("first_name"));
			aBo.setLast_Name(myRs.getString("last_name"));
			actorList.add(aBo);
		}
		return actorList;
	}
	
	
	public static void main(String[] args) throws SQLException {
		
		List<ActorBO> list = new ArrayList<ActorBO>();
		ActorService service = new ActorService();
		list = service.getActors();
		System.out.println("Printing Actors here " + service.getActors());	
		
	}
	
}
