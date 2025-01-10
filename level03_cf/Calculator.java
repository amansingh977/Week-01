import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Create scanner for input
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter first number: ");
        double first = input.nextDouble();
 
        // Taking user input
        System.out.print("Enter operator (+, -, *, /): ");
        String op = input.next();
        
		// Taking user input
        System.out.print("Enter second number: ");
        double second = input.nextDouble();

        // Variable to store result
        double result;

        // Switch case to perform operations based on the operator
        switch (op) {
            case "+":
                result = first + second;
                System.out.println("Result: " + result);
                break;
            case "-":
                result = first - second;
                System.out.println("Result: " + result);
                break;
            case "*":
                result = first * second;
                System.out.println("Result: " + result);
                break;
            case "/":
                // Check for division by zero
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator! Please enter one of the following operators: +, -, *, /");
                break;
        }
         
		// Display result 
        input.close();
    }
}
