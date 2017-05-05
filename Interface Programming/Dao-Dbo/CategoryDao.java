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
import com.samson.sakilaproject.dbo.CategoryDbo;

public class CategoryDao implements ICategoryDao {

	public List<CategoryDbo> findAll() {
		List<CategoryDbo> list = new ArrayList<CategoryDbo>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DataSource.getInstance().getConnection();
			StringBuilder sbr = new StringBuilder();
			sbr.append("select category_id,name from sakila.category");
			pstmt = con.prepareStatement(sbr.toString());
			System.out.println("Executing query .." + sbr);
			rs = pstmt.executeQuery();
			CategoryDbo dbo = null;
			while (rs.next()) {
				dbo = new CategoryDbo();
				dbo.setCategory_id(rs.getInt("category_id"));
				dbo.setName(rs.getString("name"));
				list.add(dbo);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

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

		return list;
	}

	@Override
	public CategoryDbo findById(int id) {
		
		CategoryDbo cDbo = null;

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DataSource.getInstance().getConnection();
			StringBuilder sbr = new StringBuilder();
			sbr.append("select category_id,name from sakila.category where category_id=" + id);
			pstmt = con.prepareStatement(sbr.toString());
			System.out.println("Executing query .." + sbr);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				cDbo = new CategoryDbo();
				cDbo.setCategory_id(rs.getInt("category_id"));
				cDbo.setName(rs.getString("name"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

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
		return cDbo;
	}

	@Override
	public int insert(CategoryDbo dbo) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	public static void main(String[] args) {
		ICategoryDao category = new CategoryDao();
		CategoryDbo dbo = category.findById(3);
		System.out.println("Category DBO is " + dbo);
	}

}
