import java.util.Scanner;

class FactorsOfNumber {
    public static void main(String[] args) {
        
        // Creating object of scanner class
        Scanner input = new Scanner(System.in);
        
        // Taking user input for the number
        System.out.print("Enter a number to find its factors: ");
        int number = input.nextInt();

        for (int i = 1; i < number; i++) {
            // Checking if i is a factor of number
            if (number % i == 0) {
                // Display result
                System.out.println(i);
            }
        }

        // Closing scanner class
        input.close();
    }
}
