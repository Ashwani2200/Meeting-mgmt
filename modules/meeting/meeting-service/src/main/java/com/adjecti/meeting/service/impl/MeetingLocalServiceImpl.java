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
import com.adjecti.meeting.service.MeetingLocalServiceUtil;
import com.adjecti.meeting.service.MeetingService;
import com.adjecti.meeting.service.MeetingServiceUtil;
import com.adjecti.meeting.service.base.MeetingLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * The implementation of the meeting local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * <code>com.adjecti.meeting.service.MeetingLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MeetingLocalServiceBaseImpl
 */
@Component(property = "model.class.name=com.adjecti.meeting.model.Meeting", service = AopService.class)
public class MeetingLocalServiceImpl extends MeetingLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use
	 * <code>com.adjecti.meeting.service.MeetingLocalService</code> via injection or
	 * a <code>org.osgi.util.tracker.ServiceTracker</code> or use
	 * <code>com.adjecti.meeting.service.MeetingLocalServiceUtil</code>.
	 */

	public Meeting addMeeting(String title, String dateAndTime, String location, String agenda, String description,
			String createdBy, String hostedBy, String meetingType, String meetingRoom, String meetingLink,
			String assetsName, String internalGuest, String externalGuest) {

//		long meetingId = counterLocalService.increment(Meeting.class.getName());
		Meeting meeting = MeetingLocalServiceUtil.createMeeting(counterLocalService.increment());
		meeting.setTitle(title);
		meeting.setDateAndTime(dateAndTime);
		meeting.setLocation(location);
		meeting.setAgenda(agenda);
		meeting.setDescription(description);
		meeting.setCreatedBy(createdBy);
		meeting.setHostedBy(hostedBy);
		meeting.setMeetingType(meetingType);
		meeting.setMeetingLink(meetingLink);
		meeting.setMeetingRoom(meetingRoom);
		meeting.setAssetsName(assetsName);
		meeting.setInternalGuest(internalGuest);
		meeting.setExternalGuest(externalGuest);
		return meetingLocalService.addMeeting(meeting);
	}

	public Meeting updateMeeting(long meetingId,String title, String dateAndTime, String location, String agenda, String description,
			String createdBy, String hostedBy, String meetingType, String meetingRoom, String meetingLink,
			String assetsName, String internalGuest, String externalGuest) {

//		long meetingId = counterLocalService.increment(Meeting.class.getName());
		Meeting meeting = MeetingLocalServiceUtil.createMeeting(counterLocalService.increment());
		meeting.setTitle(title);
		meeting.setDateAndTime(dateAndTime);
		meeting.setLocation(location);
		meeting.setAgenda(agenda);
		meeting.setDescription(description);
		meeting.setCreatedBy(createdBy);
		meeting.setHostedBy(hostedBy);
		meeting.setMeetingType(meetingType);
		meeting.setMeetingLink(meetingLink);
		meeting.setMeetingRoom(meetingRoom);
		meeting.setAssetsName(assetsName);
		meeting.setInternalGuest(internalGuest);
		meeting.setExternalGuest(externalGuest);
		return meetingLocalService.updateMeeting(meeting);
	}

	public Meeting deleteById(long meetingId) throws PortalException {

		return meetingLocalService.deleteMeeting(meetingId);
	}

	public List<Meeting> getAllMeeting() {
		return meetingLocalService.getMeetings(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	public Meeting getMeetingById(long meetingId) throws PortalException {
		return meetingLocalService.getMeeting(meetingId);
	}
	public List<Meeting> getMeetingCreatedBy(String createdBy) {
		return meetingPersistence.findBycreatedBy(createdBy);
	}
	
	public List<Meeting> getMeetingHostedBy(String hostedBy) {
		return meetingPersistence.findByhostedBy(hostedBy);
	}
	
	public List<Meeting> getMeetingLocation(String location) {
		return meetingPersistence.findBylocation(location);
	}

}