import java.util.Scanner;

class ArmstrongChecker {
    public static void main(String[] args) {
        
        // Creating object of scanner class
        Scanner input = new Scanner(System.in);

        // Taking user input 
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Defining sum variable and initializing it to zero
        int sum = 0;
        
        // Defining originalNumber variable and assigning it to the input number
        int originalNumber = number;
        
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum += Math.pow(digit, 3);
            originalNumber = originalNumber / 10;
        }
        
        // Checking if the number and the sum are the same
        if (sum == number) {
            // If the number and sum are the same, it's an Armstrong number
            System.out.println(number + " is an Armstrong number.");
        } else {
            // Display result
            System.out.println(number + " is not an Armstrong number.");
        }

        // Closing scanner class
        input.close();
    }
}
