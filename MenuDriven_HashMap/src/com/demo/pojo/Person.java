package com.demo.pojo;

public class Person {
	private int id;
	private String pname;
	private String email;
	private String dept;
	private String desg;
	public Person() {
		super();
	}
	public Person(int id, String pname, String email) {
		super();
		this.id = id;
		this.pname = pname;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		return "Person [id=" + id + ", pname=" + pname + ", email=" + email + "]";
	}
	
}
