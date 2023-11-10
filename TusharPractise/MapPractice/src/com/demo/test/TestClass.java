package com.demo.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.demo.beans.*;
import com.demo.services.*;

public class TestClass {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		EmployeeInterface sf = new EmployeeImpl();
		int choice;
		String input;
		do {
			System.out.println("+----------------------------------------+");
			System.out.println("|    MENU DRIVEN Using HashMap           |");
			System.out.println("|----------------------------------------|");
			System.out.println("| 1.        ADD_NEW_EMP                  |");
			System.out.println("| 2.        DisplayAll                   |");
			System.out.println("| 3.        ModifyById                   |");
			System.out.println("| 4.        DeleteById                   |");
			System.out.println("| 5.        SortById                     |");
			System.out.println("| 6.        SortBySal                    |");
			System.out.println("| 7.        getNTopEmp                   |");
			System.out.println("| 8.        sortByName                   |");
			System.out.println("| 9.        DisplayByMap                 |");
			System.out.println("| 0.        EXIT                         |");
			System.out.println("+----------------------------------------+");

			System.out.println("Enter your choice:");
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				sf.AddNewEmp();
				break;
			case 2:
				List<Employee> elst = sf.displayAll();
				elst.stream().forEach(System.out::println);
				break;

			case 3:
				System.out.println("Enter the id ");
				int id = scan.nextInt();
				System.out.println("Enter the salary");
				double sal = scan.nextDouble();
				boolean status = sf.modifyByid(id, sal);
				List<Employee> el;
				if (status) {
					System.out.println("Data Modified Successfully");
					System.out.println("MOdified data is");
					el = sf.displayAll();
					el.stream().forEach(System.out::println);
				} else {
					System.out.println("Id Not Found");
				}
				break;
				
		 case 4:
			        System.out.println("Enter the id u want to delete");
			        int idd=scan.nextInt();
					boolean status2=sf.deleteById(idd);
					
					if(status2)
					{
						System.out.println("Data has been deleted succesfully");
					}
					else
					{
						System.out.println("Id Not Found");
					}
		case 5:   
					TreeMap<Integer,Employee>tm=sf.sortById();
					for(Map.Entry<Integer, Employee> t : tm.entrySet())
					{
						System.out.println("key: "+t.getKey()+" "+"values: "+t.getValue());
					}
					//tm.entrySet().stream().forEach(tree -> System.out.println(tree.getKey()+" "+tree.getValue()));
					break;

	   case 6:
				 Map<Integer, Employee> mapp= sf.displayByMap();
				 
				// mapp.entrySet().stream().forEach(m -> System.out.println("Key: "+m.getKey()+" ,Values: "+m.getValue()));
				 break;
				 
	   case 7:  
		   		System.out.println("Enter the no of top Employee u want");
		   		int n=scan.nextInt();
		   		
		   		Employee []ans=sf.getNTopEmplyee(n);
		   		
		   		Arrays.stream(ans).forEach(System.out::println);
		   		
	   case 8:
                List<Employee>sortList=sf.sortByName();
                sortList.stream().forEach(System.out::println);
               break;
               
	   case 9:
		   		Map<Integer,Employee>mpp=sf.displayByMap();
		   		for(Map.Entry<Integer, Employee>mvp:mpp.entrySet())
		   		{
		   			System.out.println("Key:"+mvp.getKey()+" value:"+mvp.getValue());
		   		}
		   		break;
			}

			System.out.println("Do u want to continue enter Y/y if not press N/n");
			input = scan.next();
		} while (input.equals("Y") || input.equals("y"));
	}
}
