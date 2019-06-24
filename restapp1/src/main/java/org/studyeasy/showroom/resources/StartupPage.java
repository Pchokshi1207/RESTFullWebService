package org.studyeasy.showroom.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.studyeasy.showroom.model.ErrorPayload;

@Path("/")
public class StartupPage {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String usefulAnnotations(@HeaderParam("HeaderValue") String headerAttrib){
		
		return "Header value: "+headerAttrib;
	}
	
	
	@GET
	@Path("/demo")
	@Produces(MediaType.APPLICATION_JSON)
	public String contextDemo(@HeaderParam("header") String header) throws Exception{
		//ErrorPayload error=new ErrorPayload(404,"The value of custom header not found");
		//Response response=Response.status(404).entity(error).build();
		if(header==null){
			throw new NotFoundException();
		}
		return "The value of custom header value is:"+header;
	}

}
