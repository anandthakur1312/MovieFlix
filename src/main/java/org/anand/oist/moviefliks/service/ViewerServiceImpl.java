package org.anand.oist.moviefliks.service;

import java.util.List;

import org.anand.oist.moviefliks.dao.ViewerDao;
import org.anand.oist.moviefliks.dao.ViewerDaoImpl;
import org.anand.oist.moviefliks.model.Viewer;
import org.springframework.beans.factory.annotation.Autowired;

public class ViewerServiceImpl implements ViewerService {

	ViewerDao viewerDao = new ViewerDaoImpl();
	
	@Override
	public List<Viewer> getAllViewers() {
		return viewerDao.getAllViewers();
	}

	@Override
	public List<Viewer> createViewer(Viewer viewer) {			
		return viewerDao.createViewer(viewer);
	}

	@Override
	public String updateViewer(int id, Viewer viewer) {			
		return viewerDao.updateViewer(id, viewer);
	}

	@Override
	public String deleteViewer(int id) {
		
		return viewerDao.deleteViewer(id);
	}

}
