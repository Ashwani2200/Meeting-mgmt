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

import com.adjecti.meeting.model.Meeting;
import com.adjecti.meeting.service.base.MeetingServiceBaseImpl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the meeting remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * <code>com.adjecti.meeting.service.MeetingService</code> interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have
 * security checks based on the propagated JAAS credentials because this service
 * can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MeetingServiceBaseImpl
 */
@Component(property = { "json.web.service.context.name=meeting",
		"json.web.service.context.path=Meeting" }, service = AopService.class)
public class MeetingServiceImpl extends MeetingServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use
	 * <code>com.adjecti.meeting.service.MeetingServiceUtil</code> to access the
	 * meeting remote service.
	 */

	public Meeting addMeeting(String title, String dateAndTime, String location, String agenda, String description,
			String createdBy, String hostedBy, String meetingType, String meetingRoom, String meetingLink,
			String assetsName, String internalGuest, String externalGuest) {

		return meetingLocalService.addMeeting(title, dateAndTime, location, agenda, description, createdBy, hostedBy,
				meetingType, meetingRoom, meetingLink, assetsName, internalGuest, externalGuest);
	}

	public Meeting updateMeeting(String title, String dateAndTime, String location, String agenda, String description,
			String createdBy, String hostedBy, String meetingType, String meetingRoom, String meetingLink,
			String assetsName, String internalGuest, String externalGuest) {

		return meetingLocalService.updateMeeting(title, dateAndTime, location, agenda, description, createdBy, hostedBy,
				meetingType, meetingRoom, meetingLink, assetsName, internalGuest, externalGuest);
	}

	public List<Meeting> getAllMeeting() {
		return meetingLocalService.getAllMeeting();
	}

	public Meeting deleteById(long meetingId) throws PortalException {
		return meetingLocalService.deleteById(meetingId);
	}

	public Meeting getMeetingById(long meetingId) throws PortalException {
		return meetingLocalService.getMeetingById(meetingId);
	}

	public List<Meeting> getMeetingCreatedBy(String createdBy) {
		return meetingLocalService.getMeetingCreatedBy(createdBy);
	}

	public List<Meeting> getMeetingHostedBy(String hostedBy) {
		return meetingLocalService.getMeetingHostedBy(hostedBy);
	}

	public List<Meeting> getMeetingLocation(String location) {
		return meetingLocalService.getMeetingLocation(location);
	}

}