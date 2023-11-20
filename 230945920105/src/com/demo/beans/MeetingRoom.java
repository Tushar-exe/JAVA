package com.demo.beans;

public class MeetingRoom extends Room {
	
	private String tv_make;
	private String tv_model;
	
	// default constructor
	public MeetingRoom() {
		super();
	}

	// parameterized constructor
	public MeetingRoom(int roomid, String roomname, int capacity, double price, boolean status, String tv_make,
			String tv_model) {
		super(roomid, roomname, capacity, price, status);
		this.tv_make = tv_make;
		this.tv_model = tv_model;
	}
    // Getters- Setters
	public String getTv_make() {
		return tv_make;
	}

	public void setTv_make(String tv_make) {
		this.tv_make = tv_make;
	}

	public String getTv_model() {
		return tv_model;
	}

	public void setTv_model(String tv_model) {
		this.tv_model = tv_model;
	}

	// to-string method to print the data 
	@Override
	public String toString() {
		return super.toString()+ "MeetingRoom [tv_make=" + tv_make + ", tv_model=" + tv_model + "]";
	}
	
	

}
