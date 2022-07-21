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
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the remote service interface for Meeting. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see MeetingServiceUtil
 * @generated
 */
@AccessControlled
@JSONWebService
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface MeetingService extends BaseService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.adjecti.meeting.service.impl.MeetingServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the meeting remote service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link MeetingServiceUtil} if injection and service tracking are not available.
	 */
	public Meeting addMeeting(
		String title, String dateAndTime, String location, String agenda,
		String description, String createdBy, String hostedBy,
		String meetingType, String meetingRoom, String meetingLink,
		String assetsName, String internalGuest, String externalGuest);

	public Meeting deleteById(long meetingId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Meeting> getAllMeeting();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Meeting getMeetingById(long meetingId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Meeting> getMeetingCreatedBy(String createdBy);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Meeting> getMeetingHostedBy(String hostedBy);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Meeting> getMeetingLocation(String location);

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	public Meeting updateMeeting(
		String title, String dateAndTime, String location, String agenda,
		String description, String createdBy, String hostedBy,
		String meetingType, String meetingRoom, String meetingLink,
		String assetsName, String internalGuest, String externalGuest);

}