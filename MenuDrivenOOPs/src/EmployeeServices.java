import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//import static java.time.LocalDate.*;
public class EmployeeServices {
	
	static Employee []emparr;
	static int count;
	
	static
	{
		emparr=new Employee[100];
		emparr[0]=new SalarisedEmp(1,"Anushka","7894561237","anush@gmail.com","Sales","head",LocalDate.of(2023,12,12),30000,10.0);
		emparr[1]=new SalarisedEmp(2,"Ankush","36712661237","anaa@gmail.com","Accounting","Mgr",LocalDate.of(2023,12,23),50000,15.0);
		emparr[3]=new ContractEmp(3,"Anjali","7894561237","anju@gmail.com","Developer","Team Lead",LocalDate.of(2023, 11, 25),8,500);
		emparr[3]=new ContractEmp(4,"Aman","785632189","aman@gmail.com","DEpt.Inc","staff",LocalDate.of(2023, 11, 25),6,500);
		count=4;
	}
	
	public static void addNewEmp(int ch)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the id:");
		int id=scan.nextInt();
		System.out.println("Enter the name:");
		String name=scan.next();
		System.out.println("enter mobile");
		String mob=scan.next();
		System.out.println("Enter the emailId");
		String email=scan.next();
		System.out.println("Enter the dept");
		String dept=scan.next();
		System.out.println("Enter the desgn");
		String desg=scan.next();
		System.out.println("eneter joining date(dd/mm/yyyy)");
		String  date=scan.next();
		LocalDate fdt=LocalDate.parse(date,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		switch(ch){
		case 1: System.out.println("enter the salary:");
				double sal=scan.nextDouble();
				System.out.println("enter the bonus:");
				double bonus=scan.nextDouble();
				emparr[count]=new SalarisedEmp(id,name,mob,email,dept,desg,fdt,sal,bonus);
				break;
		case 2: System.out.println("Enter the hrs:");
		        int hrs=scan.nextInt();
		        System.out.println("Enter the charges:");
		        int charg=scan.nextInt();
		        emparr[count]=new ContractEmp(id,name,mob,email,dept,desg,fdt,hrs,charg);
		
		        
		}
		count++;
		
	}
	
	public static void displayAll()
	{
		for(Employee emp:emparr)
		{
			if(emp!=null)
			{
				System.out.println(emp);
			}
			else
				break;
		}
	}
	
	public static  Employee searchById(int id)
	{
		if(emparr==null)
			return null;
	
		else{
		
		for(int i=0;i<count;i++)
		{
			if(emparr[i].getPid()==id)
				System.out.println(emparr[i]);
		}
		System.out.println("Id not found");
	}
		return null;

}

	public static int searchId(int id)
	{
		for(int i=0;i<count;i++)
		{
			if(emparr[i].getPid()==id)
				return i;
		}
		return -1;
	}

	
	public static boolean updateSalById(int id,double sal)
	{
		int pos=searchId(id);
		if(pos!=-1)
		{
			if(emparr[pos] instanceof SalarisedEmp)
				{
				  ((SalarisedEmp)emparr[pos]).setSal(sal);
			}
			
			else if(emparr[pos] instanceof ContractEmp)
			{
				((ContractEmp)emparr[pos]).setCharges(sal);
			}
			else
				System.out.println("Not found");
		}
		return false;
	}
	
	public static double calculateSal(int id)
	{
		  int pos=searchId(id);
		  if(pos!=-1)
		  {
			   return emparr[pos].calculateSal();
		  }
		  return -1;
	}
	
	
	
	
}
