class kilometersToMiles {
	
	public static void main(String[] args) {
		// Distance in kilometer
		double distanceInKm = 10.8;
		
		// one km = 1.6 miles
		double kmInMiles = 1.6;
		
		// Calculate distance in Miles
		double distanceInMiles = distanceInKm*kmInMiles;
		
		// Display Result
		System.out.println("The distance " + distanceInKm + "km in miles is " + distanceInMiles);
		
	}
}
		