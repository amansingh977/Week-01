import java.util.*;
class HeightConverted {
	public static void main(String args[]) {
	
	    // Creating object of scanner class
		Scanner sc = new Scanner(System.in);
		
		// Height in centi-meter
		int heightInCm = sc.nextInt();
	
		// Height in foot
		double heightInFoot = heightInCm/30.48;
				
		// Calculate in inch
		double inch = heightInCm / 2.54;

		//Display result
		System.out.println("Your height in cms is " + heightInCm + " while in feet is  " + heightInFoot + " and in inches is " + inch);
		
		sc.close();
		
	}
}