package com.demo.beans;

public class ContractEmp extends Employee {
private double charges;
private int hrs;

public ContractEmp() {
	super();
}

public ContractEmp(int pid, String pname, String email, String dept, String desg, double charges, int hrs) {
	super(pid, pname, email, dept, desg);
	this.charges = charges;
	this.hrs = hrs;
}

public double getCharges() {
	return charges;
}

public void setCharges(double charges) {
	this.charges = charges;
}

public int getHrs() {
	return hrs;
}

public void setHrs(int hrs) {
	this.hrs = hrs;
}

@Override
public String toString() {
	return super.toString()+ "ContractEmp [charges=" + charges + ", hrs=" + hrs + "]";
}


}
