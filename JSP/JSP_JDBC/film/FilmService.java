package com.samson;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FilmService {

	public List<FilmBO> getFilm(){
		
		List<FilmBO> filmList = new ArrayList<FilmBO>();
		FilmBO fBo = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		String url = "jdbc:mysql://localhost:3306/sakila";
		String user_name = "root";
		String password = "suhas123";
		try{
			// 1. get connection to db
			Connection myConn = DriverManager.getConnection(url, user_name, password);
			// 2. create statement
			Statement myStat = myConn.createStatement();
			// 3. write sql query
			StringBuilder sbr = new StringBuilder( "select film_id,title,description from sakila.film" );
	        System.out.println("I am executing the query:" + sbr.toString());
			ResultSet myRs = myStat.executeQuery(sbr.toString());
			while (myRs.next()) {
				fBo = new FilmBO();
				fBo.setFilm_id(myRs.getInt("film_id"));
				fBo.setTitle(myRs.getString("title"));
				fBo.setDescription(myRs.getString("description"));	
				filmList.add(fBo);
			}		
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return filmList;		
	}
	
	public static void main(String[] args) {
		
		List<FilmBO> list = new ArrayList<FilmBO>();
		FilmService service = new FilmService();
		
		list = service.getFilm();
		System.out.println("Displaying results :" + service.getFilm());	

	}
}
