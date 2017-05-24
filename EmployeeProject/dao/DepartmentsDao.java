package com.samson.dao;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.samson.dbo.DepartmentsDbo;

import com.samson.DataSource;


public class DepartmentsDao implements IDepartmentsDao{

	@Override
	public List<DepartmentsDbo> findAll() {
		
			List<DepartmentsDbo> returnList = new ArrayList<DepartmentsDbo>();
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = DataSource.getInstance().getConnection();
				StringBuilder sbr = new StringBuilder();
				sbr.append("select dept_no,dept_name from employees.departments");
				pstmt = con.prepareStatement(sbr.toString());
				System.out.println("I am executing query here : " + sbr.toString());
				rs = pstmt.executeQuery();
				DepartmentsDbo dbo = null;
				while (rs.next()) {
					dbo = new DepartmentsDbo();
					dbo.setDeptNumber(rs.getString("dept_no"));
					dbo.setDeptName(rs.getString("dept_name"));
					
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
	public DepartmentsDbo findById(String id) {
		DepartmentsDbo dbo = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DataSource.getInstance().getConnection();
			StringBuilder sbr = new StringBuilder();
			
			sbr.append("select dept_no,dept_name from employees.departments where dept_no ='"+id+"'");
			pstmt = con.prepareStatement(sbr.toString());
			System.out.println("I am executing query here : " + sbr.toString());
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				dbo = new DepartmentsDbo();
				dbo.setDeptNumber(rs.getString("dept_no"));
				dbo.setDeptName(rs.getString("dept_name"));

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
		System.out.println(dbo);
		return dbo;
	}

	@Override
	public int insert(DepartmentsDbo dbo) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static void main(String[] args) {
		 String id = "d005";
		DepartmentsDao dao = new DepartmentsDao();
		dao.findById(id);
		
	}

}
