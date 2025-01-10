import java.util.Scanner;

class FahrenheitConversionCelsius {
    public static void main(String[] args) {
		
        // Creating object of scanner class
        Scanner scanner = new Scanner(System.in);

        // Enter temperature in Fahrenheit
        double fahrenheitTemperature = scanner.nextDouble();

        // Convert Fahrenheit to Celsius using the formula
        double celsiusConversion = (fahrenheitTemperature - 32) * 5 / 9;

        // Display the result
        System.out.println("The " + fahrenheitTemperature +" fahrenheit is "+ celsiusConversion +" celsius.");

        // Close the scanner object
        scanner.close();
    }
}
