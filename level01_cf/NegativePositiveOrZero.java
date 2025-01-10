import java.util.Scanner;

class NegativePositiveOrZero {
    public static void main(String[] args) {
		
        // Creating object of scanner class
        Scanner input = new Scanner(System.in);
        
		// Taking user input
        System.out.print("Enter a number - ");
        int number = input.nextInt();

        // Checking if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is positive");
        } else if (number < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }

        // Close the scanner
        input.close();
    }
}
