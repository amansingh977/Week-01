import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        
        // Creating object of scanner class
        Scanner input = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a year (>= 1582) - ");
        int inputYear = input.nextInt();
        boolean isLeapYear;
        
        // Checking if the year is valid
        if (inputYear < 1582) {
            System.out.println("The year " + inputYear + " is not valid for the Gregorian calendar.");
        } else {
            // Checking if the year is a Leap Year using multiple if-else
            if (inputYear % 4 == 0) {
                if (inputYear % 100 == 0) {
                    if (inputYear % 400 == 0) {
                        isLeapYear = true;
                    } else {
                        isLeapYear = false;
                    }
                } else {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = false;
            }
            
            // Display result 
            System.out.println("Is the year " + inputYear + " a Leap Year? " + isLeapYear);

            // Checking if the year is a Leap Year using single if with multiple logical conditions
            isLeapYear = (inputYear % 4 == 0) && ((inputYear % 100 != 0) || (inputYear % 400 == 0));
            
            // // Display result 
            System.out.println("Using logical conditions: Is the year " + inputYear + " a Leap Year? " + isLeapYear);
        }

        // Scanner class closed
        input.close();
    }
}
