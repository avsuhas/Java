package com.samson.sakilaproject.service;

import java.util.ArrayList;
import java.util.List;

import com.samson.sakilaproject.bo.InventoryBo;
import com.samson.sakilaproject.dao.IInventoryDao;
import com.samson.sakilaproject.dao.InventoryDao;
import com.samson.sakilaproject.dbo.InventoryDbo;

public class InventoryService implements IInventoryService{

	@Override
	public List<InventoryBo> findAll() {
		
		List<InventoryBo> list = new ArrayList<InventoryBo>();
		InventoryBo iBo = null;
		IInventoryDao iDao = new InventoryDao();
		
		try{
			 List<InventoryDbo> listDbo = iDao.findAll();
			 
			 for(InventoryDbo Dbo : listDbo){
				iBo = new InventoryBo();
				iBo.setFilmId(Dbo.getFilmId());
				iBo.setInventoryId(Dbo.getInverntoryId());
				iBo.setStoreId(Dbo.getStoreId());
				list.add(iBo);
			 }
		}
			 catch(Exception e){
				 e.printStackTrace();
			 }

		return list;
	}
}


