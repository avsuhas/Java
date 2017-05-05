package com.samson.sakilaproject.dao;

import java.util.List;

import com.samson.sakilaproject.dbo.CategoryDbo;

public interface ICategoryDao {
	
	public List<CategoryDbo> findAll();
	
	public CategoryDbo findById(int id);
	
	public int insert(CategoryDbo dbo);

}
