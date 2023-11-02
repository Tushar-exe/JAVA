package com.demo.beans;

public class Person {
	
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", mobile=" + mobile + "]";
	}

	private int pid;
	private String pname;
	private String mobile;
	
	public Person() {
		super();
	}

	public Person(int pid, String pname, String mobile) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.mobile = mobile;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	
	

}
