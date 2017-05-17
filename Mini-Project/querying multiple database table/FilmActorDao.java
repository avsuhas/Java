package com.samson.sakilaproject.dao;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.samson.sakilaproject.DataSource;

import com.samson.sakilaproject.dbo.FilmActorDbo;

public class FilmActorDao implements IFilmActorDao {

	@Override
	public List <FilmActorDbo> findAll() {
		
		List<FilmActorDbo> returnList = new ArrayList<FilmActorDbo>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DataSource.getInstance().getConnection();
			StringBuilder sbr = new StringBuilder();
			sbr.append("select actor_id,film_id from sakila.film_actor");
			pstmt = con.prepareStatement(sbr.toString());
			System.out.println("I am executing query here : " + sbr.toString());
			rs = pstmt.executeQuery();
			FilmActorDbo obj = null;
			while (rs.next()) {
				obj = new FilmActorDbo();
				obj.setActor_id(rs.getInt("actor_id"));
				obj.setFilm_id(rs.getInt("film_id"));
				
				returnList.add(obj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {

			try {
				try {
					DataSource.getInstance().closeConnection(pstmt, con, rs);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (PropertyVetoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return returnList;
	}

	@Override
	public FilmActorDbo findById(int id) {
		FilmActorDbo fDbo = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DataSource.getInstance().getConnection();
			StringBuilder sbr = new StringBuilder();
			sbr.append("select actor_id,film_id from sakila.film_actor where actor_id = " + id);
			pstmt = con.prepareStatement(sbr.toString());
			System.out.println("I am executing query here : " + sbr.toString());
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				fDbo = new FilmActorDbo();
				fDbo.setActor_id(rs.getInt("actor_id"));
				fDbo.setFilm_id(rs.getInt("film_id"));			
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {

			try {
				try {
					DataSource.getInstance().closeConnection(pstmt, con, rs);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (PropertyVetoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return fDbo;
	}

	@Override
	public int insert(FilmActorDbo FilmActorDbo) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
