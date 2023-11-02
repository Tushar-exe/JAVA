package com.demo.services;

import com.demo.beans.Person;
import com.demo.dao.Dao_Impl;
import com.demo.dao.* ;

import java.util.Scanner;


public class ServicePerson_Impl implements PersonService{
	
	
	private Dao pdao;
	
	public ServicePerson_Impl()
	{
		pdao=new Dao_Impl();
	}
	

	
	
	

	@Override
	public void addNewperson() {
		//taking inputs from the user
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the id of the user:");
		int id=scan.nextInt();
		
		System.out.println("Enter the name of the user:");
		String s=scan.next();
		
		System.out.println("Enter the mobileNo:");
		String mb=scan.next();
		
		Person p=new Person(id,s,mb);
		pdao.save(p);
		
		
		
	}
	@Override
	public Person[] displayAll() {
		return pdao.findAll();
	}
	@Override
	public Person searchById(int id) {
		
		return pdao.findById(id);
	}

}
