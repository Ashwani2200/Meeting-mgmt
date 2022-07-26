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

package com.adjecti.meeting.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Room}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Room
 * @generated
 */
public class RoomWrapper
	extends BaseModelWrapper<Room> implements ModelWrapper<Room>, Room {

	public RoomWrapper(Room room) {
		super(room);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("roomId", getRoomId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("roomNo", getRoomNo());
		attributes.put("floorNo", getFloorNo());
		attributes.put("capacity", getCapacity());
		attributes.put("building", getBuilding());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long roomId = (Long)attributes.get("roomId");

		if (roomId != null) {
			setRoomId(roomId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String roomNo = (String)attributes.get("roomNo");

		if (roomNo != null) {
			setRoomNo(roomNo);
		}

		String floorNo = (String)attributes.get("floorNo");

		if (floorNo != null) {
			setFloorNo(floorNo);
		}

		String capacity = (String)attributes.get("capacity");

		if (capacity != null) {
			setCapacity(capacity);
		}

		String building = (String)attributes.get("building");

		if (building != null) {
			setBuilding(building);
		}
	}

	/**
	 * Returns the building of this room.
	 *
	 * @return the building of this room
	 */
	@Override
	public String getBuilding() {
		return model.getBuilding();
	}

	/**
	 * Returns the capacity of this room.
	 *
	 * @return the capacity of this room
	 */
	@Override
	public String getCapacity() {
		return model.getCapacity();
	}

	/**
	 * Returns the company ID of this room.
	 *
	 * @return the company ID of this room
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this room.
	 *
	 * @return the create date of this room
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the floor no of this room.
	 *
	 * @return the floor no of this room
	 */
	@Override
	public String getFloorNo() {
		return model.getFloorNo();
	}

	/**
	 * Returns the group ID of this room.
	 *
	 * @return the group ID of this room
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this room.
	 *
	 * @return the modified date of this room
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this room.
	 *
	 * @return the primary key of this room
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the room ID of this room.
	 *
	 * @return the room ID of this room
	 */
	@Override
	public long getRoomId() {
		return model.getRoomId();
	}

	/**
	 * Returns the room no of this room.
	 *
	 * @return the room no of this room
	 */
	@Override
	public String getRoomNo() {
		return model.getRoomNo();
	}

	/**
	 * Returns the user ID of this room.
	 *
	 * @return the user ID of this room
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this room.
	 *
	 * @return the user name of this room
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this room.
	 *
	 * @return the user uuid of this room
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this room.
	 *
	 * @return the uuid of this room
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the building of this room.
	 *
	 * @param building the building of this room
	 */
	@Override
	public void setBuilding(String building) {
		model.setBuilding(building);
	}

	/**
	 * Sets the capacity of this room.
	 *
	 * @param capacity the capacity of this room
	 */
	@Override
	public void setCapacity(String capacity) {
		model.setCapacity(capacity);
	}

	/**
	 * Sets the company ID of this room.
	 *
	 * @param companyId the company ID of this room
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this room.
	 *
	 * @param createDate the create date of this room
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the floor no of this room.
	 *
	 * @param floorNo the floor no of this room
	 */
	@Override
	public void setFloorNo(String floorNo) {
		model.setFloorNo(floorNo);
	}

	/**
	 * Sets the group ID of this room.
	 *
	 * @param groupId the group ID of this room
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this room.
	 *
	 * @param modifiedDate the modified date of this room
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this room.
	 *
	 * @param primaryKey the primary key of this room
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the room ID of this room.
	 *
	 * @param roomId the room ID of this room
	 */
	@Override
	public void setRoomId(long roomId) {
		model.setRoomId(roomId);
	}

	/**
	 * Sets the room no of this room.
	 *
	 * @param roomNo the room no of this room
	 */
	@Override
	public void setRoomNo(String roomNo) {
		model.setRoomNo(roomNo);
	}

	/**
	 * Sets the user ID of this room.
	 *
	 * @param userId the user ID of this room
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this room.
	 *
	 * @param userName the user name of this room
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this room.
	 *
	 * @param userUuid the user uuid of this room
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this room.
	 *
	 * @param uuid the uuid of this room
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected RoomWrapper wrap(Room room) {
		return new RoomWrapper(room);
	}

}