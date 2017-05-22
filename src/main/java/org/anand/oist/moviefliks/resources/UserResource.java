package org.anand.oist.moviefliks.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.anand.oist.moviefliks.service.UserService;
import org.anand.oist.moviefliks.service.UserServiceImpl;


@Path("users")
public class UserResource {
	
	 	@GET
	    @Produces(MediaType.TEXT_PLAIN)
	    public String save() {	
	 		UserService userService = new UserServiceImpl();
	 		userService.save();
	 		System.out.println("User Resource is here");
	        return "User Resource!";
	    }
}
