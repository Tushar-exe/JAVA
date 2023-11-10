package com.demo.beans;


public class Person implements Comparable<Person>{
	
	private int pid;
	private String pname;
	private String email;
	
	
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Person(int pid, String pname, String email) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.email = email;
		
	}
	public Person() {
		super();
	}
	
	@Override
	public String toString() {
		return "pid=" + pid + ", pname=" + pname + ", email=" + email + ", dept=" + "]";

}
	@Override
	public int compareTo(Person o) {
	
		return this.pname.compareTo(o.pname);
	}
	
	
	
}
