/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.adjecti.meeting.service.impl;

import com.adjecti.meeting.model.Asset;
import com.adjecti.meeting.model.Room;
import com.adjecti.meeting.service.base.RoomLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the room local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.adjecti.meeting.service.RoomLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RoomLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.adjecti.meeting.model.Room",
	service = AopService.class
)
public class RoomLocalServiceImpl extends RoomLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.adjecti.meeting.service.RoomLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.adjecti.meeting.service.RoomLocalServiceUtil</code>.
	 */
	
	
	
	public Room addRoom(String floorNo, String building, String capacity, String roomNo) {

		Room room =roomLocalService.createRoom(counterLocalService.increment());
		room.setFloorNo(floorNo);
		room.setBuilding(building);
		room.setCapacity(capacity);
		room.setRoomNo(roomNo);
		

		return super.addRoom(room);
	}

	public Room updateRoom(long roomId,String floorNo, String building, String capacity, String roomNo) throws PortalException {

		Room room =roomLocalService.getRoom(roomId);
		room.setFloorNo(floorNo);
		room.setBuilding(building);
		room.setCapacity(capacity);
		room.setRoomNo(roomNo);
		

		return super.updateRoom(room);
	}

	public Room deleteRoom(long roomId) throws PortalException {
		return roomLocalService.deleteRoom(roomId);

	}

	public Room getRoomById(long roomId) throws PortalException {
		return roomLocalService.getRoom(roomId);
	}

	public List<Room> getAllRoom() throws PortalException {
		return roomLocalService.getRooms(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}
	
}