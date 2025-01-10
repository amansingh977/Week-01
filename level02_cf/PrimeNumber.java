import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        
        // Creating object of scanner class
        Scanner input = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a number greater than 1: ");
        int inputNumber = input.nextInt();
        boolean isPrime = true; // Variable to store the result

        // Checking if the input number is valid
        if (inputNumber <= 1) {
            System.out.println("The number " + inputNumber + " is not greater than 1. Please enter a valid number.");
        } else {
            // Checking for prime number
            for (int i = 2; i <= Math.sqrt(inputNumber); i++) {
                if (inputNumber % i == 0) {
                    isPrime = false; 
                    break; 
                }
            }

            // Display result
            System.out.println("Is the number " + inputNumber + " a Prime Number? " + isPrime);
        }

        // Scanner class closed
        input.close();
    }
}
