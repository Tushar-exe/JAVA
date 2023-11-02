package com.demo.services;

import com.demo.beans.Person;

public interface PersonService {

	void addNewperson();
	
	Person[] displayAll();
	
	Person searchById(int id);
	
}
