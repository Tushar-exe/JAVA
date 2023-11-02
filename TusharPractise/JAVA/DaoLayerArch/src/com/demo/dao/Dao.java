package com.demo.dao;

import com.demo.beans.*;

public interface Dao {

	void save(Person p);
	
	Person[] findAll();
	
	Person findById(int pid);
}
