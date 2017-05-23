package org.anand.oist.moviefliks.dao;

import java.util.List;

import org.anand.oist.moviefliks.model.Viewer;

public interface ViewerDao {
	
	public void save();
	public List<Viewer> getAllViewers();

}
