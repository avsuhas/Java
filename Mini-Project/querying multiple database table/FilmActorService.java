package com.samson.sakilaproject.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.samson.sakilaproject.bo.FilmActorBo;
import com.samson.sakilaproject.dao.ActorDao;
import com.samson.sakilaproject.dao.FilmActorDao;
import com.samson.sakilaproject.dao.FilmDao;
import com.samson.sakilaproject.dao.IFilmActorDao;
import com.samson.sakilaproject.dbo.ActorDbo;
import com.samson.sakilaproject.dbo.FilmActorDbo;
import com.samson.sakilaproject.dbo.FilmDbo;

public class FilmActorService implements IFilmActorService{

	@Override
	public List<FilmActorBo> findAll() {
	
		List<FilmActorBo> list = new ArrayList<FilmActorBo>();
		FilmActorBo fbo = null;
		IFilmActorDao dao = new FilmActorDao();
		String title = "";
		String firstName ="";
		String lastName = "";
		try{
			List<FilmActorDbo> filmList = dao.findAll();
			
			for(FilmActorDbo fDbo : filmList){
			fbo = new FilmActorBo();
			fbo.setActorId(fDbo.getActor_id());
			fbo.setFilmId(fDbo.getFilm_id());
			title = getTitle(fbo.getFilmId());
			firstName = getFirstName(fbo.getFilmId());
			fbo.setFirstName(firstName);
			lastName = getLastName(fbo.getFilmId());
			fbo.setLastName(lastName);
			fbo.setTitle(title);
			list.add(fbo);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}		
		return list;
	}
	
	public String getTitle(int id){
		FilmDao fdao = new FilmDao();
		FilmDbo dbo = fdao.findById(id);
	
		return dbo.getTitle();		
	}
	
	public String getFirstName(int id) throws SQLException{
		
		ActorDao adao = new ActorDao();
		ActorDbo dbo = adao.findById(id);
		return dbo.getFirstName();
		
	}
	
	public String getLastName(int id) throws SQLException{
		ActorDao adao = new ActorDao();
		ActorDbo dbo = adao.findById(id);
		return dbo.getLastName();
	}

}
