package com.demo.pojo;

//import com.demo.exception.InvalidSalaryException;

public class ContractEmp extends Employee{
	
	private int hrs;
	private double charges;
	public ContractEmp() {
		super();
	}
	public ContractEmp(int pid,String pname,String email,String dept,String desg,int hrs, double charges) {
		super(pid,pname,email,dept,desg);
		this.hrs = hrs;
		this.charges = charges;
	}
	
	public ContractEmp(int id){
		super(id);
	}
	public int getHrs() {
		return hrs;
	}
	public void setHrs(int hrs) {
		this.hrs = hrs;
	}
	public double getCharges()  {
		return charges;
	}
	public void setCharges(double charges)//throws InvalidSalaryException {
	{
//		if(charges<1000)
//		{
//			throw new InvalidSalaryException("salary canot be < 1000");
//		}
		this.charges = charges;
	}
	
	@Override
	public String toString() {
		return super.toString()+"ContractEmp [hrs=" + hrs + ", charges=" + charges + "]";
	}
	
	
}
