package com.demo.beans;

import java.util.Objects;

public class Person implements Comparable {
	
	private int pid;
	private String pname;
	private String mobile;
	private String email;
	
	public Person() {
		super();
	}

	public Person(int pid, String pname, String mobile, String email) {

		this.pid = pid;
		this.pname = pname;
		this.mobile = mobile;
		this.email = email;
	}
	
	
	

	public Person(int id) {
	
		this.pid = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", mobile=" + mobile + ", email=" + email + "]";
	}

	

	@Override
	public boolean equals(Object obj) {
		return this.pid==((Person)obj).pid;
	}

	@Override
	public int compareTo(Object o) {
		
		return this.pname.compareTo(((Person)o).pname);
	}
	
	
	
	
	
	
	
	

}
