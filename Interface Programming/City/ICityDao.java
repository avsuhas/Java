package com.samson.sakilaproject.dao;

import java.sql.SQLException;
import java.util.List;

import com.samson.sakilaproject.dbo.CityDbo;

public interface ICityDao {
	
public List<CityDbo> findAll() throws SQLException;
	
	public CityDbo findById(int id) throws SQLException;
	
	public int insert(CityDbo cityDbo) throws SQLException;
}
