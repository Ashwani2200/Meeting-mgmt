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
import com.adjecti.meeting.service.base.RoomServiceBaseImpl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the room remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * <code>com.adjecti.meeting.service.RoomService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have
 * security checks based on the propagated JAAS credentials because this service
 * can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RoomServiceBaseImpl
 */
@Component(property = { "json.web.service.context.name=meeting",
		"json.web.service.context.path=Room" }, service = AopService.class)
public class RoomServiceImpl extends RoomServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use
	 * <code>com.adjecti.meeting.service.RoomServiceUtil</code> to access the room
	 * remote service.
	 */

	public Room addRoom(String floorNo, String building, String capacity, String roomNo) {
		System.out.println("Chal Gya...");
		return roomLocalService.addRoom(floorNo, building, capacity, roomNo);
	}

	public Room updateRoom(long roomId, String floorNo, String building, String capacity, String roomNo)
			throws PortalException {

		return roomLocalService.updateRoom(roomId, floorNo, building, capacity, roomNo);
	}

	public Room deleteRoom(long roomId) throws PortalException {
		return roomLocalService.deleteRoom(roomId);

	}

	public Room getRoomById(long roomId) throws PortalException {
		return roomLocalService.getRoomById(roomId);
	}

	public List<Room> getAllRoom() throws PortalException {
		return roomLocalService.getAllRoom();
	}

}