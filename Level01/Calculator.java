import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        
		// Creating object of scanner class
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double number1 = sc.nextDouble();
        
        System.out.print("Enter the second number: ");
        double number2 = sc.nextDouble();
        
        // Perform arithmetic operations
		// Perform Addition
        double addition = number1 + number2;
		// Perform subtraction
        double subtraction = number1 - number2;
		// Perform multiplication
        double multiplication = number1 * number2;
		// Perform division
        double division = number1 / number2;
        
		// Display the results
        System.out.println("The addition, subtraction, multiplication, and division values of numbers " 
            + number1 + " and " + number2 + " are " 
            + addition + ", " 
            + subtraction + ", " 
            + multiplication + ", and " 
            + division );
        		
	    // Scanner class closed
        sc.close();
    }
}
