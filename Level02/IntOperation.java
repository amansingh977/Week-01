import java.util.Scanner;

class IntOperation {
    public static void main(String[] args) {
		
		// Creating object of scanner class
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter value for a: ");
        int a = scanner.nextInt();
        
		// Taking user input
        System.out.print("Enter value for b: ");
        int b = scanner.nextInt();
		
        // Taking user input
        System.out.print("Enter value for c: ");
        int c = scanner.nextInt();

        // Performing the operations following the operator precedence
        int result1 = a + b * c;   // Multiplication (*) has higher precedence than addition (+)
        int result2 = a * b + c;   // Multiplication (*) has higher precedence than addition (+)
        int result3 = c + a / b;   // Division (/) has higher precedence than addition (+)
        int result4 = a % b + c;   // Modulus (%) has higher precedence than addition (+)

        // Display the results
        System.out.println("The results of Int Operations are: " + result1 + ", " + result2 + ", " + result3 + " and " + result4);
		
		// Close the scanner object
		scanner.close();
    }
}