package com.adjecti.meeting.rest.application;

import com.adjecti.meeting.model.Meeting;
import com.adjecti.meeting.service.MeetingService;
import com.liferay.portal.kernel.json.JSONFactoryUtil;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.jaxrs.whiteboard.JaxrsWhiteboardConstants;

/**
 * @author 12345
 */
@Component(
	property = {
		JaxrsWhiteboardConstants.JAX_RS_APPLICATION_BASE + "=/greetings",
		JaxrsWhiteboardConstants.JAX_RS_NAME + "=Greetings.Rest"
	},
	service = Application.class
)
public class MeetingRestApplication extends Application {

	@Reference
	private MeetingService meetingService;
	
	public Set<Object> getSingletons() {
		return Collections.<Object>singleton(this);
	}
	
	
	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllMeeting() {
		try {
			List<Meeting> listOfMeeting=meetingService.getAllMeeting();
			
			return Response.ok(JSONFactoryUtil.serialize(listOfMeeting)).build(); 
		}catch (Exception e) {
			return Response.ok().build();
		}
		
	}
	@GET
	@Path("/{meetingId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getMeetingById(@PathParam("meetingId") long meetingId) {
		
		System.out.println("----------===========11111111!!!!!!!!!!!!1 :-----    "+meetingId);
		try {
			Meeting meeting=meetingService.getMeetingById(meetingId);
			System.out.println(meeting);
			Response.ok(meeting).build();
			
		}catch (Exception e) {
			e.printStackTrace();
			Response.serverError().build();
		}
		return Response.ok().build();
	}
	
	@POST
	@Path("/add-meeting")
	@Produces(MediaType.APPLICATION_JSON)
	public Response addMeeting(Meeting meeting) {
		
		System.out.println("----------===========11111111!!!!!!!!!!!!1"); 
		return Response.ok().build();
	}
	
	@GET
	@Path("/{meetingId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteMeeting(@PathParam("meetingId") long meetingId) {
		
		System.out.println("----------===========11111111!!!!!!!!!!!!1 :-----    "+meetingId);
		try {
			Response.ok(meetingService.deleteById(meetingId)).build();
			
		}catch (Exception e) {
			Response.serverError().build();
		}
		return Response.ok().build();
	}

	@GET
	@Produces("text/plain")
	public String working() {
		return "It works!";
	}

	@GET
	@Path("/morning")
	@Produces("text/plain")
	public String hello() {
		return "Good morning!";
	}

	@GET
	@Path("/morning/{name}")
	@Produces("text/plain")
	public String morning(
		@PathParam("name") String name,
		@QueryParam("drink") String drink) {

		String greeting = "Good Morning " + name;

		if (drink != null) {
			greeting += ". Would you like some " + drink + "?";
		}

		return greeting;
	}

}