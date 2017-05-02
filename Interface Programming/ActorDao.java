package com.samson.sakilaproject.dao;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.samson.sakilaproject.DataSource;
import com.samson.sakilaproject.dbo.ActorDbo;

public class ActorDao implements IActorDao {

	@Override
	public List<ActorDbo> findAll() throws SQLException {
		List<ActorDbo> returnList = new ArrayList<>();
		   Connection con = null;
	        PreparedStatement pstmt = null;
	        ResultSet rs = null;
	        try {
	            con = DataSource.getInstance().getConnection();
	            StringBuilder sbr = new StringBuilder();
	            sbr.append("select actor_id,first_name,last_name from sakila.actor");
	            pstmt = con.prepareStatement(sbr.toString());
	            System.out.println("I am executing query here : " + sbr.toString());
	            rs = pstmt.executeQuery(); 
	            ActorDbo obj = null;
	            while (rs.next()) {
	            	obj = new ActorDbo();
	            	obj.setActorId(rs.getInt("actor_id"));
	            	obj.setFirstName(rs.getString("first_name"));
	            	obj.setLastName(rs.getString("last_name"));
	            	returnList.add(obj);
	             }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } catch (Exception e) {
				// TODO: handle exception
			}finally {
	        
	        	try {
					DataSource.getInstance().closeConnection(pstmt, con, rs);
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
	public ActorDbo findById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(ActorDbo actorDbo) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
