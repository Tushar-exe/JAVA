package com.demo.services;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import com.demo.beans.Employee;
import com.demo.beans.SalarisedEmp;
import com.demo.dao.DaoImpl;
import com.demo.dao.DaoInterface;

public class EmployeeImpl implements EmployeeInterface{
	
	Scanner scan=new Scanner(System.in);
	Employee e=null;
	
	DaoInterface ddao;

	public EmployeeImpl()
	{
		ddao=new DaoImpl();
	}
	
	@Override
	public void AddNewEmp() {
		System.out.println("Enter the id:");
		int id=scan.nextInt();
		System.out.println("Enter the name:");
		String name=scan.next();
		System.out.println("Enter the email:");
		String em=scan.next();
		System.out.println("Enter the dept:");
		String dept=scan.next();
		System.out.println("Enter the desg:");
		String desg=scan.next();
		
		System.out.println("1. SalarisedEmp\n 2Contract\3 Vendor");
		System.out.println("Choose from the given options");
		int ch=scan.nextInt();
		
		switch(ch)
		{
		case 1: System.out.println("Enter the salary");
				double sal=scan.nextDouble();
				System.out.println("Enter the bonus");
				double bonus=scan.nextDouble();
				e=new SalarisedEmp(id,name,em,dept,desg,sal,bonus);
				break;
				
		case 2:	System.out.println("Enter the charges");
				double charg=scan.nextDouble();
				System.out.println("Enter the bonus");
				int hrs=scan.nextInt();
				e=new SalarisedEmp(id,name,em,dept,desg,charg,hrs);
				break;	
		
		}
		
		
		
	}

	@Override
	public boolean modifyByid(int id,double sal) {
		// TODO Auto-generated method stub
		return ddao.modifyByid(id,sal);
	}

	@Override
	public List<Employee> displayAll() {
		// TODO Auto-generated method stub
		return ddao.displayAll();
	}

	@Override
	public List<Employee> sortBySal() {
		// TODO Auto-generated method stub
		return ddao.sortBySal();
	}

	@Override
	public List<Employee> sortByName() {
	
		return ddao.sortByName();
	}

	@Override
	public Employee[] getNTopEmplyee(int n) {
		// TODO Auto-generated method stub
		return ddao.getNTopEmplyee(n);
	}

	@Override
	public Map<Integer, Employee> displayByMap() {
		// TODO Auto-generated method stub
		return ddao.displayByMap();
	}

	@Override
	public TreeMap<Integer, Employee> sortById() {
		// TODO Auto-generated method stub
		return ddao.sortbyId();
	}

	@Override
	public boolean deleteById(int idd) {
		// TODO Auto-generated method stub
		return ddao.deleteById(idd);
	}

}
