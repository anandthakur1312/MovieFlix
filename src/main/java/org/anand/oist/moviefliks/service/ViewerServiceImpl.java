package org.anand.oist.moviefliks.service;

import java.util.List;

import org.anand.oist.moviefliks.dao.ViewerDao;
import org.anand.oist.moviefliks.dao.ViewerDaoImpl;
import org.anand.oist.moviefliks.model.Viewer;
import org.springframework.beans.factory.annotation.Autowired;

public class ViewerServiceImpl implements ViewerService {

	ViewerDao viewerDao = new ViewerDaoImpl();
	
	@Override
	public void save() {
		viewerDao.save();
		
	}

	@Override
	public List<Viewer> getAllViewers() {
		return viewerDao.getAllViewers();
		
		
	}

}
