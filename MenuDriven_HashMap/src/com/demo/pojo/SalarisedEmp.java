package com.demo.pojo;

//import com.demo.exception.InvalidSalaryException;

public class SalarisedEmp extends Employee{

	private double sal;
	private double bonus;
	public SalarisedEmp() {
		super();
	}
	
//	public SalarisedEmp(int id) {
//		super(id);
//	}

	public SalarisedEmp(int pid,String pname,String email,String dept,String desg,double sal, double bonus) {
		super(pid,pname,email,dept,desg);
		this.sal = sal;
		this.bonus = bonus;
	}

	public double getSal() {
		return sal;
	}
	public void setSal(double sal) //throws InvalidSalaryException{
	{
//		if(sal<1000) {
//			throw new InvalidSalaryException("salary canot be < 1000");
			
		
		this.sal = sal;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public String toString() {
		return super.toString()+"SalarisedEmp [sal=" + sal + ", bonus=" + bonus + "]";
	}
	
}
