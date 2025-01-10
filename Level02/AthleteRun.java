import java.util.Scanner;

class AthleteRun {
    public static void main(String[] args) {
		
        // Creating object of scanner class
        Scanner scanner = new Scanner(System.in);

        // Taking user input for side1
        double side1 = scanner.nextDouble();

		// Taking user input for side2
        double side2 = scanner.nextDouble();

		// Taking user input for side3
        double side3 = scanner.nextDouble();

        // Calculate the perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        // Define the total distance to be run (5 km = 5000 meters)
        double totalDistance = 5000;

        // Calculate the number of rounds required to complete 5 km
        double rounds = totalDistance / perimeter;

        // Display the result 
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");

        // Close the scanner object
        scanner.close();
    }
}
