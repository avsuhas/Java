package com.samson.sakilaproject.dao;

import java.util.List;

import com.samson.sakilaproject.dbo.StoreDbo;



public interface IStoreDao {

public List<StoreDbo> findAll();
	
	public StoreDbo findById(int id);
	
	public int insert(StoreDbo storeDbo);

}
