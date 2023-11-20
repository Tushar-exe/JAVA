package com.demo.beans;

public class TrainingRoom extends Room{

	private String telephoneNo;

	public TrainingRoom() {
		super();
	}

	public TrainingRoom(int roomid, String roomname, int capacity, double price, boolean status, String telephoneNo) {
		super(roomid, roomname, capacity, price, status);
		this.telephoneNo = telephoneNo;
	}

	public String getTelephoneNo() {
		return telephoneNo;
	}

	public void setTelephoneNo(String telephoneNo) {
		this.telephoneNo = telephoneNo;
	}

	@Override
	public String toString() {
		return super.toString()+"TrainingRoom [telephoneNo=" + telephoneNo + "]";
	}
	
	
}
