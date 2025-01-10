import java.util.Scanner;

class ConvertingFeetToYardsAndMiles {
    public static void main(String[] args) {
        // Creating object of scanner class
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        // 1 yard = 3 feet
        final double FEET_TO_YARDS = 1.0 / 3.0; 
		// 1 mile = 1760 yards
        final double YARDS_TO_MILES = 1.0 / 1760.0; 

        // Convert the distance
        double distanceInYards = distanceInFeet * FEET_TO_YARDS;
        double distanceInMiles = distanceInYards * YARDS_TO_MILES;

        // Display the results
        System.out.printf("The distance in yards is " + distanceInYards + " and in miles is " + distanceInMiles);
		
		// Scanner class closed
		scanner.close();
    }
}
