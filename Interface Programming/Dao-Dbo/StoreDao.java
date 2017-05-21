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
import com.samson.sakilaproject.dbo.StoreDbo;

public class StoreDao implements IStoreDao{

	@Override
	public List<StoreDbo> findAll() {
		
		List<StoreDbo> returnList = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DataSource.getInstance().getConnection();
			StringBuilder sbr = new StringBuilder();
			sbr.append("select store_id,manager_staff_id,address_id from sakila.store");
			pstmt = con.prepareStatement(sbr.toString());
			System.out.println("I am executing query here : " + sbr.toString());
			rs = pstmt.executeQuery();
			StoreDbo obj = null;
			while (rs.next()) {
				obj = new StoreDbo();
				obj.setStoreId(rs.getInt("store_id"));
				obj.setManagerId(rs.getInt("manager_staff_id"));
				obj.setAddressId(rs.getInt("address_id"));
				returnList.add(obj);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {

			try {
				DataSource.getInstance().closeConnection(pstmt, con, rs);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (PropertyVetoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return returnList;
	}

	@Override
	public StoreDbo findById(int id) {
		
		StoreDbo aDbo = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DataSource.getInstance().getConnection();
			StringBuilder sbr = new StringBuilder();
			sbr.append("select store_id,manager_staff_id,address_id from sakila.store where store_id = " + id);
			pstmt = con.prepareStatement(sbr.toString());
			System.out.println("I am executing query here : " + sbr.toString());
			rs = pstmt.executeQuery();
			if (rs.next()) {
				aDbo = new StoreDbo();
				aDbo.setStoreId(rs.getInt("store_id"));
				aDbo.setManagerId(rs.getInt("manager_staff_id"));
				aDbo.setAddressId(rs.getInt("address_id"));

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				DataSource.getInstance().closeConnection(pstmt, con, rs);
			} catch (IOException | PropertyVetoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return aDbo;
	}

	@Override
	public int insert(StoreDbo storeDbo) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
