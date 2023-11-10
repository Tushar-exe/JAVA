package com.demo.services;

import java.util.Map;
import java.util.TreeMap;
import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeInterface {

	void AddNewEmp();
	
	boolean modifyByid(int id,double sal);
	
	List<Employee>displayAll();
	
	Map<Integer, Employee> displayByMap();
	
	List<Employee>sortBySal();
	
	List<Employee>sortByName();
	
	Employee[]getNTopEmplyee(int n);

	TreeMap<Integer, Employee> sortById();

	boolean deleteById(int idd);
}
