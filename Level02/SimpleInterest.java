import java.util.*;

class SimpleInterest {
	public static void main(String args[]) {
	    
		// Creating object of scanner class 
		Scanner scanner = new Scanner(System.in);
		
		// Taking user input
		int principal = scanner.nextInt();
		
		// Taking user input
		int rate = scanner.nextInt();
		
		// Taking user input
		int time = scanner.nextInt();
		
		//calculation of simple Interest
		double interest = (principal * rate * time) / 100;

        // Display the result		
		System.out.println("The Simple Interest is " + interest + " for Principal " + principal + " Rate of Interest " + rate + " and Time " + time );
		
		// Close the scanner object
		scanner.close();
	}
}
