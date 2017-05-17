package com.samson.sakilaproject.dao;

import java.util.List;

import com.samson.sakilaproject.dbo.FilmActorDbo;

public interface IFilmActorDao {
	
	public List<FilmActorDbo> findAll();
	
	public FilmActorDbo findById(int id);
	
	public int insert(FilmActorDbo FilmActorDbo);
	

}
