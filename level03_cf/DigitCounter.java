import java.util.Scanner;

class DigitCounter {
    public static void main(String[] args) {
        
        // Creating object of scanner class
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        
        // Creating an integer variable count with value 0
        int count = 0;
        
        while (number != 0) {
            number = number / 10;
                count++;
        }
        
        // display result
        System.out.println("\n--- Result ---");
        System.out.println("The number has " + count + " digits.");
        
        // Closing scanner class
        input.close();
    }
}
