package com.demo.services;

import java.util.Set;

import com.demo.pojo.Employee;

public interface EmpServices {
	
	void addNewEmp();
	Set<Employee>displayAll();   
	
	Employee searchById(int id);
	
	boolean deleteById(int id);
	
	boolean modifySalById(int id,double sal);
	
	Set<Employee>sortByName();
	
	Set<Employee>sortBySal();
	
	Employee []getNTopEmps(int n);
	
	

}
