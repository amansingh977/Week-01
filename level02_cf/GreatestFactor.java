import java.util.Scanner;

class GreatestFactor {
    public static void main(String[] args) {
        
        // Creating object of scanner class
        Scanner input = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        
        int greatestFactor = 1;

        // Checking number is valid
        if (number > 1) {
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) { 
                    greatestFactor = i; 
                    break; 
                }
            }

            // Display result
            System.out.println("The greatest factor of " + number + " besides itself is: " + greatestFactor);
        } else {
            System.out.println("Please enter an integer greater than 1.");
        }

        // Closing scanner class
        input.close();
    }
}
