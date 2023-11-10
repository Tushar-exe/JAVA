package com.demo.dao;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.demo.beans.Employee;

public interface DaoInterface {

	
	boolean deleteById(int idd);

	void save(Employee e);
	
	boolean modifyByid(int id,double sal);
	
	List<Employee>displayAll();
	
	List<Employee>sortBySal();
	
	List<Employee>sortByName();
	
	Map<Integer, Employee> displayByMap();
	
	Employee[] getNTopEmplyee(int n);

	TreeMap<Integer, Employee> sortbyId();
}

