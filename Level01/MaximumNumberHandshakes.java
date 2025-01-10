import java.util.*;
class MaximumNumberHandshakes {
	public static void main(String args[]) {
		
		// Creating object of scanner class
		Scanner sc = new Scanner(System.in);
		
		// number of people
		int numberOfPeople = sc.nextInt();		
				
		// Calculate number of handshakes
		int totalHandshake= (numberOfPeople * (numberOfPeople - 1) ) / 2;
		
		// Display result
		System.out.println("The total number of possible handshakes is " + totalHandshake);
		
		sc.close();
	}
}
