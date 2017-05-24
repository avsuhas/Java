package com.samson.dao;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.samson.DataSource;

import com.samson.dbo.DeptManagerDbo;


public class DeptManagerDao implements IDeptManagerDao{

	@Override
	public List<DeptManagerDbo> findAll() {
		List<DeptManagerDbo> returnList = new ArrayList<DeptManagerDbo>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DataSource.getInstance().getConnection();
			StringBuilder sbr = new StringBuilder();
			sbr.append("select emp_no,dept_no,from_date,to_date from employees.dept_manager limit 20");
			pstmt = con.prepareStatement(sbr.toString());
			System.out.println("I am executing query here : " + sbr.toString());
			rs = pstmt.executeQuery();
			DeptManagerDbo dbo = null;
			while (rs.next()) {
				dbo = new DeptManagerDbo();
				dbo.setEmpNo(rs.getInt("emp_no"));
				dbo.setDeptNo(rs.getInt("dept_no"));
				dbo.setFromDate(rs.getString("from_date"));
				dbo.setToDate(rs.getString("to_date"));
				returnList.add(dbo);
				
				
				returnList.add(dbo);
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
	//	System.out.println("results "+returnList);
		return returnList;
	}

	@Override
	public DeptManagerDbo findById(int id) {
		DeptManagerDbo dbo = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DataSource.getInstance().getConnection();
			StringBuilder sbr = new StringBuilder();
			
			sbr.append("select emp_no,dept_no,from_date,to_date from employees.dept_manager where emp_no ="+id);
			pstmt = con.prepareStatement(sbr.toString());
		
			System.out.println("I am executing query here : " + sbr.toString());
			rs = pstmt.executeQuery();
		
			if (rs.next()) {
				System.out.println("enter here");
				dbo = new DeptManagerDbo();
				dbo.setEmpNo(rs.getInt("emp_no"));
				dbo.setDeptNo(rs.getInt("dept_no"));
				dbo.setFromDate(rs.getString("from_date"));
				dbo.setToDate(rs.getString("to_date"));
				
			}
			System.out.println("enter here3");
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
		System.out.println(dbo);
		return dbo;
	}

	@Override
	public int insert(DeptManagerDbo dbo) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		int id = 110022;
		DeptManagerDao dao = new DeptManagerDao();
		dao.findById(id);
	}
}
