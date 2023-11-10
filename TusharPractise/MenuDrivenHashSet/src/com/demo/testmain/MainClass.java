package com.demo.testmain;
import com.demo.pojo.Employee;



import com.demo.services.*;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class MainClass {
	static Scanner sc=new Scanner(System.in);

	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		int ch;
		EmpServices se=new EmpServicesImpl();
		
		String input;
		
		
		do {
			System.out.println("------------------------------------------");
			System.out.println("     MENU DRIVEN WITH OOPS CONCEPT        ");
			System.out.println("----------------------------------------- |");
			System.out.println("| 1.        ADD_NEW_EMP                   |");
			System.out.println("| 2.        DisplayAll                    |");
			System.out.println("| 3.        SerchById                     |");
			System.out.println("| 4.        ModifyById                    |");
			System.out.println("| 5.        SortByName                    |");
			System.out.println("| 6.        sortBySal                    |");
			System.out.println("| 7.        GetNTopEmp                    |");
			System.out.println("-------------------------------------------");
			
			System.out.println("Enter your choice:");
			ch=scan.nextInt();
			switch(ch)
			{
			case 1:
					se.addNewEmp();
					break;
			case 2:   
			      Set<Employee>res=se.displayAll();
			      res.stream().forEach(System.out::println);
			      break;
			case 3:
				System.out.println("Enter the id u want to search");
				int id=sc.nextInt();
				Employee e=se.searchById(id);
				if(e!=null)
				{
					System.out.println(e);
				}
				else
					System.out.println("Id Not found");
				break;
			case 4:
				
				System.out.println("Enter the id u want to modify");
				int id1=sc.nextInt();
				System.out.println("Enter new salary");
				double sal=sc.nextDouble();
				boolean status=se.modifySalById(id1,sal );
				if(status)
				{
					System.out.println("Id modified successfully");
				}
				else
					System.out.println("Id does not exists");
				break;
				
				
				
			case 5:
				Set<Employee>st=se.sortByName();
				if(st!=null)
				{
					System.out.println(st);
					//st.stream().forEach(System.out::println);
				}
				else
					break;
			case 6: 
				
				Set<Employee>stt=se.sortBySal();
				if(stt!=null)
				{
					stt.stream().forEach(System.out::println);
				}
				else
					break;
			     
			case 7: 
				System.out.println("Enter the no of top employee u want to print");
				int n=sc.nextInt();
				Employee []ans=se.getNTopEmps(n);
				if(ans!=null) {
				for(Employee eee:ans)
				{
					System.out.println(eee);
				}
				}
				break;
			     
			
			
			
			}
			
			
			
			
			
			System.out.println("Do you want to continue if Yes press Y/y if not press N/n");
			input=scan.next();
			
			
		}while(input.equals("Y")||input.equals("y"));
		 System.out.println("Byeee Visit Again !!!");
		 System.exit(0);
	}
}
		