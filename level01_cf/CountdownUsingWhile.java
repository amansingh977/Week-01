import java.util.Scanner;

class CountdownUsingWhile{
    public static void main(String[] args) {
		
        // Creating object of scanner class		
        Scanner input = new Scanner(System.in);

        // Get the countdown start value from user
        System.out.print("Enter the starting value for countdown - ");
		
		//Taking user input
        int counter = input.nextInt();

        // Countdown
        while (counter >= 1) {
            System.out.println(counter);
            counter--; // Decrementing the counter
        }

        // Close the scanner
        input.close();
    }
}
