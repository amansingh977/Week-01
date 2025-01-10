import java.util.Scanner;

class FizzBuzz {
    public static void main(String[] args) {
        
        // Creating object of Scanner class
        Scanner input = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Checking for a valid input
        if (number <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
        } else {
            // Declaring and initializing the String array
            String[] results = new String[number + 1];

            // Calculate FizzBuzz results
            for (int i = 0; i <= number; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    results[i] = "FizzBuzz";
                } else if (i % 3 == 0) {
                    results[i] = "Fizz";
                } else if (i % 5 == 0) {
                    results[i] = "Buzz";
                } else {
                    results[i] = String.valueOf(i);
                }
            }

            // Display result
            for (int i = 0; i <= number; i++) {
                System.out.println("Position " + i + " = " + results[i]);
            }
        }

        // Closing Scanner class
        input.close();
    }
}
