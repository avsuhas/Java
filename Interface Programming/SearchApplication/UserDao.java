package com.samson.sakilaproject.dao;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.samson.sakilaproject.DataSource;
import com.samson.sakilaproject.dbo.UserDbo;

public class UserDao implements IUserDao {

	@Override
	public int insert(UserDbo userDbo) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		int i = 0;
		try {
			con = DataSource.getInstance().getConnection();
			StringBuilder sql = new StringBuilder();
			sql.append("insert into sakila.userdata (iduser,firstName,lastName)  values (?,?,?) ");
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, userDbo.getUserid());
			pstmt.setString(2, userDbo.getFirstName());
			pstmt.setString(3, userDbo.getLastName());
			System.out.println("I am executing query here : " + sql);
			i = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				DataSource.getInstance().closeConnection(pstmt, con, null);
			} catch (IOException | PropertyVetoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return i;

	}

	public static void main(String[] args) {
		UserDbo dbo = new UserDbo();
		dbo.setFirstName("aaaaa");
		dbo.setLastName("dddd");
		dbo.setUserid(23);
        UserDao dao = new UserDao();
        try {
			int i = dao.insert(dbo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
