import java.util.Scanner;

class ChocolateDivision {
    public static void main(String[] args) {
		
        // Creating object of scanner class
        Scanner scanner = new Scanner(System.in);

        // Enter the number of chocolates 
        int numberOfChocolates = scanner.nextInt();
		
		// Enter the number of children
        int numberOfChildren = scanner.nextInt();

        // Calculate the number of chocolates each child gets 
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
		
		//	Calculate the number of remaining chocolates
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Display the results
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild + " and the number of remaining chocolates are " + remainingChocolates);

        // Close the scanner object
        scanner.close();
    }
}