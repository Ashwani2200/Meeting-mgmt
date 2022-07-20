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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.adjecti.meeting.service.http.MeetingServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class MeetingSoap implements Serializable {

	public static MeetingSoap toSoapModel(Meeting model) {
		MeetingSoap soapModel = new MeetingSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setMeetingId(model.getMeetingId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setTitle(model.getTitle());
		soapModel.setDateAndTime(model.getDateAndTime());
		soapModel.setLocation(model.getLocation());
		soapModel.setAgenda(model.getAgenda());
		soapModel.setDescription(model.getDescription());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setHostedBy(model.getHostedBy());
		soapModel.setMeetingType(model.getMeetingType());
		soapModel.setMeetingLink(model.getMeetingLink());
		soapModel.setMeetingRoom(model.getMeetingRoom());

		return soapModel;
	}

	public static MeetingSoap[] toSoapModels(Meeting[] models) {
		MeetingSoap[] soapModels = new MeetingSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MeetingSoap[][] toSoapModels(Meeting[][] models) {
		MeetingSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MeetingSoap[models.length][models[0].length];
		}
		else {
			soapModels = new MeetingSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MeetingSoap[] toSoapModels(List<Meeting> models) {
		List<MeetingSoap> soapModels = new ArrayList<MeetingSoap>(
			models.size());

		for (Meeting model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MeetingSoap[soapModels.size()]);
	}

	public MeetingSoap() {
	}

	public long getPrimaryKey() {
		return _meetingId;
	}

	public void setPrimaryKey(long pk) {
		setMeetingId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getMeetingId() {
		return _meetingId;
	}

	public void setMeetingId(long meetingId) {
		_meetingId = meetingId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getDateAndTime() {
		return _dateAndTime;
	}

	public void setDateAndTime(String dateAndTime) {
		_dateAndTime = dateAndTime;
	}

	public String getLocation() {
		return _location;
	}

	public void setLocation(String location) {
		_location = location;
	}

	public String getAgenda() {
		return _agenda;
	}

	public void setAgenda(String agenda) {
		_agenda = agenda;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getCreatedBy() {
		return _createdBy;
	}

	public void setCreatedBy(String createdBy) {
		_createdBy = createdBy;
	}

	public String getHostedBy() {
		return _hostedBy;
	}

	public void setHostedBy(String hostedBy) {
		_hostedBy = hostedBy;
	}

	public String getMeetingType() {
		return _meetingType;
	}

	public void setMeetingType(String meetingType) {
		_meetingType = meetingType;
	}

	public String getMeetingLink() {
		return _meetingLink;
	}

	public void setMeetingLink(String meetingLink) {
		_meetingLink = meetingLink;
	}

	public String getMeetingRoom() {
		return _meetingRoom;
	}

	public void setMeetingRoom(String meetingRoom) {
		_meetingRoom = meetingRoom;
	}

	private String _uuid;
	private long _meetingId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _title;
	private String _dateAndTime;
	private String _location;
	private String _agenda;
	private String _description;
	private String _createdBy;
	private String _hostedBy;
	private String _meetingType;
	private String _meetingLink;
	private String _meetingRoom;

}