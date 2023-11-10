package com.demo.dao;


import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.demo.pojo.ContractEmp;
import com.demo.pojo.Employee;
import com.demo.pojo.SalarisedEmp;
import com.demo.pojo.Vendor;

public class DaoImplimentation implements DaoInterface{
	
	static Set<Employee>hs;
	static
	{
		hs=new HashSet<>();
		hs.add(new SalarisedEmp(12,"Rajat","a@gmail.com","hr","associate",4556,345));
 		hs.add(new SalarisedEmp(13,"Ajit","a22@gmail.com","admin","associate",4577,377));
 		hs.add(new ContractEmp(14,"Rajas","r345@gmail.com","admin","manager",30,4000));
 		hs.add(new ContractEmp(15,"Ashwini","ashu@gmail.com","hr","associate",40,5000));
 		hs.add(new ContractEmp(15,"Ashwini","ashu@gmail.com","hr","associate",40,5000));
	}
	
	@Override
	public Set<Employee> displayAll() {
		// TODO Auto-generated method stub
		return hs;
	}

	@Override
	public Employee searchById(int id) {
		for(Employee e:hs)
		{
			if(e.getPid()==id)
				return e;
		}
		return null;
	}

	@Override
	public boolean deleteById(int id) {
		return hs.remove(new SalarisedEmp(id));
	}

	@Override
	public boolean modifySalById(int id, double sal) {
		Employee emp=searchById(id);
		if(emp!=null)
		{
			if(emp instanceof SalarisedEmp)
			{
				((SalarisedEmp) emp).setSal(sal);
			}
			else if(emp instanceof ContractEmp)
			{
				((ContractEmp) emp).setCharges(sal);
			}
			else {
				  ((Vendor)emp).setAmount(sal);
		}
		return true;
	}
		return false;
	}

	@Override
	public Set<Employee> sortByName() {
		TreeSet<Employee>st=new TreeSet<>();
		for(Employee e:hs)
		{
			st.add(e);
		}
		return st;
	}

	@Override
	public Set<Employee> sortBySal() {
		
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
			
			return (int) (sal2-sal1);
			
		};
		TreeSet<Employee>ts=new TreeSet<>(cemp);
		for(Employee e:hs)
		{
			ts.add(e);
		}
		return ts;
	}

	@Override
	public Employee[] getNTopEmps(int n) {
		Set<Employee>tst=sortBySal();
		Employee []arr=new Employee[n];
		int count=0;
		
		for(Employee e:tst)
		{
			arr[count]=e;
			count++;
			if(count==n)
				break;
		}
		
		return arr;
	}

	@Override
	public void save(Employee e) {
		hs.add(e);		
		
	}

}
