package GettersAndSetters;
import java.util.Scanner;

public class CreateComputer {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the computer name:");
		String name = scan.next();
		
		System.out.println("Enter the year of the computer:");
		int year = scan.nextInt();
		
		System.out.println("Enter the cost of the computer:");
		int cost = scan.nextInt();
		
		scan.close();
		
		Computer c1 = new Computer();
			c1.setCname(name);
			c1.setCyear(year);
			c1.setCcost(cost);
			
		System.out.println();
		System.out.println("*******************************");
		System.out.println("Computer Information");
		System.out.println("Name: " + c1.getCname());
		System.out.println("Year: " + c1.getCyear());
		System.out.println("Cost: " + c1.getCcost()+"$");
			
			
	}

}
