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

package com.adjecti.meeting.model.impl;

import com.adjecti.meeting.model.Room;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Room in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RoomCacheModel implements CacheModel<Room>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof RoomCacheModel)) {
			return false;
		}

		RoomCacheModel roomCacheModel = (RoomCacheModel)object;

		if (roomId == roomCacheModel.roomId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, roomId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", roomId=");
		sb.append(roomId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", roomNo=");
		sb.append(roomNo);
		sb.append(", floorNo=");
		sb.append(floorNo);
		sb.append(", capacity=");
		sb.append(capacity);
		sb.append(", building=");
		sb.append(building);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Room toEntityModel() {
		RoomImpl roomImpl = new RoomImpl();

		if (uuid == null) {
			roomImpl.setUuid("");
		}
		else {
			roomImpl.setUuid(uuid);
		}

		roomImpl.setRoomId(roomId);
		roomImpl.setGroupId(groupId);
		roomImpl.setCompanyId(companyId);
		roomImpl.setUserId(userId);

		if (userName == null) {
			roomImpl.setUserName("");
		}
		else {
			roomImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			roomImpl.setCreateDate(null);
		}
		else {
			roomImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			roomImpl.setModifiedDate(null);
		}
		else {
			roomImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (roomNo == null) {
			roomImpl.setRoomNo("");
		}
		else {
			roomImpl.setRoomNo(roomNo);
		}

		if (floorNo == null) {
			roomImpl.setFloorNo("");
		}
		else {
			roomImpl.setFloorNo(floorNo);
		}

		if (capacity == null) {
			roomImpl.setCapacity("");
		}
		else {
			roomImpl.setCapacity(capacity);
		}

		if (building == null) {
			roomImpl.setBuilding("");
		}
		else {
			roomImpl.setBuilding(building);
		}

		roomImpl.resetOriginalValues();

		return roomImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		roomId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		roomNo = objectInput.readUTF();
		floorNo = objectInput.readUTF();
		capacity = objectInput.readUTF();
		building = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(roomId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (roomNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(roomNo);
		}

		if (floorNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(floorNo);
		}

		if (capacity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(capacity);
		}

		if (building == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(building);
		}
	}

	public String uuid;
	public long roomId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String roomNo;
	public String floorNo;
	public String capacity;
	public String building;

}