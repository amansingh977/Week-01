import java.util.*;

class SideOfSquare {
	public static void main(String args[]) {
		
		// Creating object of scanner class
		Scanner sc = new Scanner(System.in);
		
		// Taking user input for side o a square
		int sideOfSquare = sc.nextInt();

		// Calculate Perimeter of square
		int perimeterOfSquare = 4 * sideOfSquare;
		
		// Display result
		System.out.println(" The length of the side is " + sideOfSquare + " whose perimeter is " + perimeterOfSquare);
		
		// Scanner class closed
		sc.close();
		
	}
}
