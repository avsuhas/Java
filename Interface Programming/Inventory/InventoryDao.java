package com.samson.sakilaproject.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.samson.sakilaproject.DataSource;
import com.samson.sakilaproject.dbo.InventoryDbo;

public class InventoryDao implements IInventoryDao{

	@Override
	public List<InventoryDbo> findAll() {
		
		List<InventoryDbo> list = new ArrayList<InventoryDbo>();
		InventoryDbo dbo = null;
		Connection con = null;
		PreparedStatement pstmt= null;
		ResultSet rs = null;
		
		try{
			con = DataSource.getInstance().getConnection();
			StringBuilder sbr = new StringBuilder();
			sbr.append("select inventory_id,film_id,store_id from inventory;");
			pstmt = con.prepareStatement(sbr.toString());
			rs = pstmt.executeQuery();
			while(rs.next()){
				dbo = new InventoryDbo();
				dbo.setFilmId(rs.getInt("inventory_id"));
				dbo.setInverntoryId(rs.getInt("film_id"));
				dbo.setStoreId(rs.getInt("film_id"));
				list.add(dbo);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		
		return list;
	}
public static void main(String[] args) {
	
	InventoryDao dao = new InventoryDao();
	List<InventoryDbo> list = new ArrayList<InventoryDbo>();
	list = dao.findAll();
	System.out.println(list);
}
}


