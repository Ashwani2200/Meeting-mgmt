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
 * Provides a wrapper for {@link MeetingService}.
 *
 * @author Brian Wing Shun Chan
 * @see MeetingService
 * @generated
 */
public class MeetingServiceWrapper
	implements MeetingService, ServiceWrapper<MeetingService> {

	public MeetingServiceWrapper(MeetingService meetingService) {
		_meetingService = meetingService;
	}

	@Override
	public com.adjecti.meeting.model.Meeting addMeeting(
		String title, String dateAndTime, String location, String agenda,
		String description, String createdBy, String hostedBy,
		String meetingType, String meetingRoom, String meetingLink,
		String assetsName, String internalGuest, String externalGuest) {

		return _meetingService.addMeeting(
			title, dateAndTime, location, agenda, description, createdBy,
			hostedBy, meetingType, meetingRoom, meetingLink, assetsName,
			internalGuest, externalGuest);
	}

	@Override
	public com.adjecti.meeting.model.Meeting deleteById(long meetingId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _meetingService.deleteById(meetingId);
	}

	@Override
	public java.util.List<com.adjecti.meeting.model.Meeting> getAllMeeting() {
		return _meetingService.getAllMeeting();
	}

	@Override
	public com.adjecti.meeting.model.Meeting getMeetingById(long meetingId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _meetingService.getMeetingById(meetingId);
	}

	@Override
	public java.util.List<com.adjecti.meeting.model.Meeting>
		getMeetingCreatedBy(String createdBy) {

		return _meetingService.getMeetingCreatedBy(createdBy);
	}

	@Override
	public java.util.List<com.adjecti.meeting.model.Meeting> getMeetingHostedBy(
		String hostedBy) {

		return _meetingService.getMeetingHostedBy(hostedBy);
	}

	@Override
	public java.util.List<com.adjecti.meeting.model.Meeting> getMeetingLocation(
		String location) {

		return _meetingService.getMeetingLocation(location);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _meetingService.getOSGiServiceIdentifier();
	}

	@Override
	public com.adjecti.meeting.model.Meeting updateMeeting(
		long meetingId, String title, String dateAndTime, String location,
		String agenda, String description, String createdBy, String hostedBy,
		String meetingType, String meetingRoom, String meetingLink,
		String assetsName, String internalGuest, String externalGuest) {

		return _meetingService.updateMeeting(
			meetingId, title, dateAndTime, location, agenda, description,
			createdBy, hostedBy, meetingType, meetingRoom, meetingLink,
			assetsName, internalGuest, externalGuest);
	}

	@Override
	public MeetingService getWrappedService() {
		return _meetingService;
	}

	@Override
	public void setWrappedService(MeetingService meetingService) {
		_meetingService = meetingService;
	}

	private MeetingService _meetingService;

}