package com.demo.test;

import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Room;
import com.demo.services.*;

public class TestMain {
	
public static void main(String []args)
{
	Scanner scan=new Scanner(System.in);	
	
	RoomService rs=new RoomServiceImpl();
	
	int ch=0;
	

		
	do {
		System.out.println("-----------------------------------------------");
		System.out.println("            RoomService MenuDriven             ");
		System.out.println("-----------------------------------------------");
		System.out.println(" 1.           AddNewRoom                       ");
		System.out.println(" 2.           CancelRoomBooking                 ");
		System.out.println(" 3.           Book_Room                         ");
		System.out.println(" 4.           Exit                              ");
		System.out.println("----------------------------------------------- ");
		
		System.out.println(" Enter your choice from the above Menu          ");
		ch=scan.nextInt();
		

		switch (ch){
		case 1: rs.addNewRoom(); // calling method for adding new room
				break;
		case 2:
			System.out.println("Enter the id for canceling the room");
			int id=scan.nextInt();
			boolean status=rs.cancelRoom(id); // calling method canceling room
			if(status)
			{
				System.out.println("Booking Cancelled Successfully !!!!");
			}
			else
			{
				System.out.println("No Such Room Found !!!!");
			}
			break;
			
		case 3:
			System.out.println("Enter the type of room u want"); // calling method for booking the room
			String type=scan.next();
			System.out.println("Enter the capcity u want");
			int capacity=scan.nextInt();
			rs.bookRoom(type, capacity);
			break;
					
		case 4: scan.close(); // exit method
				System.out.println("Thankyou Visit Again !!!!!");
				break;
				
	   default: System.out.println("Invalid choice entered, Kindly choose from the given Choices Only!!!");

		}

		
	}while(ch!=4);
	 System.exit(1);
		
	
}

}
