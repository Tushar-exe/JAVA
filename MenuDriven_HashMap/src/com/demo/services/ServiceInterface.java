package com.demo.services;

import java.util.List;
import java.util.TreeMap;

import com.demo.pojo.Employee;

public interface ServiceInterface {

	void addNewEmp();
	List<Employee>displayAll();
	
	boolean modifyById(int id,double sal);
	
	boolean deleteById(int id);
	
	Employee[]getNTopEmp(int n);
	
	List<Employee>sortByName();
	
	TreeMap<Integer,Employee>sortById();
	
	List<Employee>sortBySal();
	
	
	
	
}
