package com.samson.sakilaproject.service;

import java.util.ArrayList;
import java.util.List;

import com.samson.sakilaproject.bo.FilmBo;
import com.samson.sakilaproject.dao.FilmDao;
import com.samson.sakilaproject.dbo.FilmDbo;

public class FilmService implements IFilmService{

	@Override
	public List<FilmBo> findALL() {
		List<FilmBo> list = new ArrayList<FilmBo>();
		 
		FilmDao fDao = new FilmDao();
			
		List<FilmDbo> l = fDao.findAll();
		
		FilmBo fBo = null;
		for(FilmDbo bo : l){
			fBo = new FilmBo();
			fBo.setFilmId(bo.getFilmId());
			fBo.setTitle(bo.getTitle());
			fBo.setDescription(bo.getDescription());
			list.add(fBo);
		}
	
		return list;
	}
	

}
