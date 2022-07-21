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

import com.adjecti.meeting.service.MeetingServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * <code>MeetingServiceUtil</code> service
 * utility. The static methods of this class call the same methods of the
 * service utility. However, the signatures are different because it is
 * difficult for SOAP to support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a <code>java.util.List</code>,
 * that is translated to an array of
 * <code>com.adjecti.meeting.model.MeetingSoap</code>. If the method in the
 * service utility returns a
 * <code>com.adjecti.meeting.model.Meeting</code>, that is translated to a
 * <code>com.adjecti.meeting.model.MeetingSoap</code>. Methods that SOAP
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
 * @see MeetingServiceHttp
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class MeetingServiceSoap {

	public static com.adjecti.meeting.model.MeetingSoap addMeeting(
			String title, String dateAndTime, String location, String agenda,
			String description, String createdBy, String hostedBy,
			String meetingType, String meetingRoom, String meetingLink,
			String assetsName, String internalGuest, String externalGuest)
		throws RemoteException {

		try {
			com.adjecti.meeting.model.Meeting returnValue =
				MeetingServiceUtil.addMeeting(
					title, dateAndTime, location, agenda, description,
					createdBy, hostedBy, meetingType, meetingRoom, meetingLink,
					assetsName, internalGuest, externalGuest);

			return com.adjecti.meeting.model.MeetingSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.adjecti.meeting.model.MeetingSoap updateMeeting(
			String title, String dateAndTime, String location, String agenda,
			String description, String createdBy, String hostedBy,
			String meetingType, String meetingRoom, String meetingLink,
			String assetsName, String internalGuest, String externalGuest)
		throws RemoteException {

		try {
			com.adjecti.meeting.model.Meeting returnValue =
				MeetingServiceUtil.updateMeeting(
					title, dateAndTime, location, agenda, description,
					createdBy, hostedBy, meetingType, meetingRoom, meetingLink,
					assetsName, internalGuest, externalGuest);

			return com.adjecti.meeting.model.MeetingSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.adjecti.meeting.model.MeetingSoap[] getAllMeeting()
		throws RemoteException {

		try {
			java.util.List<com.adjecti.meeting.model.Meeting> returnValue =
				MeetingServiceUtil.getAllMeeting();

			return com.adjecti.meeting.model.MeetingSoap.toSoapModels(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.adjecti.meeting.model.MeetingSoap deleteById(
			long meetingId)
		throws RemoteException {

		try {
			com.adjecti.meeting.model.Meeting returnValue =
				MeetingServiceUtil.deleteById(meetingId);

			return com.adjecti.meeting.model.MeetingSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.adjecti.meeting.model.MeetingSoap getMeetingById(
			long meetingId)
		throws RemoteException {

		try {
			com.adjecti.meeting.model.Meeting returnValue =
				MeetingServiceUtil.getMeetingById(meetingId);

			return com.adjecti.meeting.model.MeetingSoap.toSoapModel(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.adjecti.meeting.model.MeetingSoap[] getMeetingCreatedBy(
			String createdBy)
		throws RemoteException {

		try {
			java.util.List<com.adjecti.meeting.model.Meeting> returnValue =
				MeetingServiceUtil.getMeetingCreatedBy(createdBy);

			return com.adjecti.meeting.model.MeetingSoap.toSoapModels(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.adjecti.meeting.model.MeetingSoap[] getMeetingHostedBy(
			String hostedBy)
		throws RemoteException {

		try {
			java.util.List<com.adjecti.meeting.model.Meeting> returnValue =
				MeetingServiceUtil.getMeetingHostedBy(hostedBy);

			return com.adjecti.meeting.model.MeetingSoap.toSoapModels(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	public static com.adjecti.meeting.model.MeetingSoap[] getMeetingLocation(
			String location)
		throws RemoteException {

		try {
			java.util.List<com.adjecti.meeting.model.Meeting> returnValue =
				MeetingServiceUtil.getMeetingLocation(location);

			return com.adjecti.meeting.model.MeetingSoap.toSoapModels(
				returnValue);
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			throw new RemoteException(exception.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(MeetingServiceSoap.class);

}