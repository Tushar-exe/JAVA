package com.demo.dao;

import java.util.List;
import java.util.ArrayList;

import com.demo.beans.ContractEmp;
import com.demo.beans.Employee;
import com.demo.beans.SalarisedEmp;
import com.demo.beans.Vendor;

import java.util.Scanner;

public class DaoImpl implements DaoInterface {

	static List<Employee>elist;
	
	static
	{
		elist=new ArrayList<>();
		elist.add(new SalarisedEmp(1,"Rajat","4444","a@gmail.com","hr","associate",50000,15));
		elist.add(new SalarisedEmp(2,"Amay","3333","b@gmail.com","TeamLead","Developer",60000,15));
		elist.add(new ContractEmp(12,"Ajay","5555","c@gmail.com","Manager","Sales",15,40000));
		elist.add(new ContractEmp(13,"Sweety","6666","d@gmail.com","Projaect_Manager","Executive",15,80000));
		elist.add(new Vendor(21,"Pranav","77777","e@gmail.com","hr","associate",30,150));
		elist.add(new Vendor(22,"Usama","888888","f@gmail.com","supplier","head",50,20));
		
		
	}
	
	
	

	@Override
	public List<Employee> displayAll() {
		// display list of employee present in the list
		return elist;
	}

	@Override
	public Employee displayById(int id) {
		// 
		int pos=elist.indexOf(new SalarisedEmp(id));
		if(pos!=-1)
		{
			return elist.get(pos);
		}
		else
			return null;
	}

	@Override
	public boolean modifySalById(int id, double sal) {
		// TODO Auto-generated method stub
		Employee e=displayById(id);
		if(e!=null)
		{
		if(e instanceof SalarisedEmp)
		{
			((SalarisedEmp)e).setSal(sal);
		}
		else if(e instanceof ContractEmp)
		{
			((ContractEmp)e).setCharges(sal);
		}
		else
			((Vendor)e).setAmount(sal);
		return true;
	}
		return false;
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return elist.remove(new SalarisedEmp(id));
	}

	@Override
	public List<Employee> sortByName() {
		// TODO Auto-generated method stub
		
		List<Employee>temp=new ArrayList<>();
		
		for(Employee e:elist) {
			temp.add(e);
		}
		temp.sort(null);
		return temp;
	}

	@Override
	public void save(Employee e) {
		// 
		
		elist.add(e);
	}





	
	
}
