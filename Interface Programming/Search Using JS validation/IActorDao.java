package com.samson.sakilaproject.dao;

import java.sql.SQLException;
import java.util.List;

import com.samson.sakilaproject.dbo.ActorDbo;

public interface IActorDao {
	
	public List<ActorDbo> findAll() throws SQLException;
	
	public ActorDbo findById(int id) throws SQLException;
	
	public List<ActorDbo> findByFirst(String str)throws SQLException;
	
	public List<ActorDbo> findByLast(String str)throws SQLException;
	
	public List<ActorDbo> findByBoth(String str,String str1)throws SQLException;
	
	public List<ActorDbo> findByEither(String str)throws SQLException;
	
	public int insert(ActorDbo actorDbo) throws SQLException;

}
