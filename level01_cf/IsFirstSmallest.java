import java.util.Scanner;

public class IsFirstSmallest{
    public static void main(String[] args) {
		
		// Creating object of scanner class
        Scanner input = new Scanner(System.in);

        // Taking 3 user input 
        System.out.print("Enter the first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = input.nextInt();

        System.out.print("Enter the third number: ");
        int thirdNumber = input.nextInt();
		
		boolean isFirstSmallest;

        // Check if the first number is the smallest
        if (firstNumber < secondNumber && firstNumber < thirdNumber) {
            isFirstSmallest = true;
        } else {
            isFirstSmallest = false;
        }
        
        // Display result
		System.out.println("Is the first number the smallest? " + isFirstSmallest);
		
		// Close the scanner
        input.close();
    }
}
