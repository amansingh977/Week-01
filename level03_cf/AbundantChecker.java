import java.util.Scanner;

class AbundantChecker {
    public static void main(String[] args) {
        
        // Creating object of scanner class
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        int sum = 0;
        
        // Using a for loop from i = 1 to i < number
        for (int i = 1; i < number; i++) {
            // Inside the loop, checking if number is divisible by i
            if (number % i == 0) {
                // If true, adding i to sum
                sum += i;
            }
        }
        
        // Checking if sum is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
        // Display result
            System.out.println(number + " is not an Abundant Number.");
        }

        // Closing scanner class
        input.close();
    }
}
