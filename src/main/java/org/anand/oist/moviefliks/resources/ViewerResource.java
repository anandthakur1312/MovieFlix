package org.anand.oist.moviefliks.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.anand.oist.moviefliks.model.Viewer;
import org.anand.oist.moviefliks.service.ViewerService;
import org.anand.oist.moviefliks.service.ViewerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;


@Path("viewers")
@Produces(MediaType.APPLICATION_XML)
@Consumes(MediaType.APPLICATION_XML)
public class ViewerResource {
	
	ViewerService viewerService = new ViewerServiceImpl();
	
	 	@GET
	 	@Path("insert")
	    public String save() {	
	 		
	 		viewerService.save();
	 		System.out.println("User Resource is here");
	        return "User Resource!";
	    }
	 	
	 	@GET
	    public List<Viewer> getAllViewers() {	
	 		 System.out.println("User Resource is here");
	 	     return viewerService.getAllViewers();
	   
	    }
	 	
	 	@POST
	    public List<Viewer> createViewer(Viewer viewer) {	
	 		
	 		List<Viewer> newViewer = viewerService.createViewer(viewer);
	 		 return newViewer;
	   
	    }
	 	
	 	
	 	
	 	
}
