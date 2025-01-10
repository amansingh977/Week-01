class FindingAge{
	public static void main(String[] args){
		
		String name = "Harry";
		
		int birthYear = 2000; 
		
		int currentYear = 2024;
		
		// Calculate Current Age
		int currentAge = currentYear - birthYear;
		
		// Print Current Age
		System.out.println(name + "'s age in " + currentYear + " is " + currentAge);
	}
}