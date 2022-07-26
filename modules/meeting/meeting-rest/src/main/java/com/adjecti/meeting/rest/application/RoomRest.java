package com.adjecti.meeting.rest.application;

import com.adjecti.meeting.model.Room;
import com.adjecti.meeting.service.RoomService;
import com.liferay.portal.kernel.exception.PortalException;
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
@Component(immediate = true, property = { JaxrsWhiteboardConstants.JAX_RS_APPLICATION_BASE + "=/meeting-room",
		JaxrsWhiteboardConstants.JAX_RS_NAME + "=MeetingRoom.Rest" }, service = Application.class)
public class RoomRest extends Application {

	@Reference
	private RoomService roomService;

	public Set<Object> getSingletons() {
		return Collections.<Object>singleton(this);
	}

	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllMeeting() {
		try {
			List<Room> listOfRoom = roomService.getAllRoom();
			List<RoomDTO> roomDTO=new ArrayList<RoomDTO>();
			listOfRoom.forEach(c->{
				RoomDTO r=new RoomDTO();
				r.setRoomId(c.getRoomId());
				r.setRoomNo(c.getRoomNo());
				r.setFloorNo(c.getFloorNo());
				r.setCapacity(c.getCapacity());
				r.setBuilding(c.getBuilding());
				roomDTO.add(r);
				
			});
			return Response.ok(JSONFactoryUtil.serialize(roomDTO)).build();
		} catch (Exception e) {
			return Response.ok().build();
		}

	}

	@GET
	@Path("/{roomId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getMeetingById(@PathParam("roomId") long roomId) {

		System.out.println("----------===========11111111!!!!!!!!!!!!1 :-----    " + roomId);
		try {
			Room room = roomService.getRoomById(roomId);
			RoomDTO roomDTO = new RoomDTO();
			roomDTO.setRoomId(room.getRoomId());
			roomDTO.setRoomNo(room.getRoomNo());
			roomDTO.setFloorNo(room.getFloorNo());
			roomDTO.setCapacity(room.getCapacity());
			roomDTO.setBuilding(room.getBuilding());
			System.out.println(roomDTO);
			return Response.ok(JSONFactoryUtil.serialize(roomDTO)).build();

		} catch (Exception e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}

	@POST
	@Path("/add-room")
	@Produces(MediaType.APPLICATION_JSON)
	public Response addMeeting(RoomDTO roomDTO) {

		try {
			System.out.println("----------===========11111111!!!!!!!!!!!!1" + roomDTO);
			Room room = roomService.addRoom(roomDTO.getFloorNo(), roomDTO.getBuilding(), roomDTO.getCapacity(),
					roomDTO.getRoomNo());

			return Response.accepted(room).build();
		} catch (Exception e) {
			return Response.serverError().build();
		}
	}

	@PUT
	@Path("/update-meeting-room/{roomId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateMeeting(@PathParam("roomId") long roomId, RoomDTO roomDTO) throws PortalException {

		try {
			System.out.println("----------===========11111111!!!!!!!!!!!!1" + roomId);
			Room room = roomService.updateRoom(roomId, roomDTO.getFloorNo(), roomDTO.getBuilding(), roomDTO.getCapacity(), roomDTO.getRoomNo());

			return Response.ok(room).build();
		}catch(Exception e) {
			return Response.notModified().build();
		}
		
	}

	@DELETE
	@Path("/delete-meeting-room/{roomId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response addMeeting(@PathParam("roomId") long roomId) {

		try {
			roomService.deleteRoom(roomId);
			return Response.ok("Deleted successFully....").build();
		} catch (Exception e) {
			e.printStackTrace();
			return Response.serverError().build();
		}

	}

}
