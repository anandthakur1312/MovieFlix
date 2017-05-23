package org.anand.oist.moviefliks.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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
	    public List<Viewer> getAllViewers() {	
	 		 System.out.println("User Resource is here");
	 	     return viewerService.getAllViewers();
	    }
	 	
	 	@POST
	    public List<Viewer> createViewer(Viewer viewer) {		
	 		List<Viewer> newViewer = viewerService.createViewer(viewer);
	 		 return newViewer;	   
	    }
	 	
	 	@PUT
	 	@Path("{id}")
	    public String updateViewer(@PathParam("id") int id, Viewer viewer) {		
	 		return viewerService.updateViewer(id, viewer);	 	   
	    }
	 	
	 	@DELETE
	 	@Path("{id}")
	    public String deleteViewer(@PathParam("id") int id) {		
	 		return viewerService.deleteViewer(id);	 	   
	    }
	 	
}
