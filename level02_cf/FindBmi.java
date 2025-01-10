import java.util.Scanner;
class FindBmi {
	public static void main(String[] args){
		
		// Creating object of scanner class
		Scanner input = new Scanner(System.in);
		
		// Taking user input
		System.out.print("Enter the your weight - ");
		double weightInKg =  input.nextDouble();
		
		System.out.print("Enter the your height - ");
		double heightInCm =  input.nextDouble();
		
		// Converting height into meter 
		double heightConvert = heightInCm / 100;
		
		// Calculating BMI of user
		double bmi = weightInKg / (heightConvert * heightConvert);
		
		// Checking condition of Underweight
		if (18.4 >= bmi ){
			System.out.print("Your are Underweight");
		}
		
		// Checking condition of Normal
		else if(18.5 <= bmi && bmi <= 24.9){
			System.out.print("Your are Normal");
		}
		
		// Checking condition of Overweight
		else if(25.0 <= bmi && bmi <= 39.9){
			System.out.print("Your are Overweight");
		}
		
		// Checking condition of Obese
		else {
			System.out.print("Your are Obese");
		}
		
		// Closing scanner class
		input.close();
	}
}