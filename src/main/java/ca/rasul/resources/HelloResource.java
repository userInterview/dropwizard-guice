package ca.rasul.resources;

import ca.rasul.services.Greeter;
import ca.rasul.services.LoizInjectInterface;

import com.codahale.metrics.annotation.Timed;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author Nasir Rasul {@literal nasir@rasul.ca}
 */
@Path("/hello")
public class HelloResource {
	
    private final String message;

    private final Greeter greeter;
    
    @Inject 
    LoizInjectInterface loizInjectInterface ;

    @Inject
    public HelloResource(@Named("message") String message, Greeter greeter){
        this.message = message;
        this.greeter = greeter;
    }

    @GET
    @Timed
    @Inject
    public String hello(){
        return greeter.greet();
    }
    
	@GET
	@Path("/name")
	@Produces(MediaType.APPLICATION_JSON)
	public LoizInjectInterface getGuiceInjectName() {
		return loizInjectInterface ;
	}
	
}
