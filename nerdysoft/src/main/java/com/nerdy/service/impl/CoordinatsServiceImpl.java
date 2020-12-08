package com.nerdy.service.impl;
import com.nerdysoft.Coordinats;

import java.util.List;
import org.apache.log4j.Logger;

import com.nerdy.dao.CoordinatsDao;
import com.nerdy.dao.impl.CoordinatsDaoImpl;
import com.nerdy.service.CoordinatsService;

public class CoordinatsServiceImpl implements CoordinatsService{

	private static Logger LOGGER = Logger.getLogger(CoordinatsServiceImpl.class);
	private static CoordinatsService coordinatService;
	private CoordinatsDao coordinatDao;
	
	 public CoordinatsServiceImpl() {
		 try {
			coordinatDao = new CoordinatsDaoImpl();
		} catch (Exception e) {
			LOGGER.error(e);
		}
	}
	 
	 public static CoordinatsService getCoordinatsService() {
		 if(coordinatService == null) {
			 coordinatService  = new CoordinatsServiceImpl() {
			};
		 }
		 return coordinatService;
	 }
	 
	@Override
	public Coordinats creat(Coordinats coordinats) {
		return coordinatDao.creat(coordinats);
	}

	@Override
	public Coordinats readById(Integer id) {
		return coordinatDao.readById(id);
	}

	@Override
	public Coordinats update(Coordinats coordinats) {
		throw new IllegalStateException("we dont need this now, but maybe we will need it in the future");
	}

	@Override
	public void delete(Integer id) {
		throw new IllegalStateException("we dont need this now, but maybe we will need it in the future");
	}

	@Override
	public List<Coordinats> readAll() {
		throw new IllegalStateException("we dont need this now, but maybe we will need it in the future");
	}

}
