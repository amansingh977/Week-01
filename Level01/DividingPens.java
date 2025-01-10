class DividingPens {
	public static void main(String[] args) {
		 
		int numberOfPens = 14;
		
		int numberOfStudents = 3;
		
		// Calculate pens per student
		int pensPerStudent = (numberOfPens/numberOfStudents);
		
		// Calculate remaining pens
		int remainingPens = (numberOfPens%numberOfStudents);
		
		// Display result
		System.out.println("The Pen Per Student is " +  pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
		
	}
}
		