package com.samson.sakilaproject.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.samson.sakilaproject.bo.ActorBo;
import com.samson.sakilaproject.dao.ActorDao;
import com.samson.sakilaproject.dao.IActorDao;
import com.samson.sakilaproject.dbo.ActorDbo;

public class ActorService implements IActorService {

	@Override
	public List<ActorBo> findAllActors() {
		List<ActorBo> list = new ArrayList<ActorBo>();
		ActorBo actorBo = null;
		IActorDao actorDao = new ActorDao();
		try {
			List<ActorDbo> actorsList = actorDao.findAll();
			 
			for (ActorDbo dbo : actorsList) {
				actorBo = new ActorBo();
				actorBo.setActorId(dbo.getActorId());
				actorBo.setFirstName(dbo.getFirstName());
				actorBo.setLastName(dbo.getLastName());
				list.add(actorBo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	}
	
	
	
	public List<ActorBo> findActorsBySearchString(String searchStr) throws SQLException{
		List<ActorBo> actors = new ArrayList<ActorBo>();
		IActorDao actorDao = new ActorDao();
		List<ActorDbo>  actorsDB = actorDao.findByChar(searchStr);
		ActorBo bo = null;
		for(ActorDbo actorDB : actorsDB) {
			bo = new ActorBo();
			bo.setActorId(actorDB.getActorId());
			bo.setFirstName(actorDB.getFirstName());
			bo.setLastName(actorDB.getLastName());
			actors.add(bo);
		}
		return actors;
	}

}
