import java.util.Scanner;

class MultiplesOfNumber {
    public static void main(String[] args) {
        
        // Creating object of scanner class
        Scanner input = new Scanner(System.in);
        
        // Taking user input for the number
        System.out.print("Enter a number to find its multiples below 100: ");
        int number = input.nextInt();

        // Running a for loop backward from i = 100 to i = 1
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {
                // Display result
                System.out.println(i);
            }
        }

        // Closing scanner class
        input.close();
    }
}
