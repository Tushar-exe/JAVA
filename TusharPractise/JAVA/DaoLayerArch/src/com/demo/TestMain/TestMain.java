package com.demo.TestMain;

import java.util.Scanner;

import com.demo.services.PersonService;
import com.demo.services.ServicePerson_Impl;
import com.demo.beans.Person;



public class TestMain {
	
	public static void main(String []args) {

	Scanner scan=new Scanner(System.in);
	
	int ch;
	String choice;
	
	PersonService ps=new ServicePerson_Impl();
	
	
	do
	{
		System.out.println("----------------------------------");
		System.out.println("  LAYER ARCHITECTURE DRIVEN PROG  ");
		System.out.println("----------------------------------");
		System.out.println("| 1.       Add_NEW_PERSON        |");
		System.out.println("| 2.       DISPLAY_ALL           |");
		System.out.println("| 3.       SEARCH_BY_ID          |");
		System.out.println("| 4.       Exit                  |");
		System.out.println("----------------------------------");
		System.out.println("Enter your choice from the above Menu");
		ch=scan.nextInt();
		
		
		switch(ch)
		{
		case 1:ps.addNewperson();
				break;
				
		case 2:
			Person []p =ps.displayAll();
			for(Person p1:p) {
				if(p1!=null)
				   System.out.println(p1);
				else
				{
					break;
			      }
			}
			break;

		case 3: 
			System.out.println("Enter the id that u want to search");
			int pid=scan.nextInt();
			
			  Person pp=ps.searchById(pid);
			if(pp!=null)
			{ 
			  System.out.println(pp);
			}
			else
			{
				System.out.println("ID Not Found");
			}
			break;
			
			
		default:System.out.println("Enter correct choice");
		     
			
			
		}
		System.out.println("DO U want to continue enter Y/y else press N/n");
		choice=scan.next();
		
	}while(choice.equals("y")||choice.equals("Y"));
	 System.out.println("Byeee........");

}
}
