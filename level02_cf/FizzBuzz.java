import java.util.Scanner;

class FizzBuzz {
    public static void main(String[] args) {
        
        // Creating object of scanner class
        Scanner input = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a positive integer: ");
        int inputNumber = input.nextInt();

        // Checking if the input is a positive integer
        if (inputNumber > 0) {
            // Looping from 0 to the entered number
            for (int i = 0; i <= inputNumber; i++) {
                // Checking number is divisible by both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } 
                // Checking number is divisible by 3
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } 
                // Checking if the number is divisible by 5
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } 
                else {
                    System.out.println(i);
                }
            }
        } else {
            // Display result
            System.out.println("Please enter a positive integer greater than 0.");
        }

        // Closing scanner class
        input.close();
    }
}
