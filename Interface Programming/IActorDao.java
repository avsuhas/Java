package com.samson.sakilaproject.dao;

import java.sql.SQLException;
import java.util.List;

import com.samson.sakilaproject.dbo.ActorDbo;

public interface IActorDao {
	
	public List<ActorDbo> findAll() throws SQLException;
	
	public ActorDbo findById(int id) throws SQLException;
	
	public int insert(ActorDbo actorDbo) throws SQLException;

}
