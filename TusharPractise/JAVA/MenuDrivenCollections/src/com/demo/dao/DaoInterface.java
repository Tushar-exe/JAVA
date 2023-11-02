package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface DaoInterface {
	
	
	List<Employee>displayAll();
	
	Employee displayById(int id);
	
	boolean modifySalById(int id,double sal);
	
	boolean deleteById(int id);
	
	List<Employee>sortByName();

	void save(Employee e);
	

}
