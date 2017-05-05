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
import com.samson.sakilaproject.dbo.CityDbo;

public class CityDao implements ICityDao{

	
	public List<CityDbo> findAll() throws SQLException {
		List<CityDbo> returnList = new ArrayList<CityDbo>();
		   Connection con = null;
	        PreparedStatement pstmt = null;
	        ResultSet rs = null;
	        try {
	            con = DataSource.getInstance().getConnection();
	            StringBuilder sbr = new StringBuilder();
	            sbr.append("select city_id,city,country_id from sakila.city");
	            pstmt = con.prepareStatement(sbr.toString());
	            System.out.println("I am executing query here : " + sbr.toString());
	            rs = pstmt.executeQuery(); 
	            CityDbo obj = null;
	            while (rs.next()) {
	            	obj = new CityDbo();
	            	obj.setCity_id(rs.getInt("city_id"));
	            	obj.setCity(rs.getString("city"));
	            	obj.setCountry_id(rs.getInt("country_id"));
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
	public CityDbo findById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(CityDbo cityDbo) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
