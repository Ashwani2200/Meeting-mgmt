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

import com.adjecti.meeting.exception.NoSuchRoomException;
import com.adjecti.meeting.model.Room;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the room service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RoomUtil
 * @generated
 */
@ProviderType
public interface RoomPersistence extends BasePersistence<Room> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RoomUtil} to access the room persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the rooms where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching rooms
	 */
	public java.util.List<Room> findByUuid(String uuid);

	/**
	 * Returns a range of all the rooms where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RoomModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of rooms
	 * @param end the upper bound of the range of rooms (not inclusive)
	 * @return the range of matching rooms
	 */
	public java.util.List<Room> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the rooms where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RoomModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of rooms
	 * @param end the upper bound of the range of rooms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rooms
	 */
	public java.util.List<Room> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Room>
			orderByComparator);

	/**
	 * Returns an ordered range of all the rooms where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RoomModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of rooms
	 * @param end the upper bound of the range of rooms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching rooms
	 */
	public java.util.List<Room> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Room>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first room in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching room
	 * @throws NoSuchRoomException if a matching room could not be found
	 */
	public Room findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Room>
				orderByComparator)
		throws NoSuchRoomException;

	/**
	 * Returns the first room in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching room, or <code>null</code> if a matching room could not be found
	 */
	public Room fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Room>
			orderByComparator);

	/**
	 * Returns the last room in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching room
	 * @throws NoSuchRoomException if a matching room could not be found
	 */
	public Room findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Room>
				orderByComparator)
		throws NoSuchRoomException;

	/**
	 * Returns the last room in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching room, or <code>null</code> if a matching room could not be found
	 */
	public Room fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Room>
			orderByComparator);

	/**
	 * Returns the rooms before and after the current room in the ordered set where uuid = &#63;.
	 *
	 * @param roomId the primary key of the current room
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next room
	 * @throws NoSuchRoomException if a room with the primary key could not be found
	 */
	public Room[] findByUuid_PrevAndNext(
			long roomId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Room>
				orderByComparator)
		throws NoSuchRoomException;

	/**
	 * Removes all the rooms where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of rooms where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching rooms
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the room where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchRoomException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching room
	 * @throws NoSuchRoomException if a matching room could not be found
	 */
	public Room findByUUID_G(String uuid, long groupId)
		throws NoSuchRoomException;

	/**
	 * Returns the room where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching room, or <code>null</code> if a matching room could not be found
	 */
	public Room fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the room where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching room, or <code>null</code> if a matching room could not be found
	 */
	public Room fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the room where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the room that was removed
	 */
	public Room removeByUUID_G(String uuid, long groupId)
		throws NoSuchRoomException;

	/**
	 * Returns the number of rooms where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching rooms
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the rooms where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching rooms
	 */
	public java.util.List<Room> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the rooms where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RoomModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of rooms
	 * @param end the upper bound of the range of rooms (not inclusive)
	 * @return the range of matching rooms
	 */
	public java.util.List<Room> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the rooms where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RoomModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of rooms
	 * @param end the upper bound of the range of rooms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rooms
	 */
	public java.util.List<Room> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Room>
			orderByComparator);

	/**
	 * Returns an ordered range of all the rooms where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RoomModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of rooms
	 * @param end the upper bound of the range of rooms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching rooms
	 */
	public java.util.List<Room> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Room>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first room in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching room
	 * @throws NoSuchRoomException if a matching room could not be found
	 */
	public Room findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Room>
				orderByComparator)
		throws NoSuchRoomException;

	/**
	 * Returns the first room in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching room, or <code>null</code> if a matching room could not be found
	 */
	public Room fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Room>
			orderByComparator);

	/**
	 * Returns the last room in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching room
	 * @throws NoSuchRoomException if a matching room could not be found
	 */
	public Room findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Room>
				orderByComparator)
		throws NoSuchRoomException;

	/**
	 * Returns the last room in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching room, or <code>null</code> if a matching room could not be found
	 */
	public Room fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Room>
			orderByComparator);

	/**
	 * Returns the rooms before and after the current room in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param roomId the primary key of the current room
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next room
	 * @throws NoSuchRoomException if a room with the primary key could not be found
	 */
	public Room[] findByUuid_C_PrevAndNext(
			long roomId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Room>
				orderByComparator)
		throws NoSuchRoomException;

	/**
	 * Removes all the rooms where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of rooms where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching rooms
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns the room where roomNo = &#63; or throws a <code>NoSuchRoomException</code> if it could not be found.
	 *
	 * @param roomNo the room no
	 * @return the matching room
	 * @throws NoSuchRoomException if a matching room could not be found
	 */
	public Room findByroomNo(String roomNo) throws NoSuchRoomException;

	/**
	 * Returns the room where roomNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param roomNo the room no
	 * @return the matching room, or <code>null</code> if a matching room could not be found
	 */
	public Room fetchByroomNo(String roomNo);

	/**
	 * Returns the room where roomNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param roomNo the room no
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching room, or <code>null</code> if a matching room could not be found
	 */
	public Room fetchByroomNo(String roomNo, boolean useFinderCache);

	/**
	 * Removes the room where roomNo = &#63; from the database.
	 *
	 * @param roomNo the room no
	 * @return the room that was removed
	 */
	public Room removeByroomNo(String roomNo) throws NoSuchRoomException;

	/**
	 * Returns the number of rooms where roomNo = &#63;.
	 *
	 * @param roomNo the room no
	 * @return the number of matching rooms
	 */
	public int countByroomNo(String roomNo);

	/**
	 * Returns all the rooms where floorNo = &#63;.
	 *
	 * @param floorNo the floor no
	 * @return the matching rooms
	 */
	public java.util.List<Room> findByfloorNo(String floorNo);

	/**
	 * Returns a range of all the rooms where floorNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RoomModelImpl</code>.
	 * </p>
	 *
	 * @param floorNo the floor no
	 * @param start the lower bound of the range of rooms
	 * @param end the upper bound of the range of rooms (not inclusive)
	 * @return the range of matching rooms
	 */
	public java.util.List<Room> findByfloorNo(
		String floorNo, int start, int end);

	/**
	 * Returns an ordered range of all the rooms where floorNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RoomModelImpl</code>.
	 * </p>
	 *
	 * @param floorNo the floor no
	 * @param start the lower bound of the range of rooms
	 * @param end the upper bound of the range of rooms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rooms
	 */
	public java.util.List<Room> findByfloorNo(
		String floorNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Room>
			orderByComparator);

	/**
	 * Returns an ordered range of all the rooms where floorNo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RoomModelImpl</code>.
	 * </p>
	 *
	 * @param floorNo the floor no
	 * @param start the lower bound of the range of rooms
	 * @param end the upper bound of the range of rooms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching rooms
	 */
	public java.util.List<Room> findByfloorNo(
		String floorNo, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Room>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first room in the ordered set where floorNo = &#63;.
	 *
	 * @param floorNo the floor no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching room
	 * @throws NoSuchRoomException if a matching room could not be found
	 */
	public Room findByfloorNo_First(
			String floorNo,
			com.liferay.portal.kernel.util.OrderByComparator<Room>
				orderByComparator)
		throws NoSuchRoomException;

	/**
	 * Returns the first room in the ordered set where floorNo = &#63;.
	 *
	 * @param floorNo the floor no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching room, or <code>null</code> if a matching room could not be found
	 */
	public Room fetchByfloorNo_First(
		String floorNo,
		com.liferay.portal.kernel.util.OrderByComparator<Room>
			orderByComparator);

	/**
	 * Returns the last room in the ordered set where floorNo = &#63;.
	 *
	 * @param floorNo the floor no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching room
	 * @throws NoSuchRoomException if a matching room could not be found
	 */
	public Room findByfloorNo_Last(
			String floorNo,
			com.liferay.portal.kernel.util.OrderByComparator<Room>
				orderByComparator)
		throws NoSuchRoomException;

	/**
	 * Returns the last room in the ordered set where floorNo = &#63;.
	 *
	 * @param floorNo the floor no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching room, or <code>null</code> if a matching room could not be found
	 */
	public Room fetchByfloorNo_Last(
		String floorNo,
		com.liferay.portal.kernel.util.OrderByComparator<Room>
			orderByComparator);

	/**
	 * Returns the rooms before and after the current room in the ordered set where floorNo = &#63;.
	 *
	 * @param roomId the primary key of the current room
	 * @param floorNo the floor no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next room
	 * @throws NoSuchRoomException if a room with the primary key could not be found
	 */
	public Room[] findByfloorNo_PrevAndNext(
			long roomId, String floorNo,
			com.liferay.portal.kernel.util.OrderByComparator<Room>
				orderByComparator)
		throws NoSuchRoomException;

	/**
	 * Removes all the rooms where floorNo = &#63; from the database.
	 *
	 * @param floorNo the floor no
	 */
	public void removeByfloorNo(String floorNo);

	/**
	 * Returns the number of rooms where floorNo = &#63;.
	 *
	 * @param floorNo the floor no
	 * @return the number of matching rooms
	 */
	public int countByfloorNo(String floorNo);

	/**
	 * Returns all the rooms where capacity = &#63;.
	 *
	 * @param capacity the capacity
	 * @return the matching rooms
	 */
	public java.util.List<Room> findBycapacity(String capacity);

	/**
	 * Returns a range of all the rooms where capacity = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RoomModelImpl</code>.
	 * </p>
	 *
	 * @param capacity the capacity
	 * @param start the lower bound of the range of rooms
	 * @param end the upper bound of the range of rooms (not inclusive)
	 * @return the range of matching rooms
	 */
	public java.util.List<Room> findBycapacity(
		String capacity, int start, int end);

	/**
	 * Returns an ordered range of all the rooms where capacity = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RoomModelImpl</code>.
	 * </p>
	 *
	 * @param capacity the capacity
	 * @param start the lower bound of the range of rooms
	 * @param end the upper bound of the range of rooms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rooms
	 */
	public java.util.List<Room> findBycapacity(
		String capacity, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Room>
			orderByComparator);

	/**
	 * Returns an ordered range of all the rooms where capacity = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RoomModelImpl</code>.
	 * </p>
	 *
	 * @param capacity the capacity
	 * @param start the lower bound of the range of rooms
	 * @param end the upper bound of the range of rooms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching rooms
	 */
	public java.util.List<Room> findBycapacity(
		String capacity, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Room>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first room in the ordered set where capacity = &#63;.
	 *
	 * @param capacity the capacity
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching room
	 * @throws NoSuchRoomException if a matching room could not be found
	 */
	public Room findBycapacity_First(
			String capacity,
			com.liferay.portal.kernel.util.OrderByComparator<Room>
				orderByComparator)
		throws NoSuchRoomException;

	/**
	 * Returns the first room in the ordered set where capacity = &#63;.
	 *
	 * @param capacity the capacity
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching room, or <code>null</code> if a matching room could not be found
	 */
	public Room fetchBycapacity_First(
		String capacity,
		com.liferay.portal.kernel.util.OrderByComparator<Room>
			orderByComparator);

	/**
	 * Returns the last room in the ordered set where capacity = &#63;.
	 *
	 * @param capacity the capacity
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching room
	 * @throws NoSuchRoomException if a matching room could not be found
	 */
	public Room findBycapacity_Last(
			String capacity,
			com.liferay.portal.kernel.util.OrderByComparator<Room>
				orderByComparator)
		throws NoSuchRoomException;

	/**
	 * Returns the last room in the ordered set where capacity = &#63;.
	 *
	 * @param capacity the capacity
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching room, or <code>null</code> if a matching room could not be found
	 */
	public Room fetchBycapacity_Last(
		String capacity,
		com.liferay.portal.kernel.util.OrderByComparator<Room>
			orderByComparator);

	/**
	 * Returns the rooms before and after the current room in the ordered set where capacity = &#63;.
	 *
	 * @param roomId the primary key of the current room
	 * @param capacity the capacity
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next room
	 * @throws NoSuchRoomException if a room with the primary key could not be found
	 */
	public Room[] findBycapacity_PrevAndNext(
			long roomId, String capacity,
			com.liferay.portal.kernel.util.OrderByComparator<Room>
				orderByComparator)
		throws NoSuchRoomException;

	/**
	 * Removes all the rooms where capacity = &#63; from the database.
	 *
	 * @param capacity the capacity
	 */
	public void removeBycapacity(String capacity);

	/**
	 * Returns the number of rooms where capacity = &#63;.
	 *
	 * @param capacity the capacity
	 * @return the number of matching rooms
	 */
	public int countBycapacity(String capacity);

	/**
	 * Caches the room in the entity cache if it is enabled.
	 *
	 * @param room the room
	 */
	public void cacheResult(Room room);

	/**
	 * Caches the rooms in the entity cache if it is enabled.
	 *
	 * @param rooms the rooms
	 */
	public void cacheResult(java.util.List<Room> rooms);

	/**
	 * Creates a new room with the primary key. Does not add the room to the database.
	 *
	 * @param roomId the primary key for the new room
	 * @return the new room
	 */
	public Room create(long roomId);

	/**
	 * Removes the room with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param roomId the primary key of the room
	 * @return the room that was removed
	 * @throws NoSuchRoomException if a room with the primary key could not be found
	 */
	public Room remove(long roomId) throws NoSuchRoomException;

	public Room updateImpl(Room room);

	/**
	 * Returns the room with the primary key or throws a <code>NoSuchRoomException</code> if it could not be found.
	 *
	 * @param roomId the primary key of the room
	 * @return the room
	 * @throws NoSuchRoomException if a room with the primary key could not be found
	 */
	public Room findByPrimaryKey(long roomId) throws NoSuchRoomException;

	/**
	 * Returns the room with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param roomId the primary key of the room
	 * @return the room, or <code>null</code> if a room with the primary key could not be found
	 */
	public Room fetchByPrimaryKey(long roomId);

	/**
	 * Returns all the rooms.
	 *
	 * @return the rooms
	 */
	public java.util.List<Room> findAll();

	/**
	 * Returns a range of all the rooms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RoomModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rooms
	 * @param end the upper bound of the range of rooms (not inclusive)
	 * @return the range of rooms
	 */
	public java.util.List<Room> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the rooms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RoomModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rooms
	 * @param end the upper bound of the range of rooms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of rooms
	 */
	public java.util.List<Room> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Room>
			orderByComparator);

	/**
	 * Returns an ordered range of all the rooms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RoomModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rooms
	 * @param end the upper bound of the range of rooms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of rooms
	 */
	public java.util.List<Room> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Room>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the rooms from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of rooms.
	 *
	 * @return the number of rooms
	 */
	public int countAll();

}