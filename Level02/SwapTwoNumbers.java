import java.util.*;

public class SwapTwoNumbers{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
	
	    // Taking user input
	    System.out.print("Enter the first number: ");//input number 1
        int number1 = scanner.nextInt();
     
        // Taking user input	 
        System.out.print("Enter the second number: ");//input number 2
        int number2 = scanner.nextInt();
	
	    //swapping the numbers
	    int temp=number1;
	    number1=number2;
	    number2=temp;
	
	    // Display the result
	    System.out.println("The swapped numbers are  " + number1 + " and " + number2);
	    // Close the scanner object
		scanner.close();
	
	}
	
}
