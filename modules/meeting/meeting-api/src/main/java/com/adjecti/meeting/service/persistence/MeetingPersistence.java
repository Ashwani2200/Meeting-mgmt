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

import com.adjecti.meeting.exception.NoSuchMeetingException;
import com.adjecti.meeting.model.Meeting;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the meeting service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MeetingUtil
 * @generated
 */
@ProviderType
public interface MeetingPersistence extends BasePersistence<Meeting> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MeetingUtil} to access the meeting persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the meetings where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching meetings
	 */
	public java.util.List<Meeting> findByUuid(String uuid);

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
	public java.util.List<Meeting> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Meeting> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Meeting>
			orderByComparator);

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
	public java.util.List<Meeting> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Meeting>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first meeting in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meeting
	 * @throws NoSuchMeetingException if a matching meeting could not be found
	 */
	public Meeting findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Meeting>
				orderByComparator)
		throws NoSuchMeetingException;

	/**
	 * Returns the first meeting in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meeting, or <code>null</code> if a matching meeting could not be found
	 */
	public Meeting fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Meeting>
			orderByComparator);

	/**
	 * Returns the last meeting in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meeting
	 * @throws NoSuchMeetingException if a matching meeting could not be found
	 */
	public Meeting findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Meeting>
				orderByComparator)
		throws NoSuchMeetingException;

	/**
	 * Returns the last meeting in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meeting, or <code>null</code> if a matching meeting could not be found
	 */
	public Meeting fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Meeting>
			orderByComparator);

	/**
	 * Returns the meetings before and after the current meeting in the ordered set where uuid = &#63;.
	 *
	 * @param meetingId the primary key of the current meeting
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meeting
	 * @throws NoSuchMeetingException if a meeting with the primary key could not be found
	 */
	public Meeting[] findByUuid_PrevAndNext(
			long meetingId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Meeting>
				orderByComparator)
		throws NoSuchMeetingException;

	/**
	 * Removes all the meetings where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of meetings where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching meetings
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the meeting where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMeetingException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching meeting
	 * @throws NoSuchMeetingException if a matching meeting could not be found
	 */
	public Meeting findByUUID_G(String uuid, long groupId)
		throws NoSuchMeetingException;

	/**
	 * Returns the meeting where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching meeting, or <code>null</code> if a matching meeting could not be found
	 */
	public Meeting fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the meeting where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching meeting, or <code>null</code> if a matching meeting could not be found
	 */
	public Meeting fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the meeting where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the meeting that was removed
	 */
	public Meeting removeByUUID_G(String uuid, long groupId)
		throws NoSuchMeetingException;

	/**
	 * Returns the number of meetings where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching meetings
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the meetings where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching meetings
	 */
	public java.util.List<Meeting> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<Meeting> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<Meeting> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Meeting>
			orderByComparator);

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
	public java.util.List<Meeting> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Meeting>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first meeting in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meeting
	 * @throws NoSuchMeetingException if a matching meeting could not be found
	 */
	public Meeting findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Meeting>
				orderByComparator)
		throws NoSuchMeetingException;

	/**
	 * Returns the first meeting in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meeting, or <code>null</code> if a matching meeting could not be found
	 */
	public Meeting fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Meeting>
			orderByComparator);

	/**
	 * Returns the last meeting in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meeting
	 * @throws NoSuchMeetingException if a matching meeting could not be found
	 */
	public Meeting findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Meeting>
				orderByComparator)
		throws NoSuchMeetingException;

	/**
	 * Returns the last meeting in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meeting, or <code>null</code> if a matching meeting could not be found
	 */
	public Meeting fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Meeting>
			orderByComparator);

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
	public Meeting[] findByUuid_C_PrevAndNext(
			long meetingId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Meeting>
				orderByComparator)
		throws NoSuchMeetingException;

	/**
	 * Removes all the meetings where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of meetings where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching meetings
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the meetings where title = &#63;.
	 *
	 * @param title the title
	 * @return the matching meetings
	 */
	public java.util.List<Meeting> findBytitle(String title);

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
	public java.util.List<Meeting> findBytitle(
		String title, int start, int end);

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
	public java.util.List<Meeting> findBytitle(
		String title, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Meeting>
			orderByComparator);

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
	public java.util.List<Meeting> findBytitle(
		String title, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Meeting>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first meeting in the ordered set where title = &#63;.
	 *
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meeting
	 * @throws NoSuchMeetingException if a matching meeting could not be found
	 */
	public Meeting findBytitle_First(
			String title,
			com.liferay.portal.kernel.util.OrderByComparator<Meeting>
				orderByComparator)
		throws NoSuchMeetingException;

	/**
	 * Returns the first meeting in the ordered set where title = &#63;.
	 *
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meeting, or <code>null</code> if a matching meeting could not be found
	 */
	public Meeting fetchBytitle_First(
		String title,
		com.liferay.portal.kernel.util.OrderByComparator<Meeting>
			orderByComparator);

	/**
	 * Returns the last meeting in the ordered set where title = &#63;.
	 *
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meeting
	 * @throws NoSuchMeetingException if a matching meeting could not be found
	 */
	public Meeting findBytitle_Last(
			String title,
			com.liferay.portal.kernel.util.OrderByComparator<Meeting>
				orderByComparator)
		throws NoSuchMeetingException;

	/**
	 * Returns the last meeting in the ordered set where title = &#63;.
	 *
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meeting, or <code>null</code> if a matching meeting could not be found
	 */
	public Meeting fetchBytitle_Last(
		String title,
		com.liferay.portal.kernel.util.OrderByComparator<Meeting>
			orderByComparator);

	/**
	 * Returns the meetings before and after the current meeting in the ordered set where title = &#63;.
	 *
	 * @param meetingId the primary key of the current meeting
	 * @param title the title
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meeting
	 * @throws NoSuchMeetingException if a meeting with the primary key could not be found
	 */
	public Meeting[] findBytitle_PrevAndNext(
			long meetingId, String title,
			com.liferay.portal.kernel.util.OrderByComparator<Meeting>
				orderByComparator)
		throws NoSuchMeetingException;

	/**
	 * Removes all the meetings where title = &#63; from the database.
	 *
	 * @param title the title
	 */
	public void removeBytitle(String title);

	/**
	 * Returns the number of meetings where title = &#63;.
	 *
	 * @param title the title
	 * @return the number of matching meetings
	 */
	public int countBytitle(String title);

	/**
	 * Returns all the meetings where location = &#63;.
	 *
	 * @param location the location
	 * @return the matching meetings
	 */
	public java.util.List<Meeting> findBylocation(String location);

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
	public java.util.List<Meeting> findBylocation(
		String location, int start, int end);

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
	public java.util.List<Meeting> findBylocation(
		String location, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Meeting>
			orderByComparator);

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
	public java.util.List<Meeting> findBylocation(
		String location, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Meeting>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first meeting in the ordered set where location = &#63;.
	 *
	 * @param location the location
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meeting
	 * @throws NoSuchMeetingException if a matching meeting could not be found
	 */
	public Meeting findBylocation_First(
			String location,
			com.liferay.portal.kernel.util.OrderByComparator<Meeting>
				orderByComparator)
		throws NoSuchMeetingException;

	/**
	 * Returns the first meeting in the ordered set where location = &#63;.
	 *
	 * @param location the location
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meeting, or <code>null</code> if a matching meeting could not be found
	 */
	public Meeting fetchBylocation_First(
		String location,
		com.liferay.portal.kernel.util.OrderByComparator<Meeting>
			orderByComparator);

	/**
	 * Returns the last meeting in the ordered set where location = &#63;.
	 *
	 * @param location the location
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meeting
	 * @throws NoSuchMeetingException if a matching meeting could not be found
	 */
	public Meeting findBylocation_Last(
			String location,
			com.liferay.portal.kernel.util.OrderByComparator<Meeting>
				orderByComparator)
		throws NoSuchMeetingException;

	/**
	 * Returns the last meeting in the ordered set where location = &#63;.
	 *
	 * @param location the location
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meeting, or <code>null</code> if a matching meeting could not be found
	 */
	public Meeting fetchBylocation_Last(
		String location,
		com.liferay.portal.kernel.util.OrderByComparator<Meeting>
			orderByComparator);

	/**
	 * Returns the meetings before and after the current meeting in the ordered set where location = &#63;.
	 *
	 * @param meetingId the primary key of the current meeting
	 * @param location the location
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meeting
	 * @throws NoSuchMeetingException if a meeting with the primary key could not be found
	 */
	public Meeting[] findBylocation_PrevAndNext(
			long meetingId, String location,
			com.liferay.portal.kernel.util.OrderByComparator<Meeting>
				orderByComparator)
		throws NoSuchMeetingException;

	/**
	 * Removes all the meetings where location = &#63; from the database.
	 *
	 * @param location the location
	 */
	public void removeBylocation(String location);

	/**
	 * Returns the number of meetings where location = &#63;.
	 *
	 * @param location the location
	 * @return the number of matching meetings
	 */
	public int countBylocation(String location);

	/**
	 * Returns all the meetings where createdBy = &#63;.
	 *
	 * @param createdBy the created by
	 * @return the matching meetings
	 */
	public java.util.List<Meeting> findBycreatedBy(String createdBy);

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
	public java.util.List<Meeting> findBycreatedBy(
		String createdBy, int start, int end);

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
	public java.util.List<Meeting> findBycreatedBy(
		String createdBy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Meeting>
			orderByComparator);

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
	public java.util.List<Meeting> findBycreatedBy(
		String createdBy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Meeting>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first meeting in the ordered set where createdBy = &#63;.
	 *
	 * @param createdBy the created by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meeting
	 * @throws NoSuchMeetingException if a matching meeting could not be found
	 */
	public Meeting findBycreatedBy_First(
			String createdBy,
			com.liferay.portal.kernel.util.OrderByComparator<Meeting>
				orderByComparator)
		throws NoSuchMeetingException;

	/**
	 * Returns the first meeting in the ordered set where createdBy = &#63;.
	 *
	 * @param createdBy the created by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meeting, or <code>null</code> if a matching meeting could not be found
	 */
	public Meeting fetchBycreatedBy_First(
		String createdBy,
		com.liferay.portal.kernel.util.OrderByComparator<Meeting>
			orderByComparator);

	/**
	 * Returns the last meeting in the ordered set where createdBy = &#63;.
	 *
	 * @param createdBy the created by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meeting
	 * @throws NoSuchMeetingException if a matching meeting could not be found
	 */
	public Meeting findBycreatedBy_Last(
			String createdBy,
			com.liferay.portal.kernel.util.OrderByComparator<Meeting>
				orderByComparator)
		throws NoSuchMeetingException;

	/**
	 * Returns the last meeting in the ordered set where createdBy = &#63;.
	 *
	 * @param createdBy the created by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meeting, or <code>null</code> if a matching meeting could not be found
	 */
	public Meeting fetchBycreatedBy_Last(
		String createdBy,
		com.liferay.portal.kernel.util.OrderByComparator<Meeting>
			orderByComparator);

	/**
	 * Returns the meetings before and after the current meeting in the ordered set where createdBy = &#63;.
	 *
	 * @param meetingId the primary key of the current meeting
	 * @param createdBy the created by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meeting
	 * @throws NoSuchMeetingException if a meeting with the primary key could not be found
	 */
	public Meeting[] findBycreatedBy_PrevAndNext(
			long meetingId, String createdBy,
			com.liferay.portal.kernel.util.OrderByComparator<Meeting>
				orderByComparator)
		throws NoSuchMeetingException;

	/**
	 * Removes all the meetings where createdBy = &#63; from the database.
	 *
	 * @param createdBy the created by
	 */
	public void removeBycreatedBy(String createdBy);

	/**
	 * Returns the number of meetings where createdBy = &#63;.
	 *
	 * @param createdBy the created by
	 * @return the number of matching meetings
	 */
	public int countBycreatedBy(String createdBy);

	/**
	 * Returns all the meetings where hostedBy = &#63;.
	 *
	 * @param hostedBy the hosted by
	 * @return the matching meetings
	 */
	public java.util.List<Meeting> findByhostedBy(String hostedBy);

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
	public java.util.List<Meeting> findByhostedBy(
		String hostedBy, int start, int end);

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
	public java.util.List<Meeting> findByhostedBy(
		String hostedBy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Meeting>
			orderByComparator);

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
	public java.util.List<Meeting> findByhostedBy(
		String hostedBy, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Meeting>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first meeting in the ordered set where hostedBy = &#63;.
	 *
	 * @param hostedBy the hosted by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meeting
	 * @throws NoSuchMeetingException if a matching meeting could not be found
	 */
	public Meeting findByhostedBy_First(
			String hostedBy,
			com.liferay.portal.kernel.util.OrderByComparator<Meeting>
				orderByComparator)
		throws NoSuchMeetingException;

	/**
	 * Returns the first meeting in the ordered set where hostedBy = &#63;.
	 *
	 * @param hostedBy the hosted by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching meeting, or <code>null</code> if a matching meeting could not be found
	 */
	public Meeting fetchByhostedBy_First(
		String hostedBy,
		com.liferay.portal.kernel.util.OrderByComparator<Meeting>
			orderByComparator);

	/**
	 * Returns the last meeting in the ordered set where hostedBy = &#63;.
	 *
	 * @param hostedBy the hosted by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meeting
	 * @throws NoSuchMeetingException if a matching meeting could not be found
	 */
	public Meeting findByhostedBy_Last(
			String hostedBy,
			com.liferay.portal.kernel.util.OrderByComparator<Meeting>
				orderByComparator)
		throws NoSuchMeetingException;

	/**
	 * Returns the last meeting in the ordered set where hostedBy = &#63;.
	 *
	 * @param hostedBy the hosted by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching meeting, or <code>null</code> if a matching meeting could not be found
	 */
	public Meeting fetchByhostedBy_Last(
		String hostedBy,
		com.liferay.portal.kernel.util.OrderByComparator<Meeting>
			orderByComparator);

	/**
	 * Returns the meetings before and after the current meeting in the ordered set where hostedBy = &#63;.
	 *
	 * @param meetingId the primary key of the current meeting
	 * @param hostedBy the hosted by
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next meeting
	 * @throws NoSuchMeetingException if a meeting with the primary key could not be found
	 */
	public Meeting[] findByhostedBy_PrevAndNext(
			long meetingId, String hostedBy,
			com.liferay.portal.kernel.util.OrderByComparator<Meeting>
				orderByComparator)
		throws NoSuchMeetingException;

	/**
	 * Removes all the meetings where hostedBy = &#63; from the database.
	 *
	 * @param hostedBy the hosted by
	 */
	public void removeByhostedBy(String hostedBy);

	/**
	 * Returns the number of meetings where hostedBy = &#63;.
	 *
	 * @param hostedBy the hosted by
	 * @return the number of matching meetings
	 */
	public int countByhostedBy(String hostedBy);

	/**
	 * Caches the meeting in the entity cache if it is enabled.
	 *
	 * @param meeting the meeting
	 */
	public void cacheResult(Meeting meeting);

	/**
	 * Caches the meetings in the entity cache if it is enabled.
	 *
	 * @param meetings the meetings
	 */
	public void cacheResult(java.util.List<Meeting> meetings);

	/**
	 * Creates a new meeting with the primary key. Does not add the meeting to the database.
	 *
	 * @param meetingId the primary key for the new meeting
	 * @return the new meeting
	 */
	public Meeting create(long meetingId);

	/**
	 * Removes the meeting with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param meetingId the primary key of the meeting
	 * @return the meeting that was removed
	 * @throws NoSuchMeetingException if a meeting with the primary key could not be found
	 */
	public Meeting remove(long meetingId) throws NoSuchMeetingException;

	public Meeting updateImpl(Meeting meeting);

	/**
	 * Returns the meeting with the primary key or throws a <code>NoSuchMeetingException</code> if it could not be found.
	 *
	 * @param meetingId the primary key of the meeting
	 * @return the meeting
	 * @throws NoSuchMeetingException if a meeting with the primary key could not be found
	 */
	public Meeting findByPrimaryKey(long meetingId)
		throws NoSuchMeetingException;

	/**
	 * Returns the meeting with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param meetingId the primary key of the meeting
	 * @return the meeting, or <code>null</code> if a meeting with the primary key could not be found
	 */
	public Meeting fetchByPrimaryKey(long meetingId);

	/**
	 * Returns all the meetings.
	 *
	 * @return the meetings
	 */
	public java.util.List<Meeting> findAll();

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
	public java.util.List<Meeting> findAll(int start, int end);

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
	public java.util.List<Meeting> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Meeting>
			orderByComparator);

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
	public java.util.List<Meeting> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Meeting>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the meetings from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of meetings.
	 *
	 * @return the number of meetings
	 */
	public int countAll();

}