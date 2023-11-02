package com.demo.dao;

import com.demo.beans.Person;

public class Dao_Impl implements Dao {

	static Person[] parr;
	private static int count;
	
	static
	{
		parr=new Person[10];
		parr[0]=new Person(1,"Tushar","7788995641");
		parr[1]=new Person(2,"Usama_The_Boss","789456321");
		count=2;
		
	}
	@Override
	public void save(Person p) {
		//
		parr[count]=p;
		count++;
		
		
	}

	@Override
	public Person[] findAll() {
		// 
		
		return parr;
	}

	@Override
	public Person findById(int pid) {
		//
		for(Person p1:parr)
		{
			if(p1!=null)
			{
				if(p1.getPid()==pid)
					return p1;
			}
			else
				break;
		}
		return null;
	}
	
	
	

}
