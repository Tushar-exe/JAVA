package com.demo.dao;

import java.util.List;
import java.util.TreeMap;

import com.demo.pojo.Employee;

public interface DaoInterface {
	
	void save(Employee e);
   
	List<Employee>displayAll();
	
	boolean modifyById(int id,double sal);
	
	boolean deleteById(int id);
	
	Employee[]getNTopEmp(int n);
	
	List<Employee>sortByName();
	
	TreeMap<Integer,Employee>sortById();
	
	List<Employee>sortBySal();
}
