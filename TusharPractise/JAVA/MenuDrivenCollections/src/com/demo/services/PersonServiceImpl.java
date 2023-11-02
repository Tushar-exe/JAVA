package com.demo.services;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.ContractEmp;
import com.demo.beans.Employee;
import com.demo.beans.SalarisedEmp;
import com.demo.beans.Vendor;
import com.demo.dao.DaoImpl;
import com.demo.dao.DaoInterface;

public class PersonServiceImpl implements PersonService {

	private DaoInterface pdao;
	
	
	
	public PersonServiceImpl() {
		pdao=new DaoImpl();
	}

	@Override
	public void addNewEmp(int ch) {
      
		Scanner scan=new Scanner(System.in);
		System.out.println("enter pid");
		int pid=scan.nextInt();
		System.out.println("enter name");
		String nm=scan.next();
		System.out.println("enter mobile");
		String mob=scan.next();
		System.out.println("enter email");
		String em=scan.next();
		System.out.println("enter dept");
		String dept=scan.next();
		System.out.println("enter desg");
		String desg=scan.next();
		
		
		Employee e=null;
		
		switch(ch)
		{
			case 1:
				System.out.println("Enter details for Salarised Emp");
				scan.nextLine();
				System.out.println("Enter the salary:");
				double s=scan.nextDouble();
				System.out.println("Enter the bonus:");
				double b=scan.nextDouble();
				e=new SalarisedEmp(pid,nm,mob,em,dept,desg,s,b);
				break;
				
			case 2:
				System.out.println("Enter details for Contract Emp");
				scan.nextLine();
				System.out.println("Enter the Hrs:");
				int h=scan.nextInt();
				System.out.println("Enter the charges:");
				double c=scan.nextDouble();
				e=new ContractEmp(pid,nm,mob,em,dept,desg,h,c);
				break;
				
			case 3:
				System.out.println("Enter details for Vendor");
				scan.nextLine();
				System.out.println("Enter the No of Employee:");
				int no=scan.nextInt();
				System.out.println("Enter the amount:");
				double a=scan.nextInt();
				e=new Vendor(pid,nm,mob,em,dept,desg,no,a);
				break;	
				
		}
		pdao.save(e);
;
		
	}

	@Override
	public List<Employee> displayAll() {
		
		return pdao.displayAll();
	}




	@Override
	public Employee displayById(int id) {
		
		return pdao.displayById(id);
	}

	@Override
	public boolean modifySalById(int id, double sal) {
		
		return pdao.modifySalById(id, sal);
	}

	@Override
	public boolean deleteById(int id) {
	
		return pdao.deleteById(id);
	}

	@Override
	public List<Employee> sortByName() {
		
		return pdao.sortByName();
	}
	

}
