package com.adjecti.meeting.rest.application;

public class RoomDTO {

	private long roomId;
	private String floorNo;
	private String roomNo;
	private String capacity;
	private String building;
	public long getRoomId() {
		return roomId;
	}
	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}
	public String getFloorNo() {
		return floorNo;
	}
	public void setFloorNo(String floorNo) {
		this.floorNo = floorNo;
	}
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public RoomDTO(long roomId, String floorNo, String roomNo, String capacity, String building) {
		super();
		this.roomId = roomId;
		this.floorNo = floorNo;
		this.roomNo = roomNo;
		this.capacity = capacity;
		this.building = building;
	}
	public RoomDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RoomDTO [roomId=" + roomId + ", floorNo=" + floorNo + ", roomNo=" + roomNo + ", capacity=" + capacity
				+ ", building=" + building + "]";
	}
	
	
	
	
}
