package com.samson.sakilaproject.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.samson.sakilaproject.bo.CityBo;
import com.samson.sakilaproject.dao.CityDao;
import com.samson.sakilaproject.dao.ICityDao;
import com.samson.sakilaproject.dbo.CityDbo;

public class CityService implements ICityService {

	@Override
	public List<CityBo> findAllCity() {
		List<CityBo> list = new ArrayList<CityBo>();
		CityBo cityBo = null;
		ICityDao cityDao = new CityDao();
		try {
			List<CityDbo> cityList = cityDao.findAll();
			 
			for (CityDbo dbo : cityList) {
				cityBo = new CityBo();
				cityBo.setCity_id(dbo.getCity_id());
				cityBo.setCity(dbo.getCity());
				cityBo.setCountry_id(dbo.getCountry_id());		
				list.add(cityBo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
