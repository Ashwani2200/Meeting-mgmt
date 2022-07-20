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

package com.adjecti.meeting.service.persistence;

import com.adjecti.meeting.model.Meeting;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the meeting service. This utility wraps <code>com.adjecti.meeting.service.persistence.impl.MeetingPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MeetingPersistence
 * @generated
 */
public class MeetingUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Meeting meeting) {
		getPersistence().clearCache(meeting);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Meeting> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Meeting> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Meeting> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Meeting> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Meeting> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Meeting update(Meeting meeting) {
		return getPersistence().update(meeting);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Meeting update(
		Meeting meeting, ServiceContext serviceContext) {

		return getPersistence().update(meeting, serviceContext);
	}

	/**
	 * Returns all the meetings where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching meetings
	 */
	public static List<Meeting> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the meetings where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of meetings
	 * @param end the upper bound of the range of meetings (not inclusive)
	 * @return the range of matching meetings
	 */
	public static List<Meeting> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the meetings where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of meetings
	 * @param end the upper bound of the range of meetings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching meetings
	 */
	public static List<Meeting> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Meeting> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the meetings where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of meetings
	 * @param end the upper bound of the range of meetings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching meetings
	 */
	public static List<Meeting> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Meeting> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first meeting in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meeting
	 * @throws NoSuchMeetingException if a matching meeting could not be found
	 */
	public static Meeting findByUuid_First(
			String uuid, OrderByComparator<Meeting> orderByComparator)
		throws com.adjecti.meeting.exception.NoSuchMeetingException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first meeting in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meeting, or <code>null</code> if a matching meeting could not be found
	 */
	public static Meeting fetchByUuid_First(
		String uuid, OrderByComparator<Meeting> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last meeting in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meeting
	 * @throws NoSuchMeetingException if a matching meeting could not be found
	 */
	public static Meeting findByUuid_Last(
			String uuid, OrderByComparator<Meeting> orderByComparator)
		throws com.adjecti.meeting.exception.NoSuchMeetingException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last meeting in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meeting, or <code>null</code> if a matching meeting could not be found
	 */
	public static Meeting fetchByUuid_Last(
		String uuid, OrderByComparator<Meeting> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the meetings before and after the current meeting in the ordered set where uuid = &#63;.
	 *
	 * @param meetingId the primary key of the current meeting
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meeting
	 * @throws NoSuchMeetingException if a meeting with the primary key could not be found
	 */
	public static Meeting[] findByUuid_PrevAndNext(
			long meetingId, String uuid,
			OrderByComparator<Meeting> orderByComparator)
		throws com.adjecti.meeting.exception.NoSuchMeetingException {

		return getPersistence().findByUuid_PrevAndNext(
			meetingId, uuid, orderByComparator);
	}

	/**
	 * Removes all the meetings where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of meetings where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching meetings
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the meeting where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMeetingException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching meeting
	 * @throws NoSuchMeetingException if a matching meeting could not be found
	 */
	public static Meeting findByUUID_G(String uuid, long groupId)
		throws com.adjecti.meeting.exception.NoSuchMeetingException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the meeting where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching meeting, or <code>null</code> if a matching meeting could not be found
	 */
	public static Meeting fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the meeting where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching meeting, or <code>null</code> if a matching meeting could not be found
	 */
	public static Meeting fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the meeting where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the meeting that was removed
	 */
	public static Meeting removeByUUID_G(String uuid, long groupId)
		throws com.adjecti.meeting.exception.NoSuchMeetingException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of meetings where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching meetings
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the meetings where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching meetings
	 */
	public static List<Meeting> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the meetings where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of meetings
	 * @param end the upper bound of the range of meetings (not inclusive)
	 * @return the range of matching meetings
	 */
	public static List<Meeting> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the meetings where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of meetings
	 * @param end the upper bound of the range of meetings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching meetings
	 */
	public static List<Meeting> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Meeting> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the meetings where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of meetings
	 * @param end the upper bound of the range of meetings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching meetings
	 */
	public static List<Meeting> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Meeting> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first meeting in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meeting
	 * @throws NoSuchMeetingException if a matching meeting could not be found
	 */
	public static Meeting findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Meeting> orderByComparator)
		throws com.adjecti.meeting.exception.NoSuchMeetingException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first meeting in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meeting, or <code>null</code> if a matching meeting could not be found
	 */
	public static Meeting fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Meeting> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last meeting in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meeting
	 * @throws NoSuchMeetingException if a matching meeting could not be found
	 */
	public static Meeting findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Meeting> orderByComparator)
		throws com.adjecti.meeting.exception.NoSuchMeetingException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last meeting in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meeting, or <code>null</code> if a matching meeting could not be found
	 */
	public static Meeting fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Meeting> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the meetings before and after the current meeting in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param meetingId the primary key of the current meeting
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meeting
	 * @throws NoSuchMeetingException if a meeting with the primary key could not be found
	 */
	public static Meeting[] findByUuid_C_PrevAndNext(
			long meetingId, String uuid, long companyId,
			OrderByComparator<Meeting> orderByComparator)
		throws com.adjecti.meeting.exception.NoSuchMeetingException {

		return getPersistence().findByUuid_C_PrevAndNext(
			meetingId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the meetings where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of meetings where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching meetings
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the meetings where title = &#63;.
	 *
	 * @param title the title
	 * @return the matching meetings
	 */
	public static List<Meeting> findBytitle(String title) {
		return getPersistence().findBytitle(title);
	}

	/**
	 * Returns a range of all the meetings where title = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param title the title
	 * @param start the lower bound of the range of meetings
	 * @param end the upper bound of the range of meetings (not inclusive)
	 * @return the range of matching meetings
	 */
	public static List<Meeting> findBytitle(String title, int start, int end) {
		return getPersistence().findBytitle(title, start, end);
	}

	/**
	 * Returns an ordered range of all the meetings where title = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param title the title
	 * @param start the lower bound of the range of meetings
	 * @param end the upper bound of the range of meetings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching meetings
	 */
	public static List<Meeting> findBytitle(
		String title, int start, int end,
		OrderByComparator<Meeting> orderByComparator) {

		return getPersistence().findBytitle(
			title, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the meetings where title = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param title the title
	 * @param start the lower bound of the range of meetings
	 * @param end the upper bound of the range of meetings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching meetings
	 */
	public static List<Meeting> findBytitle(
		String title, int start, int end,
		OrderByComparator<Meeting> orderByComparator, boolean useFinderCache) {

		return getPersistence().findBytitle(
			title, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first meeting in the ordered set where title = &#63;.
	 *
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meeting
	 * @throws NoSuchMeetingException if a matching meeting could not be found
	 */
	public static Meeting findBytitle_First(
			String title, OrderByComparator<Meeting> orderByComparator)
		throws com.adjecti.meeting.exception.NoSuchMeetingException {

		return getPersistence().findBytitle_First(title, orderByComparator);
	}

	/**
	 * Returns the first meeting in the ordered set where title = &#63;.
	 *
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meeting, or <code>null</code> if a matching meeting could not be found
	 */
	public static Meeting fetchBytitle_First(
		String title, OrderByComparator<Meeting> orderByComparator) {

		return getPersistence().fetchBytitle_First(title, orderByComparator);
	}

	/**
	 * Returns the last meeting in the ordered set where title = &#63;.
	 *
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meeting
	 * @throws NoSuchMeetingException if a matching meeting could not be found
	 */
	public static Meeting findBytitle_Last(
			String title, OrderByComparator<Meeting> orderByComparator)
		throws com.adjecti.meeting.exception.NoSuchMeetingException {

		return getPersistence().findBytitle_Last(title, orderByComparator);
	}

	/**
	 * Returns the last meeting in the ordered set where title = &#63;.
	 *
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meeting, or <code>null</code> if a matching meeting could not be found
	 */
	public static Meeting fetchBytitle_Last(
		String title, OrderByComparator<Meeting> orderByComparator) {

		return getPersistence().fetchBytitle_Last(title, orderByComparator);
	}

	/**
	 * Returns the meetings before and after the current meeting in the ordered set where title = &#63;.
	 *
	 * @param meetingId the primary key of the current meeting
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meeting
	 * @throws NoSuchMeetingException if a meeting with the primary key could not be found
	 */
	public static Meeting[] findBytitle_PrevAndNext(
			long meetingId, String title,
			OrderByComparator<Meeting> orderByComparator)
		throws com.adjecti.meeting.exception.NoSuchMeetingException {

		return getPersistence().findBytitle_PrevAndNext(
			meetingId, title, orderByComparator);
	}

	/**
	 * Removes all the meetings where title = &#63; from the database.
	 *
	 * @param title the title
	 */
	public static void removeBytitle(String title) {
		getPersistence().removeBytitle(title);
	}

	/**
	 * Returns the number of meetings where title = &#63;.
	 *
	 * @param title the title
	 * @return the number of matching meetings
	 */
	public static int countBytitle(String title) {
		return getPersistence().countBytitle(title);
	}

	/**
	 * Returns all the meetings where location = &#63;.
	 *
	 * @param location the location
	 * @return the matching meetings
	 */
	public static List<Meeting> findBylocation(String location) {
		return getPersistence().findBylocation(location);
	}

	/**
	 * Returns a range of all the meetings where location = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param location the location
	 * @param start the lower bound of the range of meetings
	 * @param end the upper bound of the range of meetings (not inclusive)
	 * @return the range of matching meetings
	 */
	public static List<Meeting> findBylocation(
		String location, int start, int end) {

		return getPersistence().findBylocation(location, start, end);
	}

	/**
	 * Returns an ordered range of all the meetings where location = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param location the location
	 * @param start the lower bound of the range of meetings
	 * @param end the upper bound of the range of meetings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching meetings
	 */
	public static List<Meeting> findBylocation(
		String location, int start, int end,
		OrderByComparator<Meeting> orderByComparator) {

		return getPersistence().findBylocation(
			location, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the meetings where location = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param location the location
	 * @param start the lower bound of the range of meetings
	 * @param end the upper bound of the range of meetings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching meetings
	 */
	public static List<Meeting> findBylocation(
		String location, int start, int end,
		OrderByComparator<Meeting> orderByComparator, boolean useFinderCache) {

		return getPersistence().findBylocation(
			location, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first meeting in the ordered set where location = &#63;.
	 *
	 * @param location the location
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meeting
	 * @throws NoSuchMeetingException if a matching meeting could not be found
	 */
	public static Meeting findBylocation_First(
			String location, OrderByComparator<Meeting> orderByComparator)
		throws com.adjecti.meeting.exception.NoSuchMeetingException {

		return getPersistence().findBylocation_First(
			location, orderByComparator);
	}

	/**
	 * Returns the first meeting in the ordered set where location = &#63;.
	 *
	 * @param location the location
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meeting, or <code>null</code> if a matching meeting could not be found
	 */
	public static Meeting fetchBylocation_First(
		String location, OrderByComparator<Meeting> orderByComparator) {

		return getPersistence().fetchBylocation_First(
			location, orderByComparator);
	}

	/**
	 * Returns the last meeting in the ordered set where location = &#63;.
	 *
	 * @param location the location
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meeting
	 * @throws NoSuchMeetingException if a matching meeting could not be found
	 */
	public static Meeting findBylocation_Last(
			String location, OrderByComparator<Meeting> orderByComparator)
		throws com.adjecti.meeting.exception.NoSuchMeetingException {

		return getPersistence().findBylocation_Last(
			location, orderByComparator);
	}

	/**
	 * Returns the last meeting in the ordered set where location = &#63;.
	 *
	 * @param location the location
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meeting, or <code>null</code> if a matching meeting could not be found
	 */
	public static Meeting fetchBylocation_Last(
		String location, OrderByComparator<Meeting> orderByComparator) {

		return getPersistence().fetchBylocation_Last(
			location, orderByComparator);
	}

	/**
	 * Returns the meetings before and after the current meeting in the ordered set where location = &#63;.
	 *
	 * @param meetingId the primary key of the current meeting
	 * @param location the location
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meeting
	 * @throws NoSuchMeetingException if a meeting with the primary key could not be found
	 */
	public static Meeting[] findBylocation_PrevAndNext(
			long meetingId, String location,
			OrderByComparator<Meeting> orderByComparator)
		throws com.adjecti.meeting.exception.NoSuchMeetingException {

		return getPersistence().findBylocation_PrevAndNext(
			meetingId, location, orderByComparator);
	}

	/**
	 * Removes all the meetings where location = &#63; from the database.
	 *
	 * @param location the location
	 */
	public static void removeBylocation(String location) {
		getPersistence().removeBylocation(location);
	}

	/**
	 * Returns the number of meetings where location = &#63;.
	 *
	 * @param location the location
	 * @return the number of matching meetings
	 */
	public static int countBylocation(String location) {
		return getPersistence().countBylocation(location);
	}

	/**
	 * Returns all the meetings where createdBy = &#63;.
	 *
	 * @param createdBy the created by
	 * @return the matching meetings
	 */
	public static List<Meeting> findBycreatedBy(String createdBy) {
		return getPersistence().findBycreatedBy(createdBy);
	}

	/**
	 * Returns a range of all the meetings where createdBy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param createdBy the created by
	 * @param start the lower bound of the range of meetings
	 * @param end the upper bound of the range of meetings (not inclusive)
	 * @return the range of matching meetings
	 */
	public static List<Meeting> findBycreatedBy(
		String createdBy, int start, int end) {

		return getPersistence().findBycreatedBy(createdBy, start, end);
	}

	/**
	 * Returns an ordered range of all the meetings where createdBy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param createdBy the created by
	 * @param start the lower bound of the range of meetings
	 * @param end the upper bound of the range of meetings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching meetings
	 */
	public static List<Meeting> findBycreatedBy(
		String createdBy, int start, int end,
		OrderByComparator<Meeting> orderByComparator) {

		return getPersistence().findBycreatedBy(
			createdBy, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the meetings where createdBy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param createdBy the created by
	 * @param start the lower bound of the range of meetings
	 * @param end the upper bound of the range of meetings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching meetings
	 */
	public static List<Meeting> findBycreatedBy(
		String createdBy, int start, int end,
		OrderByComparator<Meeting> orderByComparator, boolean useFinderCache) {

		return getPersistence().findBycreatedBy(
			createdBy, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first meeting in the ordered set where createdBy = &#63;.
	 *
	 * @param createdBy the created by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meeting
	 * @throws NoSuchMeetingException if a matching meeting could not be found
	 */
	public static Meeting findBycreatedBy_First(
			String createdBy, OrderByComparator<Meeting> orderByComparator)
		throws com.adjecti.meeting.exception.NoSuchMeetingException {

		return getPersistence().findBycreatedBy_First(
			createdBy, orderByComparator);
	}

	/**
	 * Returns the first meeting in the ordered set where createdBy = &#63;.
	 *
	 * @param createdBy the created by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meeting, or <code>null</code> if a matching meeting could not be found
	 */
	public static Meeting fetchBycreatedBy_First(
		String createdBy, OrderByComparator<Meeting> orderByComparator) {

		return getPersistence().fetchBycreatedBy_First(
			createdBy, orderByComparator);
	}

	/**
	 * Returns the last meeting in the ordered set where createdBy = &#63;.
	 *
	 * @param createdBy the created by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meeting
	 * @throws NoSuchMeetingException if a matching meeting could not be found
	 */
	public static Meeting findBycreatedBy_Last(
			String createdBy, OrderByComparator<Meeting> orderByComparator)
		throws com.adjecti.meeting.exception.NoSuchMeetingException {

		return getPersistence().findBycreatedBy_Last(
			createdBy, orderByComparator);
	}

	/**
	 * Returns the last meeting in the ordered set where createdBy = &#63;.
	 *
	 * @param createdBy the created by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meeting, or <code>null</code> if a matching meeting could not be found
	 */
	public static Meeting fetchBycreatedBy_Last(
		String createdBy, OrderByComparator<Meeting> orderByComparator) {

		return getPersistence().fetchBycreatedBy_Last(
			createdBy, orderByComparator);
	}

	/**
	 * Returns the meetings before and after the current meeting in the ordered set where createdBy = &#63;.
	 *
	 * @param meetingId the primary key of the current meeting
	 * @param createdBy the created by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meeting
	 * @throws NoSuchMeetingException if a meeting with the primary key could not be found
	 */
	public static Meeting[] findBycreatedBy_PrevAndNext(
			long meetingId, String createdBy,
			OrderByComparator<Meeting> orderByComparator)
		throws com.adjecti.meeting.exception.NoSuchMeetingException {

		return getPersistence().findBycreatedBy_PrevAndNext(
			meetingId, createdBy, orderByComparator);
	}

	/**
	 * Removes all the meetings where createdBy = &#63; from the database.
	 *
	 * @param createdBy the created by
	 */
	public static void removeBycreatedBy(String createdBy) {
		getPersistence().removeBycreatedBy(createdBy);
	}

	/**
	 * Returns the number of meetings where createdBy = &#63;.
	 *
	 * @param createdBy the created by
	 * @return the number of matching meetings
	 */
	public static int countBycreatedBy(String createdBy) {
		return getPersistence().countBycreatedBy(createdBy);
	}

	/**
	 * Returns all the meetings where hostedBy = &#63;.
	 *
	 * @param hostedBy the hosted by
	 * @return the matching meetings
	 */
	public static List<Meeting> findByhostedBy(String hostedBy) {
		return getPersistence().findByhostedBy(hostedBy);
	}

	/**
	 * Returns a range of all the meetings where hostedBy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param hostedBy the hosted by
	 * @param start the lower bound of the range of meetings
	 * @param end the upper bound of the range of meetings (not inclusive)
	 * @return the range of matching meetings
	 */
	public static List<Meeting> findByhostedBy(
		String hostedBy, int start, int end) {

		return getPersistence().findByhostedBy(hostedBy, start, end);
	}

	/**
	 * Returns an ordered range of all the meetings where hostedBy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param hostedBy the hosted by
	 * @param start the lower bound of the range of meetings
	 * @param end the upper bound of the range of meetings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching meetings
	 */
	public static List<Meeting> findByhostedBy(
		String hostedBy, int start, int end,
		OrderByComparator<Meeting> orderByComparator) {

		return getPersistence().findByhostedBy(
			hostedBy, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the meetings where hostedBy = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param hostedBy the hosted by
	 * @param start the lower bound of the range of meetings
	 * @param end the upper bound of the range of meetings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching meetings
	 */
	public static List<Meeting> findByhostedBy(
		String hostedBy, int start, int end,
		OrderByComparator<Meeting> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByhostedBy(
			hostedBy, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first meeting in the ordered set where hostedBy = &#63;.
	 *
	 * @param hostedBy the hosted by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meeting
	 * @throws NoSuchMeetingException if a matching meeting could not be found
	 */
	public static Meeting findByhostedBy_First(
			String hostedBy, OrderByComparator<Meeting> orderByComparator)
		throws com.adjecti.meeting.exception.NoSuchMeetingException {

		return getPersistence().findByhostedBy_First(
			hostedBy, orderByComparator);
	}

	/**
	 * Returns the first meeting in the ordered set where hostedBy = &#63;.
	 *
	 * @param hostedBy the hosted by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meeting, or <code>null</code> if a matching meeting could not be found
	 */
	public static Meeting fetchByhostedBy_First(
		String hostedBy, OrderByComparator<Meeting> orderByComparator) {

		return getPersistence().fetchByhostedBy_First(
			hostedBy, orderByComparator);
	}

	/**
	 * Returns the last meeting in the ordered set where hostedBy = &#63;.
	 *
	 * @param hostedBy the hosted by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meeting
	 * @throws NoSuchMeetingException if a matching meeting could not be found
	 */
	public static Meeting findByhostedBy_Last(
			String hostedBy, OrderByComparator<Meeting> orderByComparator)
		throws com.adjecti.meeting.exception.NoSuchMeetingException {

		return getPersistence().findByhostedBy_Last(
			hostedBy, orderByComparator);
	}

	/**
	 * Returns the last meeting in the ordered set where hostedBy = &#63;.
	 *
	 * @param hostedBy the hosted by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meeting, or <code>null</code> if a matching meeting could not be found
	 */
	public static Meeting fetchByhostedBy_Last(
		String hostedBy, OrderByComparator<Meeting> orderByComparator) {

		return getPersistence().fetchByhostedBy_Last(
			hostedBy, orderByComparator);
	}

	/**
	 * Returns the meetings before and after the current meeting in the ordered set where hostedBy = &#63;.
	 *
	 * @param meetingId the primary key of the current meeting
	 * @param hostedBy the hosted by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meeting
	 * @throws NoSuchMeetingException if a meeting with the primary key could not be found
	 */
	public static Meeting[] findByhostedBy_PrevAndNext(
			long meetingId, String hostedBy,
			OrderByComparator<Meeting> orderByComparator)
		throws com.adjecti.meeting.exception.NoSuchMeetingException {

		return getPersistence().findByhostedBy_PrevAndNext(
			meetingId, hostedBy, orderByComparator);
	}

	/**
	 * Removes all the meetings where hostedBy = &#63; from the database.
	 *
	 * @param hostedBy the hosted by
	 */
	public static void removeByhostedBy(String hostedBy) {
		getPersistence().removeByhostedBy(hostedBy);
	}

	/**
	 * Returns the number of meetings where hostedBy = &#63;.
	 *
	 * @param hostedBy the hosted by
	 * @return the number of matching meetings
	 */
	public static int countByhostedBy(String hostedBy) {
		return getPersistence().countByhostedBy(hostedBy);
	}

	/**
	 * Caches the meeting in the entity cache if it is enabled.
	 *
	 * @param meeting the meeting
	 */
	public static void cacheResult(Meeting meeting) {
		getPersistence().cacheResult(meeting);
	}

	/**
	 * Caches the meetings in the entity cache if it is enabled.
	 *
	 * @param meetings the meetings
	 */
	public static void cacheResult(List<Meeting> meetings) {
		getPersistence().cacheResult(meetings);
	}

	/**
	 * Creates a new meeting with the primary key. Does not add the meeting to the database.
	 *
	 * @param meetingId the primary key for the new meeting
	 * @return the new meeting
	 */
	public static Meeting create(long meetingId) {
		return getPersistence().create(meetingId);
	}

	/**
	 * Removes the meeting with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param meetingId the primary key of the meeting
	 * @return the meeting that was removed
	 * @throws NoSuchMeetingException if a meeting with the primary key could not be found
	 */
	public static Meeting remove(long meetingId)
		throws com.adjecti.meeting.exception.NoSuchMeetingException {

		return getPersistence().remove(meetingId);
	}

	public static Meeting updateImpl(Meeting meeting) {
		return getPersistence().updateImpl(meeting);
	}

	/**
	 * Returns the meeting with the primary key or throws a <code>NoSuchMeetingException</code> if it could not be found.
	 *
	 * @param meetingId the primary key of the meeting
	 * @return the meeting
	 * @throws NoSuchMeetingException if a meeting with the primary key could not be found
	 */
	public static Meeting findByPrimaryKey(long meetingId)
		throws com.adjecti.meeting.exception.NoSuchMeetingException {

		return getPersistence().findByPrimaryKey(meetingId);
	}

	/**
	 * Returns the meeting with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param meetingId the primary key of the meeting
	 * @return the meeting, or <code>null</code> if a meeting with the primary key could not be found
	 */
	public static Meeting fetchByPrimaryKey(long meetingId) {
		return getPersistence().fetchByPrimaryKey(meetingId);
	}

	/**
	 * Returns all the meetings.
	 *
	 * @return the meetings
	 */
	public static List<Meeting> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the meetings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of meetings
	 * @param end the upper bound of the range of meetings (not inclusive)
	 * @return the range of meetings
	 */
	public static List<Meeting> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the meetings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of meetings
	 * @param end the upper bound of the range of meetings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of meetings
	 */
	public static List<Meeting> findAll(
		int start, int end, OrderByComparator<Meeting> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the meetings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MeetingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of meetings
	 * @param end the upper bound of the range of meetings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of meetings
	 */
	public static List<Meeting> findAll(
		int start, int end, OrderByComparator<Meeting> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the meetings from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of meetings.
	 *
	 * @return the number of meetings
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MeetingPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<MeetingPersistence, MeetingPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(MeetingPersistence.class);

		ServiceTracker<MeetingPersistence, MeetingPersistence> serviceTracker =
			new ServiceTracker<MeetingPersistence, MeetingPersistence>(
				bundle.getBundleContext(), MeetingPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}