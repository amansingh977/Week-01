import java.util.Scanner;

class HarshadChecker {
    public static void main(String[] args) {
        
        // Creating object of scanner class
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        int sum = 0;
        
        // Using a while loop to access each digit of the number
        int originalNumber = number; // Storing the original number for divisibility check
        while (number != 0) {
            // Inside the loop, adding each digit of the number to sum
            sum += number % 10;
            
            // Removing the last digit from the number
            number = number / 10;
        }
        
        // Checking if the number is perfectly divisible by the sum
        if (originalNumber % sum == 0) {
            // If the number is divisible by the sum, it's a Harshad number
            System.out.println("\n--- Result ---");
            System.out.println(originalNumber + " is a Harshad Number.");
        } else {
            // Display result
            System.out.println("\n--- Result ---");
            System.out.println(originalNumber + " is not a Harshad Number.");
        }

        // Closing scanner class
        input.close();
    }
}
