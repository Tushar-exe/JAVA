package com.demo.services;

import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

import com.demo.dao.DaoImpl;
import com.demo.dao.DaoInterface;
import com.demo.pojo.Employee;

public class ServiceImpl implements ServiceInterface{
	
	DaoInterface ddao;
	
	public ServiceImpl()
	{
		ddao=new DaoImpl();
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
		
		Employee e=new Employee(pid,nm,em,dept,desg);
		
		ddao.save(e);
	
		
	}

	@Override
	public List<Employee> displayAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean modifyById(int id, double sal) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employee[] getNTopEmp(int n) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> sortByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TreeMap<Integer, Employee> sortById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> sortBySal() {
		// TODO Auto-generated method stub
		return null;
	}

}
