package com.demo.dao;

import java.util.HashSet;
import java.util.Set;

import com.demo.beans.MeetingRoom;
import com.demo.beans.Room;
import com.demo.beans.TrainingRoom;

public class RoomDaoImpl implements RoomDao{
	
	 public static Set<Room>hs;
	 
	 static
	 {
		 hs=new HashSet<>();
		 
		 hs.add(new MeetingRoom(1,"Delux_Room",4,20000,true,"SamSung","Sam-123xv"));
		 hs.add(new MeetingRoom(2,"Semi-Delux_Room",3,18000,true,"Sony","Son-123xv"));
		 hs.add(new TrainingRoom(3,"Small",10,18000,true,"4478941342"));
		 hs.add(new TrainingRoom(4,"Large",20,18000,true,"24851521"));
	 }

	@Override
	public void save(Room r) {
		// TODO Auto-generated method stub
		hs.add(r);
		
	}



	@Override
	public void bookRoom(String type,int capacity) {
		// TODO Auto-generated method stub
		Set<Room>ans=new HashSet<Room>();
		boolean st=false;
		
		for(Room r:hs)
		{
			if(r.getCapacity()==capacity)
			{
				System.out.println(r);
				
				st=true;
				break;
			}
			
				
		}
		if(!st)
		{
			System.out.println("No Room matches the requirement");
		}
		
	}

	@Override
	public boolean cancelRoom(int id) {
		// TODO Auto-generated method stu
		
		for(Room m:hs)
		{
			if(m.getRoomid()==id)
			{
				m.setStatus(false);
				return true;
				
			}
		}
		return false;
	}

}
