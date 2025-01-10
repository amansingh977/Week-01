import java.util.*;

class KmToMiles {
	public static void main(String[] args){
	
	// Creating object of scanner class
	Scanner sc = new Scanner(System.in);
	
	double km = sc.nextDouble();
	
	// Converting km to miles
	double distanceInMiles = km/1.6;
	
	// Displey result
	System.out.println("The total miles is " + distanceInMiles + " mile for the given " + km + "km");
	
	// Scanner class closed
	sc.close();
	
	}
}
