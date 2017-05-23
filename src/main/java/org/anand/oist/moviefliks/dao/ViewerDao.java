package org.anand.oist.moviefliks.dao;

import java.util.List;

import org.anand.oist.moviefliks.model.Viewer;

public interface ViewerDao {
	
	public List<Viewer> getAllViewers();
	public List<Viewer> createViewer(Viewer viewer);
	public String updateViewer(int id, Viewer viewer);
	public String deleteViewer(int id);

}
