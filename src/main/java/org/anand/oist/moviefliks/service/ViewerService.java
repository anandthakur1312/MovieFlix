package org.anand.oist.moviefliks.service;

import java.util.List;

import org.anand.oist.moviefliks.model.Viewer;

public interface ViewerService {
	public void save();
	public List<Viewer> getAllViewers();

}
