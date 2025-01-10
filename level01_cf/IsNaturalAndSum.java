import java.util.Scanner;

class IsNaturalAndSum{
    public static void main(String[] args) {
		
		// Creating object of scanner class
        Scanner input = new Scanner(System.in);
		
		// Taking user input 
		System.out.print("Enter the number - ");
		int inputNumber = input.nextInt();
		
        // Check if the number is a natural number
        if (inputNumber > 0) {
		
            // sum of first n natural numbers
            int sumOfNaturalNumbers = inputNumber * (inputNumber + 1) / 2;
            System.out.println("The sum of the first " + inputNumber + " natural numbers is " + sumOfNaturalNumbers);
        } else {
            System.out.println("The number is not a natural number");
        }
		
		// Close the scanner
		input.close();
    }
}
