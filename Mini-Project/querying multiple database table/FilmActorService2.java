package com.samson.sakilaproject.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.samson.sakilaproject.bo.FilmActorBo2;
import com.samson.sakilaproject.bo.FilmBo;
import com.samson.sakilaproject.dao.FilmActorDao;
import com.samson.sakilaproject.dao.FilmDao;
import com.samson.sakilaproject.dbo.FilmActorDbo;
import com.samson.sakilaproject.dbo.FilmDbo;

public class FilmActorService2 {
	
	public List<FilmActorBo2> findAll() {
		List<FilmActorBo2> returnList = new ArrayList<FilmActorBo2>();
		Map<Integer,List<Integer>> actorMap = actorMap();
		int actorId = 0;
		String title = "";
		FilmActorBo2 filmActorBo2 = null; 
		List<Integer> filmList;
		Iterator<Integer> iter = actorMap.keySet().iterator();
		while(iter.hasNext()){
			filmActorBo2 = new FilmActorBo2();
			actorId=iter.next();
			title = getTitle(actorId);
			filmList = actorMap.get(actorId);
			filmActorBo2.setTitle(title);
			filmActorBo2.setFilmList(findFilmInfo(filmList));
			returnList.add(filmActorBo2);
		}
		return returnList;
	}
 
	public Map<Integer,List<Integer>>  actorMap(){
		Map<Integer,List<Integer>> actorMap = new HashMap<Integer,List<Integer>>();
		FilmActorDao filmActorDao = new FilmActorDao();
		List<FilmActorDbo> filmActorDbo =filmActorDao.findAll();
		List<Integer> filmList;
		for(FilmActorDbo dbo :filmActorDbo){
			if(actorMap.containsKey(dbo.getActor_id())){
				filmList = actorMap.get(dbo.getActor_id());
			}
			else{
				filmList = new ArrayList<Integer>();
			}
		filmList.add(dbo.getFilm_id());
		actorMap.put(dbo.getFilm_id(), filmList);
		}
		
		return actorMap;		
	}

	public	List<FilmBo> findFilmInfo(List<Integer> actorList){
			List<FilmBo> returnList = new ArrayList<FilmBo>();
			FilmBo bo = null;
			FilmDao filmDao = new FilmDao();
			FilmDbo dbo = null;
			for(Integer filmId : actorList){
				dbo = filmDao.findById(filmId);
				bo = new FilmBo();
				bo.setFilmId(dbo.getFilmId());
				bo.setTitle(dbo.getTitle());
				bo.setDescription(dbo.getDescription());
				returnList.add(bo);
				
				
			}
			
			return returnList;
			
		}
	
		private String getTitle(int id) {
			FilmDao fdao = new FilmDao();
			FilmDbo dbo = fdao.findById(id);
			return dbo.getTitle();
		}
}
