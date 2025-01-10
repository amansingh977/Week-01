import java.util.Scanner;

class CelsiusConversionFahrenheit {

    public static void main(String[] args) {
        // Creating object of scanner class
        Scanner scanner = new Scanner(System.in);

        // Enter temperature in Celsius
        double celsiusTemperature = scanner.nextDouble();

        // Convert Celsius to Fahrenheit using the formula
        double fahrenheitTemperature = (celsiusTemperature * 9 / 5) + 32;

        // Display the result
        System.out.println("The " + celsiusTemperature + " Celsius is " + fahrenheitTemperature + " Fahrenheit.");

        // Close the scanner object
        scanner.close();
    }
}
