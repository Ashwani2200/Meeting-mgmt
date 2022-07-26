package com.adjecti.meeting.rest.application;

public class MeetingDTO {

	private long meetingId;
	private String title;
	private String dateAndTime;
	private String location;
	private String agenda;
	private String description;
	private String createdBy;
	private String hostedBy;
	private String meetingType;
	private String meetingLink;

	private String meetingRoom;
	private String assetsName;
	private String internalGuest;

	private String externalGuest;

	public MeetingDTO(long meetingId, String title, String dateAndTime, String location, String agenda,
			String description, String createdBy, String hostedBy, String meetingType, String meetingLink,
			String meetingRoom, String assetsName, String internalGuest, String externalGuest) {
		super();
		this.meetingId = meetingId;
		this.title = title;
		this.dateAndTime = dateAndTime;
		this.location = location;
		this.agenda = agenda;
		this.description = description;
		this.createdBy = createdBy;
		this.hostedBy = hostedBy;
		this.meetingType = meetingType;
		this.meetingLink = meetingLink;
		this.meetingRoom = meetingRoom;
		this.assetsName = assetsName;
		this.internalGuest = internalGuest;
		this.externalGuest = externalGuest;
	}

	public MeetingDTO() {
		
	}

	public long getMeetingId() {
		return meetingId;
	}

	public void setMeetingId(long meetingId) {
		this.meetingId = meetingId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(String dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAgenda() {
		return agenda;
	}

	public void setAgenda(String agenda) {
		this.agenda = agenda;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getHostedBy() {
		return hostedBy;
	}

	public void setHostedBy(String hostedBy) {
		this.hostedBy = hostedBy;
	}

	public String getMeetingType() {
		return meetingType;
	}

	public void setMeetingType(String meetingType) {
		this.meetingType = meetingType;
	}

	public String getMeetingLink() {
		return meetingLink;
	}

	public void setMeetingLink(String meetingLink) {
		this.meetingLink = meetingLink;
	}

	public String getMeetingRoom() {
		return meetingRoom;
	}

	public void setMeetingRoom(String meetingRoom) {
		this.meetingRoom = meetingRoom;
	}

	public String getAssetsName() {
		return assetsName;
	}

	public void setAssetsName(String assetsName) {
		this.assetsName = assetsName;
	}

	public String getInternalGuest() {
		return internalGuest;
	}

	public void setInternalGuest(String internalGuest) {
		this.internalGuest = internalGuest;
	}

	public String getExternalGuest() {
		return externalGuest;
	}

	public void setExternalGuest(String externalGuest) {
		this.externalGuest = externalGuest;
	}

	@Override
	public String toString() {
		return "MeetingDTO [meetingId=" + meetingId + ", title=" + title + ", dateAndTime=" + dateAndTime
				+ ", location=" + location + ", agenda=" + agenda + ", description=" + description + ", createdBy="
				+ createdBy + ", hostedBy=" + hostedBy + ", meetingType=" + meetingType + ", meetingLink=" + meetingLink
				+ ", meetingRoom=" + meetingRoom + ", assetsName=" + assetsName + ", internalGuest=" + internalGuest
				+ ", externalGuest=" + externalGuest + "]";
	}

}
