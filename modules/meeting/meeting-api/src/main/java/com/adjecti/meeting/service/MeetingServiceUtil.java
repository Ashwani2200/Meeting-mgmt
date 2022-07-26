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

import com.adjecti.meeting.model.Meeting;

import com.liferay.portal.kernel.exception.PortalException;

import java.util.List;

/**
 * Provides the remote service utility for Meeting. This utility wraps
 * <code>com.adjecti.meeting.service.impl.MeetingServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see MeetingService
 * @generated
 */
public class MeetingServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.adjecti.meeting.service.impl.MeetingServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Meeting addMeeting(
		String title, String dateAndTime, String location, String agenda,
		String description, String createdBy, String hostedBy,
		String meetingType, String meetingRoom, String meetingLink,
		String assetsName, String internalGuest, String externalGuest) {

		return getService().addMeeting(
			title, dateAndTime, location, agenda, description, createdBy,
			hostedBy, meetingType, meetingRoom, meetingLink, assetsName,
			internalGuest, externalGuest);
	}

	public static Meeting deleteById(long meetingId) throws PortalException {
		return getService().deleteById(meetingId);
	}

	public static List<Meeting> getAllMeeting() {
		return getService().getAllMeeting();
	}

	public static Meeting getMeetingById(long meetingId)
		throws PortalException {

		return getService().getMeetingById(meetingId);
	}

	public static List<Meeting> getMeetingCreatedBy(String createdBy) {
		return getService().getMeetingCreatedBy(createdBy);
	}

	public static List<Meeting> getMeetingHostedBy(String hostedBy) {
		return getService().getMeetingHostedBy(hostedBy);
	}

	public static List<Meeting> getMeetingLocation(String location) {
		return getService().getMeetingLocation(location);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static Meeting updateMeeting(
		long meetingId, String title, String dateAndTime, String location,
		String agenda, String description, String createdBy, String hostedBy,
		String meetingType, String meetingRoom, String meetingLink,
		String assetsName, String internalGuest, String externalGuest) {

		return getService().updateMeeting(
			meetingId, title, dateAndTime, location, agenda, description,
			createdBy, hostedBy, meetingType, meetingRoom, meetingLink,
			assetsName, internalGuest, externalGuest);
	}

	public static MeetingService getService() {
		return _service;
	}

	private static volatile MeetingService _service;

}