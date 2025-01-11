import java.util.Random;

public class StudentMarks {

    // Method to generate random scores for students
    public static int[][] generateScores(int students) {
		// Creating an object of Random class
        Random random = new Random();
        int[][] scores = new int[students][3];
        for (int i = 0; i < students; i++) {
            scores[i][0] = random.nextInt(41) + 60; // Physics
            scores[i][1] = random.nextInt(41) + 60; // Chemistry
            scores[i][2] = random.nextInt(41) + 60; // Math
        }
		// Returning the generated scores
        return scores;
    }

    // Method to calculate total, average, and percentage of scores
    public static double[][] calculateResults(int[][] scores) {
        int students = scores.length;
        double[][] results = new double[students][3]; // [Total, Average, Percentage]
        for (int i = 0; i < students; i++) {
			// Calculating the total marks
            int total = scores[i][0] + scores[i][1] + scores[i][2];
			
			// Calculating the average marks (rounded to 2 decimal places)
            double average = Math.round((double) total / 3 * 100.0) / 100.0;
			
			// Calculating the percentage (rounded to nearest integer)
            double percentage = Math.round((double) total / 3.0);
            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }
		// Returning the results
        return results;
    }
	
	
    // Method to display the scorecard for students
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Roll\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
			// Displaying the roll number, scores, and calculated results
            System.out.printf("%d\t%d\t%d\t\t%d\t%.0f\t%.2f\t%.2f%%\n",
                    i + 1, scores[i][0], scores[i][1], scores[i][2], 
                    results[i][0], results[i][1], results[i][2]);
        }
    }

 
    public static void main(String[] args) {
        int numberOfStudents = 5;
        int[][] scores = generateScores(numberOfStudents);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);
    }
}
