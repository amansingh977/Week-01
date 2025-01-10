class AveragePercentageInPcm {
	public static void main(String[] args) {
		
		String name = "sam";
		
		double Maths = 94;
		
		double Physics = 95;
		
		double Chemistry = 96;
		
		// Calculate total Marks
		double totalMarks = Maths + Physics + Chemistry;
		
		// Calculate Percentage
		double Percentage = (totalMarks*100)/300;
		
		// Print Average mark
		System.out.println("Sam's average mark in PCM is " + Percentage);
		
	}
}