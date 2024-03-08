package murach.fv;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[]args) {
		// display welcome message
		
		System.out.println("Welcome to the Future Value Calculator");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			
			System.out.print("Enter monthly investment:   ");
			double monthlyInvestment = Double.parseDouble(sc.nextLine());
			
			
			System.out.print("Enter yearly interest rate: ");
			double yearlyInterestrate = Double.parseDouble(sc.nextLine());
			
			System.out.print("Enter number of year:   ");
			int years = Integer.parseInt(sc.nextLine());
			
			double monthlyInterestrate = yearlyInterestrate / 12 / 100;
			int months = years * 12;
			
			
			double futureValue = 0;
			int i = 1;
			while ( i<= months) {
				futureValue = futureValue + monthlyInvestment;
				double monthlyInterestamount = futureValue * monthlyInterestrate;
				
			futureValue = futureValue + monthlyInterestamount; 
			i = i+1;
				
			}
			
		
			System.out.println("Future value :   " +NumberFormat.getCurrencyInstance().format(futureValue));
			System.out.println();
			
			System.out.print("Continue? (y/n): ");
			choice = sc.nextLine();
			System.out.println()	;		
		}
		sc.close();

		System.out.println("Bye!");
		
	}
	
	
}
