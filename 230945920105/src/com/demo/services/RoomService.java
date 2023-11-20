package com.demo.services;

import java.util.Set;


import com.demo.beans.Room;


// interface of RoomService

public interface RoomService {
	
	public void addNewRoom();

	boolean cancelRoom(int id);


	void bookRoom(String type, int capacity);
	

}
