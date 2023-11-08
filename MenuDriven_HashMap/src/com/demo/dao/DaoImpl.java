package com.demo.dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.demo.pojo.ContractEmp;
import com.demo.pojo.Employee;
import com.demo.pojo.SalarisedEmp;
import com.demo.pojo.Vendor;

public class DaoImpl implements DaoInterface {

	static Map<Integer,Employee>mp;
	
	static
	{ 
		mp= new HashMap<>(); 
		mp.put(1, new SalarisedEmp(1,"Tushar","Tushu@gmail.com","Software Engineer","Team-Lead",50000,15));
		mp.put(2, new SalarisedEmp(2,"Jayesh","Jayu@gmail.com","Software Engineer","Team-Lead",25200,15));
		mp.put(3, new ContractEmp(3,"Usama","Ussu@gmail.com","Software Engineer","Developer",200200,15));
		mp.put(4, new ContractEmp(4,"Kiran","Kiran@gmail.com","Software Associate","Developer",20000,15));
		
		
	}
	
	
	@Override
	public void save(Employee e) {
	       
		if(!mp.containsKey(e))
		{
			mp.put(e.getId(), e);
		}
	}

	@Override
	public List<Employee> displayAll() {
		// TODO Auto-generated method stub
		List<Employee>ans=new ArrayList<>();
		for(Employee e:mp.values())
		{
			ans.add(e);		}
		return ans;
	}

	@Override
	public boolean modifyById(int id, double sal) {
		
		return false;
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		Employee e=mp.remove(id);
		if(e!=null)
		{
			return true;    
		}
		return false;
	}

	@Override
	public Employee[] getNTopEmp(int n) {
		List<Employee>e=new ArrayList<>();
		
		Employee []earr=new Employee[n];
		
		for(  )
		
		return null;
	}

	@Override
	public List<Employee> sortByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TreeMap<Integer, Employee> sortById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> sortBySal() {
		Comparator<Employee>cemp=(ob1,ob2)->{
			double sal1=0,sal2=0;
			if(ob1 instanceof SalarisedEmp)
			{
				sal1=((SalarisedEmp) ob1).getSal();
			}
			else if(ob1 instanceof ContractEmp)
			{
				sal1=((ContractEmp) ob1).getCharges();
			}
			else
				sal1=((Vendor)ob1).getAmount();
			
			if(ob2 instanceof SalarisedEmp)
			{
				sal2=((SalarisedEmp) ob2).getSal();
			}
			else if(ob2 instanceof ContractEmp)
			{
				sal2=((ContractEmp) ob2).getCharges();
			}
			else
				sal2=((Vendor)ob2).getAmount();
			
			return (int)(sal2-sal1) ;
			
			};	
			List<Employee> elst=(List<Employee>) mp.values();
	}

}
