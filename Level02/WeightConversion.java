import java.util.*;

class WeightConversion {
	public static void main(String args[]) {
		
		// Creating object of scanner class 
		Scanner scanner = new Scanner(System.in);
		
		// Taking user input
		int weightInPound = scanner.nextInt();
		
		//conversion of pound to kg
		float weightInKg = weightInPound * 2.2f;
		
		// Display the result
		System.out.println("The weight of the person in pound is " + weightInPound + " and in kg is " + weightInKg);
		
		// Close the scanner object
		scanner.close();
		
	}
}
