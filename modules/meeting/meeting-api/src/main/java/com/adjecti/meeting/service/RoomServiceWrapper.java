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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RoomService}.
 *
 * @author Brian Wing Shun Chan
 * @see RoomService
 * @generated
 */
public class RoomServiceWrapper
	implements RoomService, ServiceWrapper<RoomService> {

	public RoomServiceWrapper(RoomService roomService) {
		_roomService = roomService;
	}

	@Override
	public com.adjecti.meeting.model.Room addRoom(
		String floorNo, String building, String capacity, String roomNo) {

		return _roomService.addRoom(floorNo, building, capacity, roomNo);
	}

	@Override
	public com.adjecti.meeting.model.Room deleteRoom(long roomId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _roomService.deleteRoom(roomId);
	}

	@Override
	public java.util.List<com.adjecti.meeting.model.Room> getAllRoom()
		throws com.liferay.portal.kernel.exception.PortalException {

		return _roomService.getAllRoom();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _roomService.getOSGiServiceIdentifier();
	}

	@Override
	public com.adjecti.meeting.model.Room getRoomById(long roomId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _roomService.getRoomById(roomId);
	}

	@Override
	public com.adjecti.meeting.model.Room updateRoom(
			long roomId, String floorNo, String building, String capacity,
			String roomNo)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _roomService.updateRoom(
			roomId, floorNo, building, capacity, roomNo);
	}

	@Override
	public RoomService getWrappedService() {
		return _roomService;
	}

	@Override
	public void setWrappedService(RoomService roomService) {
		_roomService = roomService;
	}

	private RoomService _roomService;

}