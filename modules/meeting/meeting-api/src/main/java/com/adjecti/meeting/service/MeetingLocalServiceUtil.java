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

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for Meeting. This utility wraps
 * <code>com.adjecti.meeting.service.impl.MeetingLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see MeetingLocalService
 * @generated
 */
public class MeetingLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.adjecti.meeting.service.impl.MeetingLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static Meeting addMeeting(Meeting meeting) {
		return getService().addMeeting(meeting);
	}

	/**
	 * Creates a new meeting with the primary key. Does not add the meeting to the database.
	 *
	 * @param meetingId the primary key for the new meeting
	 * @return the new meeting
	 */
	public static Meeting createMeeting(long meetingId) {
		return getService().createMeeting(meetingId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
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
	public static Meeting deleteMeeting(long meetingId) throws PortalException {
		return getService().deleteMeeting(meetingId);
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
	public static Meeting deleteMeeting(Meeting meeting) {
		return getService().deleteMeeting(meeting);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static Meeting fetchMeeting(long meetingId) {
		return getService().fetchMeeting(meetingId);
	}

	/**
	 * Returns the meeting matching the UUID and group.
	 *
	 * @param uuid the meeting's UUID
	 * @param groupId the primary key of the group
	 * @return the matching meeting, or <code>null</code> if a matching meeting could not be found
	 */
	public static Meeting fetchMeetingByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchMeetingByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the meeting with the primary key.
	 *
	 * @param meetingId the primary key of the meeting
	 * @return the meeting
	 * @throws PortalException if a meeting with the primary key could not be found
	 */
	public static Meeting getMeeting(long meetingId) throws PortalException {
		return getService().getMeeting(meetingId);
	}

	/**
	 * Returns the meeting matching the UUID and group.
	 *
	 * @param uuid the meeting's UUID
	 * @param groupId the primary key of the group
	 * @return the matching meeting
	 * @throws PortalException if a matching meeting could not be found
	 */
	public static Meeting getMeetingByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return getService().getMeetingByUuidAndGroupId(uuid, groupId);
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
	public static List<Meeting> getMeetings(int start, int end) {
		return getService().getMeetings(start, end);
	}

	/**
	 * Returns all the meetings matching the UUID and company.
	 *
	 * @param uuid the UUID of the meetings
	 * @param companyId the primary key of the company
	 * @return the matching meetings, or an empty list if no matches were found
	 */
	public static List<Meeting> getMeetingsByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getMeetingsByUuidAndCompanyId(uuid, companyId);
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
	public static List<Meeting> getMeetingsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Meeting> orderByComparator) {

		return getService().getMeetingsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of meetings.
	 *
	 * @return the number of meetings
	 */
	public static int getMeetingsCount() {
		return getService().getMeetingsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
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
	public static Meeting updateMeeting(Meeting meeting) {
		return getService().updateMeeting(meeting);
	}

	public static MeetingLocalService getService() {
		return _service;
	}

	private static volatile MeetingLocalService _service;

}