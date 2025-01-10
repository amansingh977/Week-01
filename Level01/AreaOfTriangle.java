import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        
		// Creating object of scanner class
        Scanner sc = new Scanner(System.in);
		
		// Taking user input for base
        System.out.print("Enter the base of the triangle ");
        double base = sc.nextDouble();

        // Taking user input for height
        System.out.print("Enter the height of the triangle ");
        double height = sc.nextDouble();

        // Calculating area of a triangle in square inches
        double areaInSquareInches = 0.5 * base * height;

        // Converting the area to square centimeters 
        double areaInSquareCentimeters = areaInSquareInches * 6.4516;

        // display result
        System.out.println("The area of the triangle In square inches is "+areaInSquareInches+" and area In square centimeters is "+areaInSquareCentimeters );
        
		// Scanner class closed
        sc.close();
    }
}
