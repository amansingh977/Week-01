import java.util.Scanner;

class PowerOfNumber {
    public static void main(String[] args) {
        
        // Creating object of scanner class
        Scanner input = new Scanner(System.in);
        
        // Taking user input for the base number
        System.out.print("Enter the base number: ");
        int number = input.nextInt();
        
        // Taking user input for the power (exponent)
        System.out.print("Enter the power: ");
        int power = input.nextInt();
        
        // Initializing result variable to 1
        int result = 1;

        // Running a for loop to calculate the power
        for (int i = 1; i <= power; i++) {
            // Multiplying result with number in each iteration
            result *= number;
        }

        // Displaying the result (number raised to the power)
        System.out.println(number + " raised to the power " + power + " is: " + result);
        
        // Closing the scanner class
        input.close();
    }
}
