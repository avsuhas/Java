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

import com.samson.dbo.DeptEmpDbo;

public class DeptEmpDao implements IDeptEmpDao{

	@Override
	public List<DeptEmpDbo> findAll() {
		List<DeptEmpDbo> returnList = new ArrayList<DeptEmpDbo>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DataSource.getInstance().getConnection();
			StringBuilder sbr = new StringBuilder();
			sbr.append("select emp_no,dept_no,from_date,to_date from employees.dept_emp limit 20");
			pstmt = con.prepareStatement(sbr.toString());
			System.out.println("I am executing query here : " + sbr.toString());
			rs = pstmt.executeQuery();
			DeptEmpDbo dbo = null;
			while (rs.next()) {
				dbo = new DeptEmpDbo();
				dbo.setEmpNo(rs.getInt("emp_no"));
				dbo.setDeptNo(rs.getInt("dept_no"));
				dbo.setFromDate(rs.getString("from_date"));
				dbo.setToDate(rs.getString("to_date"));
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
		System.out.println("results "+returnList);
		return returnList;
	}

	@Override
	public DeptEmpDbo findById(int id) {
		DeptEmpDbo dbo = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DataSource.getInstance().getConnection();
			StringBuilder sbr = new StringBuilder();
			
			sbr.append("select emp_no,dept_no,from_date,to_date from employees.dept_emp where emp_no ="+id);
			pstmt = con.prepareStatement(sbr.toString());
			System.out.println("I am executing query here : " + sbr.toString());
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				dbo = new DeptEmpDbo();
				dbo.setEmpNo(rs.getInt("emp_no"));			
				dbo.setDeptNo(rs.getInt("dept_no"));
				dbo.setFromDate(rs.getString("from_date"));
				dbo.setToDate(rs.getString("to_date"));
				
			}
			System.out.println("here i'm");
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
	public int insert(DeptEmpDbo dbo) {
		// TODO Auto-generated method stub
		return 0;
	}

		public static void main(String[] args) {
			int id=10005;
			DeptEmpDao dao = new DeptEmpDao();
			dao.findById(id);
		}
}
