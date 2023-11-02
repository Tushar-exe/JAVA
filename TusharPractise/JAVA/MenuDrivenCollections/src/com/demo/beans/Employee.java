package com.demo.beans;

public class Employee extends Person {

	private String dept;
	private String desg;
	
	public Employee() {
		super();
	}

	public Employee(int pid,String pname,String mobile,String email,String dept, String desg) {
		super(pid,pname,mobile,email);
		
		this.dept = dept;
		this.desg = desg;
	}

	public Employee(int id) {
		super(id);
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	@Override
	public String toString() {
		return super.toString()+"Employee [dept=" + dept + ", desg=" + desg + "]";
	}
	
	
	
	
}
