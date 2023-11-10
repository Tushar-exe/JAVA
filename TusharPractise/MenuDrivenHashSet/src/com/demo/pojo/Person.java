package com.demo.pojo;



import java.util.Objects;

public class Person implements Comparable<Person> {

	private int pid;
	private String pname;
	private String email;
	public Person() {
		super();
	}
	public Person(int pid, String pname, String email) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.email = email;
	}
	public Person(int id) {
		// TODO Auto-generated constructor stub
		this.pid=id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", email=" + email + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.pid==((Person)obj).pid;
	}
		
		@Override
		public int hashCode() {
			return pid;
		}
		@Override
		public int compareTo(Person o) {
			// TODO Auto-generated method stub
			return this.pname.compareTo(o.pname);
		}
		
	
	

	
	
}
