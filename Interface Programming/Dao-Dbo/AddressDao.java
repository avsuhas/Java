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
import com.samson.sakilaproject.dbo.AddressDbo;
import com.sun.jndi.cosnaming.IiopUrl.Address;

public class AddressDao implements IAddressDao{

	@Override
	public List<AddressDbo> findAll() {
			List<AddressDbo> returnList = new ArrayList<AddressDbo>();
			   Connection con = null;
		        PreparedStatement pstmt = null;
		        ResultSet rs = null;
		        try {
		            con = DataSource.getInstance().getConnection();
		            StringBuilder sbr = new StringBuilder();
		            sbr.append("select address_id,address,district,city_id,postal_code from sakila.address");
		            pstmt = con.prepareStatement(sbr.toString());
		            System.out.println("I am executing query here : " + sbr.toString());
		            rs = pstmt.executeQuery(); 
		            AddressDbo obj = null;
		            while (rs.next()) {
		            	obj = new AddressDbo();
		            	obj.setAddress_id(rs.getInt("address_id"));
		            	obj.setAddress(rs.getString("address"));
		            	obj.setDistrict(rs.getString("district"));
		            	obj.setCity_id(rs.getInt("city_id"));
		            	obj.setPostal_code(rs.getInt("postal_code"));
		            	returnList.add(obj);
		             }
		        }
		            catch(Exception e){
		            	e.printStackTrace();
		            }
		        finally {
			        
		        	try {
						try {
							DataSource.getInstance().closeConnection(pstmt, con, rs);
						} catch (SQLException | PropertyVetoException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		        }
		
		return returnList;
	}

	@Override
	public AddressDbo findById(int a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(AddressDbo addressDbo) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
