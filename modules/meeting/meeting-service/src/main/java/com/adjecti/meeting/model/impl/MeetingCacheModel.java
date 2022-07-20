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

import com.adjecti.meeting.model.Meeting;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Meeting in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MeetingCacheModel implements CacheModel<Meeting>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MeetingCacheModel)) {
			return false;
		}

		MeetingCacheModel meetingCacheModel = (MeetingCacheModel)object;

		if (meetingId == meetingCacheModel.meetingId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, meetingId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", meetingId=");
		sb.append(meetingId);
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
		sb.append(", title=");
		sb.append(title);
		sb.append(", dateAndTime=");
		sb.append(dateAndTime);
		sb.append(", location=");
		sb.append(location);
		sb.append(", agenda=");
		sb.append(agenda);
		sb.append(", description=");
		sb.append(description);
		sb.append(", createdBy=");
		sb.append(createdBy);
		sb.append(", hostedBy=");
		sb.append(hostedBy);
		sb.append(", meetingType=");
		sb.append(meetingType);
		sb.append(", meetingLink=");
		sb.append(meetingLink);
		sb.append(", meetingRoom=");
		sb.append(meetingRoom);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Meeting toEntityModel() {
		MeetingImpl meetingImpl = new MeetingImpl();

		if (uuid == null) {
			meetingImpl.setUuid("");
		}
		else {
			meetingImpl.setUuid(uuid);
		}

		meetingImpl.setMeetingId(meetingId);
		meetingImpl.setGroupId(groupId);
		meetingImpl.setCompanyId(companyId);
		meetingImpl.setUserId(userId);

		if (userName == null) {
			meetingImpl.setUserName("");
		}
		else {
			meetingImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			meetingImpl.setCreateDate(null);
		}
		else {
			meetingImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			meetingImpl.setModifiedDate(null);
		}
		else {
			meetingImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (title == null) {
			meetingImpl.setTitle("");
		}
		else {
			meetingImpl.setTitle(title);
		}

		if (dateAndTime == null) {
			meetingImpl.setDateAndTime("");
		}
		else {
			meetingImpl.setDateAndTime(dateAndTime);
		}

		if (location == null) {
			meetingImpl.setLocation("");
		}
		else {
			meetingImpl.setLocation(location);
		}

		if (agenda == null) {
			meetingImpl.setAgenda("");
		}
		else {
			meetingImpl.setAgenda(agenda);
		}

		if (description == null) {
			meetingImpl.setDescription("");
		}
		else {
			meetingImpl.setDescription(description);
		}

		if (createdBy == null) {
			meetingImpl.setCreatedBy("");
		}
		else {
			meetingImpl.setCreatedBy(createdBy);
		}

		if (hostedBy == null) {
			meetingImpl.setHostedBy("");
		}
		else {
			meetingImpl.setHostedBy(hostedBy);
		}

		if (meetingType == null) {
			meetingImpl.setMeetingType("");
		}
		else {
			meetingImpl.setMeetingType(meetingType);
		}

		if (meetingLink == null) {
			meetingImpl.setMeetingLink("");
		}
		else {
			meetingImpl.setMeetingLink(meetingLink);
		}

		if (meetingRoom == null) {
			meetingImpl.setMeetingRoom("");
		}
		else {
			meetingImpl.setMeetingRoom(meetingRoom);
		}

		meetingImpl.resetOriginalValues();

		return meetingImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		meetingId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		title = objectInput.readUTF();
		dateAndTime = objectInput.readUTF();
		location = objectInput.readUTF();
		agenda = objectInput.readUTF();
		description = objectInput.readUTF();
		createdBy = objectInput.readUTF();
		hostedBy = objectInput.readUTF();
		meetingType = objectInput.readUTF();
		meetingLink = objectInput.readUTF();
		meetingRoom = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(meetingId);

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

		if (title == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (dateAndTime == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(dateAndTime);
		}

		if (location == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(location);
		}

		if (agenda == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(agenda);
		}

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (createdBy == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(createdBy);
		}

		if (hostedBy == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(hostedBy);
		}

		if (meetingType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(meetingType);
		}

		if (meetingLink == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(meetingLink);
		}

		if (meetingRoom == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(meetingRoom);
		}
	}

	public String uuid;
	public long meetingId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String title;
	public String dateAndTime;
	public String location;
	public String agenda;
	public String description;
	public String createdBy;
	public String hostedBy;
	public String meetingType;
	public String meetingLink;
	public String meetingRoom;

}