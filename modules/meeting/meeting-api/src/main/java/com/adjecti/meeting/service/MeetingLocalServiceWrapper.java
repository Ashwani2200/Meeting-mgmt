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
 * Provides a wrapper for {@link MeetingLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MeetingLocalService
 * @generated
 */
public class MeetingLocalServiceWrapper
	implements MeetingLocalService, ServiceWrapper<MeetingLocalService> {

	public MeetingLocalServiceWrapper(MeetingLocalService meetingLocalService) {
		_meetingLocalService = meetingLocalService;
	}

	/**
	 * Adds the meeting to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MeetingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param meeting the meeting
	 * @return the meeting that was added
	 */
	@Override
	public com.adjecti.meeting.model.Meeting addMeeting(
		com.adjecti.meeting.model.Meeting meeting) {

		return _meetingLocalService.addMeeting(meeting);
	}

	@Override
	public com.adjecti.meeting.model.Meeting addMeeting(
		String title, String dateAndTime, String location, String agenda,
		String description, String createdBy, String hostedBy,
		String meetingType, String meetingRoom, String meetingLink,
		String assetsName, String internalGuest, String externalGuest) {

		return _meetingLocalService.addMeeting(
			title, dateAndTime, location, agenda, description, createdBy,
			hostedBy, meetingType, meetingRoom, meetingLink, assetsName,
			internalGuest, externalGuest);
	}

	/**
	 * Creates a new meeting with the primary key. Does not add the meeting to the database.
	 *
	 * @param meetingId the primary key for the new meeting
	 * @return the new meeting
	 */
	@Override
	public com.adjecti.meeting.model.Meeting createMeeting(long meetingId) {
		return _meetingLocalService.createMeeting(meetingId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _meetingLocalService.createPersistedModel(primaryKeyObj);
	}

	@Override
	public com.adjecti.meeting.model.Meeting deleteById(long meetingId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _meetingLocalService.deleteById(meetingId);
	}

	/**
	 * Deletes the meeting with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MeetingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param meetingId the primary key of the meeting
	 * @return the meeting that was removed
	 * @throws PortalException if a meeting with the primary key could not be found
	 */
	@Override
	public com.adjecti.meeting.model.Meeting deleteMeeting(long meetingId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _meetingLocalService.deleteMeeting(meetingId);
	}

	/**
	 * Deletes the meeting from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MeetingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param meeting the meeting
	 * @return the meeting that was removed
	 */
	@Override
	public com.adjecti.meeting.model.Meeting deleteMeeting(
		com.adjecti.meeting.model.Meeting meeting) {

		return _meetingLocalService.deleteMeeting(meeting);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _meetingLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _meetingLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _meetingLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.adjecti.meeting.model.impl.MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _meetingLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.adjecti.meeting.model.impl.MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _meetingLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _meetingLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _meetingLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.adjecti.meeting.model.Meeting fetchMeeting(long meetingId) {
		return _meetingLocalService.fetchMeeting(meetingId);
	}

	/**
	 * Returns the meeting matching the UUID and group.
	 *
	 * @param uuid the meeting's UUID
	 * @param groupId the primary key of the group
	 * @return the matching meeting, or <code>null</code> if a matching meeting could not be found
	 */
	@Override
	public com.adjecti.meeting.model.Meeting fetchMeetingByUuidAndGroupId(
		String uuid, long groupId) {

		return _meetingLocalService.fetchMeetingByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _meetingLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<com.adjecti.meeting.model.Meeting> getAllMeeting() {
		return _meetingLocalService.getAllMeeting();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _meetingLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _meetingLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the meeting with the primary key.
	 *
	 * @param meetingId the primary key of the meeting
	 * @return the meeting
	 * @throws PortalException if a meeting with the primary key could not be found
	 */
	@Override
	public com.adjecti.meeting.model.Meeting getMeeting(long meetingId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _meetingLocalService.getMeeting(meetingId);
	}

	@Override
	public com.adjecti.meeting.model.Meeting getMeetingById(long meetingId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _meetingLocalService.getMeetingById(meetingId);
	}

	/**
	 * Returns the meeting matching the UUID and group.
	 *
	 * @param uuid the meeting's UUID
	 * @param groupId the primary key of the group
	 * @return the matching meeting
	 * @throws PortalException if a matching meeting could not be found
	 */
	@Override
	public com.adjecti.meeting.model.Meeting getMeetingByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _meetingLocalService.getMeetingByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public java.util.List<com.adjecti.meeting.model.Meeting>
		getMeetingCreatedBy(String createdBy) {

		return _meetingLocalService.getMeetingCreatedBy(createdBy);
	}

	@Override
	public java.util.List<com.adjecti.meeting.model.Meeting> getMeetingHostedBy(
		String hostedBy) {

		return _meetingLocalService.getMeetingHostedBy(hostedBy);
	}

	@Override
	public java.util.List<com.adjecti.meeting.model.Meeting> getMeetingLocation(
		String location) {

		return _meetingLocalService.getMeetingLocation(location);
	}

	/**
	 * Returns a range of all the meetings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.adjecti.meeting.model.impl.MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of meetings
	 * @param end the upper bound of the range of meetings (not inclusive)
	 * @return the range of meetings
	 */
	@Override
	public java.util.List<com.adjecti.meeting.model.Meeting> getMeetings(
		int start, int end) {

		return _meetingLocalService.getMeetings(start, end);
	}

	/**
	 * Returns all the meetings matching the UUID and company.
	 *
	 * @param uuid the UUID of the meetings
	 * @param companyId the primary key of the company
	 * @return the matching meetings, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.adjecti.meeting.model.Meeting>
		getMeetingsByUuidAndCompanyId(String uuid, long companyId) {

		return _meetingLocalService.getMeetingsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of meetings matching the UUID and company.
	 *
	 * @param uuid the UUID of the meetings
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of meetings
	 * @param end the upper bound of the range of meetings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching meetings, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.adjecti.meeting.model.Meeting>
		getMeetingsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.adjecti.meeting.model.Meeting> orderByComparator) {

		return _meetingLocalService.getMeetingsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of meetings.
	 *
	 * @return the number of meetings
	 */
	@Override
	public int getMeetingsCount() {
		return _meetingLocalService.getMeetingsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _meetingLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _meetingLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the meeting in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MeetingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param meeting the meeting
	 * @return the meeting that was updated
	 */
	@Override
	public com.adjecti.meeting.model.Meeting updateMeeting(
		com.adjecti.meeting.model.Meeting meeting) {

		return _meetingLocalService.updateMeeting(meeting);
	}

	@Override
	public com.adjecti.meeting.model.Meeting updateMeeting(
		String title, String dateAndTime, String location, String agenda,
		String description, String createdBy, String hostedBy,
		String meetingType, String meetingRoom, String meetingLink,
		String assetsName, String internalGuest, String externalGuest) {

		return _meetingLocalService.updateMeeting(
			title, dateAndTime, location, agenda, description, createdBy,
			hostedBy, meetingType, meetingRoom, meetingLink, assetsName,
			internalGuest, externalGuest);
	}

	@Override
	public MeetingLocalService getWrappedService() {
		return _meetingLocalService;
	}

	@Override
	public void setWrappedService(MeetingLocalService meetingLocalService) {
		_meetingLocalService = meetingLocalService;
	}

	private MeetingLocalService _meetingLocalService;

}