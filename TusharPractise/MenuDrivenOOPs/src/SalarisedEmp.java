import java.time.LocalDate;

public class SalarisedEmp extends Employee {

	private double sal;
	private double bonus;
	
	public SalarisedEmp()
	{
		super();
		
	}
	
	public SalarisedEmp(int pid,String pname,String mobile ,String email,String dept,String desg,LocalDate doj,double sal,double bonus)
	{
		super(pid,pname,mobile,email,dept,desg,doj);
		
		this.bonus=bonus;
		this.sal=sal;
		
	}
	
	public double calculateSal()
	{
		return sal+0.10*sal+0.15*sal-0.08*sal+bonus;
	}
	
	public double calculateBonus()
	{
		return sal*0.10+bonus  ;
	}
	
	
	public void setSal(double sal)
	{
		this.sal=sal;
	}
	
	public double getSal()
	{
		return sal;	
	}
	
	public void setBonus(double bonus)
	{
		this.bonus=bonus;
	}
	
	public double getBonus()
	{
		return bonus;
	}
	
	
	
	public String toString()
	{
		return super.toString()+"salary is :"+sal+"bonus is:"+bonus;
	}
	
}
