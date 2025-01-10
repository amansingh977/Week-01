import java.util.Scanner;

class GradeCalculator {
    public static void main(String[] args) {
        
        // Creating object of scanner class
        Scanner input = new Scanner(System.in);

        // Taking user input 
        System.out.print("Enter marks for Physics: ");
        int physics = input.nextInt();
        
        // Taking user input 
        System.out.print("Enter marks for Chemistry: ");
        int chemistry = input.nextInt();
        
        // Taking user input 
        System.out.print("Enter marks for Maths: ");
        int maths = input.nextInt();
        
        // Calculating the total marks
        int totalMarks = physics + chemistry + maths;
        
        // Calculating percentage
        double percentage = (totalMarks / 3.0);

        // Initializing grade and remarks
        char grade;
        String remarks;

        // Checking the grade acquired based on percentage
        if (percentage >= 80) {
            grade = 'A';
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = 'B';
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            grade = 'C';
            remarks = "Level 2, below but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            grade = 'D';
            remarks = "Level 1, well below agency-normalized standards";
        } else if (percentage >= 40) {
            grade = 'E';
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = 'R';
            remarks = "Remedial standards";
        }

        // Display the result
        System.out.println("\n--- Result ---");
        System.out.println("Average Marks: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        // Closing scanner class
        input.close();
    }
}
