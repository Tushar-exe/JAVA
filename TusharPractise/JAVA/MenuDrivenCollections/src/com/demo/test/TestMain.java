package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.beans.Person;
import com.demo.services.PersonService;
import com.demo.services.PersonServiceImpl;
public class TestMain {
	
	public static void main(String []args)
	{
		int ch;
		String choice;
		Scanner scan=new Scanner(System.in);
		
		PersonService ps=new PersonServiceImpl();
		
		do {
			

			System.out.println("----------------------------------------");
			System.out.println("  MenuDriven Using Collection-Framework ");
			System.out.println("----------------------------------------");
			System.out.println("| 1.       Add_NEW_PERSON              |");
			System.out.println("| 2.       DISPLAY_ALL                 |");
			System.out.println("| 3.       SEARCH_BY_ID                |");
			System.out.println("| 4.       Delete_By_Id                |");
			System.out.println("| 5.       Modify_By_Id                |");
			System.out.println("| 6.       sort_By_Name                |");
			System.out.println("----------------------------------------");
			System.out.println("Enter your choice from the above Menu");
			ch=scan.nextInt();
			
			
			switch(ch)
			{
			case 1: 
				System.out.println("1. salaried\n2.contract\n 3.vendor");
				int ch1=scan.nextInt();
				ps.addNewEmp(ch1);
					break;
					
			case 2:
				List<Employee>ls =ps.displayAll();
				for(Person p1:ls) {
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
				
				  Employee e=ps.displayById(pid);
				if(e!=null)
				{ 
				  System.out.println(e);
				}
				else
				{
					System.out.println("ID Not Found");
				}
				break;
			case 4: 
				System.out.println("Enter the id that u want to delete");
				 pid=scan.nextInt();
				 
				 boolean b=ps.deleteById(pid);
				 if(b)
				 {
					 System.out.println("Id Deleted successfully ");
				 }
				 else
					 System.out.println("Id Not Found ");
				  break;
		
			case 5: 
				 System.out.println("Enter the id that u want to modify");
				 pid=scan.nextInt();
				 System.out.println("Enter the new Salary ");
				 double sal=scan.nextDouble();
				 boolean bb=ps.modifySalById(pid, sal);
				 if(bb)
				 {
					 System.out.println("Salary Modified successfully ");
				 }
				 else
					 
					 System.out.println("Id Not Found cannot update sal ");
				 break;
				 
			case 6:
				List<Employee>emp=ps.sortByName();
				emp.stream().forEach(System.out::println);
				break;
				
				
			default:System.out.println("Enter correct choice");
			     
				
				
			}
			System.out.println("\n");
			System.out.println("DO U want to continue enter Y/y else press N/n");
			choice=scan.next();
			
		}while(choice.equals("y")||choice.equals("Y"));
		 System.out.println("Byeee........");

		}
		
	}


