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

package com.adjecti.meeting.service.http;

import com.adjecti.meeting.service.RoomServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * <code>RoomServiceUtil</code> service
 * utility. The static methods of this class call the same methods of the
 * service utility. However, the signatures are different because it is
 * difficult for SOAP to support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a <code>java.util.List</code>,
 * that is translated to an array of
 * <code>com.adjecti.meeting.model.RoomSoap</code>. If the method in the
 * service utility returns a
 * <code>com.adjecti.meeting.model.Room</code>, that is translated to a
 * <code>com.adjecti.meeting.model.RoomSoap</code>. Methods that SOAP
 * cannot safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RoomServiceHttp
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class RoomServiceSoap {

	public static com.adjecti.meeting.model.RoomSoap addRoom(
			String floorNo, String building, String capacity, String roomNo)
		throws RemoteException {

		try {
			com.adjecti.meeting.model.Room returnValue =
				RoomServiceUtil.addRoom(floorNo, building, capacity, roomNo);

			return com.adjecti.meeting.model.RoomSoap.toSoapModel(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.adjecti.meeting.model.RoomSoap updateRoom(
			long roomId, String floorNo, String building, String capacity,
			String roomNo)
		throws RemoteException {

		try {
			com.adjecti.meeting.model.Room returnValue =
				RoomServiceUtil.updateRoom(
					roomId, floorNo, building, capacity, roomNo);

			return com.adjecti.meeting.model.RoomSoap.toSoapModel(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.adjecti.meeting.model.RoomSoap deleteRoom(long roomId)
		throws RemoteException {

		try {
			com.adjecti.meeting.model.Room returnValue =
				RoomServiceUtil.deleteRoom(roomId);

			return com.adjecti.meeting.model.RoomSoap.toSoapModel(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.adjecti.meeting.model.RoomSoap getRoomById(long roomId)
		throws RemoteException {

		try {
			com.adjecti.meeting.model.Room returnValue =
				RoomServiceUtil.getRoomById(roomId);

			return com.adjecti.meeting.model.RoomSoap.toSoapModel(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.adjecti.meeting.model.RoomSoap[] getAllRoom()
		throws RemoteException {

		try {
			java.util.List<com.adjecti.meeting.model.Room> returnValue =
				RoomServiceUtil.getAllRoom();

			return com.adjecti.meeting.model.RoomSoap.toSoapModels(returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(RoomServiceSoap.class);

}