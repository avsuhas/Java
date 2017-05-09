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
import com.samson.sakilaproject.SakilaConstants;
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
		} finally {

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

		ActorDbo aDbo = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DataSource.getInstance().getConnection();
			StringBuilder sbr = new StringBuilder();
			sbr.append("select actor_id,first_name,last_name from sakila.actor where actor_id = " + id);
			pstmt = con.prepareStatement(sbr.toString());
			System.out.println("I am executing query here : " + sbr.toString());
			rs = pstmt.executeQuery();
			if (rs.next()) {
				aDbo = new ActorDbo();
				aDbo.setActorId(rs.getInt("actor_id"));
				aDbo.setFirstName(rs.getString("first_name"));
				aDbo.setLastName(rs.getString("last_name"));

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				DataSource.getInstance().closeConnection(pstmt, con, rs);
			} catch (IOException | PropertyVetoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return aDbo;
	}

	@Override
	public int insert(ActorDbo actorDbo) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		int i = 0;
		try {
			con = DataSource.getInstance().getConnection();
			StringBuilder sql = new StringBuilder();
			sql.append("insert into sakila.actor (actor_id,first_name,last_name)  values (?,?,?) ");
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, actorDbo.getActorId());
			pstmt.setString(2, actorDbo.getFirstName());
			pstmt.setString(3, actorDbo.getLastName());
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

	private String queryBuilder(String firstName, String lastName, String flag) {
		StringBuilder sbr = new StringBuilder();
		sbr.append("select first_name ,last_name, actor_id ");
		sbr.append("from sakila.actor ");
		sbr.append("where 1 = 1 and ");
		if (flag.equalsIgnoreCase(SakilaConstants.SEARCH_BY_FIRST_NAME)) {
			sbr.append("lower(first_name) like '" + firstName + "%' ");
		} else if (flag.equals(SakilaConstants.SEARCH_BY_LAST_NAME)) {
			sbr.append("lower(last_name) like '" + lastName + "%' ");
		} else if (flag.equalsIgnoreCase(SakilaConstants.SEARCH_BY_FIRST_AND_LAST_NAME)) {
			sbr.append("lower(first_name) like '" + firstName.toLowerCase() + "%' and  lower(last_name) like '"
					+ lastName.toLowerCase() + "%' ");
		} else if (flag.equalsIgnoreCase(SakilaConstants.SEARCH_BY_FIRST_OR_LAST_NAME)) {
			sbr.append("lower(first_name) like '" + firstName.toLowerCase() + "%' or lower(last_name) like '"
					+ lastName.toLowerCase() + "%'");
		}
		sbr.append(" order by 1;");
		System.out.println("Query to be executed here is" + sbr.toString());
		return sbr.toString();
	}

	@Override
	public List<ActorDbo> findBySearchString(String firstName, String lastName, String flag) throws SQLException {
		List<ActorDbo> list = new ArrayList<ActorDbo>();
		ActorDbo aDbo = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DataSource.getInstance().getConnection();
			String query = queryBuilder(firstName, lastName, flag);
			pstmt = con.prepareStatement(query);
			System.out.println("I am executing query here : " + query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println("here");
				aDbo = new ActorDbo();
				aDbo.setActorId(rs.getInt("actor_id"));
				aDbo.setFirstName(rs.getString("first_name"));
				aDbo.setLastName(rs.getString("last_name"));
				list.add(aDbo);
				System.out.println("here again");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				DataSource.getInstance().closeConnection(pstmt, con, rs);
			} catch (IOException | PropertyVetoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return list;

	}
	public static void main(String[] args) {
		List<ActorDbo> list = new ArrayList<ActorDbo>();
		ActorDao aDao = new ActorDao();
		try {
			list = aDao.findBySearchString("a","", SakilaConstants.SEARCH_BY_FIRST_NAME);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(list);
	}
	
}
