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
			System.out.println("| 4.        ADD_NEW_EMP                  |");
			System.out.println("| 5.        ADD_NEW_EMP                  |");
			System.out.println("| 6.        ADD_NEW_EMP                  |");
			System.out.println("-------------------------------------------");
			
			System.out.println("Enter your choice:");
			ch=scan.nextInt();
			switch(ch)
			{
				
			case 1:System.out.println("1. Salarised/n 2.Contract /n 3.Vendor");
					System.out.println("select from the given option");
					
					switch(ch)
					{
					case 1:
					}
			
				
			case 2:
				EmployeeServices.displayAll();
				break;
			
			}
			
			
			
			
			System.out.println("Do you want to continue if Yes press Y/y if not press N/n");
			input=scan.next();
			
			
		}while(input.equals("Y")||input.equals("y"));
		 System.out.println("Byeee Visit Again !!!");
		 System.exit(0);
		
		
		
	}
}

// ghghhf
