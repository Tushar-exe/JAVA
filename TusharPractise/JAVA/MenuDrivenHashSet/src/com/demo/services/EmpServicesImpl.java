package com.demo.services;

import java.util.Scanner;
import java.util.Set;

import com.demo.dao.DaoImplimentation;
import com.demo.dao.DaoInterface;
import com.demo.pojo.ContractEmp;
import com.demo.pojo.Employee;
import com.demo.pojo.SalarisedEmp;
import com.demo.pojo.Vendor;

public class EmpServicesImpl implements EmpServices {
	
	private DaoInterface ddao;
	
	public EmpServicesImpl()
	{
		ddao=new DaoImplimentation();
	}

	@Override
	public void addNewEmp() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter pid");
		int pid=sc.nextInt();
		System.out.println("enter name");
		String nm=sc.next();
		System.out.println("enter email");
		String em=sc.next();
		System.out.println("enter dept");
		String dept=sc.next();
		System.out.println("enter desg");
		String desg=sc.next();
		
		Employee e=null;
		
		System.out.println("Choose from the following whose details u want to add\n ");
		System.out.println("1.SalariseEmp\n 2.ContractEmp\n 3.Vendor");
		int c=sc.nextInt();
		switch(c)
		{
		case 1: System.out.println("Enter the sal");
				double sal =sc.nextDouble();
				System.out.println("Enter the bonus");
				double bon =sc.nextDouble();
				e=new SalarisedEmp(pid,nm,em,dept,desg,sal,bon);
				break;
		case 2: System.out.println("Enter the hrs");
				int hr=sc.nextInt();
				System.out.println("Enter the charges");
				double cg=sc.nextDouble();
				e=new ContractEmp(pid,nm,em,dept,desg,hr,cg);
				break;
		case 3: System.out.println("Enter the noOfEmp");
		        int no=sc.nextInt();
		        System.out.println("Enter the amount");
		        double amt=sc.nextDouble();
		        e=new Vendor(pid,nm,em,dept,desg,no,amt);
		        break;
		
		}
		ddao.save(e);
	}

	@Override
	public Set<Employee> displayAll() {
		
		return ddao.displayAll();
	}

	@Override
	public Employee searchById(int id) {
		
		return ddao.searchById(id);
	}

	@Override
	public boolean deleteById(int id) {
	
		return ddao.deleteById(id);
	}

	@Override
	public boolean modifySalById(int id, double sal) {
		
		return ddao.modifySalById(id, sal);
	}

	@Override
	public Set<Employee> sortByName() {
		
		return ddao.sortByName();
	}

	@Override
	public Set<Employee> sortBySal() {
	
		return null;
	}

	@Override
	public Employee[] getNTopEmps(int n) {
	
		return ddao.getNTopEmps(n);
	}

}
