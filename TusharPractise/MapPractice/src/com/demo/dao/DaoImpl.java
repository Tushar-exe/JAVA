package com.demo.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.demo.beans.ContractEmp;
import com.demo.beans.Employee;
import com.demo.beans.SalarisedEmp;

public class DaoImpl implements DaoInterface{
	
	
	static Map<Integer,Employee>hm;
	
	static
	{
		hm=new HashMap<Integer, Employee>();
		hm.put(1, new SalarisedEmp(1,"Tushar","Tush@gamil.com","Developer","Software Engg",50000,15));
		hm.put(2, new SalarisedEmp(2,"Jayesh","Jay@gamil.com","Developer","Software Engg",40000,15));
		hm.put(3, new ContractEmp(3,"Aditiya","Adii@gamil.com","Developer","Software Engg",80000,6));
	}

	@Override
	public boolean modifyByid(int id,double sal) {
		
		return false;
	}

	@Override
	public List<Employee> displayAll() {
		List<Employee>elist=new ArrayList<Employee>();
		
		for(Employee e:hm.values())
		{
			elist.add(e);
		}
		return elist;
	}

	@Override
	public List<Employee> sortBySal() {
		List<Employee>elist=new ArrayList<Employee>();
		for(Employee e:hm.values())
		{
			elist.add(e);
		}
		
		Comparator<Employee>cemp=(ob1,ob2)->
		{ 
			double sal1=0,sal2=0;
			if(ob1 instanceof SalarisedEmp)
			{
			   sal1=((SalarisedEmp) ob1).getSal();
			}
			
			else if(ob1 instanceof ContractEmp)
			{
				sal1= ((ContractEmp) ob1).getCharges();
			}
			else
			{
				System.out.println("Vendor add kr pehle");
			}
			
			
			if(ob2 instanceof SalarisedEmp)
			{
			   sal2=((SalarisedEmp) ob2).getSal();
			}
			
			else if(ob2 instanceof ContractEmp)
			{
				sal2= ((ContractEmp) ob2).getCharges();
			}
			else
			{
				System.out.println("Vendor add kr pehle");
			}
			
			return (int) (sal2-sal2);
			
		};
		elist.sort(cemp);
		
		return elist;
	}

	

	

	@Override
	public Employee[] getNTopEmplyee(int n) {
		// TODO Auto-generated method stub
		List<Employee>li=sortBySal();
		
		Employee []earr=new Employee[n];
		
		for(int i=0;i<n;i++)
		{
			earr[i]=li.get(i);
		}
		
		return earr;
	}

	@Override
	public void save(Employee e) {
		if(!hm.containsKey(e))
		{
			hm.put(e.getPid(), e);
		}
		
	}

	@Override
	public List<Employee> sortByName() {
		List<Employee>elist=new ArrayList<Employee>(hm.values());
		Collections.sort(elist);
		return elist;
	}

	@Override
	public Map<Integer, Employee> displayByMap() {		
		return hm;
	}

	@Override
	public TreeMap<Integer, Employee> sortbyId() {
		// TODO Auto-generated method stub
		TreeMap<Integer,Employee>tmap=new TreeMap<>(hm);
		return tmap;
	}

	@Override
	public boolean deleteById(int idd) {
		
		return hm.remove(idd)==null ? false : true;
	}

}
