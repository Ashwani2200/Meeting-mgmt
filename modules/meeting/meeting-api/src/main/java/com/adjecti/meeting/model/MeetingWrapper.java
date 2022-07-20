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
 * This class is a wrapper for {@link Meeting}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Meeting
 * @generated
 */
public class MeetingWrapper
	extends BaseModelWrapper<Meeting>
	implements Meeting, ModelWrapper<Meeting> {

	public MeetingWrapper(Meeting meeting) {
		super(meeting);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("meetingId", getMeetingId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("title", getTitle());
		attributes.put("dateAndTime", getDateAndTime());
		attributes.put("location", getLocation());
		attributes.put("agenda", getAgenda());
		attributes.put("description", getDescription());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("hostedBy", getHostedBy());
		attributes.put("meetingType", getMeetingType());
		attributes.put("meetingLink", getMeetingLink());
		attributes.put("meetingRoom", getMeetingRoom());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long meetingId = (Long)attributes.get("meetingId");

		if (meetingId != null) {
			setMeetingId(meetingId);
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

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String dateAndTime = (String)attributes.get("dateAndTime");

		if (dateAndTime != null) {
			setDateAndTime(dateAndTime);
		}

		String location = (String)attributes.get("location");

		if (location != null) {
			setLocation(location);
		}

		String agenda = (String)attributes.get("agenda");

		if (agenda != null) {
			setAgenda(agenda);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String createdBy = (String)attributes.get("createdBy");

		if (createdBy != null) {
			setCreatedBy(createdBy);
		}

		String hostedBy = (String)attributes.get("hostedBy");

		if (hostedBy != null) {
			setHostedBy(hostedBy);
		}

		String meetingType = (String)attributes.get("meetingType");

		if (meetingType != null) {
			setMeetingType(meetingType);
		}

		String meetingLink = (String)attributes.get("meetingLink");

		if (meetingLink != null) {
			setMeetingLink(meetingLink);
		}

		String meetingRoom = (String)attributes.get("meetingRoom");

		if (meetingRoom != null) {
			setMeetingRoom(meetingRoom);
		}
	}

	/**
	 * Returns the agenda of this meeting.
	 *
	 * @return the agenda of this meeting
	 */
	@Override
	public String getAgenda() {
		return model.getAgenda();
	}

	/**
	 * Returns the company ID of this meeting.
	 *
	 * @return the company ID of this meeting
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this meeting.
	 *
	 * @return the create date of this meeting
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the created by of this meeting.
	 *
	 * @return the created by of this meeting
	 */
	@Override
	public String getCreatedBy() {
		return model.getCreatedBy();
	}

	/**
	 * Returns the date and time of this meeting.
	 *
	 * @return the date and time of this meeting
	 */
	@Override
	public String getDateAndTime() {
		return model.getDateAndTime();
	}

	/**
	 * Returns the description of this meeting.
	 *
	 * @return the description of this meeting
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the group ID of this meeting.
	 *
	 * @return the group ID of this meeting
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the hosted by of this meeting.
	 *
	 * @return the hosted by of this meeting
	 */
	@Override
	public String getHostedBy() {
		return model.getHostedBy();
	}

	/**
	 * Returns the location of this meeting.
	 *
	 * @return the location of this meeting
	 */
	@Override
	public String getLocation() {
		return model.getLocation();
	}

	/**
	 * Returns the meeting ID of this meeting.
	 *
	 * @return the meeting ID of this meeting
	 */
	@Override
	public long getMeetingId() {
		return model.getMeetingId();
	}

	/**
	 * Returns the meeting link of this meeting.
	 *
	 * @return the meeting link of this meeting
	 */
	@Override
	public String getMeetingLink() {
		return model.getMeetingLink();
	}

	/**
	 * Returns the meeting room of this meeting.
	 *
	 * @return the meeting room of this meeting
	 */
	@Override
	public String getMeetingRoom() {
		return model.getMeetingRoom();
	}

	/**
	 * Returns the meeting type of this meeting.
	 *
	 * @return the meeting type of this meeting
	 */
	@Override
	public String getMeetingType() {
		return model.getMeetingType();
	}

	/**
	 * Returns the modified date of this meeting.
	 *
	 * @return the modified date of this meeting
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this meeting.
	 *
	 * @return the primary key of this meeting
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the title of this meeting.
	 *
	 * @return the title of this meeting
	 */
	@Override
	public String getTitle() {
		return model.getTitle();
	}

	/**
	 * Returns the user ID of this meeting.
	 *
	 * @return the user ID of this meeting
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this meeting.
	 *
	 * @return the user name of this meeting
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this meeting.
	 *
	 * @return the user uuid of this meeting
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this meeting.
	 *
	 * @return the uuid of this meeting
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
	 * Sets the agenda of this meeting.
	 *
	 * @param agenda the agenda of this meeting
	 */
	@Override
	public void setAgenda(String agenda) {
		model.setAgenda(agenda);
	}

	/**
	 * Sets the company ID of this meeting.
	 *
	 * @param companyId the company ID of this meeting
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this meeting.
	 *
	 * @param createDate the create date of this meeting
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the created by of this meeting.
	 *
	 * @param createdBy the created by of this meeting
	 */
	@Override
	public void setCreatedBy(String createdBy) {
		model.setCreatedBy(createdBy);
	}

	/**
	 * Sets the date and time of this meeting.
	 *
	 * @param dateAndTime the date and time of this meeting
	 */
	@Override
	public void setDateAndTime(String dateAndTime) {
		model.setDateAndTime(dateAndTime);
	}

	/**
	 * Sets the description of this meeting.
	 *
	 * @param description the description of this meeting
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the group ID of this meeting.
	 *
	 * @param groupId the group ID of this meeting
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the hosted by of this meeting.
	 *
	 * @param hostedBy the hosted by of this meeting
	 */
	@Override
	public void setHostedBy(String hostedBy) {
		model.setHostedBy(hostedBy);
	}

	/**
	 * Sets the location of this meeting.
	 *
	 * @param location the location of this meeting
	 */
	@Override
	public void setLocation(String location) {
		model.setLocation(location);
	}

	/**
	 * Sets the meeting ID of this meeting.
	 *
	 * @param meetingId the meeting ID of this meeting
	 */
	@Override
	public void setMeetingId(long meetingId) {
		model.setMeetingId(meetingId);
	}

	/**
	 * Sets the meeting link of this meeting.
	 *
	 * @param meetingLink the meeting link of this meeting
	 */
	@Override
	public void setMeetingLink(String meetingLink) {
		model.setMeetingLink(meetingLink);
	}

	/**
	 * Sets the meeting room of this meeting.
	 *
	 * @param meetingRoom the meeting room of this meeting
	 */
	@Override
	public void setMeetingRoom(String meetingRoom) {
		model.setMeetingRoom(meetingRoom);
	}

	/**
	 * Sets the meeting type of this meeting.
	 *
	 * @param meetingType the meeting type of this meeting
	 */
	@Override
	public void setMeetingType(String meetingType) {
		model.setMeetingType(meetingType);
	}

	/**
	 * Sets the modified date of this meeting.
	 *
	 * @param modifiedDate the modified date of this meeting
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this meeting.
	 *
	 * @param primaryKey the primary key of this meeting
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the title of this meeting.
	 *
	 * @param title the title of this meeting
	 */
	@Override
	public void setTitle(String title) {
		model.setTitle(title);
	}

	/**
	 * Sets the user ID of this meeting.
	 *
	 * @param userId the user ID of this meeting
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this meeting.
	 *
	 * @param userName the user name of this meeting
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this meeting.
	 *
	 * @param userUuid the user uuid of this meeting
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this meeting.
	 *
	 * @param uuid the uuid of this meeting
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
	protected MeetingWrapper wrap(Meeting meeting) {
		return new MeetingWrapper(meeting);
	}

}