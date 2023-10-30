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
			System.out.println("| 2.        DisplayAll                  |");
			System.out.println("| 1.        Modify_SAL                  |");
			System.out.println("| 1.        ADD_NEW_EMP                  |");
			System.out.println("| 1.        ADD_NEW_EMP                  |");
			System.out.println("| 1.        ADD_NEW_EMP                  |");
			System.out.println("-------------------------------------------");
			
			System.out.println("Enter your choice:");
			ch=scan.nextInt();
			switch(ch)
			{
			case 1:
				EmployeeServices.displayAll();
				
			
			}
			
			
			
			
			
			
			
		}while(input.equals("Y")||input.equals("y");
		
		
	}
}
