package com.demo.services;

import java.util.Scanner;

import java.util.Set;

import com.demo.beans.Room;
import com.demo.dao.RoomDao;
import com.demo.dao.RoomDaoImpl;



public class RoomServiceImpl implements RoomService{
	
	Room r=null;
	
	Scanner scan=new Scanner(System.in);

	private RoomDao rdao;
	
	public RoomServiceImpl()
	{
		rdao=new RoomDaoImpl();
	}
	
	
	@Override
	public void addNewRoom() {
		// Accepting data from user for new room details
		
		System.out.println("Enter the New Roomid:");
		int id=scan.nextInt();
		System.out.println("Enter the RoomName: ");
		String name=scan.next();
		System.out.println("Enter the Capacity: ");
		int capacity=scan.nextInt();
		System.out.println("Enter the price: ");
		double p=scan.nextDouble();
		
		System.out.println("Enter the Status: ");
		boolean status=scan.nextBoolean();
		
		r=new Room(id,name,capacity,p,status);
		
		rdao.save(r);
		
	}

	@Override
	public boolean cancelRoom(int id) {
		// method for cancelling the room booked by the user
		return rdao.cancelRoom(id);
	}

	@Override
	public void bookRoom(String type,int capacity) {
		
		
		// method for booking the room

		
		rdao.bookRoom(type, capacity);
	}

}
