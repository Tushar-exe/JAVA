package com.demo.services;

import java.util.List;

import com.demo.beans.Employee;

public interface PersonService {
	
	void addNewEmp(int ch);
	
	List<Employee>displayAll();
	
	Employee displayById(int id);
	
	boolean modifySalById(int id,double sal);
	
	boolean deleteById(int id);
	
	List<Employee>sortByName();
	

}
