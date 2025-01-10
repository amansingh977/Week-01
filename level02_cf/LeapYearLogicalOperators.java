import java.util.Scanner;

class LeapYearLogicalOperators {
    public static void main(String[] args) {
        
        // Creating object of scanner class
        Scanner input = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a year (>= 1582) - ");
        int inputYear = input.nextInt();
        boolean isLeapYear;
        
        // Checking if the year is valid
        if (inputYear >= 1582) {
            // Using single if statement with logical operators to determine Leap Year
            isLeapYear = (inputYear % 4 == 0) && ((inputYear % 100 != 0) || (inputYear % 400 == 0));
            
            // Display result
            System.out.println("Is the year " + inputYear + " a Leap Year? " + isLeapYear);
        } else {
            System.out.println("The year " + inputYear + " is not valid for the Gregorian calendar.");
        }

        // Scanner class closed
        input.close();
    }
}
