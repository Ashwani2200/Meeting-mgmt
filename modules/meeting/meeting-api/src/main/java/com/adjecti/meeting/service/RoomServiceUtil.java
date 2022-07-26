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

package com.adjecti.meeting.service;

import com.adjecti.meeting.model.Room;

import com.liferay.portal.kernel.exception.PortalException;

import java.util.List;

/**
 * Provides the remote service utility for Room. This utility wraps
 * <code>com.adjecti.meeting.service.impl.RoomServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see RoomService
 * @generated
 */
public class RoomServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.adjecti.meeting.service.impl.RoomServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Room addRoom(
		String floorNo, String building, String capacity, String roomNo) {

		return getService().addRoom(floorNo, building, capacity, roomNo);
	}

	public static Room deleteRoom(long roomId) throws PortalException {
		return getService().deleteRoom(roomId);
	}

	public static List<Room> getAllRoom() throws PortalException {
		return getService().getAllRoom();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static Room getRoomById(long roomId) throws PortalException {
		return getService().getRoomById(roomId);
	}

	public static Room updateRoom(
			long roomId, String floorNo, String building, String capacity,
			String roomNo)
		throws PortalException {

		return getService().updateRoom(
			roomId, floorNo, building, capacity, roomNo);
	}

	public static RoomService getService() {
		return _service;
	}

	private static volatile RoomService _service;

}