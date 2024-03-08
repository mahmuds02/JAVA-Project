package murach.test;

public class CodeTesterApp {
	public static void main(String args[]) {
		System.out.println("Welcome to the Code Tester");
		System.out.println();
		
		
		
		String productCode = "Java";
		double price = 49.50;
		int quantity = 2;
		
		
		double total = price * quantity;
		
		
		String message =
		"Code:    " + productCode + "\n" +
		"Price:     " + price + "\n" +
		"Quantity:  " + quantity + "\n" +
		"Total:    " + total + "\n";
		
		System.out.print(message);
		
		
		// step 4
		
		String firstName = "FIrstname";
		String lastName = "Lastname";
		System.out.println("Name: " + lastName + ", " + firstName);
		
		firstName = "Saim";
		System.out.println("Name: " + lastName + ", " + firstName);
		
		
		
		
		double sum = 301.75;
		int count = 6;
		double average = sum / count; 
		
		 System.out.println("Sum:      " + sum);
	        System.out.println("Count:    " + count);
	        System.out.println("Average:  " + average);
	        
	        
	        sum = 123.45; // New sum value
	        average = sum / count;
	        System.out.println("Sum:      " + sum);
	        System.out.println("Average:  " + average);

	        System.out.println("Bye!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Bye!");
	}
		

}
