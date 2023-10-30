import java.time.LocalDateTime;

import java.util.Scanner;

public class TestEmpArr {

	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		int ch;

		String input;


		do {
			System.out.println("------------------------------------------");
			System.out.println("     MENU DRIVEN WITH OOPS CONCEPT        ");
			System.out.println("-----------------------------------------|");
			System.out.println("| 1.        ADD_NEW_EMP                  |");
			System.out.println("| 2.        DisplayAll                   |");
			System.out.println("| 3.        Modify_SAL                   |");
			System.out.println("| 4.        SearchById                   |");
			System.out.println("| 5.        DisplayDeatilsById           |");
			System.out.println("| 6.        Calculate_Salary             |");
			System.out.println("-------------------------------------------");

			System.out.println("Enter your choice:");
			ch=scan.nextInt();
			switch(ch)
			{

			case 1:
				System.out.println("1. Salarised/n 2.Contract /n 3.Vendor");
				System.out.println("select from the given option");
				int ch1=scan.nextInt();
				EmployeeServices.addNewEmp(ch1);
				break;

			case 2:	
				EmployeeServices.displayAll();
				break;	

			case 3:
				System.out.println("Enter the id");
				int c=scan.nextInt();
				double s=scan.nextDouble();
				boolean status=EmployeeServices.updateSalById(c, s);

				if(status)
				{
					System.out.println("Modification is done check it:");
					EmployeeServices.displayAll();

				}
				break;

			case 4:	System.out.println("Enter the id u want to search"); 

			int id=scan.nextInt();
			int ans=EmployeeServices.searchId(id);
			System.out.println();
			break;

			case 5: System.out.println("Enter the id whose details u want to search");
			int id1=scan.nextInt();
			Employee emp=EmployeeServices.searchById(id1);
			if(emp!=null)
			{
				System.out.println(emp);
			}
			else
				System.out.println("ID NOT FOUND");
			
			break;

			case 6:System.out.println("enetr id");
			int pid=scan.nextInt();
			double salary=EmployeeServices.calculateSal(pid);
			if(salary!=-1) {
				System.out.println("Net Salary : "+salary);
			}
			else {
				System.out.println("not found");
			}
			break;



			}




			System.out.println("Do you want to continue if Yes press Y/y if not press N/n");
			input=scan.next();


		}while(input.equals("Y")||input.equals("y"));
		scan.close();
		System.out.println("Byeee Visit Again !!!");
		System.exit(0);



	}
}

// ghghhf
