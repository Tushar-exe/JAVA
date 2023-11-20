package com.demo.dao;

import java.util.Set;

import com.demo.beans.Room;

public interface RoomDao {
	
	void save(Room r);
	
  boolean cancelRoom(int id);
	

	void bookRoom(String type, int capacity);
	

}
