package com.adjecti.meeting.rest.application;

import com.adjecti.meeting.model.Meeting;
import com.adjecti.meeting.service.MeetingService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.liferay.portal.kernel.json.JSONFactoryUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.jaxrs.whiteboard.JaxrsWhiteboardConstants;

/**
 * @author 12345
 */
@Component(immediate = true, property = { JaxrsWhiteboardConstants.JAX_RS_APPLICATION_BASE + "=/meeting",
		JaxrsWhiteboardConstants.JAX_RS_NAME + "=Meeting.Rest" }, service = Application.class)
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
			List<Meeting> listOfMeeting = meetingService.getAllMeeting();
			List<MeetingDTO> meetingDTO = new ArrayList<MeetingDTO>();
			listOfMeeting.forEach(c -> {
				MeetingDTO m = new MeetingDTO();
				m.setMeetingId(c.getMeetingId());
				m.setTitle(c.getTitle());
				m.setDateAndTime(c.getDateAndTime());
				m.setLocation(c.getLocation());
				m.setAgenda(c.getAgenda());
				m.setDescription(c.getDescription());
				m.setCreatedBy(c.getCreatedBy());
				m.setHostedBy(c.getHostedBy());
				m.setMeetingType(c.getMeetingType());
				m.setMeetingRoom(c.getMeetingRoom());
				m.setMeetingLink(c.getMeetingLink());
				m.setAssetsName(c.getAssetsName());
				m.setInternalGuest(c.getInternalGuest());
				m.setExternalGuest(c.getExternalGuest());
				meetingDTO.add(m);
			});

			return Response.ok(JSONFactoryUtil.serialize(meetingDTO)).build();
		} catch (Exception e) {
			return Response.ok().build();
		}

	}

	@GET
	@Path("/{meetingId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getMeetingById(@PathParam("meetingId") long meetingId) {

		System.out.println("----------===========11111111!!!!!!!!!!!!1 :-----    " + meetingId);
		try {
			Meeting meeting = meetingService.getMeetingById(meetingId);

			MeetingDTO meetingDTO = new MeetingDTO();
			meetingDTO.setMeetingId(meeting.getMeetingId());
			meetingDTO.setTitle(meeting.getTitle());
			meetingDTO.setDateAndTime(meeting.getDateAndTime());
			meetingDTO.setLocation(meeting.getLocation());
			meetingDTO.setAgenda(meeting.getAgenda());
			meetingDTO.setDescription(meeting.getDescription());
			meetingDTO.setCreatedBy(meeting.getCreatedBy());
			meetingDTO.setHostedBy(meeting.getHostedBy());
			meetingDTO.setMeetingType(meeting.getMeetingType());
			meetingDTO.setMeetingLink(meeting.getMeetingLink());
			meetingDTO.setMeetingRoom(meeting.getMeetingRoom());
			meetingDTO.setAssetsName(meeting.getAssetsName());
			meetingDTO.setInternalGuest(meeting.getInternalGuest());
			meetingDTO.setExternalGuest(meeting.getExternalGuest());
			System.out.println(meeting);
			return Response.ok(JSONFactoryUtil.serialize(meetingDTO)).build();

		} catch (Exception e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}

	@POST
	@Path("/add-meeting")
	@Produces(MediaType.APPLICATION_JSON)
	public Response addMeeting(MeetingDTO meeting) {

		System.out.println("----------===========11111111!!!!!!!!!!!!1" + meeting);
		Meeting m = meetingService.addMeeting(meeting.getTitle(), meeting.getDateAndTime(), meeting.getLocation(),
				meeting.getAgenda(), meeting.getDescription(), meeting.getCreatedBy(), meeting.getHostedBy(),
				meeting.getMeetingType(), meeting.getMeetingRoom(), meeting.getMeetingLink(), meeting.getAssetsName(),
				meeting.getInternalGuest(), meeting.getExternalGuest());
		return Response.ok(m).build();
	}

	@PUT
	@Path("/update-meeting/{meetingId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateMeeting(@PathParam("meetingId") long meetingId, MeetingDTO meeting) {

		System.out.println("----------===========11111111!!!!!!!!!!!!1" + meetingId);
		meetingService.updateMeeting(meetingId, meeting.getTitle(), meeting.getDateAndTime(), meeting.getLocation(),
				meeting.getAgenda(), meeting.getDescription(), meeting.getCreatedBy(), meeting.getHostedBy(),
				meeting.getMeetingType(), meeting.getMeetingRoom(), meeting.getMeetingLink(), meeting.getAssetsName(),
				meeting.getInternalGuest(), meeting.getExternalGuest());
		return Response.ok("Updated.....").build();
	}

	@DELETE
	@Path("/delete-meeting/{meetingId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response addMeeting(@PathParam("meetingId") long meetingId) {

		try {
			meetingService.deleteById(meetingId);
			return Response.ok("Deleted successFully....").build();
		} catch (Exception e) {
			e.printStackTrace();
			return Response.serverError().build();
		}

	}

}