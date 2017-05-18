package com.samson.sakilaproject.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.samson.sakilaproject.bo.ActorBo;
import com.samson.sakilaproject.bo.FilmActorBo;
import com.samson.sakilaproject.dao.ActorDao;
import com.samson.sakilaproject.dao.FilmActorDao;
import com.samson.sakilaproject.dao.FilmDao;
import com.samson.sakilaproject.dao.IActorDao;
import com.samson.sakilaproject.dao.IFilmActorDao;
import com.samson.sakilaproject.dbo.ActorDbo;
import com.samson.sakilaproject.dbo.FilmActorDbo;
import com.samson.sakilaproject.dbo.FilmDbo;

public class FilmActorService implements IFilmActorService {

	@Override
	public List<FilmActorBo> findAll() {
		List<FilmActorBo> returnList = new ArrayList<FilmActorBo>();
		Map<Integer, List<Integer>> filmActorMap = filmActorMap();
		int filmId = 0;
		String title = "";
		FilmActorBo filmActorBo = null;
		List<Integer> actorList;
		Iterator<Integer> iter = filmActorMap.keySet().iterator();
		while (iter.hasNext()) {
			filmActorBo = new FilmActorBo();
			filmId = iter.next();
			title = getTitle(filmId);
			actorList = filmActorMap.get(filmId);
			filmActorBo.setTitle(title);
			filmActorBo.setActorList(findActorsInformation(actorList));
			returnList.add(filmActorBo);
		}
		System.out.println(returnList);
		return returnList;

	}






	private Map<Integer, List<Integer>> filmActorMap() {
		Map<Integer, List<Integer>> filmActorMap = new HashMap<Integer, List<Integer>>();
		IFilmActorDao iFilmActorDao = new FilmActorDao();
		List<FilmActorDbo> filmActorList = iFilmActorDao.findAll();
		List<Integer> actorList = null;
		for (FilmActorDbo dbo : filmActorList) {
			if (filmActorMap.containsKey(dbo.getFilm_id())) {
				actorList = filmActorMap.get(dbo.getFilm_id());
			} else {
				actorList = new ArrayList<Integer>();
			}
			actorList.add(dbo.getActor_id());
			filmActorMap.put(dbo.getFilm_id(), actorList);
		}
		return filmActorMap;
	}
	
	
	
	
	
	
	public List<ActorBo>  findActorsInformation(List<Integer> actorList){
		List<ActorBo> returnList = new ArrayList<ActorBo>();
	    ActorBo bo = null;
		ActorDbo dbo = null;
		IActorDao dao = new ActorDao();
		for(Integer actorId : actorList) {
	    	try {
				dbo = dao.findById(actorId);
				bo = new ActorBo();
				bo.setActorId(dbo.getActorId());
				bo.setFirstName(dbo.getFirstName());
				bo.setLastName(dbo.getLastName());
				returnList.add(bo);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
	    }
		
		
		return returnList;
		
		
		
	}
	
	public static void main(String[] args) {
		FilmActorService service = new FilmActorService();
		service.findAll();
	}

	private String getTitle(int id) {
		FilmDao fdao = new FilmDao();
		FilmDbo dbo = fdao.findById(id);
		return dbo.getTitle();
	}

	
}
